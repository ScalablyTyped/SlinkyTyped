package typingsSlinky.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be set at the same time.
  */
/**
  * Details of the script or CSS to inject.
  * Either the code or the file property must be set,
  * but both may not be set at the same time.
  **/
@js.native
trait InjectDetails extends StObject {
  
  /**
    * JavaScript or CSS code to inject.
    *
    * **Warning**
    * Be careful using the *code* parameter.
    * Incorrect use of it may open your app to
    * cross site scripting attacks.
    * @see[More information]{@link https://en.wikipedia.org/wiki/Cross-site_scripting}
    */
  /**
    * JavaScript or CSS code to inject.
    * Warning: Be careful using the code parameter.
    * Incorrect use of it may open your app to xss attacks.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * JavaScript or CSS file to inject.
    */
  /** JavaScript or CSS file to inject. */
  var file: js.UndefOr[String] = js.native
}
object InjectDetails {
  
  @scala.inline
  def apply(): InjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectDetails]
  }
  
  @scala.inline
  implicit class InjectDetailsMutableBuilder[Self <: InjectDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
