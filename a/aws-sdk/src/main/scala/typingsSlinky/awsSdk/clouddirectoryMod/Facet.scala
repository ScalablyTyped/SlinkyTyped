package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Facet extends js.Object {
  /**
    * There are two different styles that you can define on any given facet, Static and Dynamic. For static facets, all attributes must be defined in the schema. For dynamic facets, attributes can be defined during data plane operations.
    */
  var FacetStyle: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.FacetStyle] = js.native
  /**
    * The name of the Facet.
    */
  var Name: js.UndefOr[FacetName] = js.native
  /**
    * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
    */
  var ObjectType: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectType] = js.native
}

object Facet {
  @scala.inline
  def apply(): Facet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facet]
  }
  @scala.inline
  implicit class FacetOps[Self <: Facet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacetStyle(value: FacetStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: FacetName): Self = {
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
    @scala.inline
    def withObjectType(value: ObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(js.undefined)
        ret
    }
  }
  
}

