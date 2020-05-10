package typingsSlinky.ol.kmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var crossOrigin: js.UndefOr[String] = js.native
  var defaultStyle: js.UndefOr[js.Array[typingsSlinky.ol.styleStyleMod.default]] = js.native
  var extractStyles: js.UndefOr[Boolean] = js.native
  var showPointNames: js.UndefOr[Boolean] = js.native
  var writeStyles: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyle(value: js.Array[typingsSlinky.ol.styleStyleMod.default]): Self = {
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

