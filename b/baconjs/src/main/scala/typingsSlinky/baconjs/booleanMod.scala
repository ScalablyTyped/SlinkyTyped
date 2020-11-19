package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/boolean", JSImport.Namespace)
@js.native
object booleanMod extends js.Object {
  
  def and(left: Property[_], right: Property[_]): Property[Boolean] = js.native
  
  def not(src: default[_]): default[Boolean] = js.native
  
  def or(left: Property[_], right: Property[_]): Property[Boolean] = js.native
}
