package typingsSlinky.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.reactNavigation.mod.NavigationDescriptor
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationProp
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationMaterialBottomTabs.anon.Route
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabOptions
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationViewProps extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ] = js.native
  var navigation: NavigationProp[NavigationTabState] = js.native
  var navigationConfig: js.Any = js.native
  var screenProps: js.UndefOr[js.Any] = js.native
  def getAccessibilityLabel(props: Route): js.UndefOr[String] = js.native
  def getLabelText(props: Route): js.UndefOr[String] = js.native
  def getTestID(props: Route): js.UndefOr[String] = js.native
  def onIndexChange(index: Double): Unit = js.native
  def onTabPress(props: Route): Unit = js.native
  def renderIcon(props: RenderIconProps): ReactElement = js.native
  def renderScene(props: Route): ReactElement = js.native
}

object NavigationViewProps {
  @scala.inline
  def apply(
    descriptors: StringDictionary[
      NavigationDescriptor[
        NavigationParams, 
        NavigationMaterialBottomTabOptions, 
        NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    getAccessibilityLabel: Route => js.UndefOr[String],
    getLabelText: Route => js.UndefOr[String],
    getTestID: Route => js.UndefOr[String],
    navigation: NavigationProp[NavigationTabState],
    navigationConfig: js.Any,
    onIndexChange: Double => Unit,
    onTabPress: Route => Unit,
    renderIcon: RenderIconProps => ReactElement,
    renderScene: Route => ReactElement
  ): NavigationViewProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), onTabPress = js.Any.fromFunction1(onTabPress), renderIcon = js.Any.fromFunction1(renderIcon), renderScene = js.Any.fromFunction1(renderScene))
    __obj.asInstanceOf[NavigationViewProps]
  }
  @scala.inline
  implicit class NavigationViewPropsOps[Self <: NavigationViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescriptors(
      value: StringDictionary[
          NavigationDescriptor[
            NavigationParams, 
            NavigationMaterialBottomTabOptions, 
            NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ]
    ): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAccessibilityLabel(value: Route => js.UndefOr[String]): Self = this.set("getAccessibilityLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLabelText(value: Route => js.UndefOr[String]): Self = this.set("getLabelText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTestID(value: Route => js.UndefOr[String]): Self = this.set("getTestID", js.Any.fromFunction1(value))
    @scala.inline
    def setNavigation(value: NavigationProp[NavigationTabState]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationConfig(value: js.Any): Self = this.set("navigationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnIndexChange(value: Double => Unit): Self = this.set("onIndexChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTabPress(value: Route => Unit): Self = this.set("onTabPress", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderIcon(value: RenderIconProps => ReactElement): Self = this.set("renderIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderScene(value: Route => ReactElement): Self = this.set("renderScene", js.Any.fromFunction1(value))
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenProps: Self = this.set("screenProps", js.undefined)
  }
  
}

