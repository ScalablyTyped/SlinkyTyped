package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileInfoSuccess extends StObject {
  
  /** 按照传入的 digestAlgorithm 计算得出的的文件摘要 */
  var digest: String = js.native
  
  /** 文件大小，单位：B */
  var size: Double = js.native
}
object GetFileInfoSuccess {
  
  @scala.inline
  def apply(digest: String, size: Double): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
  
  @scala.inline
  implicit class GetFileInfoSuccessMutableBuilder[Self <: GetFileInfoSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
