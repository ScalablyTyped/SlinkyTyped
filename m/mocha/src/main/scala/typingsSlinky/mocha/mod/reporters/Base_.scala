package typingsSlinky.mocha.mod.reporters

import typingsSlinky.mocha.Mocha.MochaOptions
import typingsSlinky.mocha.Mocha.Runner
import typingsSlinky.mocha.Mocha.Test
import typingsSlinky.mocha.Mocha.reporters.Base
import typingsSlinky.mocha.Mocha.reporters.Base.ColorMap
import typingsSlinky.mocha.Mocha.reporters.Base.SymbolMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialize a new `Base` reporter.
  *
  * All other reporters generally inherit from this reporter, providing stats such as test duration,
  * number of tests passed / failed, etc.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Base.html
  */
@JSImport("mocha", "reporters.Base")
@js.native
class Base_ protected () extends Base {
  def this(runner: Runner) = this()
  def this(runner: Runner, options: MochaOptions) = this()
}
@JSImport("mocha", "reporters.Base")
@js.native
object Base_ extends js.Object {
  
  /**
    * Color `str` with the given `type` (from `colors`)
    *
    * @see https://mochajs.org/api/module-base#.color
    */
  def color(`type`: String, str: String): String = js.native
  
  /**
    * Default color map
    *
    * @see https://mochajs.org/api/module-base#.colors
    */
  val colors: ColorMap = js.native
  
  /**
    * Returns a diff between two strings with colored ANSI output.
    *
    * @see https://mochajs.org/api/module-base#.generateDiff
    */
  def generateDiff(actual: String, expected: String): String = js.native
  
  /**
    * Inline diffs instead of +/-
    *
    * @see https://mochajs.org/api/module-base#.inlineDiffs
    */
  var inlineDiffs: Boolean = js.native
  
  /**
    * Output the given `failures` as a list.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
    */
  def list(failures: js.Array[Test]): Unit = js.native
  
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
    * ANSI TTY control sequences common among reporters.
    *
    * @see https://mochajs.org/api/module-base#.cursor
    */
  @js.native
  object cursor extends js.Object {
    
    /**
      * Clears the line and moves to the beginning of the line.
      */
    def CR(): Unit = js.native
    
    /**
      * Moves to the beginning of the line
      */
    def beginningOfLine(): Unit = js.native
    
    /**
      * Deletes the current line
      */
    def deleteLine(): Unit = js.native
    
    /**
      * Hides the cursor
      */
    def hide(): Unit = js.native
    
    /**
      * Shows the cursor
      */
    def show(): Unit = js.native
  }
  
  /**
    * Expose terminal window size
    *
    * @see https://mochajs.org/api/module-base#.window
    */
  @js.native
  object window extends js.Object {
    
    var width: Double = js.native
  }
}
