package typingsSlinky.deezerSdk.DeezerSdk

import typingsSlinky.deezerSdk.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready}
  */
@js.native
trait SdkOptions extends js.Object {
  /**
    * In addition to the PlayerState properties,
    * {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready} also documents the
    * property current_track, but the author of this comment was not able no retrieve it.
    */
  val player: PlayerState = js.native
  val token: Accesstoken = js.native
}

object SdkOptions {
  @scala.inline
  def apply(player: PlayerState, token: Accesstoken): SdkOptions = {
    val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkOptions]
  }
  @scala.inline
  implicit class SdkOptionsOps[Self <: SdkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayer(value: PlayerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: Accesstoken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

