package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanRateProperty extends js.Object {
  /**
    * The property name.
    */
  var name: js.UndefOr[SavingsPlanRatePropertyKey] = js.native
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.native
}

object SavingsPlanRateProperty {
  @scala.inline
  def apply(): SavingsPlanRateProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanRateProperty]
  }
  @scala.inline
  implicit class SavingsPlanRatePropertyOps[Self <: SavingsPlanRateProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: SavingsPlanRatePropertyKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: JsonSafeFilterValueString): Self = {
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

