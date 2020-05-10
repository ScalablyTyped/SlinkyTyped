package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFacetResponse extends js.Object {
  /**
    * The Facet structure that is associated with the facet.
    */
  var Facet: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.Facet] = js.native
}

object GetFacetResponse {
  @scala.inline
  def apply(): GetFacetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFacetResponse]
  }
  @scala.inline
  implicit class GetFacetResponseOps[Self <: GetFacetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacet(value: Facet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Facet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Facet")(js.undefined)
        ret
    }
  }
  
}

