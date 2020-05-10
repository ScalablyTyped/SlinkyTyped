package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionOriginItem extends js.Object {
  /**
    * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this origin.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  /**
    * A unique identifier for the origin or origin group.
    */
  var Id: js.UndefOr[NonEmptyString] = js.native
  /**
    * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin.
    */
  var OriginPath: js.UndefOr[NonEmptyString] = js.native
}

object AwsCloudFrontDistributionOriginItem {
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginItem]
  }
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginItemOps[Self <: AwsCloudFrontDistributionOriginItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginPath(value: NonEmptyString): Self = {
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
  }
  
}

