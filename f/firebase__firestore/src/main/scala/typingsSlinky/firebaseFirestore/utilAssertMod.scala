package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/assert", JSImport.Namespace)
@js.native
object utilAssertMod extends js.Object {
  def debugAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = js.native
  def debugCast[T](obj: js.Object, constructor: Instantiable[T]): T = js.native
  def fail(): scala.Nothing = js.native
  def fail(failure: String): scala.Nothing = js.native
  def hardAssert(assertion: Boolean): /* asserts assertion */ Boolean = js.native
  def hardAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = js.native
}

