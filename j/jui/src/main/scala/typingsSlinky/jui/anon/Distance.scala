package typingsSlinky.jui.anon

import typingsSlinky.jui.juiStrings.`bottom-left`
import typingsSlinky.jui.juiStrings.`bottom-right`
import typingsSlinky.jui.juiStrings.`top-lefet`
import typingsSlinky.jui.juiStrings.`top-right`
import typingsSlinky.jui.juiStrings.bottom
import typingsSlinky.jui.juiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distance extends StObject {
  
  /**
    * @cfg {Integer} [distance=5]
    * Determines each margin value when there are multiple notice messages
    */
  var distance: js.UndefOr[Double] = js.native
  
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * @cfg {Integer} [hideDuration=500]
    * Determines the duration of an effect when a notice message disappears
    */
  var hideDuration: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {String} [hideEasing="linear"]
    * Determines an effect when a notice message disappears (see CSS3 specifications)
    */
  var hideEasing: js.UndefOr[String] = js.native
  
  /**
    * @cfg {Integer} [padding=12]
    * Determines the margin value of a notice message (the margin value may be in object form rather than a numeric value)
    */
  var padding: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {"top"/"top-lefet"/"top-right"/"bottom"/"bottom-left"/"bottom-right"} [position="top-right"]
    * Designates the location where a notice message is added
    */
  var position: js.UndefOr[top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`] = js.native
  
  /**
    * @cfg {Integer} [showDuration=500]
    * Determines the duration of an effect when a notice message is shown
    */
  var showDuration: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {String} [showEasing="swing"]
    * Determines an effect when a notice message is shown (see CSS3 specifications)
    */
  var showEasing: js.UndefOr[String] = js.native
  
  /**
    * @cfg {Integer} [timeout=3000]
    * Determines the duration for which a notice message is displayed (the message does not disappear when the value is 0)
    */
  var timeout: js.UndefOr[Double] = js.native
  
  var tpl: js.UndefOr[js.Any] = js.native
}
object Distance {
  
  @scala.inline
  def apply(): Distance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distance]
  }
  
  @scala.inline
  implicit class DistanceMutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDurationUndefined: Self = StObject.set(x, "hideDuration", js.undefined)
    
    @scala.inline
    def setHideEasing(value: String): Self = StObject.set(x, "hideEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideEasingUndefined: Self = StObject.set(x, "hideEasing", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPosition(value: top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    @scala.inline
    def setShowEasing(value: String): Self = StObject.set(x, "showEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEasingUndefined: Self = StObject.set(x, "showEasing", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
