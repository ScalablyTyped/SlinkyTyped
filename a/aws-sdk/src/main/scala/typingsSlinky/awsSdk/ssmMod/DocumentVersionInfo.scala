package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentVersionInfo extends js.Object {
  /**
    * The date the document was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentFormat] = js.native
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * An identifier for the default version of the document.
    */
  var IsDefaultVersion: js.UndefOr[Boolean] = js.native
  /**
    * The document name.
    */
  var Name: js.UndefOr[DocumentName] = js.native
  /**
    * The status of the Systems Manager document, such as Creating, Active, Failed, and Deleting.
    */
  var Status: js.UndefOr[DocumentStatus] = js.native
  /**
    * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.native
  /**
    * The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}

object DocumentVersionInfo {
  @scala.inline
  def apply(): DocumentVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentVersionInfo]
  }
  @scala.inline
  implicit class DocumentVersionInfoOps[Self <: DocumentVersionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentFormat(value: DocumentFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentVersion(value: DocumentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefaultVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefaultVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: DocumentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DocumentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusInformation(value: DocumentStatusInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionName(value: DocumentVersionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionName")(js.undefined)
        ret
    }
  }
  
}

