package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Document
import typingsSlinky.activexWord.Word.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wn extends StObject {
  
  val Doc: Document = js.native
  
  val Wn: Window = js.native
}
object Wn {
  
  @scala.inline
  def apply(Doc: Document, Wn: Window): Wn = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wn]
  }
  
  @scala.inline
  implicit class WnMutableBuilder[Self <: Wn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWn(value: Window): Self = StObject.set(x, "Wn", value.asInstanceOf[js.Any])
  }
}
