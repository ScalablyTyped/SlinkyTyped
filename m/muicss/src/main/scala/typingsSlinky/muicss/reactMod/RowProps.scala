package typingsSlinky.muicss.reactMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowProps extends HTMLAttributes[HTMLDivElement] {
  
  var lg: js.UndefOr[Double] = js.native
  
  var md: js.UndefOr[Double] = js.native
  
  var sm: js.UndefOr[Double] = js.native
  
  var xs: js.UndefOr[Double] = js.native
}
object RowProps {
  
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  @scala.inline
  implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
    
    @scala.inline
    def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
    
    @scala.inline
    def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
    
    @scala.inline
    def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
  }
}
