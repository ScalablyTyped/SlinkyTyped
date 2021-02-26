package typingsSlinky.reactOverlays.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arialabelledby extends StObject {
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var ref: RefCallback[HTMLElement] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object Arialabelledby {
  
  @scala.inline
  def apply(ref: /* instance */ HTMLElement | Null => Unit): Arialabelledby = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[Arialabelledby]
  }
  
  @scala.inline
  implicit class ArialabelledbyMutableBuilder[Self <: Arialabelledby] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def setRef(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
