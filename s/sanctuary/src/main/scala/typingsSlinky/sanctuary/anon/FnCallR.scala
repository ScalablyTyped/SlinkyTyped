package typingsSlinky.sanctuary.anon

import typingsSlinky.sanctuary.mod.Fn
import typingsSlinky.sanctuary.mod.Profunctor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallR[B, C, A, D] extends js.Object {
  
  def apply(r: Fn[B, C]): Fn[A, D] = js.native
  def apply(r: Profunctor[B, C]): Profunctor[A, D] = js.native
}
