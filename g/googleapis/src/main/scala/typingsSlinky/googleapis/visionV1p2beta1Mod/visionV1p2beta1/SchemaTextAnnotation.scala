package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaTextAnnotation extends js.Object {
  
  /**
    * List of pages detected by OCR.
    */
  var pages: js.UndefOr[js.Array[SchemaPage]] = js.native
  
  /**
    * UTF-8 text detected on the pages.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaTextAnnotation {
  
  @scala.inline
  def apply(): SchemaTextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextAnnotation]
  }
  
  @scala.inline
  implicit class SchemaTextAnnotationOps[Self <: SchemaTextAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPagesVarargs(value: SchemaPage*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[SchemaPage]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
