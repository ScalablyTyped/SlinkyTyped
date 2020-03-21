package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
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
  class TagPickerBase () extends BasePicker[ITag, ITagPickerProps]
  
  val TagPicker: ReactComponentClass[ITagPickerProps] = js.native
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: AnonOnRenderItem = js.native
  }
  
}

