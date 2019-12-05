package typingsSlinky.atBlueprintjsCore.atBlueprintjsCoreMod

import slinky.core.ReactComponentClass
import typingsSlinky.atBlueprintjsCore.Anon_SelectedTabId
import typingsSlinky.atBlueprintjsCore.TypeofClassTab
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTabsTabsMod.ITabsProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Tabs")
@js.native
class Tabs ()
  extends typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Tabs {
  def this(props: ITabsProps) = this()
}

/* static members */
@JSImport("@blueprintjs/core", "Tabs")
@js.native
object Tabs extends js.Object {
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  var Expander: ReactComponentClass[js.Object] = js.native
  var Tab: TypeofClassTab = js.native
  var defaultProps: Partial[ITabsProps] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(hasSelectedTabId: ITabsProps): Anon_SelectedTabId = js.native
}

