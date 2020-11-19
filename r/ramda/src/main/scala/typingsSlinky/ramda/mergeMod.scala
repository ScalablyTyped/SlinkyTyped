package typingsSlinky.ramda

import typingsSlinky.ramda.ramdaStrings.flat
import typingsSlinky.ramda.toolsMod.Merge
import typingsSlinky.ramda.toolsMod.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/merge", JSImport.Namespace)
@js.native
object mergeMod extends js.Object {
  
  def default(__ : Placeholder): js.Function2[/* b */ js.Object, /* a */ js.Object, Merge[js.Object, js.Object, flat]] = js.native
  def default[O2 /* <: js.Object */](__ : Placeholder, b: O2): js.Function1[/* a */ js.Object, Merge[O2, js.Object, flat]] = js.native
  def default[O1 /* <: js.Object */](a: O1): js.Function1[/* b */ js.Object, Merge[js.Object, O1, flat]] = js.native
  def default[O1 /* <: js.Object */, O2 /* <: js.Object */](a: O1, b: O2): Merge[O2, O1, flat] = js.native
}
