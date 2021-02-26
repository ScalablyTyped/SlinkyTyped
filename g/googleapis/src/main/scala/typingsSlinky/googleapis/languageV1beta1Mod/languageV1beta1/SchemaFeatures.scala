package typingsSlinky.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All available features for sentiment, syntax, and semantic analysis.
  * Setting each one to true will enable that specific analysis for the input.
  */
@js.native
trait SchemaFeatures extends StObject {
  
  /**
    * Extract document-level sentiment.
    */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.native
  
  /**
    * Extract entities.
    */
  var extractEntities: js.UndefOr[Boolean] = js.native
  
  /**
    * Extract syntax information.
    */
  var extractSyntax: js.UndefOr[Boolean] = js.native
}
object SchemaFeatures {
  
  @scala.inline
  def apply(): SchemaFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatures]
  }
  
  @scala.inline
  implicit class SchemaFeaturesMutableBuilder[Self <: SchemaFeatures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtractDocumentSentiment(value: Boolean): Self = StObject.set(x, "extractDocumentSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractDocumentSentimentUndefined: Self = StObject.set(x, "extractDocumentSentiment", js.undefined)
    
    @scala.inline
    def setExtractEntities(value: Boolean): Self = StObject.set(x, "extractEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractEntitiesUndefined: Self = StObject.set(x, "extractEntities", js.undefined)
    
    @scala.inline
    def setExtractSyntax(value: Boolean): Self = StObject.set(x, "extractSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractSyntaxUndefined: Self = StObject.set(x, "extractSyntax", js.undefined)
  }
}
