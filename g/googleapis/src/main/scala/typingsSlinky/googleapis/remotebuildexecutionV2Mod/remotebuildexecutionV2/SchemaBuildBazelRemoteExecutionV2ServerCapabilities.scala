package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for Capabilities.GetCapabilities.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ServerCapabilities extends js.Object {
  /**
    * Capabilities of the remote cache system.
    */
  var cacheCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2CacheCapabilities] = js.native
  /**
    * Earliest RE API version supported, including deprecated versions.
    */
  var deprecatedApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.native
  /**
    * Capabilities of the remote execution system.
    */
  var executionCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities] = js.native
  /**
    * Latest RE API version supported.
    */
  var highApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.native
  /**
    * Earliest non-deprecated RE API version supported.
    */
  var lowApiVersion: js.UndefOr[SchemaBuildBazelSemverSemVer] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ServerCapabilities {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ServerCapabilitiesOps[Self <: SchemaBuildBazelRemoteExecutionV2ServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheCapabilities(value: SchemaBuildBazelRemoteExecutionV2CacheCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedApiVersion(value: SchemaBuildBazelSemverSemVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedApiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedApiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionCapabilities(value: SchemaBuildBazelRemoteExecutionV2ExecutionCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withHighApiVersion(value: SchemaBuildBazelSemverSemVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highApiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highApiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLowApiVersion(value: SchemaBuildBazelSemverSemVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowApiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowApiVersion")(js.undefined)
        ret
    }
  }
  
}

