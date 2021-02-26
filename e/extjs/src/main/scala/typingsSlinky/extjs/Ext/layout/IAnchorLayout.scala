package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IAuto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnchorLayout extends IAuto {
  
  /** [Config Option] (String) */
  var anchor: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var defaultAnchor: js.UndefOr[String] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IAnchorLayout: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
}
object IAnchorLayout {
  
  @scala.inline
  def apply(): IAnchorLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnchorLayout]
  }
  
  @scala.inline
  implicit class IAnchorLayoutMutableBuilder[Self <: IAnchorLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setDefaultAnchor(value: String): Self = StObject.set(x, "defaultAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAnchorUndefined: Self = StObject.set(x, "defaultAnchor", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
  }
}
