package typingsSlinky.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.arangodbStrings.integer
  - typingsSlinky.arangodb.arangodbStrings.boolean
  - typingsSlinky.arangodb.arangodbStrings.string
  - typingsSlinky.arangodb.arangodbStrings.number
  - typingsSlinky.arangodb.arangodbStrings.json
  - typingsSlinky.arangodb.arangodbStrings.password
  - typingsSlinky.arangodb.arangodbStrings.int
  - typingsSlinky.arangodb.arangodbStrings.bool
*/
trait ConfigurationType extends js.Object

object ConfigurationType {
  @scala.inline
  def bool: typingsSlinky.arangodb.arangodbStrings.bool = this.cast("bool")
  @scala.inline
  def boolean: typingsSlinky.arangodb.arangodbStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def int: typingsSlinky.arangodb.arangodbStrings.int = this.cast("int")
  @scala.inline
  def integer: typingsSlinky.arangodb.arangodbStrings.integer = this.cast("integer")
  @scala.inline
  def json: typingsSlinky.arangodb.arangodbStrings.json = this.cast("json")
  @scala.inline
  def number: typingsSlinky.arangodb.arangodbStrings.number = this.cast("number")
  @scala.inline
  def password: typingsSlinky.arangodb.arangodbStrings.password = this.cast("password")
  @scala.inline
  def string: typingsSlinky.arangodb.arangodbStrings.string = this.cast("string")
}

