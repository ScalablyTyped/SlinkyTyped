package typingsSlinky.ffmpeg.mod

import typingsSlinky.ffmpeg.ffmpegStrings.C
import typingsSlinky.ffmpeg.ffmpegStrings.CE
import typingsSlinky.ffmpeg.ffmpegStrings.CW
import typingsSlinky.ffmpeg.ffmpegStrings.NC
import typingsSlinky.ffmpeg.ffmpegStrings.NE
import typingsSlinky.ffmpeg.ffmpegStrings.NW
import typingsSlinky.ffmpeg.ffmpegStrings.SC
import typingsSlinky.ffmpeg.ffmpegStrings.SE
import typingsSlinky.ffmpeg.ffmpegStrings.SW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  position  :'NE' | 'NC' | 'NW' | 'SE' | 'SC' | 'SW' | 'C' | 'CE' | 'CW',   margin_nord  :number,   margin_sud  :number,   margin_east  :number,   margin_west  :number}> */
@js.native
trait WatermarkSettings extends js.Object {
  var margin_east: js.UndefOr[Double] = js.native
  var margin_nord: js.UndefOr[Double] = js.native
  var margin_sud: js.UndefOr[Double] = js.native
  var margin_west: js.UndefOr[Double] = js.native
  var position: js.UndefOr[NE | NC | NW | SE | SC | SW | C | CE | CW] = js.native
}

object WatermarkSettings {
  @scala.inline
  def apply(): WatermarkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatermarkSettings]
  }
  @scala.inline
  implicit class WatermarkSettingsOps[Self <: WatermarkSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMargin_east(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin_east")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin_east: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin_east")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin_nord(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin_nord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin_nord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin_nord")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin_sud(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin_sud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin_sud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin_sud")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin_west(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin_west")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin_west: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin_west")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: NE | NC | NW | SE | SC | SW | C | CE | CW): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

