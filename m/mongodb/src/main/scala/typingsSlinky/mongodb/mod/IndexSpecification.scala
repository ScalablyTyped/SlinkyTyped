package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSpecification extends StObject {
  
  var `2dsphereIndexVersion`: js.UndefOr[scala.Double] = js.native
  
  var background: js.UndefOr[Boolean] = js.native
  
  var bits: js.UndefOr[scala.Double] = js.native
  
  var bucketSize: js.UndefOr[scala.Double] = js.native
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var default_language: js.UndefOr[String] = js.native
  
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.native
  
  var key: js.Object = js.native
  
  var language_override: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[scala.Double] = js.native
  
  var min: js.UndefOr[scala.Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var partialFilterExpression: js.UndefOr[js.Object] = js.native
  
  var sparse: js.UndefOr[Boolean] = js.native
  
  var storageEngine: js.UndefOr[js.Object] = js.native
  
  var textIndexVersion: js.UndefOr[scala.Double] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
  
  var weights: js.UndefOr[js.Object] = js.native
}
object IndexSpecification {
  
  @scala.inline
  def apply(key: js.Object): IndexSpecification = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSpecification]
  }
  
  @scala.inline
  implicit class IndexSpecificationMutableBuilder[Self <: IndexSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set2dsphereIndexVersion(value: scala.Double): Self = StObject.set(x, "2dsphereIndexVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2dsphereIndexVersionUndefined: Self = StObject.set(x, "2dsphereIndexVersion", js.undefined)
    
    @scala.inline
    def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBits(value: scala.Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
    
    @scala.inline
    def setBucketSize(value: scala.Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setDefault_language(value: String): Self = StObject.set(x, "default_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_languageUndefined: Self = StObject.set(x, "default_language", js.undefined)
    
    @scala.inline
    def setExpireAfterSeconds(value: scala.Double): Self = StObject.set(x, "expireAfterSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireAfterSecondsUndefined: Self = StObject.set(x, "expireAfterSeconds", js.undefined)
    
    @scala.inline
    def setKey(value: js.Object): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_override(value: String): Self = StObject.set(x, "language_override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_overrideUndefined: Self = StObject.set(x, "language_override", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPartialFilterExpression(value: js.Object): Self = StObject.set(x, "partialFilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialFilterExpressionUndefined: Self = StObject.set(x, "partialFilterExpression", js.undefined)
    
    @scala.inline
    def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    
    @scala.inline
    def setStorageEngine(value: js.Object): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    
    @scala.inline
    def setTextIndexVersion(value: scala.Double): Self = StObject.set(x, "textIndexVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextIndexVersionUndefined: Self = StObject.set(x, "textIndexVersion", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    @scala.inline
    def setWeights(value: js.Object): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
  }
}
