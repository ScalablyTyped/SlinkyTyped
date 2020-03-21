package typingsSlinky.reactDevUtils

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.webpack.mod.optimize.AggressiveMergingPlugin
import typingsSlinky.webpack.mod.optimize.AggressiveSplittingPlugin
import typingsSlinky.webpack.mod.optimize.DedupePlugin
import typingsSlinky.webpack.mod.optimize.LimitChunkCountPlugin
import typingsSlinky.webpack.mod.optimize.MinChunkSizePlugin
import typingsSlinky.webpack.mod.optimize.ModuleConcatenationPlugin
import typingsSlinky.webpack.mod.optimize.OccurrenceOrderPlugin
import typingsSlinky.webpack.mod.optimize.UglifyJsPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofoptimize extends js.Object {
  var AggressiveMergingPlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.AggressiveMergingPlugin]
  var AggressiveSplittingPlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.AggressiveSplittingPlugin]
  /** @deprecated */
  var DedupePlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.DedupePlugin]
  var LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, typingsSlinky.webpack.mod.optimize.LimitChunkCountPlugin]
  var MinChunkSizePlugin: Instantiable1[/* options */ js.Any, typingsSlinky.webpack.mod.optimize.MinChunkSizePlugin]
  /** @deprecated use config.optimization.concatenateModules */
  var ModuleConcatenationPlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.ModuleConcatenationPlugin]
  var OccurrenceOrderPlugin: Instantiable1[
    /* preferEntry */ Boolean, 
    typingsSlinky.webpack.mod.optimize.OccurrenceOrderPlugin
  ]
  var UglifyJsPlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.UglifyJsPlugin]
}

object Typeofoptimize {
  @scala.inline
  def apply(
    AggressiveMergingPlugin: Instantiable0[AggressiveMergingPlugin],
    AggressiveSplittingPlugin: Instantiable0[AggressiveSplittingPlugin],
    DedupePlugin: Instantiable0[DedupePlugin],
    LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, LimitChunkCountPlugin],
    MinChunkSizePlugin: Instantiable1[/* options */ js.Any, MinChunkSizePlugin],
    ModuleConcatenationPlugin: Instantiable0[ModuleConcatenationPlugin],
    OccurrenceOrderPlugin: Instantiable1[/* preferEntry */ Boolean, OccurrenceOrderPlugin],
    UglifyJsPlugin: Instantiable0[UglifyJsPlugin]
  ): Typeofoptimize = {
    val __obj = js.Dynamic.literal(AggressiveMergingPlugin = AggressiveMergingPlugin.asInstanceOf[js.Any], AggressiveSplittingPlugin = AggressiveSplittingPlugin.asInstanceOf[js.Any], DedupePlugin = DedupePlugin.asInstanceOf[js.Any], LimitChunkCountPlugin = LimitChunkCountPlugin.asInstanceOf[js.Any], MinChunkSizePlugin = MinChunkSizePlugin.asInstanceOf[js.Any], ModuleConcatenationPlugin = ModuleConcatenationPlugin.asInstanceOf[js.Any], OccurrenceOrderPlugin = OccurrenceOrderPlugin.asInstanceOf[js.Any], UglifyJsPlugin = UglifyJsPlugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofoptimize]
  }
}

