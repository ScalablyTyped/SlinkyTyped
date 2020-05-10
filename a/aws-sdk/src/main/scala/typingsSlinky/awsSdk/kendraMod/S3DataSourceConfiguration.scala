package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DataSourceConfiguration extends js.Object {
  /**
    * Provides the path to the S3 bucket that contains the user context filtering files for the data source.
    */
  var AccessControlListConfiguration: js.UndefOr[typingsSlinky.awsSdk.kendraMod.AccessControlListConfiguration] = js.native
  /**
    * The name of the bucket that contains the documents.
    */
  var BucketName: S3BucketName = js.native
  var DocumentsMetadataConfiguration: js.UndefOr[typingsSlinky.awsSdk.kendraMod.DocumentsMetadataConfiguration] = js.native
  /**
    * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix also matches an exclusion pattern, the document is not indexed. For more information about glob patterns, see glob (programming) in Wikipedia.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  /**
    * A list of S3 prefixes for the documents that should be included in the index.
    */
  var InclusionPrefixes: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
}

object S3DataSourceConfiguration {
  @scala.inline
  def apply(BucketName: S3BucketName): S3DataSourceConfiguration = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataSourceConfiguration]
  }
  @scala.inline
  implicit class S3DataSourceConfigurationOps[Self <: S3DataSourceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: S3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessControlListConfiguration(value: AccessControlListConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlListConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlListConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlListConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentsMetadataConfiguration(value: DocumentsMetadataConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentsMetadataConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentsMetadataConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentsMetadataConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusionPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusionPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusionPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusionPrefixes(value: DataSourceInclusionsExclusionsStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InclusionPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusionPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InclusionPrefixes")(js.undefined)
        ret
    }
  }
  
}

