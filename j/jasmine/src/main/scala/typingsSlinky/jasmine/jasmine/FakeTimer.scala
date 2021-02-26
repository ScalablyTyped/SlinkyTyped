package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FakeTimer
  extends Instantiable0[js.Any] {
  
  def reset(): Unit = js.native
  
  def runFunctionsWithinRange(oldMillis: Double, nowMillis: Double): Unit = js.native
  
  def scheduleFunction(timeoutKey: js.Any, funcToCall: js.Function0[Unit], millis: Double, recurring: Boolean): Unit = js.native
  
  def tick(millis: Double): Unit = js.native
}
