package typingsSlinky.officeUiFabricReact.panelTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelHeaderRenderer extends IRenderFunction[IPanelProps] {
  
  /**
    * @param props - Props given to the panel
    * @param defaultRender - Default header renderer. If using this renderer in code that does not
    * assign `headerTextId` to an element elsewhere, it **must** be passed to this function.
    * @param headerTextId - If provided, this **must** be used as the ID of an element containing the
    * panel's title, because the panel popup uses this ID as its aria-labelledby.
    */
  def apply(): ReactElement | Null = js.native
  def apply(props: js.UndefOr[scala.Nothing], defaultRender: js.UndefOr[scala.Nothing], headerTextId: String): ReactElement | Null = js.native
  def apply(props: js.UndefOr[scala.Nothing], defaultRender: IPanelHeaderRenderer): ReactElement | Null = js.native
  def apply(props: js.UndefOr[scala.Nothing], defaultRender: IPanelHeaderRenderer, headerTextId: String): ReactElement | Null = js.native
  def apply(props: IPanelProps): ReactElement | Null = js.native
  def apply(props: IPanelProps, defaultRender: js.UndefOr[scala.Nothing], headerTextId: String): ReactElement | Null = js.native
  def apply(props: IPanelProps, defaultRender: IPanelHeaderRenderer): ReactElement | Null = js.native
  def apply(props: IPanelProps, defaultRender: IPanelHeaderRenderer, headerTextId: String): ReactElement | Null = js.native
}
