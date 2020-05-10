package typingsSlinky.reactDevUtils

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.webpack.mod.Stats
import typingsSlinky.webpack.mod.Stats.Preset
import typingsSlinky.webpack.mod.Stats.ToJsonOptionsObject
import typingsSlinky.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStats extends Instantiable1[/* compilation */ Compilation, Stats] {
  def filterWarnings(warnings: js.Array[String]): js.Array[String] = js.native
  def filterWarnings(
    warnings: js.Array[String],
    warningsFilter: js.Array[String | js.RegExp | (js.Function1[/* warning */ String, Boolean])]
  ): js.Array[String] = js.native
  /**
    * Returns the default json options from the stats preset.
    * @param preset The preset to be transformed into json options.
    */
  def presetToOptions(): ToJsonOptionsObject = js.native
  def presetToOptions(preset: Preset): ToJsonOptionsObject = js.native
}

