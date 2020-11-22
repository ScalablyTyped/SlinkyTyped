package typingsSlinky.rcFieldForm.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcFieldForm.interfaceMod.Meta
import typingsSlinky.rcFieldForm.interfaceMod.ValidatorRule
import typingsSlinky.rcFieldForm.listMod.ListField
import typingsSlinky.rcFieldForm.listMod.ListOperations
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ListProps425441958 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def children(
    value: (/* fields */ js.Array[ListField], /* operations */ ListOperations, /* meta */ Meta) => ReactElement
  ): this.type = set("children", js.Any.fromFunction3(value))
  
  @scala.inline
  def rulesVarargs(value: ValidatorRule*): this.type = set("rules", js.Array(value :_*))
  
  @scala.inline
  def rules(value: js.Array[ValidatorRule]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value :_*))
  
  @scala.inline
  def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
}
