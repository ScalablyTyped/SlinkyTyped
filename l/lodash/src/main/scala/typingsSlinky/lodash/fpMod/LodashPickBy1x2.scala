package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.ValueKeyIteratee
import typingsSlinky.lodash.mod.ValueKeyIterateeTypeGuard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPickBy1x2[T] extends StObject {
  
  def apply(predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  def apply[S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S] = js.native
}
