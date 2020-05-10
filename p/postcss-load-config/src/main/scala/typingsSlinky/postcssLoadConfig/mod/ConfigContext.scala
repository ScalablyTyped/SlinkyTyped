package typingsSlinky.postcssLoadConfig.mod

import typingsSlinky.postcss.PickProcessOptionsmapfrom
import typingsSlinky.postcss.mod.Builder
import typingsSlinky.postcss.mod.Node
import typingsSlinky.postcss.mod.Parser
import typingsSlinky.postcss.mod.ParserInput
import typingsSlinky.postcss.mod.Root_
import typingsSlinky.postcss.mod.SourceMapOptions
import typingsSlinky.postcss.mod.Stringifier
import typingsSlinky.postcss.mod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The full shape of the ConfigContext.
/* Inlined postcss-load-config.postcss-load-config.Context & postcss-load-config.postcss-load-config.ProcessOptionsPreload & postcss-load-config.postcss-load-config.RemainingProcessOptions */
@js.native
trait ConfigContext extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var env: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
  var parser: js.UndefOr[String | Parser] = js.native
  var stringifier: js.UndefOr[String | Stringifier] = js.native
  var syntax: js.UndefOr[String | Syntax] = js.native
  var to: js.UndefOr[String] = js.native
}

object ConfigContext {
  @scala.inline
  def apply(): ConfigContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigContext]
  }
  @scala.inline
  implicit class ConfigContextOps[Self <: ConfigContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: SourceMapOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
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
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

