package typingsSlinky.rbacA.rbacMod

import typingsSlinky.rbacA.AnonAttributes
import typingsSlinky.rbacA.mod.AttributesManager
import typingsSlinky.rbacA.mod.Provider
import typingsSlinky.rbacA.mod.RBAC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbac-a/lib/rbac", JSImport.Namespace)
@js.native
class ^[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends RBAC[P, AM] {
  def this(opts: AnonAttributes[P, AM]) = this()
}

