package typingsSlinky.c3.mod

import typingsSlinky.c3.anon.Anchor
import typingsSlinky.c3.anon.Onclick
import typingsSlinky.c3.c3Strings.bottom
import typingsSlinky.c3.c3Strings.inset
import typingsSlinky.c3.c3Strings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendOptions extends StObject {
  
  /**
    * Defaults to `false`.
    */
  var equally: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide legend
    * If true given, all legend will be hidden. If string or array given, only the legend that has the id will be hidden.
    * Defaults to `false`.
    */
  var hide: js.UndefOr[Boolean | ArrayOrString] = js.native
  
  /**
    * Change inset legend attributes. Ignored unless `legend.position` is `"inset"`.
    */
  var inset: js.UndefOr[Anchor] = js.native
  
  var item: js.UndefOr[Onclick] = js.native
  
  /**
    * Padding between legend elements.
    * Defaults to `0`.
    */
  var padding: js.UndefOr[Double] = js.native
  
  /**
    * Change the position of legend.
    */
  var position: js.UndefOr[bottom | right | inset] = js.native
  
  /**
    * Show or hide legend.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}
object LegendOptions {
  
  @scala.inline
  def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  
  @scala.inline
  implicit class LegendOptionsMutableBuilder[Self <: LegendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEqually(value: Boolean): Self = StObject.set(x, "equally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquallyUndefined: Self = StObject.set(x, "equally", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean | ArrayOrString): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setHideVarargs(value: String*): Self = StObject.set(x, "hide", js.Array(value :_*))
    
    @scala.inline
    def setInset(value: Anchor): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setItem(value: Onclick): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPosition(value: bottom | right | inset): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
