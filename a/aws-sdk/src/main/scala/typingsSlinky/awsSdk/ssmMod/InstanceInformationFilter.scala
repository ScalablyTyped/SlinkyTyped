package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInformationFilter extends js.Object {
  /**
    * The name of the filter. 
    */
  var key: InstanceInformationFilterKey = js.native
  /**
    * The filter values.
    */
  var valueSet: InstanceInformationFilterValueSet = js.native
}

object InstanceInformationFilter {
  @scala.inline
  def apply(key: InstanceInformationFilterKey, valueSet: InstanceInformationFilterValueSet): InstanceInformationFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformationFilter]
  }
  @scala.inline
  implicit class InstanceInformationFilterOps[Self <: InstanceInformationFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: InstanceInformationFilterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueSet(value: InstanceInformationFilterValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

