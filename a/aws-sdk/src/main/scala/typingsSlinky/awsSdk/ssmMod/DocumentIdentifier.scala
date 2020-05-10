package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentIdentifier extends js.Object {
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentFormat] = js.native
  /**
    * The document type.
    */
  var DocumentType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentType] = js.native
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * The AWS user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.native
  /**
    * The operating system platform. 
    */
  var PlatformTypes: js.UndefOr[PlatformTypeList] = js.native
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.native
  /**
    * The schema version.
    */
  var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.native
  /**
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TargetType] = js.native
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}

object DocumentIdentifier {
  @scala.inline
  def apply(): DocumentIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentIdentifier]
  }
  @scala.inline
  implicit class DocumentIdentifierOps[Self <: DocumentIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDocumentType(value: DocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentType")(js.undefined)
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
    def withName(value: DocumentARN): Self = {
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
    def withOwner(value: DocumentOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformTypes(value: PlatformTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequires(value: DocumentRequiresList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Requires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Requires")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaVersion(value: DocumentSchemaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetType(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(js.undefined)
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

