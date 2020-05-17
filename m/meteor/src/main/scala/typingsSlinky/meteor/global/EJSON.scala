package typingsSlinky.meteor.global

import typingsSlinky.meteor.EJSONableCustomType
import typingsSlinky.meteor.JSONable
import typingsSlinky.meteor.anon.Canonical
import typingsSlinky.meteor.anon.KeyOrderSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("EJSON")
@js.native
object EJSON extends js.Object {
  var newBinary: js.Any = js.native
  def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: typingsSlinky.meteor.EJSON, b: typingsSlinky.meteor.EJSON): Boolean = js.native
  def equals(a: typingsSlinky.meteor.EJSON, b: typingsSlinky.meteor.EJSON, options: KeyOrderSensitive): Boolean = js.native
  def fromJSONValue(`val`: JSONable): js.Any = js.native
  def isBinary(x: js.Object): Boolean = js.native
  def parse(str: String): typingsSlinky.meteor.EJSON = js.native
  def stringify(`val`: typingsSlinky.meteor.EJSON): String = js.native
  def stringify(`val`: typingsSlinky.meteor.EJSON, options: Canonical): String = js.native
  def toJSONValue(`val`: typingsSlinky.meteor.EJSON): JSONable = js.native
}

