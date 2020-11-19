package typingsSlinky.reactNativeSwipeout.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeSwipeout.reactNativeSwipeoutStrings.delete
import typingsSlinky.reactNativeSwipeout.reactNativeSwipeoutStrings.primary
import typingsSlinky.reactNativeSwipeout.reactNativeSwipeoutStrings.secondary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeoutButtonProperties extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[ReactElement] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var text: js.UndefOr[ReactElement] = js.native
  
  var `type`: js.UndefOr[
    typingsSlinky.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
  ] = js.native
  
  var underlayColor: js.UndefOr[String] = js.native
}
object SwipeoutButtonProperties {
  
  @scala.inline
  def apply(): SwipeoutButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutButtonProperties]
  }
  
  @scala.inline
  implicit class SwipeoutButtonPropertiesOps[Self <: SwipeoutButtonProperties] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComponent(value: ReactElement): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setTextReactElement(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: ReactElement): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(
      value: typingsSlinky.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
}
