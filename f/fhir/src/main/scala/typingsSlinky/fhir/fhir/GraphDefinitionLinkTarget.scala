package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Potential target for the link
  */
@js.native
trait GraphDefinitionLinkTarget extends BackboneElement {
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Compartment Consistency Rules
    */
  var compartment: js.UndefOr[js.Array[GraphDefinitionLinkTargetCompartment]] = js.native
  /**
    * Additional links from target resource
    */
  var link: js.UndefOr[js.Array[GraphDefinitionLink]] = js.native
  /**
    * Profile for the target resource
    */
  var profile: js.UndefOr[uri] = js.native
  /**
    * Type of resource this link refers to
    */
  var `type`: code = js.native
}

object GraphDefinitionLinkTarget {
  @scala.inline
  def apply(`type`: code): GraphDefinitionLinkTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLinkTarget]
  }
  @scala.inline
  implicit class GraphDefinitionLinkTargetOps[Self <: GraphDefinitionLinkTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_profile(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_profile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_profile")(js.undefined)
        ret
    }
    @scala.inline
    def with_type(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCompartment(value: js.Array[GraphDefinitionLinkTargetCompartment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compartment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compartment")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: js.Array[GraphDefinitionLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
  }
  
}

