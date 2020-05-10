package typingsSlinky.cordovaPluginMapsforge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapsforgePlugin extends js.Object {
  var cache: MapsforgeCachePlugin = js.native
  var embedded: MapsforgeEmbeddedPlugin = js.native
}

object MapsforgePlugin {
  @scala.inline
  def apply(cache: MapsforgeCachePlugin, embedded: MapsforgeEmbeddedPlugin): MapsforgePlugin = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsforgePlugin]
  }
  @scala.inline
  implicit class MapsforgePluginOps[Self <: MapsforgePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: MapsforgeCachePlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbedded(value: MapsforgeEmbeddedPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

