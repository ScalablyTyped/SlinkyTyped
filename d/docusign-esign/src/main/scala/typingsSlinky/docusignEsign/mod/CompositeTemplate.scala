package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeTemplate extends StObject {
  
  /**
    * The id of this composite template. This id is used as a reference when adding document object information. If used, the document's `content-disposition`
    * must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition,
    * the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.
    */
  var compositeTemplateId: js.UndefOr[String] = js.native
  
  /**
    * An optional document object that will act as the primary document in the composite template object. If the document node is present, it will take
    * precedence over any server template or inline template documents. It always comes first. Only use this when you want to supply the document dynamically.
    */
  var document: js.UndefOr[/* A document object. */ Document] = js.native
  
  /**
    *  Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.
    */
  var inlineTemplates: js.UndefOr[js.Array[InlineTemplate]] = js.native
  
  /**
    * A number representing the sequence in which to apply the template that contains the PDF metadata.
    *
    * Example: `4`
    */
  var pdfMetaDataTemplateSequence: js.UndefOr[String] = js.native
  
  /**
    * Zero or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value
    */
  var serverTemplates: js.UndefOr[js.Array[ServerTemplate]] = js.native
}
object CompositeTemplate {
  
  @scala.inline
  def apply(): CompositeTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeTemplate]
  }
  
  @scala.inline
  implicit class CompositeTemplateMutableBuilder[Self <: CompositeTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompositeTemplateId(value: String): Self = StObject.set(x, "compositeTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeTemplateIdUndefined: Self = StObject.set(x, "compositeTemplateId", js.undefined)
    
    @scala.inline
    def setDocument(value: /* A document object. */ Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setInlineTemplates(value: js.Array[InlineTemplate]): Self = StObject.set(x, "inlineTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineTemplatesUndefined: Self = StObject.set(x, "inlineTemplates", js.undefined)
    
    @scala.inline
    def setInlineTemplatesVarargs(value: InlineTemplate*): Self = StObject.set(x, "inlineTemplates", js.Array(value :_*))
    
    @scala.inline
    def setPdfMetaDataTemplateSequence(value: String): Self = StObject.set(x, "pdfMetaDataTemplateSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfMetaDataTemplateSequenceUndefined: Self = StObject.set(x, "pdfMetaDataTemplateSequence", js.undefined)
    
    @scala.inline
    def setServerTemplates(value: js.Array[ServerTemplate]): Self = StObject.set(x, "serverTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTemplatesUndefined: Self = StObject.set(x, "serverTemplates", js.undefined)
    
    @scala.inline
    def setServerTemplatesVarargs(value: ServerTemplate*): Self = StObject.set(x, "serverTemplates", js.Array(value :_*))
  }
}
