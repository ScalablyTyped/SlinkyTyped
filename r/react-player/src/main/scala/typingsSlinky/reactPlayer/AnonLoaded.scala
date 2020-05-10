package typingsSlinky.reactPlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLoaded extends js.Object {
  var loaded: Double = js.native
  var loadedSeconds: Double = js.native
  var played: Double = js.native
  var playedSeconds: Double = js.native
}

object AnonLoaded {
  @scala.inline
  def apply(loaded: Double, loadedSeconds: Double, played: Double, playedSeconds: Double): AnonLoaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], loadedSeconds = loadedSeconds.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], playedSeconds = playedSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoaded]
  }
  @scala.inline
  implicit class AnonLoadedOps[Self <: AnonLoaded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadedSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("played")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayedSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playedSeconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

