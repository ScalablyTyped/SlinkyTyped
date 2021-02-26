package typingsSlinky.jqueryToastPlugin

import typingsSlinky.jqueryToastPlugin.jqueryToastPluginBooleans.`false`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-center`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-left`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-right`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`mid-center`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`top-center`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`top-left`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`top-right`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.center
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.error
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.fade
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.info
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.left
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.plain
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.right
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.slide
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.success
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait toastOptions extends StObject {
  
  var afterHidden: js.UndefOr[js.Function0[_]] = js.native
  
  var afterShown: js.UndefOr[js.Function0[_]] = js.native
  
  var allowToastClose: js.UndefOr[Boolean] = js.native
  
  var beforeHide: js.UndefOr[js.Function0[_]] = js.native
  
  var beforeShow: js.UndefOr[js.Function0[_]] = js.native
  
  var bgColor: js.UndefOr[String] = js.native
  
  var heading: js.UndefOr[String] = js.native
  
  var hideAfter: js.UndefOr[Double | `false`] = js.native
  
  var icon: js.UndefOr[info | warning | error | success] = js.native
  
  var loader: js.UndefOr[Boolean] = js.native
  
  var loaderBg: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[
    `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
  ] = js.native
  
  var showHideTransition: js.UndefOr[fade | slide | plain] = js.native
  
  var stack: js.UndefOr[Double | `false`] = js.native
  
  var text: String = js.native
  
  var textAlign: js.UndefOr[left | right | center] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object toastOptions {
  
  @scala.inline
  def apply(text: String): toastOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[toastOptions]
  }
  
  @scala.inline
  implicit class toastOptionsMutableBuilder[Self <: toastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterHidden(value: () => _): Self = StObject.set(x, "afterHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterHiddenUndefined: Self = StObject.set(x, "afterHidden", js.undefined)
    
    @scala.inline
    def setAfterShown(value: () => _): Self = StObject.set(x, "afterShown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterShownUndefined: Self = StObject.set(x, "afterShown", js.undefined)
    
    @scala.inline
    def setAllowToastClose(value: Boolean): Self = StObject.set(x, "allowToastClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowToastCloseUndefined: Self = StObject.set(x, "allowToastClose", js.undefined)
    
    @scala.inline
    def setBeforeHide(value: () => _): Self = StObject.set(x, "beforeHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeHideUndefined: Self = StObject.set(x, "beforeHide", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: () => _): Self = StObject.set(x, "beforeShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setHideAfter(value: Double | `false`): Self = StObject.set(x, "hideAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAfterUndefined: Self = StObject.set(x, "hideAfter", js.undefined)
    
    @scala.inline
    def setIcon(value: info | warning | error | success): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLoader(value: Boolean): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderBg(value: String): Self = StObject.set(x, "loaderBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderBgUndefined: Self = StObject.set(x, "loaderBg", js.undefined)
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setPosition(
      value: `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowHideTransition(value: fade | slide | plain): Self = StObject.set(x, "showHideTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHideTransitionUndefined: Self = StObject.set(x, "showHideTransition", js.undefined)
    
    @scala.inline
    def setStack(value: Double | `false`): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: left | right | center): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
