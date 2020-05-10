package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRouteMatch extends js.Object {
  /**
    * An object that represents the data to match from the request.
    */
  var metadata: js.UndefOr[GrpcRouteMetadataList] = js.native
  /**
    * The method name to match from the request. If you specify a name, you must also specify a serviceName.
    */
  var methodName: js.UndefOr[MethodName] = js.native
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: js.UndefOr[ServiceName] = js.native
}

object GrpcRouteMatch {
  @scala.inline
  def apply(): GrpcRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcRouteMatch]
  }
  @scala.inline
  implicit class GrpcRouteMatchOps[Self <: GrpcRouteMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: GrpcRouteMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodName(value: MethodName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
  }
  
}

