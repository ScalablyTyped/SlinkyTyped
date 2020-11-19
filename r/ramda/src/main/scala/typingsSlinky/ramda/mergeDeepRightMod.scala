package typingsSlinky.ramda

import typingsSlinky.ramda.ramdaStrings.deep
import typingsSlinky.ramda.toolsMod.Merge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/mergeDeepRight", JSImport.Namespace)
@js.native
object mergeDeepRightMod extends js.Object {
  
  def default[O1 /* <: js.Object */](a: O1): js.Function1[/* o2 */ js.Object, Merge[js.Object, O1, deep]] = js.native
  def default[O1 /* <: js.Object */, O2 /* <: js.Object */](o1: O1, o2: O2): Merge[O2, O1, deep] = js.native
}
