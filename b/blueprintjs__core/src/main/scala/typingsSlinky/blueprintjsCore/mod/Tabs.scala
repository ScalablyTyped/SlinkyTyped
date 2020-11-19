package typingsSlinky.blueprintjsCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.blueprintjsCore.anon.PartialITabsProps
import typingsSlinky.blueprintjsCore.anon.SelectedTabId
import typingsSlinky.blueprintjsCore.anon.TypeofTab
import typingsSlinky.blueprintjsCore.tabsMod.ITabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tabs")
@js.native
class Tabs ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Tabs {
  def this(props: ITabsProps) = this()
}
/* static members */
@JSImport("@blueprintjs/core", "Tabs")
@js.native
object Tabs extends js.Object {
  
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  var Expander: ReactComponentClass[js.Object] = js.native
  
  var Tab: TypeofTab = js.native
  
  var defaultProps: PartialITabsProps = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(hasSelectedTabId: ITabsProps): SelectedTabId = js.native
}
