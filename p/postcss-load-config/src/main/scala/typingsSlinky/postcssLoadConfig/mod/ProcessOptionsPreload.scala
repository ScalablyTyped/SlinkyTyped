package typingsSlinky.postcssLoadConfig.mod

import typingsSlinky.postcss.PickProcessOptionsmapfrom
import typingsSlinky.postcss.mod.Builder
import typingsSlinky.postcss.mod.Node
import typingsSlinky.postcss.mod.Parser
import typingsSlinky.postcss.mod.ParserInput
import typingsSlinky.postcss.mod.Root_
import typingsSlinky.postcss.mod.Stringifier
import typingsSlinky.postcss.mod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In the ConfigContext, these three options can be instances of the
// appropriate class, or strings. If they are strings, postcss-load-config will
// require() them and pass the instances along.
@js.native
trait ProcessOptionsPreload extends js.Object {
  var parser: js.UndefOr[String | Parser] = js.native
  var stringifier: js.UndefOr[String | Stringifier] = js.native
  var syntax: js.UndefOr[String | Syntax] = js.native
}

object ProcessOptionsPreload {
  @scala.inline
  def apply(): ProcessOptionsPreload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOptionsPreload]
  }
  @scala.inline
  implicit class ProcessOptionsPreloadOps[Self <: ProcessOptionsPreload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParserFunction2(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParser(value: String | Parser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withStringifierFunction2(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStringifier(value: String | Stringifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: String | Syntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntax")(js.undefined)
        ret
    }
  }
  
}

