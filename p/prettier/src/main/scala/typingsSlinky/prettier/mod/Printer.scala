package typingsSlinky.prettier.mod

import typingsSlinky.prettier.anon.EndOfLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Printer extends js.Object {
  var canAttachComment: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.native
  var embed: js.UndefOr[
    js.Function4[
      /* path */ FastPath[_], 
      /* print */ js.Function1[/* path */ FastPath[_], Doc_], 
      /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], 
      /* options */ ParserOptions, 
      Doc_ | Null
    ]
  ] = js.native
  var handleComments: js.UndefOr[EndOfLine] = js.native
  var hasPrettierIgnore: js.UndefOr[js.Function1[/* path */ FastPath[_], Boolean]] = js.native
  var insertPragma: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  /**
    * @returns `null` if you want to remove this node
    * @returns `void` if you want to use modified newNode
    * @returns anything if you want to replace the node with it
    */
  var massageAstNode: js.UndefOr[js.Function3[/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any, _]] = js.native
  var printComments: js.UndefOr[
    js.Function4[
      /* path */ FastPath[_], 
      /* print */ js.Function1[/* path */ FastPath[_], Doc_], 
      /* options */ ParserOptions, 
      /* needsSemi */ Boolean, 
      Doc_
    ]
  ] = js.native
  var willPrintOwnComments: js.UndefOr[js.Function1[/* path */ FastPath[_], Boolean]] = js.native
  def print(path: FastPath[_], options: ParserOptions, print: js.Function1[/* path */ FastPath[_], Doc_]): Doc_ = js.native
}

object Printer {
  @scala.inline
  def apply(print: (FastPath[_], ParserOptions, js.Function1[/* path */ FastPath[_], Doc_]) => Doc_): Printer = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction3(print))
    __obj.asInstanceOf[Printer]
  }
  @scala.inline
  implicit class PrinterOps[Self <: Printer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrint(value: (FastPath[_], ParserOptions, js.Function1[/* path */ FastPath[_], Doc_]) => Doc_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCanAttachComment(value: /* node */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAttachComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanAttachComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAttachComment")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbed(
      value: (/* path */ FastPath[_], /* print */ js.Function1[/* path */ FastPath[_], Doc_], /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], /* options */ ParserOptions) => Doc_ | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEmbed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleComments(value: EndOfLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleComments")(js.undefined)
        ret
    }
    @scala.inline
    def withHasPrettierIgnore(value: /* path */ FastPath[_] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrettierIgnore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasPrettierIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrettierIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertPragma(value: /* text */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPragma")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertPragma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPragma")(js.undefined)
        ret
    }
    @scala.inline
    def withMassageAstNode(value: (/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("massageAstNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMassageAstNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("massageAstNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintComments(
      value: (/* path */ FastPath[_], /* print */ js.Function1[/* path */ FastPath[_], Doc_], /* options */ ParserOptions, /* needsSemi */ Boolean) => Doc_
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printComments")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutPrintComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printComments")(js.undefined)
        ret
    }
    @scala.inline
    def withWillPrintOwnComments(value: /* path */ FastPath[_] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willPrintOwnComments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWillPrintOwnComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willPrintOwnComments")(js.undefined)
        ret
    }
  }
  
}

