package typingsSlinky.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConfigParameterValue extends js.Object {
  /** if true, omit the parameter from the map of fetched parameter values */
  var useInAppDefault: js.UndefOr[Boolean] = js.native
  /** the string to set the parameter to */
  var value: js.UndefOr[String] = js.native
}

object RemoteConfigParameterValue {
  @scala.inline
  def apply(): RemoteConfigParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteConfigParameterValue]
  }
  @scala.inline
  implicit class RemoteConfigParameterValueOps[Self <: RemoteConfigParameterValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseInAppDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInAppDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseInAppDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInAppDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

