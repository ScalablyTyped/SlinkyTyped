package typingsSlinky.antDesignReactNative.tabsTabsMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.AnonAnimated
import typingsSlinky.antDesignReactNative.AnonComponent
import typingsSlinky.antDesignReactNative.TypeofDefaultTabBar
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.PropsType
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNativeCommunityViewpager.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends Component[TabsProps, StateType, js.Any] {
  def this(props: PropsType) = this()
  var instanceId: Double = js.native
  /** compatible for different between react and preact in `setState`. */
  var nextCurrentTab: js.Any = js.native
  var prevCurrentTab: Double = js.native
  var scrollView: AnonComponent = js.native
  var tabCache: NumberDictionary[TagMod[Any]] = js.native
  var viewPager: default | Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabs(nextProps: PropsType): Unit = js.native
  def getOffsetIndex(current: Double, width: Double): Double = js.native
  def getOffsetIndex(current: Double, width: Double, threshold: Double): Double = js.native
  def getSubElement(
    tab: TabData,
    index: Double,
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]]
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
    StringDictionary[TagMod[Any]]
  ] = js.native
  def getTabBarBaseProps(): AnonAnimated = js.native
  def getTabIndex(props: PropsType): Double = js.native
  def goToTab(index: Double): Boolean = js.native
  def goToTab(index: Double, force: Boolean): Boolean = js.native
  def goToTab(index: Double, force: Boolean, newState: js.Any): Boolean = js.native
  def handleLayout(e: LayoutChangeEvent): Unit = js.native
  def isTabVertical(): Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_horizontal(direction: horizontal): Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_vertical(direction: vertical): Boolean = js.native
  def onMomentumScrollEnd(e: SyntheticEvent[NodeHandle, NativeScrollEvent]): Unit = js.native
  def renderContent(): ReactElement = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[String], 
      /* allPrefix */ js.UndefOr[String], 
      StringDictionary[TagMod[Any]]
    ]
  ): ReactElement = js.native
  def renderTabBar(tabBarProps: js.Any, DefaultTabBar: ReactComponentClass[js.Object]): js.UndefOr[js.Object | Null] = js.native
  def scrollTo(index: Double): Unit = js.native
  def scrollTo(index: Double, animated: Boolean): Unit = js.native
  def setScrollView(sv: js.Any): Unit = js.native
  def shouldRenderTab(idx: Double): Boolean = js.native
  def tabClickGoToTab(index: Double): Unit = js.native
}

/* static members */
@JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

