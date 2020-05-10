package typingsSlinky.rollup.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupCache extends js.Object {
  var modules: js.Array[ModuleJSON] = js.native
  var plugins: js.UndefOr[Record[String, SerializablePluginCache]] = js.native
}

object RollupCache {
  @scala.inline
  def apply(modules: js.Array[ModuleJSON]): RollupCache = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupCache]
  }
  @scala.inline
  implicit class RollupCacheOps[Self <: RollupCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModules(value: js.Array[ModuleJSON]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: Record[String, SerializablePluginCache]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
  }
  
}

