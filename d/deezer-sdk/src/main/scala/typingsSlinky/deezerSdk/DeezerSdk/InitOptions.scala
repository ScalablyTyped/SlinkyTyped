package typingsSlinky.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}
  */
@js.native
trait InitOptions extends js.Object {
  val appId: String = js.native
  val channelUrl: String = js.native
  val player: js.UndefOr[PlayerOptions] = js.native
}

object InitOptions {
  @scala.inline
  def apply(appId: String, channelUrl: String): InitOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], channelUrl = channelUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayer(value: PlayerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(js.undefined)
        ret
    }
  }
  
}

