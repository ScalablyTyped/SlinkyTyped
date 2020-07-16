package typingsSlinky.rcTreeSelect.components

import typingsSlinky.rcTreeSelect.mod.default
import typingsSlinky.rcTreeSelect.treeSelectMod.TreeSelectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rc-tree-select/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[ValueType](p: TreeSelectProps[ValueType]): SharedBuilder_TreeSelectProps_1571959893[default[ValueType], ValueType] = new SharedBuilder_TreeSelectProps_1571959893[default[ValueType], ValueType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[ValueType](): SharedBuilder_TreeSelectProps_1571959893[default[ValueType], ValueType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_TreeSelectProps_1571959893[default[ValueType], ValueType](js.Array(this.component, __props.asInstanceOf[TreeSelectProps[ValueType]]))
  }
  implicit def make[ValueType](companion: Lib.type): SharedBuilder_TreeSelectProps_1571959893[default[ValueType], ValueType] = new SharedBuilder_TreeSelectProps_1571959893[default[ValueType], ValueType](js.Array(this.component, js.Dictionary.empty))()
}

