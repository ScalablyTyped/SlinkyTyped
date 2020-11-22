package typingsSlinky.contentfulManagement.appDefinitionMod

import typingsSlinky.contentfulManagement.contentfulManagementStrings.Array
import typingsSlinky.contentfulManagement.contentfulManagementStrings.Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.contentfulManagement.appDefinitionMod.SingleFieldType
  - typingsSlinky.contentfulManagement.appDefinitionMod.LinkFieldType
  - typingsSlinky.contentfulManagement.appDefinitionMod.ArrayFieldType
*/
trait FieldType extends js.Object
object FieldType {
  
  @scala.inline
  def SingleFieldType(`type`: Field): FieldType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
  
  @scala.inline
  def LinkFieldType(linkType: LinkType, `type`: Link): FieldType = {
    val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
  
  @scala.inline
  def ArrayFieldType(items: SingleFieldType | LinkFieldType, `type`: Array): FieldType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
}
