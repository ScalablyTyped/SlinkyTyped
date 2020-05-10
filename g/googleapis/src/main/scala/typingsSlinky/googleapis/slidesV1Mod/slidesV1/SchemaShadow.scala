package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The shadow properties of a page element.  If these fields are unset, they
  * may be inherited from a parent placeholder if it exists. If there is no
  * parent, the fields will default to the value used for new page elements
  * created in the Slides editor, which may depend on the page element kind.
  */
@js.native
trait SchemaShadow extends js.Object {
  /**
    * The alignment point of the shadow, that sets the origin for translate,
    * scale and skew of the shadow. This property is read-only.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * The alpha of the shadow&#39;s color, from 0.0 to 1.0.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The radius of the shadow blur. The larger the radius, the more diffuse
    * the shadow becomes.
    */
  var blurRadius: js.UndefOr[SchemaDimension] = js.native
  /**
    * The shadow color value.
    */
  var color: js.UndefOr[SchemaOpaqueColor] = js.native
  /**
    * The shadow property state.  Updating the shadow on a page element will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no shadow on a page element, set
    * this field to `NOT_RENDERED`. In this case, any other shadow fields set
    * in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * Whether the shadow should rotate with the shape. This property is
    * read-only.
    */
  var rotateWithShape: js.UndefOr[Boolean] = js.native
  /**
    * Transform that encodes the translate, scale, and skew of the shadow,
    * relative to the alignment position.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
  /**
    * The type of the shadow. This property is read-only.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaShadow {
  @scala.inline
  def apply(): SchemaShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShadow]
  }
  @scala.inline
  implicit class SchemaShadowOps[Self <: SchemaShadow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurRadius(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: SchemaOpaqueColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateWithShape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateWithShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateWithShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateWithShape")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: SchemaAffineTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

