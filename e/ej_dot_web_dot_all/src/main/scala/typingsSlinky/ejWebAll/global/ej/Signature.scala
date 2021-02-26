package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Signature")
@js.native
class Signature protected ()
  extends typingsSlinky.ejWebAll.ej.Signature {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Signature {
  
  @JSGlobal("ej.Signature")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Signature.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Signature.SaveImageFormat")
  @js.native
  object SaveImageFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Signature.SaveImageFormat with Double] = js.native
    
    /* 2 */ val BMP: typingsSlinky.ejWebAll.ej.Signature.SaveImageFormat.BMP with Double = js.native
    
    /* 1 */ val JPG: typingsSlinky.ejWebAll.ej.Signature.SaveImageFormat.JPG with Double = js.native
    
    /* 0 */ val PNG: typingsSlinky.ejWebAll.ej.Signature.SaveImageFormat.PNG with Double = js.native
    
    /* 3 */ val TIFF: typingsSlinky.ejWebAll.ej.Signature.SaveImageFormat.TIFF with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Signature.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Signature = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Signature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
