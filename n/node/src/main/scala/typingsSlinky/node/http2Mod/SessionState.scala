package typingsSlinky.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionState extends StObject {
  
  var deflateDynamicTableSize: js.UndefOr[Double] = js.native
  
  var effectiveLocalWindowSize: js.UndefOr[Double] = js.native
  
  var effectiveRecvDataLength: js.UndefOr[Double] = js.native
  
  var inflateDynamicTableSize: js.UndefOr[Double] = js.native
  
  var lastProcStreamID: js.UndefOr[Double] = js.native
  
  var localWindowSize: js.UndefOr[Double] = js.native
  
  var nextStreamID: js.UndefOr[Double] = js.native
  
  var outboundQueueSize: js.UndefOr[Double] = js.native
  
  var remoteWindowSize: js.UndefOr[Double] = js.native
}
object SessionState {
  
  @scala.inline
  def apply(): SessionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionState]
  }
  
  @scala.inline
  implicit class SessionStateMutableBuilder[Self <: SessionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeflateDynamicTableSize(value: Double): Self = StObject.set(x, "deflateDynamicTableSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeflateDynamicTableSizeUndefined: Self = StObject.set(x, "deflateDynamicTableSize", js.undefined)
    
    @scala.inline
    def setEffectiveLocalWindowSize(value: Double): Self = StObject.set(x, "effectiveLocalWindowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveLocalWindowSizeUndefined: Self = StObject.set(x, "effectiveLocalWindowSize", js.undefined)
    
    @scala.inline
    def setEffectiveRecvDataLength(value: Double): Self = StObject.set(x, "effectiveRecvDataLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveRecvDataLengthUndefined: Self = StObject.set(x, "effectiveRecvDataLength", js.undefined)
    
    @scala.inline
    def setInflateDynamicTableSize(value: Double): Self = StObject.set(x, "inflateDynamicTableSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflateDynamicTableSizeUndefined: Self = StObject.set(x, "inflateDynamicTableSize", js.undefined)
    
    @scala.inline
    def setLastProcStreamID(value: Double): Self = StObject.set(x, "lastProcStreamID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastProcStreamIDUndefined: Self = StObject.set(x, "lastProcStreamID", js.undefined)
    
    @scala.inline
    def setLocalWindowSize(value: Double): Self = StObject.set(x, "localWindowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalWindowSizeUndefined: Self = StObject.set(x, "localWindowSize", js.undefined)
    
    @scala.inline
    def setNextStreamID(value: Double): Self = StObject.set(x, "nextStreamID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextStreamIDUndefined: Self = StObject.set(x, "nextStreamID", js.undefined)
    
    @scala.inline
    def setOutboundQueueSize(value: Double): Self = StObject.set(x, "outboundQueueSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundQueueSizeUndefined: Self = StObject.set(x, "outboundQueueSize", js.undefined)
    
    @scala.inline
    def setRemoteWindowSize(value: Double): Self = StObject.set(x, "remoteWindowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteWindowSizeUndefined: Self = StObject.set(x, "remoteWindowSize", js.undefined)
  }
}
