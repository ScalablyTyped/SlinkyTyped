package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextDataType extends js.Object {
  /**
    * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection library.
    */
  var EncodedData: js.UndefOr[StringType] = js.native
  /**
    * HttpHeaders received on your server in same order.
    */
  var HttpHeaders: HttpHeaderList = js.native
  /**
    * Source IP address of your user.
    */
  var IpAddress: StringType = js.native
  /**
    * Your server endpoint where this API is invoked.
    */
  var ServerName: StringType = js.native
  /**
    * Your server path where this API is invoked. 
    */
  var ServerPath: StringType = js.native
}

object ContextDataType {
  @scala.inline
  def apply(HttpHeaders: HttpHeaderList, IpAddress: StringType, ServerName: StringType, ServerPath: StringType): ContextDataType = {
    val __obj = js.Dynamic.literal(HttpHeaders = HttpHeaders.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], ServerPath = ServerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextDataType]
  }
  @scala.inline
  implicit class ContextDataTypeOps[Self <: ContextDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpHeaders(value: HttpHeaderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddress(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerName(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerPath(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodedData(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodedData")(js.undefined)
        ret
    }
  }
  
}

