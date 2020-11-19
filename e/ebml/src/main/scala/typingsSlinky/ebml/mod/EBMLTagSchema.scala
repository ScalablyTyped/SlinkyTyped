package typingsSlinky.ebml.mod

import typingsSlinky.ebml.ebmlStrings.f
import typingsSlinky.ebml.ebmlStrings.i
import typingsSlinky.ebml.ebmlStrings.s
import typingsSlinky.ebml.ebmlStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ebml.mod.EBMLTagSchemaBase
  - typingsSlinky.ebml.mod.EBMLNumericTagSchema
  - typingsSlinky.ebml.mod.EBMLStringValueTagSchema
  - typingsSlinky.ebml.mod.EBMLBinaryTagSchema
*/
trait EBMLTagSchema extends js.Object
object EBMLTagSchema {
  
  @scala.inline
  def EBMLTagSchemaBase(description: String, level: Double, name: String, `type`: TagType): EBMLTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchema]
  }
  
  @scala.inline
  def EBMLNumericTagSchema(description: String, level: Double, name: String, range: String, `type`: u | i | f): EBMLTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchema]
  }
  
  @scala.inline
  def EBMLStringValueTagSchema(description: String, level: Double, name: String, `type`: s): EBMLTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchema]
  }
  
  @scala.inline
  def EBMLBinaryTagSchema(description: String, level: Double, name: String, `type`: TagType): EBMLTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchema]
  }
}
