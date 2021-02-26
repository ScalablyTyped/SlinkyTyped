package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
  */
@js.native
trait EventSeries extends StObject {
  
  /**
    * Number of occurrences in this series up to the last heartbeat time
    */
  var count: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Time of the last occurrence observed
    */
  var lastObservedTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
    */
  var state: js.UndefOr[Input[String]] = js.native
}
object EventSeries {
  
  @scala.inline
  def apply(): EventSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSeries]
  }
  
  @scala.inline
  implicit class EventSeriesMutableBuilder[Self <: EventSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setLastObservedTime(value: Input[String]): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastObservedTimeUndefined: Self = StObject.set(x, "lastObservedTime", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
