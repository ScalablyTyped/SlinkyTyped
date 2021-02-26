package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import typingsSlinky.rsocketTypes.rsocketTypesNumbers.`0x06`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestStreamFrame extends Frame {
  
  var data: Encodable = js.native
  
  var flags: Double = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var metadata: Encodable = js.native
  
  var requestN: Double = js.native
  
  var streamId: Double = js.native
  
  var `type`: `0x06` = js.native
}
object RequestStreamFrame {
  
  @scala.inline
  def apply(
    data: Encodable,
    flags: Double,
    metadata: Encodable,
    requestN: Double,
    streamId: Double,
    `type`: `0x06`
  ): RequestStreamFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestStreamFrame]
  }
  
  @scala.inline
  implicit class RequestStreamFrameMutableBuilder[Self <: RequestStreamFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
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
    def setRequestN(value: Double): Self = StObject.set(x, "requestN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0x06`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
