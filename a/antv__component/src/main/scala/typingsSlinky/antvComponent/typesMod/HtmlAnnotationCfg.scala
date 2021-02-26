package typingsSlinky.antvComponent.typesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antvComponent.antvComponentStrings.bottom
import typingsSlinky.antvComponent.antvComponentStrings.left
import typingsSlinky.antvComponent.antvComponentStrings.middle
import typingsSlinky.antvComponent.antvComponentStrings.right
import typingsSlinky.antvComponent.antvComponentStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlAnnotationCfg extends HtmlComponentCfg {
  
  /** X 方向对齐，默认 left */
  var alignX: js.UndefOr[left | middle | right] = js.native
  
  /** Y 方向对齐，默认 top */
  var alignY: js.UndefOr[top | middle | bottom] = js.native
  
  /** 自定义 html */
  var html: String | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | HTMLElement]) = js.native
  
  /** zIndex 设置 */
  var zIndex: js.UndefOr[Double] = js.native
}
object HtmlAnnotationCfg {
  
  @scala.inline
  def apply(
    html: String | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | HTMLElement])
  ): HtmlAnnotationCfg = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlAnnotationCfg]
  }
  
  @scala.inline
  implicit class HtmlAnnotationCfgMutableBuilder[Self <: HtmlAnnotationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignX(value: left | middle | right): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
    
    @scala.inline
    def setAlignY(value: top | middle | bottom): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
    
    @scala.inline
    def setHtml(
      value: String | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | HTMLElement])
    ): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlFunction1(value: /* container */ HTMLElement => Unit | String | HTMLElement): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHtmlHTMLElement(value: HTMLElement): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
