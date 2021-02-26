package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaApiDataRow extends StObject {
  
  var clicks: js.UndefOr[Double] = js.native
  
  var ctr: js.UndefOr[Double] = js.native
  
  var impressions: js.UndefOr[Double] = js.native
  
  var keys: js.UndefOr[js.Array[String]] = js.native
  
  var position: js.UndefOr[Double] = js.native
}
object SchemaApiDataRow {
  
  @scala.inline
  def apply(): SchemaApiDataRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiDataRow]
  }
  
  @scala.inline
  implicit class SchemaApiDataRowMutableBuilder[Self <: SchemaApiDataRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicksUndefined: Self = StObject.set(x, "clicks", js.undefined)
    
    @scala.inline
    def setCtr(value: Double): Self = StObject.set(x, "ctr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrUndefined: Self = StObject.set(x, "ctr", js.undefined)
    
    @scala.inline
    def setImpressions(value: Double): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
