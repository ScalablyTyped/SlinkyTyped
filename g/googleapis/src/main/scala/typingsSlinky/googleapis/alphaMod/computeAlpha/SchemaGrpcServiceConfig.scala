package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gRPC config to access the SDS server.
  */
@js.native
trait SchemaGrpcServiceConfig extends js.Object {
  /**
    * The call credentials to access the SDS server.
    */
  var callCredentials: js.UndefOr[SchemaCallCredentials] = js.native
  /**
    * The channel credentials to access the SDS server.
    */
  var channelCredentials: js.UndefOr[SchemaChannelCredentials] = js.native
  /**
    * The target URI of the SDS server.
    */
  var targetUri: js.UndefOr[String] = js.native
}

object SchemaGrpcServiceConfig {
  @scala.inline
  def apply(): SchemaGrpcServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcServiceConfig]
  }
  @scala.inline
  implicit class SchemaGrpcServiceConfigOps[Self <: SchemaGrpcServiceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallCredentials(value: SchemaCallCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelCredentials(value: SchemaChannelCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUri")(js.undefined)
        ret
    }
  }
  
}

