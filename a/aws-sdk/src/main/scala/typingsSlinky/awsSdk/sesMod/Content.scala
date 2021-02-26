package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
  /**
    * The character set of the content.
    */
  var Charset: js.UndefOr[typingsSlinky.awsSdk.sesMod.Charset] = js.native
  
  /**
    * The textual data of the content.
    */
  var Data: MessageData = js.native
}
object Content {
  
  @scala.inline
  def apply(Data: MessageData): Content = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: Charset): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
    
    @scala.inline
    def setData(value: MessageData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
  }
}
