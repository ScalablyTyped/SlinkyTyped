package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2TagFilter extends js.Object {
  /**
    * The tag filter key.
    */
  var Key: js.UndefOr[typingsSlinky.awsSdk.codedeployMod.Key] = js.native
  /**
    * The tag filter type:   KEY_ONLY: Key only.   VALUE_ONLY: Value only.   KEY_AND_VALUE: Key and value.  
    */
  var Type: js.UndefOr[EC2TagFilterType] = js.native
  /**
    * The tag filter value.
    */
  var Value: js.UndefOr[typingsSlinky.awsSdk.codedeployMod.Value] = js.native
}

object EC2TagFilter {
  @scala.inline
  def apply(): EC2TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2TagFilter]
  }
  @scala.inline
  implicit class EC2TagFilterOps[Self <: EC2TagFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Key): Self = {
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
    def withType(value: EC2TagFilterType): Self = {
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
    def withValue(value: Value): Self = {
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

