package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.ConstraintFunction
import typingsSlinky.inversify.interfacesMod.interfaces.Request
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/syntax/constraint_helpers", JSImport.Namespace)
@js.native
object constraintHelpersMod extends js.Object {
  
  def namedConstraint(value: js.Any): ConstraintFunction = js.native
  
  def taggedConstraint(key: PropertyKey): js.Function1[/* value */ js.Any, ConstraintFunction] = js.native
  
  def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = js.native
  
  def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = js.native
  def typeConstraint(`type`: js.Function): js.Function1[/* request */ Request | Null, Boolean] = js.native
}
