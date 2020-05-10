package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeProperties extends js.Object {
  /**
    * The hyperlink destination of the shape. If unset, there is no link. Links
    * are not inherited from parent placeholders.
    */
  var link: js.UndefOr[Link] = js.native
  /**
    * The outline of the shape. If unset, the outline is inherited from a
    * parent placeholder if it exists. If the shape has no parent, then the
    * default outline depends on the shape type, matching the defaults for
    * new shapes created in the Slides editor.
    */
  var outline: js.UndefOr[Outline] = js.native
  /**
    * The shadow properties of the shape. If unset, the shadow is inherited from
    * a parent placeholder if it exists. If the shape has no parent, then the
    * default shadow matches the defaults for new shapes created in the Slides
    * editor. This property is read-only.
    */
  var shadow: js.UndefOr[Shadow] = js.native
  /**
    * The background fill of the shape. If unset, the background fill is
    * inherited from a parent placeholder if it exists. If the shape has no
    * parent, then the default background fill depends on the shape type,
    * matching the defaults for new shapes created in the Slides editor.
    */
  var shapeBackgroundFill: js.UndefOr[ShapeBackgroundFill] = js.native
}

object ShapeProperties {
  @scala.inline
  def apply(): ShapeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeProperties]
  }
  @scala.inline
  implicit class ShapePropertiesOps[Self <: ShapeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLink(value: Link): Self = {
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
    def withOutline(value: Outline): Self = {
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
    def withShadow(value: Shadow): Self = {
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
    def withShapeBackgroundFill(value: ShapeBackgroundFill): Self = {
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

