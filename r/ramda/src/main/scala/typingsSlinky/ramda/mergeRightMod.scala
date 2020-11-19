package typingsSlinky.ramda

import typingsSlinky.ramda.ramdaStrings.flat
import typingsSlinky.ramda.toolsMod.Merge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/mergeRight", JSImport.Namespace)
@js.native
object mergeRightMod extends js.Object {
  
  def default[O1 /* <: js.Object */](a: O1): js.Function1[/* b */ js.Object, Merge[js.Object, O1, flat]] = js.native
  def default[O1 /* <: js.Object */, O2 /* <: js.Object */](a: O1, b: O2): Merge[O2, O1, flat] = js.native
}
