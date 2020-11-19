package typingsSlinky.antDesignReactNative.listPropsTypeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings._empty
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.android
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.down
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.empty
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.ios
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.middle
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.up
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemPropsType extends js.Object {
  
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var align: js.UndefOr[top | middle | bottom] = js.native
  
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  var extra: js.UndefOr[ReactElement] = js.native
  
  var multipleLine: js.UndefOr[Boolean] = js.native
  
  var platform: js.UndefOr[android | ios] = js.native
  
  var thumb: js.UndefOr[ReactElement | Null] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object ListItemPropsType {
  
  @scala.inline
  def apply(): ListItemPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemPropsType]
  }
  
  @scala.inline
  implicit class ListItemPropsTypeOps[Self <: ListItemPropsType] (val x: Self) extends AnyVal {
    
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
    def setActiveStyle(value: StyleProp[ViewStyle]): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    
    @scala.inline
    def setActiveStyleNull: Self = this.set("activeStyle", null)
    
    @scala.inline
    def setAlign(value: top | middle | bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setArrow(value: horizontal | down | up | empty | _empty): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExtraReactElement(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setMultipleLine(value: Boolean): Self = this.set("multipleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleLine: Self = this.set("multipleLine", js.undefined)
    
    @scala.inline
    def setPlatform(value: android | ios): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setThumbReactElement(value: ReactElement): Self = this.set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb(value: ReactElement): Self = this.set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
    
    @scala.inline
    def setThumbNull: Self = this.set("thumb", null)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
