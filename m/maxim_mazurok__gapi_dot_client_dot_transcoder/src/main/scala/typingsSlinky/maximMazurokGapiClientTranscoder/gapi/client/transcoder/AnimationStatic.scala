package typingsSlinky.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStatic extends StObject {
  
  /** The time to start displaying the overlay object, in seconds. Default: 0 */
  var startTimeOffset: js.UndefOr[String] = js.native
  
  /** Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. */
  var xy: js.UndefOr[NormalizedCoordinate] = js.native
}
object AnimationStatic {
  
  @scala.inline
  def apply(): AnimationStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationStatic]
  }
  
  @scala.inline
  implicit class AnimationStaticMutableBuilder[Self <: AnimationStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
    
    @scala.inline
    def setXy(value: NormalizedCoordinate): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
  }
}
