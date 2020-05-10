package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeConstraintSet extends js.Object {
  /**
    * The name, if any, of the SizeConstraintSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * A unique identifier for a SizeConstraintSet. You use SizeConstraintSetId to get information about a SizeConstraintSet (see GetSizeConstraintSet), update a SizeConstraintSet (see UpdateSizeConstraintSet), insert a SizeConstraintSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SizeConstraintSet from AWS WAF (see DeleteSizeConstraintSet).  SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId = js.native
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  var SizeConstraints: typingsSlinky.awsSdk.wafMod.SizeConstraints = js.native
}

object SizeConstraintSet {
  @scala.inline
  def apply(SizeConstraintSetId: ResourceId, SizeConstraints: SizeConstraints): SizeConstraintSet = {
    val __obj = js.Dynamic.literal(SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any], SizeConstraints = SizeConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSet]
  }
  @scala.inline
  implicit class SizeConstraintSetOps[Self <: SizeConstraintSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizeConstraintSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeConstraintSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeConstraints(value: SizeConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

