package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAppConfiguration extends ManagedAppPolicy {
  /**
    * A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned
    * by this service
    */
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.native
}

object ManagedAppConfiguration {
  @scala.inline
  def apply(): ManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppConfiguration]
  }
  @scala.inline
  implicit class ManagedAppConfigurationOps[Self <: ManagedAppConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomSettings(value: js.Array[KeyValuePair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSettings")(js.undefined)
        ret
    }
  }
  
}

