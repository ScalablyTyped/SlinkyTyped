package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInstanceFilter extends js.Object {
  /**
    * The name of the search filter field.
    */
  var name: js.UndefOr[SystemInstanceFilterName] = js.native
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search. 
    */
  var value: js.UndefOr[SystemInstanceFilterValues] = js.native
}

object SystemInstanceFilter {
  @scala.inline
  def apply(): SystemInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceFilter]
  }
  @scala.inline
  implicit class SystemInstanceFilterOps[Self <: SystemInstanceFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: SystemInstanceFilterName): Self = {
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
    def withValue(value: SystemInstanceFilterValues): Self = {
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

