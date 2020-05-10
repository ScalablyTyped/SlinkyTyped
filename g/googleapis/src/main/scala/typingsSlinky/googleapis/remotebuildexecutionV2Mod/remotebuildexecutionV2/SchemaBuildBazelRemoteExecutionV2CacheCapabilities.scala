package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities of the remote cache system.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2CacheCapabilities extends js.Object {
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
  implicit class SchemaBuildBazelRemoteExecutionV2CacheCapabilitiesOps[Self <: SchemaBuildBazelRemoteExecutionV2CacheCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionCacheUpdateCapabilities(value: SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCacheUpdateCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionCacheUpdateCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCacheUpdateCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withCachePriorityCapabilities(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePriorityCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachePriorityCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePriorityCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDigestFunction(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBatchTotalSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchTotalSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBatchTotalSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchTotalSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withSymlinkAbsolutePathStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinkAbsolutePathStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymlinkAbsolutePathStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinkAbsolutePathStrategy")(js.undefined)
        ret
    }
  }
  
}

