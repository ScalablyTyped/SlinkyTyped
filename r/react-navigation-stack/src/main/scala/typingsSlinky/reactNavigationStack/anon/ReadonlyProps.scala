package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigation.mod.NavigationState
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardMode
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView.Props> */
@js.native
trait ReadonlyProps extends js.Object {
  
  val descriptors: StackDescriptorMap = js.native
  
  val headerMode: js.UndefOr[StackHeaderMode] = js.native
  
  val keyboardHandlingEnabled: js.UndefOr[Boolean] = js.native
  
  val mode: js.UndefOr[StackCardMode] = js.native
  
  val navigation: StackNavigationHelpers = js.native
  
  val screenProps: js.Any = js.native
  
  val state: NavigationState = js.native
}
object ReadonlyProps {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    screenProps: js.Any,
    state: NavigationState
  ): ReadonlyProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProps]
  }
  
  @scala.inline
  implicit class ReadonlyPropsOps[Self <: ReadonlyProps] (val x: Self) extends AnyVal {
    
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
    def setDescriptors(value: StackDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: StackNavigationHelpers): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: NavigationState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderMode(value: StackHeaderMode): Self = this.set("headerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderMode: Self = this.set("headerMode", js.undefined)
    
    @scala.inline
    def setKeyboardHandlingEnabled(value: Boolean): Self = this.set("keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardHandlingEnabled: Self = this.set("keyboardHandlingEnabled", js.undefined)
    
    @scala.inline
    def setMode(value: StackCardMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
