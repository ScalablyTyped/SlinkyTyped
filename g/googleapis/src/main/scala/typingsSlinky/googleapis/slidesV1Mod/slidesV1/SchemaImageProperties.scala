package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the Image.
  */
@js.native
trait SchemaImageProperties extends js.Object {
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var brightness: js.UndefOr[Double] = js.native
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var contrast: js.UndefOr[Double] = js.native
  /**
    * The crop properties of the image. If not set, the image is not cropped.
    * This property is read-only.
    */
  var cropProperties: js.UndefOr[SchemaCropProperties] = js.native
  /**
    * The hyperlink destination of the image. If unset, there is no link.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * The outline of the image. If not set, the image has no outline.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  /**
    * The recolor effect of the image. If not set, the image is not recolored.
    * This property is read-only.
    */
  var recolor: js.UndefOr[SchemaRecolor] = js.native
  /**
    * The shadow of the image. If not set, the image has no shadow. This
    * property is read-only.
    */
  var shadow: js.UndefOr[SchemaShadow] = js.native
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    * This property is read-only.
    */
  var transparency: js.UndefOr[Double] = js.native
}

object SchemaImageProperties {
  @scala.inline
  def apply(): SchemaImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageProperties]
  }
  @scala.inline
  implicit class SchemaImagePropertiesOps[Self <: SchemaImageProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(js.undefined)
        ret
    }
    @scala.inline
    def withContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(js.undefined)
        ret
    }
    @scala.inline
    def withCropProperties(value: SchemaCropProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropProperties")(js.undefined)
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
    def withRecolor(value: SchemaRecolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recolor")(js.undefined)
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
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
  }
  
}

