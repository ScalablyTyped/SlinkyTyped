package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailoverContext extends js.Object {
  /** This is always sql#failoverContext. */
  var kind: js.UndefOr[String] = js.native
  /** The current settings version of this instance. Request will be rejected if this version doesn't match the current settings version. */
  var settingsVersion: js.UndefOr[String] = js.native
}

object FailoverContext {
  @scala.inline
  def apply(): FailoverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverContext]
  }
  @scala.inline
  implicit class FailoverContextOps[Self <: FailoverContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsVersion")(js.undefined)
        ret
    }
  }
  
}

