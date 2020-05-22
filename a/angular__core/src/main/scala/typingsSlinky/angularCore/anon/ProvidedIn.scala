package typingsSlinky.angularCore.anon

import typingsSlinky.angularCore.angularCoreStrings.root
import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvidedIn extends js.Object {
  var providedIn: Type[_] | root | Null
}

object ProvidedIn {
  @scala.inline
  def apply(providedIn: Type[_] | root = null): ProvidedIn = {
    val __obj = js.Dynamic.literal(providedIn = providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidedIn]
  }
}

