package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origin extends js.Object {
  /**
    * A complex type that contains names and values for the custom headers that you want.
    */
  var CustomHeaders: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CustomHeaders] = js.native
  /**
    * A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use the S3OriginConfig element instead.
    */
  var CustomOriginConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.CustomOriginConfig] = js.native
  /**
    *  Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this origin, for example, myawsbucket.s3.amazonaws.com. If you set up your bucket to be configured as a website endpoint, enter the Amazon S3 static website hosting endpoint for the bucket. For more information about specifying this value for different types of origins, see Origin Domain Name in the Amazon CloudFront Developer Guide. Constraints for Amazon S3 origins:    If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the s3-accelerate endpoint for DomainName.   The bucket name must be between 3 and 63 characters long (inclusive).   The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.   The bucket name must not contain adjacent periods.    Custom Origins: The DNS domain name for the HTTP server from which you want CloudFront to get objects for this origin, for example, www.example.com.  Constraints for custom origins:    DomainName must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or underscore (_) characters.   The name cannot exceed 128 characters.  
    */
  var DomainName: String = js.native
  /**
    * A unique identifier for the origin or origin group. The value of Id must be unique within the distribution. When you specify the value of TargetOriginId for the default cache behavior or for another cache behavior, you indicate the origin to which you want the cache behavior to route requests by specifying the value of the Id element for that origin. When a request matches the path pattern for that cache behavior, CloudFront routes the request to the specified origin. For more information, see Cache Behavior Settings in the Amazon CloudFront Developer Guide.
    */
  var Id: String = js.native
  /**
    * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin. When you include the OriginPath element, specify the directory name, beginning with a /. CloudFront appends the directory name to the value of DomainName, for example, example.com/production. Do not include a / at the end of the directory name. For example, suppose you've specified the following values for your distribution:    DomainName: An Amazon S3 bucket named myawsbucket.    OriginPath: /production     CNAME: example.com    When a user enters example.com/index.html in a browser, CloudFront sends a request to Amazon S3 for myawsbucket/production/index.html. When a user enters example.com/acme/index.html in a browser, CloudFront sends a request to Amazon S3 for myawsbucket/production/acme/index.html.
    */
  var OriginPath: js.UndefOr[String] = js.native
  /**
    * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the CustomOriginConfig element instead.
    */
  var S3OriginConfig: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.S3OriginConfig] = js.native
}

object Origin {
  @scala.inline
  def apply(DomainName: String, Id: String): Origin = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
  @scala.inline
  implicit class OriginOps[Self <: Origin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomHeaders(value: CustomHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomOriginConfig(value: CustomOriginConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomOriginConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomOriginConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomOriginConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginPath")(js.undefined)
        ret
    }
    @scala.inline
    def withS3OriginConfig(value: S3OriginConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OriginConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3OriginConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OriginConfig")(js.undefined)
        ret
    }
  }
  
}

