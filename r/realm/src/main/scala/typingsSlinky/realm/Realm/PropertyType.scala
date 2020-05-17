package typingsSlinky.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PropertyType
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~PropertyType }
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.realm.realmStrings.bool
  - typingsSlinky.realm.realmStrings.int
  - typingsSlinky.realm.realmStrings.float
  - typingsSlinky.realm.realmStrings.double
  - typingsSlinky.realm.realmStrings.string
  - typingsSlinky.realm.realmStrings.data
  - typingsSlinky.realm.realmStrings.date
  - typingsSlinky.realm.realmStrings.list
  - typingsSlinky.realm.realmStrings.linkingObjects
*/
trait PropertyType extends js.Object

object PropertyType {
  @scala.inline
  def bool: typingsSlinky.realm.realmStrings.bool = "bool".asInstanceOf[typingsSlinky.realm.realmStrings.bool]
  @scala.inline
  def int: typingsSlinky.realm.realmStrings.int = "int".asInstanceOf[typingsSlinky.realm.realmStrings.int]
  @scala.inline
  def float: typingsSlinky.realm.realmStrings.float = "float".asInstanceOf[typingsSlinky.realm.realmStrings.float]
  @scala.inline
  def double: typingsSlinky.realm.realmStrings.double = "double".asInstanceOf[typingsSlinky.realm.realmStrings.double]
  @scala.inline
  def string: typingsSlinky.realm.realmStrings.string = "string".asInstanceOf[typingsSlinky.realm.realmStrings.string]
  @scala.inline
  def data: typingsSlinky.realm.realmStrings.data = "data".asInstanceOf[typingsSlinky.realm.realmStrings.data]
  @scala.inline
  def date: typingsSlinky.realm.realmStrings.date = "date".asInstanceOf[typingsSlinky.realm.realmStrings.date]
  @scala.inline
  def list: typingsSlinky.realm.realmStrings.list = "list".asInstanceOf[typingsSlinky.realm.realmStrings.list]
  @scala.inline
  def linkingObjects: typingsSlinky.realm.realmStrings.linkingObjects = "linkingObjects".asInstanceOf[typingsSlinky.realm.realmStrings.linkingObjects]
  @scala.inline
  implicit def apply(value: String): PropertyType = value.asInstanceOf[PropertyType]
}

