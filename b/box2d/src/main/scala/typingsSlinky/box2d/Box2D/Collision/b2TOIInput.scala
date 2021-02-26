package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Sweep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2TOIInput extends StObject {
  
  /**
    * Proxy A
    **/
  var proxyA: b2DistanceProxy = js.native
  
  /**
    * Proxy B
    **/
  var proxyB: b2DistanceProxy = js.native
  
  /**
    * Sweep A
    **/
  var sweepA: b2Sweep = js.native
  
  /**
    * Sweep B
    **/
  var sweepB: b2Sweep = js.native
  
  /**
    * Tolerance
    **/
  var tolerance: Double = js.native
}
object b2TOIInput {
  
  @scala.inline
  def apply(
    proxyA: b2DistanceProxy,
    proxyB: b2DistanceProxy,
    sweepA: b2Sweep,
    sweepB: b2Sweep,
    tolerance: Double
  ): b2TOIInput = {
    val __obj = js.Dynamic.literal(proxyA = proxyA.asInstanceOf[js.Any], proxyB = proxyB.asInstanceOf[js.Any], sweepA = sweepA.asInstanceOf[js.Any], sweepB = sweepB.asInstanceOf[js.Any], tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2TOIInput]
  }
  
  @scala.inline
  implicit class b2TOIInputMutableBuilder[Self <: b2TOIInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxyA(value: b2DistanceProxy): Self = StObject.set(x, "proxyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyB(value: b2DistanceProxy): Self = StObject.set(x, "proxyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweepA(value: b2Sweep): Self = StObject.set(x, "sweepA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweepB(value: b2Sweep): Self = StObject.set(x, "sweepB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
  }
}
