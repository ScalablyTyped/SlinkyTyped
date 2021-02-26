package typingsSlinky.rmcTabs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.rmcTabs.anon.ActiveTab
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import typingsSlinky.rmcTabs.propsTypeMod.PropsType
import typingsSlinky.rmcTabs.rmcTabsStrings.horizontal
import typingsSlinky.rmcTabs.rmcTabsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsBaseMod {
  
  @JSImport("rmc-tabs/lib/Tabs.base", "StateType")
  @js.native
  class StateType () extends StObject {
    
    var currentTab: Double = js.native
  }
  
  @JSImport("rmc-tabs/lib/Tabs.base", "Tabs")
  @js.native
  abstract class Tabs[P /* <: PropsType */, S /* <: StateType */] protected ()
    extends PureComponent[P, S, js.Any] {
    def this(props: P) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MTabs(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabs(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MTabs(nextProps: P): Unit = js.native
    
    def getOffsetIndex(current: Double, width: Double): Double = js.native
    @JSName("getOffsetIndex")
    def getOffsetIndex_distanceToChangeTab(
      current: Double,
      width: Double,
      threshold: /* import warning: importer.ImportType#apply Failed type conversion: P['distanceToChangeTab'] */ js.Any
    ): Double = js.native
    
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]]
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: js.UndefOr[scala.Nothing],
      allPrefix: String
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: String
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: String,
      allPrefix: String
    ): js.Any = js.native
    
    def getSubElements(): js.Function2[
        /* defaultPrefix */ js.UndefOr[String], 
        /* allPrefix */ js.UndefOr[String], 
        StringDictionary[ReactElement]
      ] = js.native
    
    def getTabBarBaseProps(): ActiveTab[S, P] = js.native
    
    def getTabIndex(props: P): Double = js.native
    
    def goToTab(index: Double): Boolean = js.native
    def goToTab(index: Double, force: js.UndefOr[scala.Nothing], newState: js.UndefOr[scala.Nothing], props: P): Boolean = js.native
    def goToTab(index: Double, force: js.UndefOr[scala.Nothing], newState: js.Any): Boolean = js.native
    def goToTab(index: Double, force: js.UndefOr[scala.Nothing], newState: js.Any, props: P): Boolean = js.native
    def goToTab(index: Double, force: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: js.UndefOr[scala.Nothing], props: P): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: js.Any): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: js.Any, props: P): Boolean = js.native
    
    var instanceId: Double = js.native
    
    def isTabVertical(): Boolean = js.native
    @JSName("isTabVertical")
    def isTabVertical_horizontal(direction: horizontal): Boolean = js.native
    @JSName("isTabVertical")
    def isTabVertical_vertical(direction: vertical): Boolean = js.native
    
    /** compatible for different between react and preact in `setState`. */
    var nextCurrentTab: js.Any = js.native
    
    var prevCurrentTab: Double = js.native
    
    def renderTabBar(tabBarProps: js.Any, DefaultTabBar: ReactComponentClass[js.Object]): js.UndefOr[js.Object | Null] = js.native
    
    def shouldRenderTab(idx: Double): Boolean = js.native
    
    var tabCache: NumberDictionary[ReactElement] = js.native
    
    def tabClickGoToTab(index: Double): Unit = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/Tabs.base", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/Tabs.base", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
