package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Resource
import typingsSlinky.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var channel: Double = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var maximumLevel: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  var url: Resource | String = js.native
}

object Channel {
  @scala.inline
  def apply(channel: Double, url: Resource | String): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: Resource | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withTileDiscardPolicy(value: TileDiscardPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDiscardPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileDiscardPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDiscardPolicy")(js.undefined)
        ret
    }
  }
  
}

