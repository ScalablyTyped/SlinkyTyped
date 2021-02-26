package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFragmentsOutput extends StObject {
  
  /**
    * A list of archived Fragment objects from the stream that meet the selector criteria. Results are in no specific order, even across pages.
    */
  var Fragments: js.UndefOr[FragmentList] = js.native
  
  /**
    * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.NextToken] = js.native
}
object ListFragmentsOutput {
  
  @scala.inline
  def apply(): ListFragmentsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFragmentsOutput]
  }
  
  @scala.inline
  implicit class ListFragmentsOutputMutableBuilder[Self <: ListFragmentsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragments(value: FragmentList): Self = StObject.set(x, "Fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentsUndefined: Self = StObject.set(x, "Fragments", js.undefined)
    
    @scala.inline
    def setFragmentsVarargs(value: Fragment*): Self = StObject.set(x, "Fragments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
