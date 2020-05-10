package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextAnnotation contains a structured representation of OCR extracted text.
  * The hierarchy of an OCR extracted text structure is like this:
  * TextAnnotation -&gt; Page -&gt; Block -&gt; Paragraph -&gt; Word -&gt;
  * Symbol Each structural component, starting from Page, may further have
  * their own properties. Properties describe detected languages, breaks etc..
  * Please refer to the TextAnnotation.TextProperty message definition below
  * for more detail.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1TextAnnotation extends js.Object {
  /**
    * List of pages detected by OCR.
    */
  var pages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1Page]] = js.native
  /**
    * UTF-8 text detected on the pages.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1TextAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1TextAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1TextAnnotationOps[Self <: SchemaGoogleCloudVisionV1p2beta1TextAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPages(value: js.Array[SchemaGoogleCloudVisionV1p2beta1Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
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

