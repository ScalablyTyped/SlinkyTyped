package typingsSlinky.awsSdkClientS3Node.typesListObjectVersionsOutputMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typingsSlinky.awsSdkClientS3Node.typesDeleteMarkerEntryMod.UnmarshalledDeleteMarkerEntry
import typingsSlinky.awsSdkClientS3Node.typesObjectVersionMod.UnmarshalledObjectVersion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectVersionsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CommonPrefixList shape
    */
  var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.native
  /**
    * _DeleteMarkers shape
    */
  var DeleteMarkers: js.UndefOr[js.Array[UnmarshalledDeleteMarkerEntry]] = js.native
  /**
    * _Delimiter shape
    */
  var Delimiter: js.UndefOr[String] = js.native
  /**
    * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
    */
  var EncodingType: js.UndefOr[url | String] = js.native
  /**
    * <p>A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.native
  /**
    * <p>Marks the last Key returned in a truncated response.</p>
    */
  var KeyMarker: js.UndefOr[String] = js.native
  /**
    * _MaxKeys shape
    */
  var MaxKeys: js.UndefOr[Double] = js.native
  /**
    * _BucketName shape
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * <p>Use this value for the key marker request parameter in a subsequent request.</p>
    */
  var NextKeyMarker: js.UndefOr[String] = js.native
  /**
    * <p>Use this value for the next version id marker parameter in a subsequent request.</p>
    */
  var NextVersionIdMarker: js.UndefOr[String] = js.native
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * _VersionIdMarker shape
    */
  var VersionIdMarker: js.UndefOr[String] = js.native
  /**
    * _ObjectVersionList shape
    */
  var Versions: js.UndefOr[js.Array[UnmarshalledObjectVersion]] = js.native
}

object ListObjectVersionsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListObjectVersionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectVersionsOutput]
  }
  @scala.inline
  implicit class ListObjectVersionsOutputOps[Self <: ListObjectVersionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteMarkers(value: js.Array[UnmarshalledDeleteMarkerEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingType(value: url | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxKeys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withNextKeyMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextKeyMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextKeyMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextKeyMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withNextVersionIdMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextVersionIdMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextVersionIdMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextVersionIdMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionIdMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionIdMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionIdMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionIdMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[UnmarshalledObjectVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Versions")(js.undefined)
        ret
    }
  }
  
}

