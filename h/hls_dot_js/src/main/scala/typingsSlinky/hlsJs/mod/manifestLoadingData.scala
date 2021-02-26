package typingsSlinky.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait manifestLoadingData extends StObject {
  
  var url: String = js.native
}
object manifestLoadingData {
  
  @scala.inline
  def apply(url: String): manifestLoadingData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[manifestLoadingData]
  }
  
  @scala.inline
  implicit class manifestLoadingDataMutableBuilder[Self <: manifestLoadingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
