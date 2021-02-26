package typingsSlinky.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEngineTimingOptions extends StObject {
  
  /**
    * A `Number` that specifies the global scaling factor of time for all bodies.
    * A value of `0` freezes the simulation.
    * A value of `0.1` gives a slow-motion effect.
    * A value of `1.2` gives a speed-up effect.
    *
    * @property timing.timeScale
    * @type number
    * @default 1
    */
  var timeScale: Double = js.native
  
  /**
    * A `Number` that specifies the current simulation-time in milliseconds starting from `0`.
    * It is incremented on every `Engine.update` by the given `delta` argument.
    *
    * @property timing.timestamp
    * @type number
    * @default 0
    */
  var timestamp: Double = js.native
}
object IEngineTimingOptions {
  
  @scala.inline
  def apply(timeScale: Double, timestamp: Double): IEngineTimingOptions = {
    val __obj = js.Dynamic.literal(timeScale = timeScale.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEngineTimingOptions]
  }
  
  @scala.inline
  implicit class IEngineTimingOptionsMutableBuilder[Self <: IEngineTimingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
