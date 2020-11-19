package typingsSlinky.reactNativeAwesomeCardIo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAwesomeCardIo.mod.CardDetails
import typingsSlinky.reactNativeAwesomeCardIo.mod.CardIODetectionMode
import typingsSlinky.reactNativeAwesomeCardIo.mod.CardIOViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardIOView {
  
  @JSImport("react-native-awesome-card-io", "CardIOView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeAwesomeCardIo.mod.CardIOView] {
    
    @scala.inline
    def allowFreelyRotatingCardGuide(value: Boolean): this.type = set("allowFreelyRotatingCardGuide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def detectionMode(value: CardIODetectionMode): this.type = set("detectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def guideColor(value: String | Double): this.type = set("guideColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideCardIOLogo(value: Boolean): this.type = set("hideCardIOLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def languageOrLocale(value: String): this.type = set("languageOrLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scanExpiry(value: Boolean): this.type = set("scanExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scanInstructions(value: String): this.type = set("scanInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scannedImageDuration(value: Double): this.type = set("scannedImageDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def useCardIOLogo(value: Boolean): this.type = set("useCardIOLogo", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardIOViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(didScanCard: CardDetails => Unit): Builder = {
    val __props = js.Dynamic.literal(didScanCard = js.Any.fromFunction1(didScanCard))
    new Builder(js.Array(this.component, __props.asInstanceOf[CardIOViewProps]))
  }
}
