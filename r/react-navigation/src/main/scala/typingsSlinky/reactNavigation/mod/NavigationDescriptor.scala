package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationDescriptor[Params, Options, NavigationScreenPropType] extends js.Object {
  var key: String = js.native
  var navigation: NavigationScreenPropType = js.native
  var options: Options = js.native
  var state: NavigationLeafRoute[Params] | NavigationStateRoute[Params] = js.native
  def getComponent(): ReactComponentClass[js.Object] = js.native
}

object NavigationDescriptor {
  @scala.inline
  def apply[Params, Options, NavigationScreenPropType](
    getComponent: () => ReactComponentClass[js.Object],
    key: String,
    navigation: NavigationScreenPropType,
    options: Options,
    state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  ): NavigationDescriptor[Params, Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent), key = key.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDescriptor[Params, Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class NavigationDescriptorOps[Self[params, options, navigationscreenproptype] <: NavigationDescriptor[params, options, navigationscreenproptype], Params, Options, NavigationScreenPropType] (val x: Self[Params, Options, NavigationScreenPropType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params, Options, NavigationScreenPropType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params, Options, NavigationScreenPropType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Params, Options, NavigationScreenPropType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Params, Options, NavigationScreenPropType]) with Other]
    @scala.inline
    def withGetComponent(value: () => ReactComponentClass[js.Object]): Self[Params, Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKey(value: String): Self[Params, Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationScreenPropType): Self[Params, Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self[Params, Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: NavigationLeafRoute[Params] | NavigationStateRoute[Params]): Self[Params, Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

