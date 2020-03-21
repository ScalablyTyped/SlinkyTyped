package typingsSlinky.firebaseAuthTypes.mod.firebaseComponentAugmentingMod

import typingsSlinky.firebaseAuthTypes.mod.FirebaseAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var auth: FirebaseAuth
}

object NameServiceMapping {
  @scala.inline
  def apply(auth: FirebaseAuth): NameServiceMapping = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameServiceMapping]
  }
}

