package typingsSlinky.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostDataEntry extends StObject {
  
  var bytes: js.UndefOr[String] = js.native
}
object PostDataEntry {
  
  @scala.inline
  def apply(): PostDataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostDataEntry]
  }
  
  @scala.inline
  implicit class PostDataEntryMutableBuilder[Self <: PostDataEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: String): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
  }
}
