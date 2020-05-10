package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSet extends js.Object {
  /**
    * An array of GeoMatchConstraint objects, which contain the country that you want AWS WAF to search for.
    */
  var GeoMatchConstraints: typingsSlinky.awsSdk.wafMod.GeoMatchConstraints = js.native
  /**
    * The GeoMatchSetId for an GeoMatchSet. You use GeoMatchSetId to get information about a GeoMatchSet (see GeoMatchSet), update a GeoMatchSet (see UpdateGeoMatchSet), insert a GeoMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a GeoMatchSet from AWS WAF (see DeleteGeoMatchSet).  GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId = js.native
  /**
    * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}

object GeoMatchSet {
  @scala.inline
  def apply(GeoMatchConstraints: GeoMatchConstraints, GeoMatchSetId: ResourceId): GeoMatchSet = {
    val __obj = js.Dynamic.literal(GeoMatchConstraints = GeoMatchConstraints.asInstanceOf[js.Any], GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSet]
  }
  @scala.inline
  implicit class GeoMatchSetOps[Self <: GeoMatchSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoMatchConstraints(value: GeoMatchConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoMatchConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeoMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoMatchSetId")(value.asInstanceOf[js.Any])
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

