package typingsSlinky.prettier.mod

import typingsSlinky.prettier.anon.Value
import typingsSlinky.prettier.anon.ValueArray
import typingsSlinky.prettier.anon.`0`
import typingsSlinky.prettier.prettierBooleans.`true`
import typingsSlinky.prettier.prettierStrings.boolean
import typingsSlinky.prettier.prettierStrings.int
import typingsSlinky.prettier.prettierStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SupportOption extends js.Object
object _SupportOption {
  
  @scala.inline
  def BooleanSupportOption(category: String, default: Boolean, description: String, since: String, `type`: boolean): _SupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SupportOption]
  }
  
  @scala.inline
  def IntArraySupportOption(array: `true`, category: String, default: js.Array[Value], since: String, `type`: int): _SupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SupportOption]
  }
  
  @scala.inline
  def BooleanArraySupportOption(array: `true`, category: String, default: js.Array[ValueArray], since: String, `type`: boolean): _SupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SupportOption]
  }
  
  @scala.inline
  def IntSupportOption(category: String, default: Double, since: String, `type`: int): _SupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SupportOption]
  }
  
  @scala.inline
  def PathSupportOption(category: String, default: String, since: String, `type`: path): _SupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SupportOption]
  }
  
  @scala.inline
  def PathArraySupportOption(array: `true`, category: String, default: js.Array[`0`], since: String, `type`: path): _SupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SupportOption]
  }
}
