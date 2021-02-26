package typingsSlinky.rbacA

import typingsSlinky.rbacA.anon.Attributes
import typingsSlinky.rbacA.mod.AttributesManager
import typingsSlinky.rbacA.mod.Provider
import typingsSlinky.rbacA.mod.RBAC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbacMod {
  
  @JSImport("rbac-a/lib/rbac", JSImport.Namespace)
  @js.native
  class ^[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends RBAC[P, AM] {
    def this(opts: Attributes[P, AM]) = this()
  }
}
