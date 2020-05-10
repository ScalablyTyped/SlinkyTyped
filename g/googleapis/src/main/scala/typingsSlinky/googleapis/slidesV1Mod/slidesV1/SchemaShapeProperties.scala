package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of a Shape.  If the shape is a placeholder shape as
  * determined by the placeholder field, then these properties may be inherited
  * from a parent placeholder shape. Determining the rendered value of the
  * property depends on the corresponding property_state field value.
  */
@js.native
trait SchemaShapeProperties extends js.Object {
  /**
    * The alignment of the content in the shape. If unspecified, the alignment
    * is inherited from a parent placeholder if it exists. If the shape has no
    * parent, the default alignment matches the alignment for new shapes
    * created in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  /**
    * The hyperlink destination of the shape. If unset, there is no link. Links
    * are not inherited from parent placeholders.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * The outline of the shape. If unset, the outline is inherited from a
    * parent placeholder if it exists. If the shape has no parent, then the
    * default outline depends on the shape type, matching the defaults for new
    * shapes created in the Slides editor.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  /**
    * The shadow properties of the shape. If unset, the shadow is inherited
    * from a parent placeholder if it exists. If the shape has no parent, then
    * the default shadow matches the defaults for new shapes created in the
    * Slides editor. This property is read-only.
    */
  var shadow: js.UndefOr[SchemaShadow] = js.native
  /**
    * The background fill of the shape. If unset, the background fill is
    * inherited from a parent placeholder if it exists. If the shape has no
    * parent, then the default background fill depends on the shape type,
    * matching the defaults for new shapes created in the Slides editor.
    */
  var shapeBackgroundFill: js.UndefOr[SchemaShapeBackgroundFill] = js.native
}

object SchemaShapeProperties {
  @scala.inline
  def apply(): SchemaShapeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShapeProperties]
  }
  @scala.inline
  implicit class SchemaShapePropertiesOps[Self <: SchemaShapeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: SchemaLink): Self = {
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
    def withOutline(value: SchemaOutline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: SchemaShadow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeBackgroundFill(value: SchemaShapeBackgroundFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeBackgroundFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeBackgroundFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeBackgroundFill")(js.undefined)
        ret
    }
  }
  
}

