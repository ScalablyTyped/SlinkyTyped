package typingsSlinky.reactNativeFirebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TIMESTAMP extends StObject {
  
  var TIMESTAMP: StringDictionary[String] = js.native
}
object TIMESTAMP {
  
  @scala.inline
  def apply(TIMESTAMP: StringDictionary[String]): TIMESTAMP = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any])
    __obj.asInstanceOf[TIMESTAMP]
  }
  
  @scala.inline
  implicit class TIMESTAMPMutableBuilder[Self <: TIMESTAMP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTIMESTAMP(value: StringDictionary[String]): Self = StObject.set(x, "TIMESTAMP", value.asInstanceOf[js.Any])
  }
}
