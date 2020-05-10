package typingsSlinky.prettier

import typingsSlinky.prettier.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndOfLine extends js.Object {
  var endOfLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.native
  var ownLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.native
  var remaining: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.native
}

object AnonEndOfLine {
  @scala.inline
  def apply(): AnonEndOfLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEndOfLine]
  }
  @scala.inline
  implicit class AnonEndOfLineOps[Self <: AnonEndOfLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOfLine(
      value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfLine")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutEndOfLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfLine")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnLine(
      value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownLine")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOwnLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownLine")(js.undefined)
        ret
    }
    @scala.inline
    def withRemaining(
      value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRemaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(js.undefined)
        ret
    }
  }
  
}

