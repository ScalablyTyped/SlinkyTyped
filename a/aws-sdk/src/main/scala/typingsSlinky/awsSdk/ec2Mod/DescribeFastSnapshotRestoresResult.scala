package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFastSnapshotRestoresResult extends StObject {
  
  /**
    * Information about the state of fast snapshot restores.
    */
  var FastSnapshotRestores: js.UndefOr[DescribeFastSnapshotRestoreSuccessSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeFastSnapshotRestoresResult {
  
  @scala.inline
  def apply(): DescribeFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastSnapshotRestoresResult]
  }
  
  @scala.inline
  implicit class DescribeFastSnapshotRestoresResultMutableBuilder[Self <: DescribeFastSnapshotRestoresResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFastSnapshotRestores(value: DescribeFastSnapshotRestoreSuccessSet): Self = StObject.set(x, "FastSnapshotRestores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastSnapshotRestoresUndefined: Self = StObject.set(x, "FastSnapshotRestores", js.undefined)
    
    @scala.inline
    def setFastSnapshotRestoresVarargs(value: DescribeFastSnapshotRestoreSuccessItem*): Self = StObject.set(x, "FastSnapshotRestores", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
