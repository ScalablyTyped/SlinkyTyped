package typingsSlinky.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of InkAnalysisLine objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysisLineCollectionLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkAnalysisLine object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Reference to the parent InkAnalysisParagraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ink analysis words in this ink analysis line.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var words: js.UndefOr[InkAnalysisWordCollectionLoadOptions] = js.native
}
object InkAnalysisLineCollectionLoadOptions {
  
  @scala.inline
  def apply(): InkAnalysisLineCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class InkAnalysisLineCollectionLoadOptionsMutableBuilder[Self <: InkAnalysisLineCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setParagraph(value: InkAnalysisParagraphLoadOptions): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    @scala.inline
    def setWords(value: InkAnalysisWordCollectionLoadOptions): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
  }
}
