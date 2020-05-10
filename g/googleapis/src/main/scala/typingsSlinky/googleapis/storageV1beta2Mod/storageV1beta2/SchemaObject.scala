package typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.AnonEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object.
  */
@js.native
trait SchemaObject extends js.Object {
  /**
    * Access controls on the object.
    */
  var acl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.native
  /**
    * The bucket containing this object.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Cache-Control directive for the object data.
    */
  var cacheControl: js.UndefOr[String] = js.native
  /**
    * Number of underlying components that make up this object. Components are
    * accumulated by compose operations and are limited to a count of 32.
    */
  var componentCount: js.UndefOr[Double] = js.native
  /**
    * Content-Disposition of the object data.
    */
  var contentDisposition: js.UndefOr[String] = js.native
  /**
    * Content-Encoding of the object data.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * Content-Language of the object data.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Content-Type of the object data.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using
    * base64.
    */
  var crc32c: js.UndefOr[String] = js.native
  /**
    * HTTP 1.1 Entity tag for the object.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The content generation of this object. Used for object versioning.
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * The ID of the object.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * MD5 hash of the data; encoded using base64.
    */
  var md5Hash: js.UndefOr[String] = js.native
  /**
    * Media download link.
    */
  var mediaLink: js.UndefOr[String] = js.native
  /**
    * User-provided metadata, in key/value pairs.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The generation of the metadata for this object at this generation. Used
    * for metadata versioning. Has no meaning outside of the context of this
    * generation.
    */
  var metageneration: js.UndefOr[String] = js.native
  /**
    * The name of this object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[AnonEntity] = js.native
  /**
    * The link to this object.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Content-Length of the data in bytes.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * Storage class of the object.
    */
  var storageClass: js.UndefOr[String] = js.native
  /**
    * Deletion time of the object in RFC 3339 format. Will be returned if and
    * only if this version of the object has been deleted.
    */
  var timeDeleted: js.UndefOr[String] = js.native
  /**
    * Modification time of the object metadata in RFC 3339 format.
    */
  var updated: js.UndefOr[String] = js.native
}

object SchemaObject {
  @scala.inline
  def apply(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
  @scala.inline
  implicit class SchemaObjectOps[Self <: SchemaObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: js.Array[SchemaObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCrc32c(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crc32c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrc32c: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crc32c")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaLink")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMetageneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metageneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetageneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metageneration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: AnonEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeDeleted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

