package typingsSlinky.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurriedFn2[A, B, R] extends js.Object {
  
  def apply(a: A): CurriedFn1[B, R] = js.native
  def apply(a: A, b: B): R = js.native
}
