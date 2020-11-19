package typingsSlinky.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scalike", "TryBuilder2")
@js.native
class TryBuilder2[A, B, C] protected () extends js.Object {
  def this(oa: Try[A], ob: Try[B], oc: Try[C]) = this()
  
  def chain[D](od: Try[D]): TryBuilder3[A, B, C, D] = js.native
  
  var oa: js.Any = js.native
  
  var ob: js.Any = js.native
  
  var oc: js.Any = js.native
  
  def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D] = js.native
}
