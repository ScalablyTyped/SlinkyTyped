package typingsSlinky.firebaseRemoteConfig.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var FIREBASE_REMOTE_CONFIG_URL_BASE: String = js.native
}

object Window {
  @scala.inline
  def apply(FIREBASE_REMOTE_CONFIG_URL_BASE: String): Window = {
    val __obj = js.Dynamic.literal(FIREBASE_REMOTE_CONFIG_URL_BASE = FIREBASE_REMOTE_CONFIG_URL_BASE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFIREBASE_REMOTE_CONFIG_URL_BASE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIREBASE_REMOTE_CONFIG_URL_BASE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

