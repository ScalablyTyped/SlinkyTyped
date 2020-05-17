package typingsSlinky.multerS3.mod.global.Express.MulterS3

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File
  extends typingsSlinky.multer.mod.global.Express.Multer.File {
  var acl: String = js.native
  var bucket: String = js.native
  var contentDisposition: Null = js.native
  var contentType: String = js.native
  var etag: String = js.native
  var key: String = js.native
  var location: String = js.native
  var metadata: js.Any = js.native
  var serverSideEncryption: Null = js.native
  var storageClass: String = js.native
}

object File {
  @scala.inline
  def apply(
    acl: String,
    bucket: String,
    buffer: Buffer,
    contentDisposition: Null,
    contentType: String,
    destination: String,
    encoding: String,
    etag: String,
    fieldname: String,
    filename: String,
    key: String,
    location: String,
    metadata: js.Any,
    mimetype: String,
    originalname: String,
    path: String,
    serverSideEncryption: Null,
    size: Double,
    storageClass: String,
    stream: Readable
  ): File = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serverSideEncryption = serverSideEncryption.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentDisposition(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

