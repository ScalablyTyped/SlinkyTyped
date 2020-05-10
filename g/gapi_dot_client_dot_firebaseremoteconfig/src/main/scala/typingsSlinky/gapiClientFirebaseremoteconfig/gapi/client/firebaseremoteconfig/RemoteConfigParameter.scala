package typingsSlinky.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConfigParameter extends js.Object {
  /**
    * Optional - a map of (condition_name, value). The condition_name of the
    * highest priority (the one listed first in the conditions array) determines
    * the value of this parameter.
    */
  var conditionalValues: js.UndefOr[Record[String, RemoteConfigParameterValue]] = js.native
  /**
    * Optional - value to set the parameter to, when none of the named conditions
    * evaluate to <code>true</code>.
    */
  var defaultValue: js.UndefOr[RemoteConfigParameterValue] = js.native
}

object RemoteConfigParameter {
  @scala.inline
  def apply(): RemoteConfigParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteConfigParameter]
  }
  @scala.inline
  implicit class RemoteConfigParameterOps[Self <: RemoteConfigParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionalValues(value: Record[String, RemoteConfigParameterValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: RemoteConfigParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
  }
  
}

