package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBackupsResponse extends StObject {
  
  /**
    * A list of backups.
    */
  var Backups: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Backups] = js.native
  
  /**
    * An opaque string that indicates that the response contains only a subset of backups. Use this value in a subsequent DescribeBackups request to get more backups.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.NextToken] = js.native
}
object DescribeBackupsResponse {
  
  @scala.inline
  def apply(): DescribeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsResponse]
  }
  
  @scala.inline
  implicit class DescribeBackupsResponseMutableBuilder[Self <: DescribeBackupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackups(value: Backups): Self = StObject.set(x, "Backups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupsUndefined: Self = StObject.set(x, "Backups", js.undefined)
    
    @scala.inline
    def setBackupsVarargs(value: Backup*): Self = StObject.set(x, "Backups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
