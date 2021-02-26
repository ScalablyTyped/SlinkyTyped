package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities extends StObject {
  
  var updateEnabled: js.UndefOr[Boolean] = js.native
}
object BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilitiesMutableBuilder[Self <: BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateEnabled(value: Boolean): Self = StObject.set(x, "updateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEnabledUndefined: Self = StObject.set(x, "updateEnabled", js.undefined)
  }
}
