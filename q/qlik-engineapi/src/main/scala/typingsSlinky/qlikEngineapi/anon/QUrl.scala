package typingsSlinky.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QUrl extends StObject {
  
  /**
    * Name of the Service
    */
  var qName: String = js.native
  
  /**
    * URL of the Service
    */
  var qUrl: String = js.native
}
object QUrl {
  
  @scala.inline
  def apply(qName: String, qUrl: String): QUrl = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[QUrl]
  }
  
  @scala.inline
  implicit class QUrlMutableBuilder[Self <: QUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUrl(value: String): Self = StObject.set(x, "qUrl", value.asInstanceOf[js.Any])
  }
}
