package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaOptions extends js.Object {
  var albumsControl: js.UndefOr[Boolean] = js.native
  var albumsControlOptions: js.UndefOr[AlbumsControlOptions] = js.native
  var indoorSceneSwitchControl: js.UndefOr[Boolean] = js.native
  var linksControl: js.UndefOr[Boolean] = js.native
  var navigationControl: js.UndefOr[Boolean] = js.native
}

object PanoramaOptions {
  @scala.inline
  def apply(): PanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoramaOptions]
  }
  @scala.inline
  implicit class PanoramaOptionsOps[Self <: PanoramaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbumsControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumsControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumsControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumsControl")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumsControlOptions(value: AlbumsControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumsControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumsControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumsControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIndoorSceneSwitchControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoorSceneSwitchControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndoorSceneSwitchControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoorSceneSwitchControl")(js.undefined)
        ret
    }
    @scala.inline
    def withLinksControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinksControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksControl")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationControl")(js.undefined)
        ret
    }
  }
  
}

