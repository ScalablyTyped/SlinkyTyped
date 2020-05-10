package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftIntegration extends js.Object {
  // AWS access key credentials
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.native
  // Redshift Cluster host
  var host: String = js.native
  // Password associated with Redshift cluster
  var password: String = js.native
  // Redshift Cluster port
  var port: Double = js.native
  // unload S3 bucket path
  var s3_bucket_path: String = js.native
  // Username associated with Redshift cluster
  var username: String = js.native
}

object RedshiftIntegration {
  @scala.inline
  def apply(host: String, password: String, port: Double, s3_bucket_path: String, username: String): RedshiftIntegration = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], s3_bucket_path = s3_bucket_path.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftIntegration]
  }
  @scala.inline
  implicit class RedshiftIntegrationOps[Self <: RedshiftIntegration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3_bucket_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3_bucket_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAws_access_key(value: AwsAccessKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_access_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAws_access_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_access_key")(js.undefined)
        ret
    }
  }
  
}

