package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVBoxLayout extends IBox {
  
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  
  /** [Config Option] ("round"/"floor"/"ceil") */
  var alignRoundingMethod: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var constrainAlign: js.UndefOr[Boolean] = js.native
}
object IVBoxLayout {
  
  @scala.inline
  def apply(): IVBoxLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVBoxLayout]
  }
  
  @scala.inline
  implicit class IVBoxLayoutMutableBuilder[Self <: IVBoxLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignRoundingMethod(value: js.Any): Self = StObject.set(x, "alignRoundingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignRoundingMethodUndefined: Self = StObject.set(x, "alignRoundingMethod", js.undefined)
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setConstrainAlign(value: Boolean): Self = StObject.set(x, "constrainAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainAlignUndefined: Self = StObject.set(x, "constrainAlign", js.undefined)
  }
}
