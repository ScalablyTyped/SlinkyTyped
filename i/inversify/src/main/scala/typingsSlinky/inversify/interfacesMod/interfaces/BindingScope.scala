package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inversify.inversifyStrings.Singleton
  - typingsSlinky.inversify.inversifyStrings.Transient
  - typingsSlinky.inversify.inversifyStrings.Request
*/
trait BindingScope extends js.Object

object BindingScope {
  @scala.inline
  def Request: typingsSlinky.inversify.inversifyStrings.Request = this.cast("Request")
  @scala.inline
  def Singleton: typingsSlinky.inversify.inversifyStrings.Singleton = this.cast("Singleton")
  @scala.inline
  def Transient: typingsSlinky.inversify.inversifyStrings.Transient = this.cast("Transient")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

