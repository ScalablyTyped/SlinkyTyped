package typingsSlinky.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.list
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.map
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.List
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Map
  - typingsSlinky.awsSdkBuildTypes.apiModelMod.Structure
*/
trait ComplexShape extends js.Object
object ComplexShape {
  
  @scala.inline
  def List(member: Member, `type`: list): ComplexShape = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexShape]
  }
  
  @scala.inline
  def Map(key: Member, `type`: map, value: Member): ComplexShape = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexShape]
  }
  
  @scala.inline
  def Structure(members: StringDictionary[StructureMember], `type`: structure): ComplexShape = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexShape]
  }
}
