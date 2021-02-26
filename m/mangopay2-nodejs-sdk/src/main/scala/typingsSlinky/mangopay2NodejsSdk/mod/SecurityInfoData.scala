package typingsSlinky.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityInfoData extends StObject {
  
  var AVSResult: typingsSlinky.mangopay2NodejsSdk.mod.AVSResult = js.native
}
object SecurityInfoData {
  
  @scala.inline
  def apply(AVSResult: AVSResult): SecurityInfoData = {
    val __obj = js.Dynamic.literal(AVSResult = AVSResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInfoData]
  }
  
  @scala.inline
  implicit class SecurityInfoDataMutableBuilder[Self <: SecurityInfoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAVSResult(value: AVSResult): Self = StObject.set(x, "AVSResult", value.asInstanceOf[js.Any])
  }
}
