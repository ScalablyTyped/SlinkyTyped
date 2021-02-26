package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Rating")
@js.native
class Rating protected ()
  extends typingsSlinky.ejWebAll.ej.Rating {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Rating {
  
  @JSGlobal("ej.Rating")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Rating.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Rating.Precision")
  @js.native
  object Precision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Rating.Precision with Double] = js.native
    
    /* 0 */ val Exact: typingsSlinky.ejWebAll.ej.Rating.Precision.Exact with Double = js.native
    
    /* 1 */ val Full: typingsSlinky.ejWebAll.ej.Rating.Precision.Full with Double = js.native
    
    /* 2 */ val Half: typingsSlinky.ejWebAll.ej.Rating.Precision.Half with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Rating.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Rating = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Rating): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
