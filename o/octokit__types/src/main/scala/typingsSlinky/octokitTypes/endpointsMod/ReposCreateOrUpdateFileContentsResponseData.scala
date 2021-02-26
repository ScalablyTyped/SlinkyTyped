package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Committer
import typingsSlinky.octokitTypes.anon.Downloadurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateOrUpdateFileContentsResponseData extends StObject {
  
  var commit: Committer = js.native
  
  var content: Downloadurl = js.native
}
object ReposCreateOrUpdateFileContentsResponseData {
  
  @scala.inline
  def apply(commit: Committer, content: Downloadurl): ReposCreateOrUpdateFileContentsResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsResponseData]
  }
  
  @scala.inline
  implicit class ReposCreateOrUpdateFileContentsResponseDataMutableBuilder[Self <: ReposCreateOrUpdateFileContentsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: Committer): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Downloadurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
