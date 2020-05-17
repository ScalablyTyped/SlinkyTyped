package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.OnRenderItem
import typingsSlinky.officeUiFabricReact.basePickerMod.BasePicker
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", JSImport.Namespace)
@js.native
object tagPickerMod extends js.Object {
  @js.native
  class TagPickerBase protected () extends BasePicker[ITag, ITagPickerProps] {
    def this(props: ITagPickerProps) = this()
  }
  
  val TagPicker: ReactComponentClass[ITagPickerProps] = js.native
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: OnRenderItem = js.native
  }
  
}

