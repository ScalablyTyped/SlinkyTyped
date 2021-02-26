package typingsSlinky.materializeCss.anon

import typingsSlinky.materializeCss.M.Pushpin
import typingsSlinky.materializeCss.materializeCssStrings.`pin-bottom`
import typingsSlinky.materializeCss.materializeCssStrings.`pin-top`
import typingsSlinky.materializeCss.materializeCssStrings.pinned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.PushpinOptions> */
@js.native
trait PartialPushpinOptions extends StObject {
  
  var bottom: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var onPositionChange: js.UndefOr[
    js.ThisFunction1[/* this */ Pushpin, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
  ] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object PartialPushpinOptions {
  
  @scala.inline
  def apply(): PartialPushpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPushpinOptions]
  }
  
  @scala.inline
  implicit class PartialPushpinOptionsMutableBuilder[Self <: PartialPushpinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnPositionChange(
      value: js.ThisFunction1[/* this */ Pushpin, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
    ): Self = StObject.set(x, "onPositionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPositionChangeUndefined: Self = StObject.set(x, "onPositionChange", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
