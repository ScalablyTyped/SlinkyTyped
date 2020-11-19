package typingsSlinky.avvio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Close[I, C] extends js.Object {
  
  def apply(fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def apply(fn: js.Function2[/* err */ js.Error, /* done */ js.Function, Unit]): Unit = js.native
  def apply(fn: js.Function3[/* err */ js.Error, /* context */ C, /* done */ js.Function, Unit]): Unit = js.native
}
