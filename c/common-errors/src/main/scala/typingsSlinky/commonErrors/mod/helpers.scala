package typingsSlinky.commonErrors.mod

import typingsSlinky.commonErrors.anon.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("common-errors", "helpers")
@js.native
object helpers extends js.Object {
  
  /**
    * Simple interface for generating a new Error class type.
    * @param name The full name of the new Error class
    * @param options.extends         The base class for the new Error
    *                                class. Default is Error.
    * @param options.globalize       Boolean (default true) to store the
    *                                Error in global space so that the
    *                                Error is equivalent to others included
    *                                from other versions of the module.
    * @param options.args            Array of names of values to accept and
    *                                store from the class constructor.
    *                                Default is ['message', 'inner_error'].
    * @param options.generateMessage A function for defining a custom error
    *                                message.
    */
  def generateClass(name: String): ErrorConstructor = js.native
  def generateClass(name: String, options: Args): ErrorConstructor = js.native
}
