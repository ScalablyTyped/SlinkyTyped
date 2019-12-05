package typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inversify.inversifyStrings.ConstructorArgument
  - typings.inversify.inversifyStrings.ClassProperty
  - typings.inversify.inversifyStrings.Variable
*/
trait TargetType extends js.Object

object TargetType {
  @scala.inline
  def ClassProperty: typingsSlinky.inversify.inversifyStrings.ClassProperty = this.cast("ClassProperty")
  @scala.inline
  def ConstructorArgument: typingsSlinky.inversify.inversifyStrings.ConstructorArgument = this.cast("ConstructorArgument")
  @scala.inline
  def Variable: typingsSlinky.inversify.inversifyStrings.Variable = this.cast("Variable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

