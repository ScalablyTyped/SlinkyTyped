package typingsSlinky.rcTabs.tabsMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcTabs.anon.PartialTabsPropsRefAttrib
import typingsSlinky.rcTabs.anon.WeakValidationMapTabsProp
import typingsSlinky.rcTabs.tabPaneMod.TabPaneProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ForwardRefExoticComponent<rc-tabs.rc-tabs/es/Tabs.TabsProps & react.react.RefAttributes<std.HTMLDivElement>> & {  TabPane :(hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren : rc-tabs.rc-tabs/es/TabPanelList/TabPane.TabPaneProps): react.react.<global>.JSX.Element} */
@js.native
trait ForwardTabsType extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: TabsProps with RefAttributes[HTMLDivElement]): ReactElement | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var TabPane: js.Function1[
    /* hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren */ TabPaneProps, 
    ReactElement
  ] = js.native
  
  var defaultProps: js.UndefOr[PartialTabsPropsRefAttrib] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapTabsProp] = js.native
}
