package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.tabBarInterfaceMod.TabButtonLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonTabButton extends StObject {
  
  /**
    * If `true`, the user cannot interact with the tab button.
    */
  var disabled: Boolean = js.native
  
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[String] = js.native
  
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[String] = js.native
  
  /**
    * Set the layout of the text and icon in the tab bar. It defaults to `'icon-top'`.
    */
  var layout: js.UndefOr[TabButtonLayout] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.native
  
  /**
    * The selected tab component
    */
  var selected: Boolean = js.native
  
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: js.UndefOr[String] = js.native
  
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[String] = js.native
}
object IonTabButton {
  
  @scala.inline
  def apply(disabled: Boolean, selected: Boolean): IonTabButton = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTabButton]
  }
  
  @scala.inline
  implicit class IonTabButtonMutableBuilder[Self <: IonTabButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setLayout(value: TabButtonLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
