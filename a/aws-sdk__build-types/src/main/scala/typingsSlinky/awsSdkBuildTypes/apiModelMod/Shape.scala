package typingsSlinky.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.blob
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.boolean
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.byte
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.character
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.double
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.float
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.integer
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.list
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.long
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.map
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.short
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.string
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Blob
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Boolean
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Byte
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Character
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Double
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Float
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Integer
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.List
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Long
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Map
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Short
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.String
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Structure
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Timestamp
*/
trait Shape extends js.Object

object Shape {
  @scala.inline
  def Boolean(`type`: boolean): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def String(`type`: string): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Short(`type`: short): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Character(`type`: character): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Integer(`type`: integer): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def List(member: Member, `type`: list): Shape = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Blob(`type`: blob): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Byte(`type`: byte): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Double(`type`: double): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Long(`type`: long): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Float(`type`: float): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Map(key: Member, `type`: map, value: Member): Shape = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Timestamp(`type`: timestamp): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Structure(members: StringDictionary[StructureMember], `type`: structure): Shape = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

