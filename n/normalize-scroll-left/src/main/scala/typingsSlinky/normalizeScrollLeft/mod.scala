package typingsSlinky.normalizeScrollLeft

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.ltr
import typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("normalize-scroll-left", "detectScrollType")
  @js.native
  def detectScrollType(): ScrollType = js.native
  
  @JSImport("normalize-scroll-left", "getNormalizedScrollLeft")
  @js.native
  def getNormalizedScrollLeft_ltr(element: HTMLElement, direction: ltr): Double = js.native
  @JSImport("normalize-scroll-left", "getNormalizedScrollLeft")
  @js.native
  def getNormalizedScrollLeft_rtl(element: HTMLElement, direction: rtl): Double = js.native
  
  @JSImport("normalize-scroll-left", "setNormalizedScrollLeft")
  @js.native
  def setNormalizedScrollLeft_ltr(element: HTMLElement, scrollLeft: Double, direction: ltr): Unit = js.native
  @JSImport("normalize-scroll-left", "setNormalizedScrollLeft")
  @js.native
  def setNormalizedScrollLeft_rtl(element: HTMLElement, scrollLeft: Double, direction: rtl): Unit = js.native
  
  @JSImport("normalize-scroll-left", "_setScrollType")
  @js.native
  def setScrollType(): Unit = js.native
  @JSImport("normalize-scroll-left", "_setScrollType")
  @js.native
  def setScrollType(`type`: ScrollType): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate
    - typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.default
    - typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.negative
    - typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.reverse
  */
  trait ScrollType extends StObject
  object ScrollType {
    
    @scala.inline
    def default: typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.default = "default".asInstanceOf[typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.default]
    
    @scala.inline
    def indeterminate: typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate = "indeterminate".asInstanceOf[typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.indeterminate]
    
    @scala.inline
    def negative: typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.negative = "negative".asInstanceOf[typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.negative]
    
    @scala.inline
    def reverse: typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.reverse = "reverse".asInstanceOf[typingsSlinky.normalizeScrollLeft.normalizeScrollLeftStrings.reverse]
  }
}
