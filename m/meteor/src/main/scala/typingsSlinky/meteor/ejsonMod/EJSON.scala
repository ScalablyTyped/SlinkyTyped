package typingsSlinky.meteor.ejsonMod

import typingsSlinky.meteor.Anon_Canonical
import typingsSlinky.meteor.Anon_KeyOrderSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ejson", "EJSON")
@js.native
object EJSON extends js.Object {
  var newBinary: js.Any = js.native
  def addType(
    name: String,
    factory: js.Function1[
      /* val */ typingsSlinky.meteor.ejsonMod.JSONable, 
      typingsSlinky.meteor.ejsonMod.EJSONableCustomType
    ]
  ): Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: typingsSlinky.meteor.ejsonMod.EJSON, b: typingsSlinky.meteor.ejsonMod.EJSON): Boolean = js.native
  def equals(
    a: typingsSlinky.meteor.ejsonMod.EJSON,
    b: typingsSlinky.meteor.ejsonMod.EJSON,
    options: Anon_KeyOrderSensitive
  ): Boolean = js.native
  def fromJSONValue(`val`: typingsSlinky.meteor.ejsonMod.JSONable): js.Any = js.native
  def isBinary(x: js.Object): Boolean = js.native
  def parse(str: String): typingsSlinky.meteor.ejsonMod.EJSON = js.native
  def stringify(`val`: typingsSlinky.meteor.ejsonMod.EJSON): String = js.native
  def stringify(`val`: typingsSlinky.meteor.ejsonMod.EJSON, options: Anon_Canonical): String = js.native
  def toJSONValue(`val`: typingsSlinky.meteor.ejsonMod.EJSON): typingsSlinky.meteor.ejsonMod.JSONable = js.native
}

