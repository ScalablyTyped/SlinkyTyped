package typingsSlinky.rollup.mod

import typingsSlinky.rollup.rollupStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreRenderedAsset extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var source: String | js.typedarray.Uint8Array = js.native
  
  var `type`: asset = js.native
}
object PreRenderedAsset {
  
  @scala.inline
  def apply(source: String | js.typedarray.Uint8Array, `type`: asset): PreRenderedAsset = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreRenderedAsset]
  }
  
  @scala.inline
  implicit class PreRenderedAssetMutableBuilder[Self <: PreRenderedAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSource(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
