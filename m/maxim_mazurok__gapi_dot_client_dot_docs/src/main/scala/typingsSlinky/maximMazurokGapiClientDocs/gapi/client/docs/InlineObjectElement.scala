package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineObjectElement extends StObject {
  
  /** The ID of the InlineObject this element contains. */
  var inlineObjectId: js.UndefOr[String] = js.native
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this content. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The suggested insertion IDs. An InlineObjectElement may have multiple insertion IDs if it is a nested suggested change. If empty, then this is not a suggested insertion. */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The suggested text style changes to this InlineObject, keyed by suggestion ID. */
  var suggestedTextStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle}
    */ typingsSlinky.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.InlineObjectElement with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The text style of this InlineObjectElement. Similar to text content, like text runs and footnote references, the text style of an inline object element can affect content layout as
    * well as the styling of text inserted adjacent to it.
    */
  var textStyle: js.UndefOr[TextStyle] = js.native
}
object InlineObjectElement {
  
  @scala.inline
  def apply(): InlineObjectElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObjectElement]
  }
  
  @scala.inline
  implicit class InlineObjectElementMutableBuilder[Self <: InlineObjectElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineObjectId(value: String): Self = StObject.set(x, "inlineObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineObjectIdUndefined: Self = StObject.set(x, "inlineObjectId", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedTextStyleChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedTextStyle}
      */ typingsSlinky.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.InlineObjectElement with TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
