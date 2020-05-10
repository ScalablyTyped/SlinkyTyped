package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of an image.
  */
@js.native
trait SchemaImageProperties extends js.Object {
  /**
    * The clockwise rotation angle of the image, in radians.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect.
    */
  var brightness: js.UndefOr[Double] = js.native
  /**
    * A URI to the image with a default lifetime of 30 minutes. This URI is
    * tagged with the account of the requester. Anyone with the URI effectively
    * accesses the image as the original requester. Access to the image may be
    * lost if the document&#39;s sharing settings change.
    */
  var contentUri: js.UndefOr[String] = js.native
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect.
    */
  var contrast: js.UndefOr[Double] = js.native
  /**
    * The crop properties of the image.  After cropping, the image will be
    * stretched to fit in its container.
    */
  var cropProperties: js.UndefOr[SchemaCropProperties] = js.native
  /**
    * The source URI is the URI used to insert the image. The source URI can be
    * empty.
    */
  var sourceUri: js.UndefOr[String] = js.native
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
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
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
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
    def withContentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUri")(js.undefined)
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
    def withSourceUri(value: String): Self = {
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

