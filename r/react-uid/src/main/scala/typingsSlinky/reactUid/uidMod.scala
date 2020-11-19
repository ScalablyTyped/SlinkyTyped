package typingsSlinky.reactUid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-uid/dist/es5/uid", JSImport.Namespace)
@js.native
object uidMod extends js.Object {
  
  def generateUID(): js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String] = js.native
  
  def uid(item: js.Any): String = js.native
  def uid(item: js.Any, index: Double): String = js.native
}
