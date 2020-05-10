package typingsSlinky.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YouTubeConfig extends js.Object {
  var embedOptions: js.UndefOr[js.Object] = js.native
  var playerVars: js.UndefOr[js.Object] = js.native
  var preload: js.UndefOr[Boolean] = js.native
}

object YouTubeConfig {
  @scala.inline
  def apply(): YouTubeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubeConfig]
  }
  @scala.inline
  implicit class YouTubeConfigOps[Self <: YouTubeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbedOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerVars(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerVars")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
  }
  
}

