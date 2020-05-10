package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected start or end of a structural component.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak extends js.Object {
  /**
    * True if break prepends the element.
    */
  var isPrefix: js.UndefOr[Boolean] = js.native
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreakOps[Self <: SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrefix")(js.undefined)
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

