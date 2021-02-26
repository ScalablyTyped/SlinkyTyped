package typingsSlinky.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubject[T]
  extends IObservable[T]
     with IObserver[T]
     with IDisposable {
  
  def hasObservers(): Boolean = js.native
}
