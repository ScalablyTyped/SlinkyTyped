package typingsSlinky.rcPicker

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.rcPicker.anon.BlurToCancel
import typingsSlinky.rcPicker.anon.Focused
import typingsSlinky.react.mod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/hooks/usePickerInput", JSImport.Namespace)
@js.native
object usePickerInputMod extends js.Object {
  def default(
    hasOpenIsClickOutsideTriggerOpenForwardKeyDownBlurToCancelOnSubmitOnCancelOnFocusOnBlur: BlurToCancel
  ): js.Tuple2[DOMAttributes[HTMLInputElement], Focused] = js.native
}

