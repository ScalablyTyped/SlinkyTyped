package typingsSlinky.openlayers.mod.olx.format

import typingsSlinky.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMLOptions extends js.Object {
  var defaultStyle: js.UndefOr[js.Array[Style]] = js.native
  var extractStyles: js.UndefOr[Boolean] = js.native
  var showPointNames: js.UndefOr[Boolean] = js.native
  var writeStyles: js.UndefOr[Boolean] = js.native
}

object KMLOptions {
  @scala.inline
  def apply(): KMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMLOptions]
  }
  @scala.inline
  implicit class KMLOptionsOps[Self <: KMLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultStyle(value: js.Array[Style]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPointNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPointNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPointNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPointNames")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStyles")(js.undefined)
        ret
    }
  }
  
}

