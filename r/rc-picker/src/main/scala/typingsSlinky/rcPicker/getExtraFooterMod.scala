package typingsSlinky.rcPicker

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/utils/getExtraFooter", JSImport.Namespace)
@js.native
object getExtraFooterMod extends js.Object {
  def default(prefixCls: String, mode: PanelMode): ReactElement = js.native
  def default(
    prefixCls: String,
    mode: PanelMode,
    renderExtraFooter: js.Function1[/* mode */ PanelMode, TagMod[Any]]
  ): ReactElement = js.native
}

