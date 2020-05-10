package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The crop properties of an image.  The crop rectangle is represented using
  * fractional offsets from the original content&#39;s four edges.  - If the
  * offset is in the interval (0, 1), the corresponding edge of crop rectangle
  * is positioned inside of the image&#39;s original bounding rectangle. - If
  * the offset is negative or greater than 1, the corresponding edge of crop
  * rectangle is positioned outside of the image&#39;s original bounding
  * rectangle. - If all offsets and rotation angle are 0, the image is not
  * cropped.
  */
@js.native
trait SchemaCropProperties extends js.Object {
  /**
    * The clockwise rotation angle of the crop rectangle around its center, in
    * radians. Rotation is applied after the offsets.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The offset specifies how far inwards the bottom edge of the crop
    * rectangle is from the bottom edge of the original content as a fraction
    * of the original content&#39;s height.
    */
  var offsetBottom: js.UndefOr[Double] = js.native
  /**
    * The offset specifies how far inwards the left edge of the crop rectangle
    * is from the left edge of the original content as a fraction of the
    * original content&#39;s width.
    */
  var offsetLeft: js.UndefOr[Double] = js.native
  /**
    * The offset specifies how far inwards the right edge of the crop rectangle
    * is from the right edge of the original content as a fraction of the
    * original content&#39;s width.
    */
  var offsetRight: js.UndefOr[Double] = js.native
  /**
    * The offset specifies how far inwards the top edge of the crop rectangle
    * is from the top edge of the original content as a fraction of the
    * original content&#39;s height.
    */
  var offsetTop: js.UndefOr[Double] = js.native
}

object SchemaCropProperties {
  @scala.inline
  def apply(): SchemaCropProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropProperties]
  }
  @scala.inline
  implicit class SchemaCropPropertiesOps[Self <: SchemaCropProperties] (val x: Self) extends AnyVal {
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
    def withOffsetBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(js.undefined)
        ret
    }
  }
  
}

