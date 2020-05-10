package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurations extends js.Object {
  /**
    * The current configuration of the broker.
    */
  var Current: js.UndefOr[ConfigurationId] = js.native
  /**
    * The history of configurations applied to the broker.
    */
  var History: js.UndefOr[listOfConfigurationId] = js.native
  /**
    * The pending configuration of the broker.
    */
  var Pending: js.UndefOr[ConfigurationId] = js.native
}

object Configurations {
  @scala.inline
  def apply(): Configurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurations]
  }
  @scala.inline
  implicit class ConfigurationsOps[Self <: Configurations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: ConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Current")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: listOfConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("History")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("History")(js.undefined)
        ret
    }
    @scala.inline
    def withPending(value: ConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(js.undefined)
        ret
    }
  }
  
}

