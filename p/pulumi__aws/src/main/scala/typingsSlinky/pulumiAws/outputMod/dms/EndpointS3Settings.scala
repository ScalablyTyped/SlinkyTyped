package typingsSlinky.pulumiAws.outputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointS3Settings extends js.Object {
  var bucketFolder: js.UndefOr[String] = js.native
  var bucketName: js.UndefOr[String] = js.native
  var compressionType: js.UndefOr[String] = js.native
  var csvDelimiter: js.UndefOr[String] = js.native
  var csvRowDelimiter: js.UndefOr[String] = js.native
  var externalTableDefinition: js.UndefOr[String] = js.native
  var serviceAccessRoleArn: js.UndefOr[String] = js.native
}

object EndpointS3Settings {
  @scala.inline
  def apply(): EndpointS3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointS3Settings]
  }
  @scala.inline
  implicit class EndpointS3SettingsOps[Self <: EndpointS3Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionType")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvRowDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvRowDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvRowDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvRowDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalTableDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalTableDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalTableDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalTableDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccessRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccessRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccessRoleArn")(js.undefined)
        ret
    }
  }
  
}

