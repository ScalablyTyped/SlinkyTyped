package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x0a`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayloadFrame extends Frame {
  
  var data: js.UndefOr[Encodable] = js.native
  
  var flags: Double = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var metadata: js.UndefOr[Encodable] = js.native
  
  var streamId: Double = js.native
  
  var `type`: `0x0a` = js.native
}
object PayloadFrame {
  
  @scala.inline
  def apply(flags: Double, streamId: Double, `type`: `0x0a`): PayloadFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadFrame]
  }
  
  @scala.inline
  implicit class PayloadFrameMutableBuilder[Self <: PayloadFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMetadata(value: Encodable): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x0a`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
