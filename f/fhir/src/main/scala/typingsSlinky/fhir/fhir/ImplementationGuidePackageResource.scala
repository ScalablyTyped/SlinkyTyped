package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource in the implementation guide
  */
@js.native
trait ImplementationGuidePackageResource extends BackboneElement {
  /**
    * Contains extended information for property 'acronym'.
    */
  var _acronym: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'example'.
    */
  var _example: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sourceUri'.
    */
  var _sourceUri: js.UndefOr[Element] = js.native
  /**
    * Short code to identify the resource
    */
  var acronym: js.UndefOr[String] = js.native
  /**
    * Reason why included in guide
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If not an example, has its normal meaning
    */
  var example: Boolean = js.native
  /**
    * Resource this is an example of (if applicable)
    */
  var exampleFor: js.UndefOr[Reference] = js.native
  /**
    * Human Name for the resource
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Location of the resource
    */
  var sourceReference: js.UndefOr[Reference] = js.native
  /**
    * Location of the resource
    */
  var sourceUri: js.UndefOr[uri] = js.native
}

object ImplementationGuidePackageResource {
  @scala.inline
  def apply(example: Boolean): ImplementationGuidePackageResource = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePackageResource]
  }
  @scala.inline
  implicit class ImplementationGuidePackageResourceOps[Self <: ImplementationGuidePackageResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExample(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("example")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_acronym(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_acronym")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_acronym: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_acronym")(js.undefined)
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_example(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_example")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_example: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_example")(js.undefined)
        ret
    }
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
        ret
    }
    @scala.inline
    def with_sourceUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceUri")(js.undefined)
        ret
    }
    @scala.inline
    def withAcronym(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acronym")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcronym: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acronym")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExampleFor(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExampleFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleFor")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(js.undefined)
        ret
    }
  }
  
}

