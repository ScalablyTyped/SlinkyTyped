package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetAttributeReference extends js.Object {
  /**
    * The target attribute name that is associated with the facet reference. See Attribute References for more information.
    */
  var TargetAttributeName: AttributeName = js.native
  /**
    * The target facet name that is associated with the facet reference. See Attribute References for more information.
    */
  var TargetFacetName: FacetName = js.native
}

object FacetAttributeReference {
  @scala.inline
  def apply(TargetAttributeName: AttributeName, TargetFacetName: FacetName): FacetAttributeReference = {
    val __obj = js.Dynamic.literal(TargetAttributeName = TargetAttributeName.asInstanceOf[js.Any], TargetFacetName = TargetFacetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttributeReference]
  }
  @scala.inline
  implicit class FacetAttributeReferenceOps[Self <: FacetAttributeReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetAttributeName(value: AttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetFacetName(value: FacetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetFacetName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

