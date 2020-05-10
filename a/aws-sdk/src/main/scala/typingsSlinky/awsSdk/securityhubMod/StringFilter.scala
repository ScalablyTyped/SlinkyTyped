package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringFilter extends js.Object {
  /**
    * The condition to be applied to a string value when querying for findings. 
    */
  var Comparison: js.UndefOr[StringFilterComparison] = js.native
  /**
    * The string filter value.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}

object StringFilter {
  @scala.inline
  def apply(): StringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringFilter]
  }
  @scala.inline
  implicit class StringFilterOps[Self <: StringFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparison(value: StringFilterComparison): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comparison")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

