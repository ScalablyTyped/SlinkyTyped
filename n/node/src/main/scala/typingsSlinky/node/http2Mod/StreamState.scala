package typingsSlinky.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamState extends StObject {
  
  var localClose: js.UndefOr[Double] = js.native
  
  var localWindowSize: js.UndefOr[Double] = js.native
  
  var remoteClose: js.UndefOr[Double] = js.native
  
  var state: js.UndefOr[Double] = js.native
  
  var sumDependencyWeight: js.UndefOr[Double] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object StreamState {
  
  @scala.inline
  def apply(): StreamState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamState]
  }
  
  @scala.inline
  implicit class StreamStateMutableBuilder[Self <: StreamState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalClose(value: Double): Self = StObject.set(x, "localClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCloseUndefined: Self = StObject.set(x, "localClose", js.undefined)
    
    @scala.inline
    def setLocalWindowSize(value: Double): Self = StObject.set(x, "localWindowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalWindowSizeUndefined: Self = StObject.set(x, "localWindowSize", js.undefined)
    
    @scala.inline
    def setRemoteClose(value: Double): Self = StObject.set(x, "remoteClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCloseUndefined: Self = StObject.set(x, "remoteClose", js.undefined)
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSumDependencyWeight(value: Double): Self = StObject.set(x, "sumDependencyWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumDependencyWeightUndefined: Self = StObject.set(x, "sumDependencyWeight", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
