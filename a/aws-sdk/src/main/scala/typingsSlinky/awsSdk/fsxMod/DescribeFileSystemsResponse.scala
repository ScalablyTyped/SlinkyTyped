package typingsSlinky.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFileSystemsResponse extends StObject {
  
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FileSystems] = js.native
  
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextToken value in the later request to fetch the descriptions. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.NextToken] = js.native
}
object DescribeFileSystemsResponse {
  
  @scala.inline
  def apply(): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
  
  @scala.inline
  implicit class DescribeFileSystemsResponseMutableBuilder[Self <: DescribeFileSystemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystems(value: FileSystems): Self = StObject.set(x, "FileSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemsUndefined: Self = StObject.set(x, "FileSystems", js.undefined)
    
    @scala.inline
    def setFileSystemsVarargs(value: FileSystem*): Self = StObject.set(x, "FileSystems", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
