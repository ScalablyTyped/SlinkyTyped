package typingsSlinky.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
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
  def renderIcon(props: RenderIconProps): TagMod[Any] = js.native
  def renderScene(props: Route): TagMod[Any] = js.native
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
    renderIcon: RenderIconProps => TagMod[Any],
    renderScene: Route => TagMod[Any]
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
    def withDescriptors(
      value: StringDictionary[
          NavigationDescriptor[
            NavigationParams, 
            NavigationMaterialBottomTabOptions, 
            NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAccessibilityLabel(value: Route => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccessibilityLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLabelText(value: Route => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTestID(value: Route => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTestID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationProp[NavigationTabState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnIndexChange(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndexChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTabPress(value: Route => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderIcon(value: RenderIconProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderScene(value: Route => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderScene")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScreenProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(js.undefined)
        ret
    }
  }
  
}

