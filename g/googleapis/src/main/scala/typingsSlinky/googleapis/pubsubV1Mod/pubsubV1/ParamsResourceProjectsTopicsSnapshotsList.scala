package typingsSlinky.googleapis.pubsubV1Mod.pubsubV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsTopicsSnapshotsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Maximum number of snapshot names to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The value returned by the last `ListTopicSnapshotsResponse`; indicates
    * that this is a continuation of a prior `ListTopicSnapshots` call, and
    * that the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the topic that snapshots are attached to. Format is
    * `projects/{project}/topics/{topic}`.
    */
  var topic: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsTopicsSnapshotsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsTopicsSnapshotsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTopicsSnapshotsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsTopicsSnapshotsListMutableBuilder[Self <: ParamsResourceProjectsTopicsSnapshotsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
