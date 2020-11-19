package typingsSlinky.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommAngularDescriptor extends js.Object {
  
  /**
    * Add commands to a descriptor.
    * @param command The name that was used to create the command.
    */
  def add(command: String): ICommAngularDescriptor = js.native
  /**
    * Add descriptor to a descriptor.
    * @param descriptor Another descriptor attached to a sequnce of commands.
    */
  def add(descriptor: ICommAngularDescriptor): ICommAngularDescriptor = js.native
  
  /**
    * A command flow is a decision point inside the command group.You can have any number
    * of flows inside a command group and nesting them how you perfer.
    * see http://commangular.org/docs/#building-command-flows
    */
  def asFlow(): ICommAngularDescriptor = js.native
  
  /**
    * Used along with mapTo function. Maps commands to be executed parallel
    * see http://commangular.org/docs/#building-parallel-commands
    */
  def asParallel(): ICommAngularDescriptor = js.native
  
  /**
    * Used along with mapTo function. Creates a sequence of commands that
    * execute after one and other
    * see http://commangular.org/docs/#building-command-sequences
    */
  def asSequence(): ICommAngularDescriptor = js.native
  
  /**
    * This is to be used with flowing commands to attach an expression that
    * evaluates using Angular $parse.
    * see http://commangular.org/docs/#building-command-flows
    * @param expression A string form expression that can make use of services to validate conditions.
    * @param services A comma seperated list of services that are used in the above expression
    */
  def link(expression: String): ICommAngularDescriptor = js.native
  def link(expression: String, services: String): ICommAngularDescriptor = js.native
  
  /**
    * Works with the <code>link</code> function to attach a command to the flow if the
    * expression becomes truthy.
    * see http://commangular.org/docs/#building-command-flows
    * @param command The name that was used to create the command.
    */
  def to(command: String): ICommAngularDescriptor = js.native
}
