package typingsSlinky.parse.mod._Global_.Parse.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parse.parseStrings.String
  - typingsSlinky.parse.parseStrings.Number
  - typingsSlinky.parse.parseStrings.Boolean
  - typingsSlinky.parse.parseStrings.Date
  - typingsSlinky.parse.parseStrings.File
  - typingsSlinky.parse.parseStrings.GeoPoint
  - typingsSlinky.parse.parseStrings.Polygon
  - typingsSlinky.parse.parseStrings.Array
  - typingsSlinky.parse.parseStrings.Object
  - typingsSlinky.parse.parseStrings.Pointer
  - typingsSlinky.parse.parseStrings.Relation
*/
trait TYPE extends js.Object

object TYPE {
  @scala.inline
  def Array: typingsSlinky.parse.parseStrings.Array = this.cast("Array")
  @scala.inline
  def Boolean: typingsSlinky.parse.parseStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def Date: typingsSlinky.parse.parseStrings.Date = this.cast("Date")
  @scala.inline
  def File: typingsSlinky.parse.parseStrings.File = this.cast("File")
  @scala.inline
  def GeoPoint: typingsSlinky.parse.parseStrings.GeoPoint = this.cast("GeoPoint")
  @scala.inline
  def Number: typingsSlinky.parse.parseStrings.Number = this.cast("Number")
  @scala.inline
  def Object: typingsSlinky.parse.parseStrings.Object = this.cast("Object")
  @scala.inline
  def Pointer: typingsSlinky.parse.parseStrings.Pointer = this.cast("Pointer")
  @scala.inline
  def Polygon: typingsSlinky.parse.parseStrings.Polygon = this.cast("Polygon")
  @scala.inline
  def Relation: typingsSlinky.parse.parseStrings.Relation = this.cast("Relation")
  @scala.inline
  def String: typingsSlinky.parse.parseStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

