package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends StObject {
  
  /** Height of this size. Acceptable values are 0 to 32767, inclusive. */
  var height: js.UndefOr[Double] = js.native
  
  /** IAB standard size. This is a read-only, auto-generated field. */
  var iab: js.UndefOr[Boolean] = js.native
  
  /** ID of this size. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#size". */
  var kind: js.UndefOr[String] = js.native
  
  /** Width of this size. Acceptable values are 0 to 32767, inclusive. */
  var width: js.UndefOr[Double] = js.native
}
object Size {
  
  @scala.inline
  def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIab(value: Boolean): Self = StObject.set(x, "iab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIabUndefined: Self = StObject.set(x, "iab", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
