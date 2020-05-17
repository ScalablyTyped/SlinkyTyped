package typingsSlinky.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var Format: String = js.native
  var Overlap: String = js.native
  var Size: Width = js.native
  var TileSize: String = js.native
  var Url: String = js.native
  var xmlns: js.UndefOr[String] = js.native
}

object Format {
  @scala.inline
  def apply(Format: String, Overlap: String, Size: Width, TileSize: String, Url: String): Format = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Overlap = Overlap.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TileSize = TileSize.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Width): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(js.undefined)
        ret
    }
  }
  
}

