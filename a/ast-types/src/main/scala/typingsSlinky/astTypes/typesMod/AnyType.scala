package typingsSlinky.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyType extends js.Object {
  
  def arrayOf(): AnyType = js.native
  
  def assert(value: js.Any): Boolean = js.native
  def assert(value: js.Any, deep: Deep): Boolean = js.native
  
  def check(value: js.Any): Boolean = js.native
  def check(value: js.Any, deep: Deep): Boolean = js.native
}
