package typingsSlinky.ramda

import typingsSlinky.ramda.ramdaStrings.flat
import typingsSlinky.ramda.toolsMod.Merge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/mergeLeft", JSImport.Namespace)
@js.native
object mergeLeftMod extends js.Object {
  
  def default[O1 /* <: js.Object */](a: O1): js.Function1[/* b */ js.Object, Merge[O1, js.Object, flat]] = js.native
  def default[O1 /* <: js.Object */, O2 /* <: js.Object */](a: O1, b: O2): Merge[O1, O2, flat] = js.native
}
