package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Function1
import typingsSlinky.cypress.lodashMod.Function2
import typingsSlinky.cypress.lodashMod.Function3
import typingsSlinky.cypress.lodashMod.Function4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartial3x2[T2] extends js.Object {
  def apply[T1, R](func: Function2[T1, T2, R]): Function1[T1, R] = js.native
  def apply[T1, T3, R](func: Function3[T1, T2, T3, R]): Function2[T1, T3, R] = js.native
  def apply[T1, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): Function3[T1, T3, T4, R] = js.native
}

