package typingsSlinky.jscodeshift.variableDeclaratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterMethods extends js.Object {
  
  /**
    * Returns a function that returns true if the provided path is a variable
    * declarator and requires one of the specified module names.
    *
    * @param names A module name or an array of module names
    */
  def requiresModule(names: String): Filter = js.native
  def requiresModule(names: js.Array[String]): Filter = js.native
}
