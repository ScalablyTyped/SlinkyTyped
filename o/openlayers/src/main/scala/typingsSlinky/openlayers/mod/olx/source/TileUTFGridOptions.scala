package typingsSlinky.openlayers.mod.olx.source

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileUTFGridOptions extends js.Object {
  var jsonp: js.UndefOr[Boolean] = js.native
  var preemptive: js.UndefOr[Boolean] = js.native
  var tileJSON: js.UndefOr[TileJSON] = js.native
  var url: js.UndefOr[String] = js.native
}

object TileUTFGridOptions {
  @scala.inline
  def apply(): TileUTFGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileUTFGridOptions]
  }
  @scala.inline
  implicit class TileUTFGridOptionsOps[Self <: TileUTFGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.undefined)
        ret
    }
    @scala.inline
    def withPreemptive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreemptive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptive")(js.undefined)
        ret
    }
    @scala.inline
    def withTileJSON(value: TileJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

