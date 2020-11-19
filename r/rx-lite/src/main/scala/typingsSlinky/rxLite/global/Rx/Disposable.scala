package typingsSlinky.rxLite.global.Rx

import typingsSlinky.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Rx.Disposable")
@js.native
class Disposable protected ()
  extends typingsSlinky.rxLite.Rx.Disposable {
  def this(action: js.Function0[Unit]) = this()
}
/* static members */
@JSGlobal("Rx.Disposable")
@js.native
object Disposable extends js.Object {
  
  def create(action: js.Function0[Unit]): IDisposable = js.native
  
  var empty: IDisposable = js.native
}
