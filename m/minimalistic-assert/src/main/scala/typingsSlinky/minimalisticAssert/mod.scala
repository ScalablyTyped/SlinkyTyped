package typingsSlinky.minimalisticAssert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minimalistic-assert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(`val`: js.Any): Unit = js.native
  def apply(`val`: js.Any, msg: String): Unit = js.native
  
  def equal[T](l: T, r: T): Unit = js.native
  def equal[T](l: T, r: T, msg: String): Unit = js.native
}
