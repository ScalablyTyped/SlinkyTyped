package typingsSlinky.leafletFullscreen.mod

import typingsSlinky.leafletFullscreen.mod.Control_.FullscreenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var fullscreenControl: js.UndefOr[Boolean] = js.native
  var fullscreenControlOptions: js.UndefOr[FullscreenOptions] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullscreenControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenControl")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenControlOptions(value: FullscreenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenControlOptions")(js.undefined)
        ret
    }
  }
  
}

