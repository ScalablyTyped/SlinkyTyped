package typingsSlinky.rbacA.anon

import typingsSlinky.rbacA.mod.AttributesManager
import typingsSlinky.rbacA.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes[P /* <: Provider */, AM /* <: AttributesManager */] extends js.Object {
  var attributes: js.UndefOr[AM] = js.undefined
  var provider: P
}

object Attributes {
  @scala.inline
  def apply[P, AM](provider: P, attributes: AM = null): Attributes[P, AM] = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes[P, AM]]
  }
}

