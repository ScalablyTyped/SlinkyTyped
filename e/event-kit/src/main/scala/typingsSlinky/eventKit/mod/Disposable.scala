package typingsSlinky.eventKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("event-kit", "Disposable")
@js.native
/** Construct a Disposable. */
class Disposable () extends DisposableLike {
  def this(disposableAction: js.Function0[Unit]) = this()
  
  /** A callback which will be called within dispose(). */
  var disposalAction: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disposed: Boolean = js.native
}
/* static members */
@JSImport("event-kit", "Disposable")
@js.native
object Disposable extends js.Object {
  
  /** Ensure that Object correctly implements the Disposable contract. */
  def isDisposable(`object`: js.Object): Boolean = js.native
}
