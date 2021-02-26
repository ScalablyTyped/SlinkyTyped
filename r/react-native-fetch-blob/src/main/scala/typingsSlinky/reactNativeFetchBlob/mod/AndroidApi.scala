package typingsSlinky.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidApi extends StObject {
  
  /**
    * When sending an ACTION_VIEW intent with given file path and MIME type, system will try to open an
    * App to handle the file. For example, open Gallery app to view an image, or install APK.
    * @param path Path of the file to be opened.
    * @param mime Basically system will open an app according to this MIME type.
    */
  def actionViewIntent(path: String, mime: String): js.Promise[_] = js.native
}
object AndroidApi {
  
  @scala.inline
  def apply(actionViewIntent: (String, String) => js.Promise[_]): AndroidApi = {
    val __obj = js.Dynamic.literal(actionViewIntent = js.Any.fromFunction2(actionViewIntent))
    __obj.asInstanceOf[AndroidApi]
  }
  
  @scala.inline
  implicit class AndroidApiMutableBuilder[Self <: AndroidApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionViewIntent(value: (String, String) => js.Promise[_]): Self = StObject.set(x, "actionViewIntent", js.Any.fromFunction2(value))
  }
}
