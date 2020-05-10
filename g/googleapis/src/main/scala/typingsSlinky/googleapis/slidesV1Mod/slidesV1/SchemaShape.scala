package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a generic shape that does not have a more
  * specific classification.
  */
@js.native
trait SchemaShape extends js.Object {
  /**
    * Placeholders are shapes that are inherit from corresponding placeholders
    * on layouts and masters.  If set, the shape is a placeholder shape and any
    * inherited properties can be resolved by looking at the parent placeholder
    * identified by the Placeholder.parent_object_id field.
    */
  var placeholder: js.UndefOr[SchemaPlaceholder] = js.native
  /**
    * The properties of the shape.
    */
  var shapeProperties: js.UndefOr[SchemaShapeProperties] = js.native
  /**
    * The type of the shape.
    */
  var shapeType: js.UndefOr[String] = js.native
  /**
    * The text content of the shape.
    */
  var text: js.UndefOr[SchemaTextContent] = js.native
}

object SchemaShape {
  @scala.inline
  def apply(): SchemaShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShape]
  }
  @scala.inline
  implicit class SchemaShapeOps[Self <: SchemaShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholder(value: SchemaPlaceholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeProperties(value: SchemaShapeProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeType")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: SchemaTextContent): Self = {
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

