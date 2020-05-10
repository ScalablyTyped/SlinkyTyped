package typingsSlinky.reactNavigation

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNavigation.mod.NavigationDescriptor
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescriptors[Options, ScreenProps] extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      js.Object, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ] = js.native
  var navigationConfig: Options = js.native
  var screenProps: js.UndefOr[ScreenProps] = js.native
}

object AnonDescriptors {
  @scala.inline
  def apply[Options, ScreenProps](
    descriptors: StringDictionary[
      NavigationDescriptor[
        NavigationParams, 
        js.Object, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigationConfig: Options
  ): AnonDescriptors[Options, ScreenProps] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptors[Options, ScreenProps]]
  }
  @scala.inline
  implicit class AnonDescriptorsOps[Self[options, screenprops] <: AnonDescriptors[options, screenprops], Options, ScreenProps] (val x: Self[Options, ScreenProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, ScreenProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, ScreenProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, ScreenProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, ScreenProps]) with Other]
    @scala.inline
    def withDescriptors(
      value: StringDictionary[
          NavigationDescriptor[
            NavigationParams, 
            js.Object, 
            NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ]
    ): Self[Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationConfig(value: Options): Self[Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenProps(value: ScreenProps): Self[Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenProps: Self[Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(js.undefined)
        ret
    }
  }
  
}

