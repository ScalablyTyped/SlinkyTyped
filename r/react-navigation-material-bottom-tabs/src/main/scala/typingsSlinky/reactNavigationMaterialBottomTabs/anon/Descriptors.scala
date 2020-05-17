package typingsSlinky.reactNavigationMaterialBottomTabs.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.reactNavigation.mod.NavigationDescriptor
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationProp
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import typingsSlinky.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Descriptors extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      _, 
      Options, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ] = js.native
  var navigation: NavigationProp[_] = js.native
  var screenProps: js.UndefOr[js.Any] = js.native
  def renderIcon(options: TintColor): TagMod[Any] = js.native
}

object Descriptors {
  @scala.inline
  def apply(
    descriptors: StringDictionary[
      NavigationDescriptor[
        _, 
        Options, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigation: NavigationProp[_],
    renderIcon: TintColor => TagMod[Any]
  ): Descriptors = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], renderIcon = js.Any.fromFunction1(renderIcon))
    __obj.asInstanceOf[Descriptors]
  }
  @scala.inline
  implicit class DescriptorsOps[Self <: Descriptors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptors(
      value: StringDictionary[
          NavigationDescriptor[
            _, 
            Options, 
            NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderIcon(value: TintColor => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(js.Any.fromFunction1(value))
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

