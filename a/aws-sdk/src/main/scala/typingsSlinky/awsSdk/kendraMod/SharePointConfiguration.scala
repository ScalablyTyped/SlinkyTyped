package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharePointConfiguration extends js.Object {
  /**
    *  TRUE to include attachments to documents stored in your Microsoft SharePoint site in the index; otherwise, FALSE.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.native
  /**
    * The Microsoft SharePoint attribute field that contains the title of the document.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  /**
    * A list of DataSourceToIndexFieldMapping objects that map Microsoft SharePoint attributes to custom fields in the Amazon Kendra index. You must first create the index fields using the operation before you map SharePoint attributes. For more information, see Mapping Data Source Fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  /**
    * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a user/password pair. For more information, see Using a Microsoft SharePoint Data Source. For more information about AWS Secrets Manager, see  What Is AWS Secrets Manager  in the AWS Secrets Manager user guide.
    */
  var SecretArn: typingsSlinky.awsSdk.kendraMod.SecretArn = js.native
  /**
    * The version of Microsoft SharePoint that you are using as a data source.
    */
  var SharePointVersion: typingsSlinky.awsSdk.kendraMod.SharePointVersion = js.native
  /**
    * The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
    */
  var Urls: SharePointUrlList = js.native
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.native
}

object SharePointConfiguration {
  @scala.inline
  def apply(SecretArn: SecretArn, SharePointVersion: SharePointVersion, Urls: SharePointUrlList): SharePointConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], SharePointVersion = SharePointVersion.asInstanceOf[js.Any], Urls = Urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePointConfiguration]
  }
  @scala.inline
  implicit class SharePointConfigurationOps[Self <: SharePointConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecretArn(value: SecretArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharePointVersion(value: SharePointVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharePointVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: SharePointUrlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrawlAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentTitleFieldName(value: DataSourceFieldName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentTitleFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentTitleFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentTitleFieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldMappings(value: DataSourceToIndexFieldMappingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfiguration(value: DataSourceVpcConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfiguration")(js.undefined)
        ret
    }
  }
  
}

