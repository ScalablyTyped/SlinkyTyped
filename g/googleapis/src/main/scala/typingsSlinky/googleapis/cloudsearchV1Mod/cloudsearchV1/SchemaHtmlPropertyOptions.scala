package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for html properties.
  */
@js.native
trait SchemaHtmlPropertyOptions extends StObject {
  
  /**
    * If set, describes how the property should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaHtmlOperatorOptions] = js.native
  
  /**
    * Indicates the search quality importance of the tokens within the field
    * when used for retrieval. Can only be set to DEFAULT or NONE.
    */
  var retrievalImportance: js.UndefOr[SchemaRetrievalImportance] = js.native
}
object SchemaHtmlPropertyOptions {
  
  @scala.inline
  def apply(): SchemaHtmlPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHtmlPropertyOptions]
  }
  
  @scala.inline
  implicit class SchemaHtmlPropertyOptionsMutableBuilder[Self <: SchemaHtmlPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: SchemaHtmlOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    @scala.inline
    def setRetrievalImportance(value: SchemaRetrievalImportance): Self = StObject.set(x, "retrievalImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalImportanceUndefined: Self = StObject.set(x, "retrievalImportance", js.undefined)
  }
}
