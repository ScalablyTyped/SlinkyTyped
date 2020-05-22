package typingsSlinky.rcTreeSelect.components

import typingsSlinky.rcTreeSelect.treeSelectMod.TreeSelectProps
import typingsSlinky.rcTreeSelect.treeSelectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeSelect {
  @JSImport("rc-tree-select/lib/TreeSelect", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[ValueType](p: TreeSelectProps[ValueType]): SharedBuilder_TreeSelectProps_1571959893[default[js.Any], ValueType] = new SharedBuilder_TreeSelectProps_1571959893[default[js.Any], ValueType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[ValueType](): SharedBuilder_TreeSelectProps_1571959893[default[js.Any], ValueType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_TreeSelectProps_1571959893[default[js.Any], ValueType](js.Array(this.component, __props.asInstanceOf[TreeSelectProps[ValueType]]))
  }
  implicit def make[ValueType](companion: TreeSelect.type): SharedBuilder_TreeSelectProps_1571959893[default[js.Any], ValueType] = new SharedBuilder_TreeSelectProps_1571959893[default[js.Any], ValueType](js.Array(this.component, js.Dictionary.empty))()
}

