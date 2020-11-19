package typingsSlinky.jsen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsenValidator extends js.Object {
  
  def apply(): Boolean = js.native
  def apply(data: js.Any): Boolean = js.native
  
  def build(): js.Any = js.native
  def build(initial: js.UndefOr[scala.Nothing], options: JsenBuildSettings): js.Any = js.native
  def build(initial: js.Any): js.Any = js.native
  def build(initial: js.Any, options: JsenBuildSettings): js.Any = js.native
  
  var errors: js.Array[JsenValidateError] = js.native
}
