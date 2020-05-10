package typingsSlinky.esFeatureDetection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2015Syntax | es-feature-detection.es-feature-detection.ES2016Syntax | es-feature-detection.es-feature-detection.ES2017Syntax, boolean> & {  es2015  :std.Record<es-feature-detection.es-feature-detection.ES2015Syntax, boolean>,   es2016  :std.Record<es-feature-detection.es-feature-detection.ES2016Syntax, boolean>,   es2017  :std.Record<es-feature-detection.es-feature-detection.ES2017Syntax, boolean>} */
@js.native
trait RecordES2015SyntaxES2016S extends js.Object {
  var `Arrow function`: Boolean = js.native
  var `Binary literals`: Boolean = js.native
  var `Block level function declaration`: Boolean = js.native
  var `Computed property`: Boolean = js.native
  var `Default parameters`: Boolean = js.native
  var Destructuring: Boolean = js.native
  var `Exponentiation operator`: Boolean = js.native
  var `Generator function`: Boolean = js.native
  var `Octal literals`: Boolean = js.native
  @JSName("RegExp.prototype.sticky")
  var RegExpDotprototypeDotsticky: Boolean = js.native
  @JSName("RegExp.prototype.unicode")
  var RegExpDotprototypeDotunicode: Boolean = js.native
  var `Rest destructuring`: Boolean = js.native
  var `Rest parameters`: Boolean = js.native
  var `Shorthand method`: Boolean = js.native
  var `Shorthand property`: Boolean = js.native
  var `Spread Array`: Boolean = js.native
  var `Spread Function call`: Boolean = js.native
  var `Template Strings`: Boolean = js.native
  var `Trailing parameter commas`: Boolean = js.native
  var __all: Boolean = js.native
  @JSName("async/await")
  var asyncSlashawait: Boolean = js.native
  var `class`: Boolean = js.native
  var const: Boolean = js.native
  var es2015: RecordES2015Syntaxboolean = js.native
  var es2016: RecordES2016Syntaxboolean = js.native
  var es2017: RecordES2017Syntaxboolean = js.native
  @JSName("for...of")
  var forDotDotDotof: Boolean = js.native
  var let: Boolean = js.native
}

object RecordES2015SyntaxES2016S {
  @scala.inline
  def apply(
    `Arrow function`: Boolean,
    `Binary literals`: Boolean,
    `Block level function declaration`: Boolean,
    `Computed property`: Boolean,
    `Default parameters`: Boolean,
    Destructuring: Boolean,
    `Exponentiation operator`: Boolean,
    `Generator function`: Boolean,
    `Octal literals`: Boolean,
    RegExpDotprototypeDotsticky: Boolean,
    RegExpDotprototypeDotunicode: Boolean,
    `Rest destructuring`: Boolean,
    `Rest parameters`: Boolean,
    `Shorthand method`: Boolean,
    `Shorthand property`: Boolean,
    `Spread Array`: Boolean,
    `Spread Function call`: Boolean,
    `Template Strings`: Boolean,
    `Trailing parameter commas`: Boolean,
    __all: Boolean,
    asyncSlashawait: Boolean,
    `class`: Boolean,
    const: Boolean,
    es2015: RecordES2015Syntaxboolean,
    es2016: RecordES2016Syntaxboolean,
    es2017: RecordES2017Syntaxboolean,
    forDotDotDotof: Boolean,
    let: Boolean
  ): RecordES2015SyntaxES2016S = {
    val __obj = js.Dynamic.literal(Destructuring = Destructuring.asInstanceOf[js.Any], __all = __all.asInstanceOf[js.Any], const = const.asInstanceOf[js.Any], es2015 = es2015.asInstanceOf[js.Any], es2016 = es2016.asInstanceOf[js.Any], es2017 = es2017.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any])
    __obj.updateDynamic("Arrow function")((`Arrow function`).asInstanceOf[js.Any])
    __obj.updateDynamic("Binary literals")((`Binary literals`).asInstanceOf[js.Any])
    __obj.updateDynamic("Block level function declaration")((`Block level function declaration`).asInstanceOf[js.Any])
    __obj.updateDynamic("Computed property")((`Computed property`).asInstanceOf[js.Any])
    __obj.updateDynamic("Default parameters")((`Default parameters`).asInstanceOf[js.Any])
    __obj.updateDynamic("Exponentiation operator")((`Exponentiation operator`).asInstanceOf[js.Any])
    __obj.updateDynamic("Generator function")((`Generator function`).asInstanceOf[js.Any])
    __obj.updateDynamic("Octal literals")((`Octal literals`).asInstanceOf[js.Any])
    __obj.updateDynamic("RegExp.prototype.sticky")(RegExpDotprototypeDotsticky.asInstanceOf[js.Any])
    __obj.updateDynamic("RegExp.prototype.unicode")(RegExpDotprototypeDotunicode.asInstanceOf[js.Any])
    __obj.updateDynamic("Rest destructuring")((`Rest destructuring`).asInstanceOf[js.Any])
    __obj.updateDynamic("Rest parameters")((`Rest parameters`).asInstanceOf[js.Any])
    __obj.updateDynamic("Shorthand method")((`Shorthand method`).asInstanceOf[js.Any])
    __obj.updateDynamic("Shorthand property")((`Shorthand property`).asInstanceOf[js.Any])
    __obj.updateDynamic("Spread Array")((`Spread Array`).asInstanceOf[js.Any])
    __obj.updateDynamic("Spread Function call")((`Spread Function call`).asInstanceOf[js.Any])
    __obj.updateDynamic("Template Strings")((`Template Strings`).asInstanceOf[js.Any])
    __obj.updateDynamic("Trailing parameter commas")((`Trailing parameter commas`).asInstanceOf[js.Any])
    __obj.updateDynamic("async/await")(asyncSlashawait.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("for...of")(forDotDotDotof.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2015SyntaxES2016S]
  }
  @scala.inline
  implicit class RecordES2015SyntaxES2016SOps[Self <: RecordES2015SyntaxES2016S] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withArrow function`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arrow function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBinary literals`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Binary literals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBlock level function declaration`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Block level function declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withComputed property`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Computed property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDefault parameters`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestructuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destructuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExponentiation operator`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exponentiation operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withGenerator function`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Generator function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOctal literals`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Octal literals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegExpDotprototypeDotsticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegExp.prototype.sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegExpDotprototypeDotunicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegExp.prototype.unicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRest destructuring`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rest destructuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRest parameters`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rest parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShorthand method`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shorthand method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShorthand property`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shorthand property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSpread Array`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spread Array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSpread Function call`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spread Function call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTemplate Strings`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Template Strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTrailing parameter commas`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trailing parameter commas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncSlashawait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async/await")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("const")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEs2015(value: RecordES2015Syntaxboolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es2015")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEs2016(value: RecordES2016Syntaxboolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es2016")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEs2017(value: RecordES2017Syntaxboolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es2017")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForDotDotDotof(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for...of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("let")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

