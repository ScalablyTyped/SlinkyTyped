package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a critical sound configuration that can be included in the
  * `aps` dictionary of an APNs payload.
  */
@js.native
trait CriticalSound extends js.Object {
  /**
    * The critical alert flag. Set to `true` to enable the critical alert.
    */
  var critical: js.UndefOr[Boolean] = js.native
  /**
    * The name of a sound file in the app's main bundle or in the `Library/Sounds`
    * folder of the app's container directory. Specify the string "default" to play
    * the system sound.
    */
  var name: String = js.native
  /**
    * The volume for the critical alert's sound. Must be a value between 0.0
    * (silent) and 1.0 (full volume).
    */
  var volume: js.UndefOr[Double] = js.native
}

object CriticalSound {
  @scala.inline
  def apply(name: String): CriticalSound = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriticalSound]
  }
  @scala.inline
  implicit class CriticalSoundOps[Self <: CriticalSound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCritical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

