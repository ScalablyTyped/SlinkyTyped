package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofinput extends StObject {
  
  ////////////////////
  // Input - IME
  ////////////////////
  /**
    * Use the chrome.input.ime API to implement a custom IME for Chrome OS. This allows your extension to handle keystrokes, set the composition, and manage the candidate window.
    * Permissions:  "input"
    * @since Chrome 21.
    */
  val ime: Typeofime = js.native
}
object Typeofinput {
  
  @scala.inline
  def apply(ime: Typeofime): Typeofinput = {
    val __obj = js.Dynamic.literal(ime = ime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofinput]
  }
  
  @scala.inline
  implicit class TypeofinputMutableBuilder[Self <: Typeofinput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIme(value: Typeofime): Self = StObject.set(x, "ime", value.asInstanceOf[js.Any])
  }
}
