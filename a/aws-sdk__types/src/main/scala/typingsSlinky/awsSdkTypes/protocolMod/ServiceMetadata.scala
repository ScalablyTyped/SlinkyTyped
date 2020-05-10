package typingsSlinky.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMetadata extends js.Object {
  var apiVersion: java.lang.String = js.native
  var endpointPrefix: java.lang.String = js.native
  var jsonVersion: js.UndefOr[java.lang.String] = js.native
  var protocol: SupportedProtocol = js.native
  var serviceAbbreviation: js.UndefOr[java.lang.String] = js.native
  var serviceFullName: java.lang.String = js.native
  var serviceId: js.UndefOr[java.lang.String] = js.native
  var signatureVersion: SupportedSignatureVersion = js.native
  var signingName: js.UndefOr[java.lang.String] = js.native
  /**
    * Required for json-rpc services.
    */
  var targetPrefix: js.UndefOr[java.lang.String] = js.native
  /**
    * Sometimes specified when format differs from protocol default.
    */
  var timestampFormat: js.UndefOr[java.lang.String] = js.native
  var uid: java.lang.String = js.native
  /**
    * Required for query services.
    */
  var xmlNamespace: js.UndefOr[java.lang.String] = js.native
}

object ServiceMetadata {
  @scala.inline
  def apply(
    apiVersion: java.lang.String,
    endpointPrefix: java.lang.String,
    protocol: SupportedProtocol,
    serviceFullName: java.lang.String,
    signatureVersion: SupportedSignatureVersion,
    uid: java.lang.String
  ): ServiceMetadata = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], endpointPrefix = endpointPrefix.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], serviceFullName = serviceFullName.asInstanceOf[js.Any], signatureVersion = signatureVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceMetadata]
  }
  @scala.inline
  implicit class ServiceMetadataOps[Self <: ServiceMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointPrefix(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: SupportedProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceFullName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureVersion(value: SupportedSignatureVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonVersion(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAbbreviation(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAbbreviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAbbreviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAbbreviation")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPrefix(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampFormat(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlNamespace(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlNamespace")(js.undefined)
        ret
    }
  }
  
}

