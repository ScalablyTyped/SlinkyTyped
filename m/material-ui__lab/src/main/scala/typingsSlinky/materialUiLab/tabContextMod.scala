package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.tabContextTabContextMod.TabContextProps
import typingsSlinky.materialUiLab.tabContextTabContextMod.TabContextValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/lab/TabContext", JSImport.Namespace)
@js.native
object tabContextMod extends js.Object {
  def default(props: TabContextProps): ReactElement = js.native
  def getPanelId(context: TabContextValue, tabValue: String): String = js.native
  def getTabId(context: TabContextValue, tabValue: String): String = js.native
  def useTabContext(): TabContextValue | Null = js.native
}

