package typingsSlinky.jquery.anon

import typingsSlinky.jquery.JQuery._SpeedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration
  extends _SpeedSettings[js.Any] {
  
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: typingsSlinky.jquery.JQuery.Duration = js.native
}
object Duration {
  
  @scala.inline
  def apply(duration: typingsSlinky.jquery.JQuery.Duration): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: typingsSlinky.jquery.JQuery.Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
