package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapFilter extends js.Object {
  /**
    * The condition to apply to a key value when querying for findings with a map filter.
    */
  var Comparison: js.UndefOr[MapFilterComparison] = js.native
  /**
    * The key of the map filter.
    */
  var Key: js.UndefOr[NonEmptyString] = js.native
  /**
    * The value for the key in the map filter.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}

object MapFilter {
  @scala.inline
  def apply(): MapFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapFilter]
  }
  @scala.inline
  implicit class MapFilterOps[Self <: MapFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparison(value: MapFilterComparison): Self = {
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
    def withKey(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
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

