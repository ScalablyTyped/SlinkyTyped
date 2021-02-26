package typingsSlinky.prettier.mod

import typingsSlinky.prettier.anon.Value
import typingsSlinky.prettier.anon.ValueArray
import typingsSlinky.prettier.anon.`0`
import typingsSlinky.prettier.prettierBooleans.`true`
import typingsSlinky.prettier.prettierStrings.boolean
import typingsSlinky.prettier.prettierStrings.int
import typingsSlinky.prettier.prettierStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SupportOption extends StObject
object _SupportOption {
  
  @scala.inline
  def BooleanArraySupportOption(array: `true`, category: String, default: js.Array[ValueArray], since: String, `type`: boolean): typingsSlinky.prettier.mod.BooleanArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.prettier.mod.BooleanArraySupportOption]
  }
  
  @scala.inline
  def BooleanSupportOption(category: String, default: Boolean, description: String, since: String, `type`: boolean): typingsSlinky.prettier.mod.BooleanSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.prettier.mod.BooleanSupportOption]
  }
  
  @scala.inline
  def IntArraySupportOption(array: `true`, category: String, default: js.Array[Value], since: String, `type`: int): typingsSlinky.prettier.mod.IntArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.prettier.mod.IntArraySupportOption]
  }
  
  @scala.inline
  def IntSupportOption(category: String, default: Double, since: String, `type`: int): typingsSlinky.prettier.mod.IntSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.prettier.mod.IntSupportOption]
  }
  
  @scala.inline
  def PathArraySupportOption(array: `true`, category: String, default: js.Array[`0`], since: String, `type`: path): typingsSlinky.prettier.mod.PathArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.prettier.mod.PathArraySupportOption]
  }
  
  @scala.inline
  def PathSupportOption(category: String, default: String, since: String, `type`: path): typingsSlinky.prettier.mod.PathSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.prettier.mod.PathSupportOption]
  }
}
