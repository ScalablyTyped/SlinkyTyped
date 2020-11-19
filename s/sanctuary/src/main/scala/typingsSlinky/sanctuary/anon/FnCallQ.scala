package typingsSlinky.sanctuary.anon

import typingsSlinky.sanctuary.mod.Bifunctor
import typingsSlinky.sanctuary.mod.Either
import typingsSlinky.sanctuary.mod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallQ[B] extends js.Object {
  
  def apply[A, C](q: Bifunctor[A, C]): Bifunctor[B, C] = js.native
  def apply[A, C](q: Either[A, C]): Either[B, C] = js.native
  def apply[A, C](q: Pair[A, C]): Pair[B, C] = js.native
}
