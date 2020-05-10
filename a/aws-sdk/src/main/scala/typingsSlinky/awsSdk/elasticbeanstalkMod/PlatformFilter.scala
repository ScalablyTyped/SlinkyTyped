package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformFilter extends js.Object {
  /**
    * The operator to apply to the Type with each of the Values.  Valid Values: = (equal to) | != (not equal to) | &lt; (less than) | &lt;= (less than or equal to) | &gt; (greater than) | &gt;= (greater than or equal to) | contains | begins_with | ends_with 
    */
  var Operator: js.UndefOr[PlatformFilterOperator] = js.native
  /**
    * The custom platform attribute to which the filter values are applied. Valid Values: PlatformName | PlatformVersion | PlatformStatus | PlatformOwner 
    */
  var Type: js.UndefOr[PlatformFilterType] = js.native
  /**
    * The list of values applied to the custom platform attribute.
    */
  var Values: js.UndefOr[PlatformFilterValueList] = js.native
}

object PlatformFilter {
  @scala.inline
  def apply(): PlatformFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformFilter]
  }
  @scala.inline
  implicit class PlatformFilterOps[Self <: PlatformFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperator(value: PlatformFilterOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PlatformFilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: PlatformFilterValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

