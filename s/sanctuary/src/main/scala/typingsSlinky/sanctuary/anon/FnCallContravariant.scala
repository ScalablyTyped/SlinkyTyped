package typingsSlinky.sanctuary.anon

import typingsSlinky.sanctuary.mod.Contravariant
import typingsSlinky.sanctuary.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallContravariant[A, B] extends js.Object {
  
  def apply(contravariant: Contravariant[A]): Contravariant[B] = js.native
  def apply[X](contravariant: Fn[A, X]): Fn[B, X] = js.native
}
