package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.OnRenderItem
import typingsSlinky.officeUiFabricReact.basePickerMod.BasePicker
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", JSImport.Namespace)
@js.native
object tagPickerMod extends js.Object {
  
  val TagPicker: ReactComponentClass[ITagPickerProps] = js.native
  
  @js.native
  class TagPickerBase protected () extends BasePicker[ITag, ITagPickerProps] {
    def this(props: ITagPickerProps) = this()
  }
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    
    var defaultProps: OnRenderItem = js.native
  }
}
