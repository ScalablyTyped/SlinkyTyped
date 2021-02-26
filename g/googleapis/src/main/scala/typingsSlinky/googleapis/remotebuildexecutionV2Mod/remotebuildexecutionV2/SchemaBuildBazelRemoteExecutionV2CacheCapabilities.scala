package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Capabilities of the remote cache system.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2CacheCapabilities extends StObject {
  
  /**
    * Capabilities for updating the action cache.
    */
  var actionCacheUpdateCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities] = js.native
  
  /**
    * Supported cache priority range for both CAS and ActionCache.
    */
  var cachePriorityCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] = js.native
  
  /**
    * All the digest functions supported by the remote cache. Remote cache may
    * support multiple digest functions simultaneously.
    */
  var digestFunction: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Maximum total size of blobs to be uploaded/downloaded using batch
    * methods. A value of 0 means no limit is set, although in practice there
    * will always be a message size limitation of the protocol in use, e.g.
    * GRPC.
    */
  var maxBatchTotalSizeBytes: js.UndefOr[String] = js.native
  
  /**
    * Whether absolute symlink targets are supported.
    */
  var symlinkAbsolutePathStrategy: js.UndefOr[String] = js.native
}
object SchemaBuildBazelRemoteExecutionV2CacheCapabilities {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2CacheCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2CacheCapabilities]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2CacheCapabilitiesMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2CacheCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionCacheUpdateCapabilities(value: SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities): Self = StObject.set(x, "actionCacheUpdateCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionCacheUpdateCapabilitiesUndefined: Self = StObject.set(x, "actionCacheUpdateCapabilities", js.undefined)
    
    @scala.inline
    def setCachePriorityCapabilities(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities): Self = StObject.set(x, "cachePriorityCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePriorityCapabilitiesUndefined: Self = StObject.set(x, "cachePriorityCapabilities", js.undefined)
    
    @scala.inline
    def setDigestFunction(value: js.Array[String]): Self = StObject.set(x, "digestFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestFunctionUndefined: Self = StObject.set(x, "digestFunction", js.undefined)
    
    @scala.inline
    def setDigestFunctionVarargs(value: String*): Self = StObject.set(x, "digestFunction", js.Array(value :_*))
    
    @scala.inline
    def setMaxBatchTotalSizeBytes(value: String): Self = StObject.set(x, "maxBatchTotalSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchTotalSizeBytesUndefined: Self = StObject.set(x, "maxBatchTotalSizeBytes", js.undefined)
    
    @scala.inline
    def setSymlinkAbsolutePathStrategy(value: String): Self = StObject.set(x, "symlinkAbsolutePathStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymlinkAbsolutePathStrategyUndefined: Self = StObject.set(x, "symlinkAbsolutePathStrategy", js.undefined)
  }
}
