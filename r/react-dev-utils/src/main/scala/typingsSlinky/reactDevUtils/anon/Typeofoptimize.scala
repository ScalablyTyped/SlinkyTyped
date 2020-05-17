package typingsSlinky.reactDevUtils.anon

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

@js.native
trait Typeofoptimize extends js.Object {
  var AggressiveMergingPlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.AggressiveMergingPlugin] = js.native
  var AggressiveSplittingPlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.AggressiveSplittingPlugin] = js.native
  /** @deprecated */
  var DedupePlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.DedupePlugin] = js.native
  var LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, typingsSlinky.webpack.mod.optimize.LimitChunkCountPlugin] = js.native
  var MinChunkSizePlugin: Instantiable1[/* options */ js.Any, typingsSlinky.webpack.mod.optimize.MinChunkSizePlugin] = js.native
  /** @deprecated use config.optimization.concatenateModules */
  var ModuleConcatenationPlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.ModuleConcatenationPlugin] = js.native
  var OccurrenceOrderPlugin: Instantiable1[
    /* preferEntry */ Boolean, 
    typingsSlinky.webpack.mod.optimize.OccurrenceOrderPlugin
  ] = js.native
  var UglifyJsPlugin: Instantiable0[typingsSlinky.webpack.mod.optimize.UglifyJsPlugin] = js.native
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
  @scala.inline
  implicit class TypeofoptimizeOps[Self <: Typeofoptimize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggressiveMergingPlugin(value: Instantiable0[AggressiveMergingPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggressiveMergingPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggressiveSplittingPlugin(value: Instantiable0[AggressiveSplittingPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggressiveSplittingPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDedupePlugin(value: Instantiable0[DedupePlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedupePlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimitChunkCountPlugin(value: Instantiable1[/* options */ js.Any, LimitChunkCountPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitChunkCountPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinChunkSizePlugin(value: Instantiable1[/* options */ js.Any, MinChunkSizePlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinChunkSizePlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleConcatenationPlugin(value: Instantiable0[ModuleConcatenationPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleConcatenationPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccurrenceOrderPlugin(value: Instantiable1[/* preferEntry */ Boolean, OccurrenceOrderPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OccurrenceOrderPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUglifyJsPlugin(value: Instantiable0[UglifyJsPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UglifyJsPlugin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

