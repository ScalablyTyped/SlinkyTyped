package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource with narrative, extensions, and contained resources
  */
@js.native
trait DomainResource
  extends ResourceBase
     with Resource {
  /**
    * Contained, inline Resources
    */
  var contained: js.UndefOr[js.Array[Resource]] = js.native
  /**
    * Additional Content defined by implementations
    */
  var extension: js.UndefOr[js.Array[Extension]] = js.native
  /**
    * Extensions that cannot be ignored
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.native
  /**
    * Text summary of the resource, for human interpretation
    */
  var text: js.UndefOr[Narrative] = js.native
}

object DomainResource {
  @scala.inline
  def apply(): DomainResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainResource]
  }
  @scala.inline
  implicit class DomainResourceOps[Self <: DomainResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContained(value: js.Array[Resource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contained")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierExtension(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Narrative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

