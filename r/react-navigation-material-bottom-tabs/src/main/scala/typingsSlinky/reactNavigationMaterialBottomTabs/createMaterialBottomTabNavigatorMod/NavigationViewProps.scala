package typingsSlinky.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.reactNavigation.mod.NavigationDescriptor
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationProp
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationMaterialBottomTabs.AnonRoute
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabOptions
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationViewProps extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  var navigation: NavigationProp[NavigationTabState]
  var navigationConfig: js.Any
  var screenProps: js.UndefOr[js.Any] = js.undefined
  def getAccessibilityLabel(props: AnonRoute): js.UndefOr[String]
  def getLabelText(props: AnonRoute): js.UndefOr[String]
  def getTestID(props: AnonRoute): js.UndefOr[String]
  def onIndexChange(index: Double): Unit
  def onTabPress(props: AnonRoute): Unit
  def renderIcon(props: RenderIconProps): TagMod[Any]
  def renderScene(props: AnonRoute): TagMod[Any]
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
    getAccessibilityLabel: AnonRoute => js.UndefOr[String],
    getLabelText: AnonRoute => js.UndefOr[String],
    getTestID: AnonRoute => js.UndefOr[String],
    navigation: NavigationProp[NavigationTabState],
    navigationConfig: js.Any,
    onIndexChange: Double => Unit,
    onTabPress: AnonRoute => Unit,
    renderIcon: RenderIconProps => TagMod[Any],
    renderScene: AnonRoute => TagMod[Any],
    screenProps: js.Any = null
  ): NavigationViewProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), onTabPress = js.Any.fromFunction1(onTabPress), renderIcon = js.Any.fromFunction1(renderIcon), renderScene = js.Any.fromFunction1(renderScene))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationViewProps]
  }
}

