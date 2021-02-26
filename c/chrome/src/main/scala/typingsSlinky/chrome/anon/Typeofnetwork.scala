package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.devtools.network.HARLog
import typingsSlinky.chrome.chrome.devtools.network.NavigatedEvent
import typingsSlinky.chrome.chrome.devtools.network.RequestFinishedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofnetwork extends StObject {
  
  def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit = js.native
  
  var onNavigated: NavigatedEvent = js.native
  
  var onRequestFinished: RequestFinishedEvent = js.native
}
object Typeofnetwork {
  
  @scala.inline
  def apply(
    getHAR: js.Function1[/* harLog */ HARLog, Unit] => Unit,
    onNavigated: NavigatedEvent,
    onRequestFinished: RequestFinishedEvent
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction1(getHAR), onNavigated = onNavigated.asInstanceOf[js.Any], onRequestFinished = onRequestFinished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetwork]
  }
  
  @scala.inline
  implicit class TypeofnetworkMutableBuilder[Self <: Typeofnetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHAR(value: js.Function1[/* harLog */ HARLog, Unit] => Unit): Self = StObject.set(x, "getHAR", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNavigated(value: NavigatedEvent): Self = StObject.set(x, "onNavigated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRequestFinished(value: RequestFinishedEvent): Self = StObject.set(x, "onRequestFinished", value.asInstanceOf[js.Any])
  }
}
