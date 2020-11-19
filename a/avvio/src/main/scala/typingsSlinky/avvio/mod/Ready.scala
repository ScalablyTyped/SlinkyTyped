package typingsSlinky.avvio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ready[I, C] extends js.Object {
  
  def apply(): js.Promise[C] = js.native
  def apply(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def apply(callback: js.Function2[/* err */ js.Error, /* done */ js.Function, Unit]): Unit = js.native
  def apply(callback: js.Function3[/* err */ js.Error, /* context */ C, /* done */ js.Function, Unit]): Unit = js.native
}
