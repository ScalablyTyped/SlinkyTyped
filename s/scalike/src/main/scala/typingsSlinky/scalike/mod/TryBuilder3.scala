package typingsSlinky.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scalike", "TryBuilder3")
@js.native
class TryBuilder3[A, B, C, D] protected () extends js.Object {
  def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D]) = this()
  
  def chain[E](oe: Try[E]): TryBuilder4[A, B, C, D, E] = js.native
  
  var oa: js.Any = js.native
  
  var ob: js.Any = js.native
  
  var oc: js.Any = js.native
  
  var od: js.Any = js.native
  
  def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Try[E] = js.native
}
