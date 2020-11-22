package typingsSlinky.fastJsonStringify.mod

import typingsSlinky.fastJsonStringify.fastJsonStringifyStrings.`null`
import typingsSlinky.fastJsonStringify.fastJsonStringifyStrings.`object`
import typingsSlinky.fastJsonStringify.fastJsonStringifyStrings.array
import typingsSlinky.fastJsonStringify.fastJsonStringifyStrings.boolean
import typingsSlinky.fastJsonStringify.fastJsonStringifyStrings.integer
import typingsSlinky.fastJsonStringify.fastJsonStringifyStrings.number
import typingsSlinky.fastJsonStringify.fastJsonStringifyStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastJsonStringify.mod.RefSchema
  - typingsSlinky.fastJsonStringify.mod.StringSchema
  - typingsSlinky.fastJsonStringify.mod.IntegerSchema
  - typingsSlinky.fastJsonStringify.mod.NumberSchema
  - typingsSlinky.fastJsonStringify.mod.NullSchema
  - typingsSlinky.fastJsonStringify.mod.BooleanSchema
  - typingsSlinky.fastJsonStringify.mod.ArraySchema
  - typingsSlinky.fastJsonStringify.mod.TupleSchema
  - typingsSlinky.fastJsonStringify.mod.ObjectSchema
*/
trait Schema extends js.Object
object Schema {
  
  @scala.inline
  def NullSchema(`type`: `null`): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def NumberSchema(`type`: number): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def ObjectSchema(`type`: `object`): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def IntegerSchema(`type`: integer): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def TupleSchema(items: js.Array[Schema], `type`: array): Schema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def StringSchema(`type`: string): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def RefSchema($ref: String): Schema = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def BooleanSchema(`type`: boolean): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def ArraySchema(items: Schema | js.Object, `type`: array): Schema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}
