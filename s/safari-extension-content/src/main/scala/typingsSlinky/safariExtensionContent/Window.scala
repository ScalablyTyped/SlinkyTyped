package typingsSlinky.safariExtensionContent

import typingsSlinky.safariExtensionContent.anon.Typeofsafari
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var safari: Typeofsafari = js.native
}
object Window {
  
  @scala.inline
  def apply(safari: Typeofsafari): Window = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSafari(value: Typeofsafari): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
  }
}
