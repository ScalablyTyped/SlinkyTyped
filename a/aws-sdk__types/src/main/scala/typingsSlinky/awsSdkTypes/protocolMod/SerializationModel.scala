package typingsSlinky.awsSdkTypes.protocolMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.blob
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.boolean
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.float
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.integer
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.list
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.map
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.string
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.structure
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkTypes.protocolMod.Blob
  - typingsSlinky.awsSdkTypes.protocolMod.Boolean
  - typingsSlinky.awsSdkTypes.protocolMod.Float
  - typingsSlinky.awsSdkTypes.protocolMod.Integer
  - typingsSlinky.awsSdkTypes.protocolMod.List
  - typingsSlinky.awsSdkTypes.protocolMod.Map
  - typingsSlinky.awsSdkTypes.protocolMod.String
  - typingsSlinky.awsSdkTypes.protocolMod.Structure
  - typingsSlinky.awsSdkTypes.protocolMod.Timestamp
*/
trait SerializationModel extends js.Object

object SerializationModel {
  @scala.inline
  def Timestamp(`type`: timestamp): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Float(`type`: float): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Boolean(`type`: boolean): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def String(`type`: string): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def List(member: Member, `type`: list): SerializationModel = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Blob(`type`: blob): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Integer(`type`: integer): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Structure(members: StringDictionary[Member], required: js.Array[java.lang.String], `type`: structure): SerializationModel = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Map(key: Member, `type`: map, value: Member): SerializationModel = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
}

