package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppArgsSnoopId extends js.Object {
  var app: String = js.native
  var appArgs: js.UndefOr[String] = js.native
  var snoopId: String = js.native
  var spy: js.UndefOr[String] = js.native
  var whisper: js.UndefOr[String] = js.native
}

object AnonAppArgsSnoopId {
  @scala.inline
  def apply(app: String, snoopId: String): AnonAppArgsSnoopId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], snoopId = snoopId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppArgsSnoopId]
  }
  @scala.inline
  implicit class AnonAppArgsSnoopIdOps[Self <: AnonAppArgsSnoopId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnoopId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snoopId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppArgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withSpy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spy")(js.undefined)
        ret
    }
    @scala.inline
    def withWhisper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whisper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhisper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whisper")(js.undefined)
        ret
    }
  }
  
}

