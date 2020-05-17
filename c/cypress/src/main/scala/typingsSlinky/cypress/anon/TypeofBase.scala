package typingsSlinky.cypress.anon

import typingsSlinky.cypress.Mocha.Test
import typingsSlinky.cypress.Mocha.reporters.Base.ColorMap
import typingsSlinky.cypress.Mocha.reporters.Base.SymbolMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBase extends js.Object {
  /**
    * Default color map
    *
    * @see https://mochajs.org/api/module-base#.colors
    */
  val colors: ColorMap = js.native
  /**
    * ANSI TTY control sequences common among reporters.
    *
    * @see https://mochajs.org/api/module-base#.cursor
    */
  val cursor: Typeofcursor = js.native
  /**
    * Inline diffs instead of +/-
    *
    * @see https://mochajs.org/api/module-base#.inlineDiffs
    */
  var inlineDiffs: Boolean = js.native
  /**
    * Default symbol map
    *
    * @see https://mochajs.org/api/module-base#.symbols
    */
  val symbols: SymbolMap = js.native
  /**
    * Enables coloring by default
    *
    * @see https://mochajs.org/api/module-base#.useColors
    */
  var useColors: Boolean = js.native
  /**
    * Expose terminal window size
    *
    * @see https://mochajs.org/api/module-base#.window
    */
  val window: Width = js.native
  /**
    * Color `str` with the given `type` (from `colors`)
    *
    * @see https://mochajs.org/api/module-base#.color
    */
  def color(`type`: String, str: String): String = js.native
  /**
    * Returns a diff between two strings with colored ANSI output.
    *
    * @see https://mochajs.org/api/module-base#.generateDiff
    */
  def generateDiff(actual: String, expected: String): String = js.native
  /**
    * Output the given `failures` as a list.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
    */
  def list(failures: js.Array[Test]): Unit = js.native
}

object TypeofBase {
  @scala.inline
  def apply(
    color: (String, String) => String,
    colors: ColorMap,
    cursor: Typeofcursor,
    generateDiff: (String, String) => String,
    inlineDiffs: Boolean,
    list: js.Array[Test] => Unit,
    symbols: SymbolMap,
    useColors: Boolean,
    window: Width
  ): TypeofBase = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction2(color), colors = colors.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], generateDiff = js.Any.fromFunction2(generateDiff), inlineDiffs = inlineDiffs.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), symbols = symbols.asInstanceOf[js.Any], useColors = useColors.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBase]
  }
  @scala.inline
  implicit class TypeofBaseOps[Self <: TypeofBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColors(value: ColorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: Typeofcursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateDiff(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateDiff")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInlineDiffs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: js.Array[Test] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSymbols(value: SymbolMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: Width): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

