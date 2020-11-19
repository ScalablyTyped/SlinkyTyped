package typingsSlinky.avvio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Avvio methods
@js.native
trait After[I, C] extends js.Object {
  
  def apply(fn: js.Function1[/* err */ js.Error, Unit]): C = js.native
  def apply(fn: js.Function2[/* err */ js.Error, /* done */ js.Function, Unit]): C = js.native
  def apply(fn: js.Function3[/* err */ js.Error, /* context */ C, /* done */ js.Function, Unit]): C = js.native
}
