package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructuralElement extends StObject {
  
  /** The zero-based end index of this structural element, exclusive, in UTF-16 code units. */
  var endIndex: js.UndefOr[Double] = js.native
  
  /** A paragraph type of structural element. */
  var paragraph: js.UndefOr[Paragraph] = js.native
  
  /** A section break type of structural element. */
  var sectionBreak: js.UndefOr[SectionBreak] = js.native
  
  /** The zero-based start index of this structural element, in UTF-16 code units. */
  var startIndex: js.UndefOr[Double] = js.native
  
  /** A table type of structural element. */
  var table: js.UndefOr[Table] = js.native
  
  /** A table of contents type of structural element. */
  var tableOfContents: js.UndefOr[TableOfContents] = js.native
}
object StructuralElement {
  
  @scala.inline
  def apply(): StructuralElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuralElement]
  }
  
  @scala.inline
  implicit class StructuralElementMutableBuilder[Self <: StructuralElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    @scala.inline
    def setSectionBreak(value: SectionBreak): Self = StObject.set(x, "sectionBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionBreakUndefined: Self = StObject.set(x, "sectionBreak", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableOfContents(value: TableOfContents): Self = StObject.set(x, "tableOfContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableOfContentsUndefined: Self = StObject.set(x, "tableOfContents", js.undefined)
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
