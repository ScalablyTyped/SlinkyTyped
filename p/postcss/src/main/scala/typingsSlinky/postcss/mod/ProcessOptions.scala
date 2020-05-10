package typingsSlinky.postcss.mod

import typingsSlinky.postcss.PickProcessOptionsmapfrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessOptions extends js.Object {
  /**
    * The path of the CSS source file. You should always set "from", because it is
    * used in source map generation and syntax error messages.
    */
  var from: js.UndefOr[String] = js.native
  /**
    * Source map options
    */
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
  /**
    * Function to generate AST by string.
    */
  var parser: js.UndefOr[Parser] = js.native
  /**
    * Class to generate string by AST.
    */
  var stringifier: js.UndefOr[Stringifier] = js.native
  /**
    * Object with parse and stringify.
    */
  var syntax: js.UndefOr[Syntax] = js.native
  /**
    * The path where you'll put the output CSS file. You should always set "to"
    * to generate correct source maps.
    */
  var to: js.UndefOr[String] = js.native
}

object ProcessOptions {
  @scala.inline
  def apply(): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOptions]
  }
  @scala.inline
  implicit class ProcessOptionsOps[Self <: ProcessOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withParser(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withStringifier(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStringifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSyntax(value: Syntax): Self = {
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

