package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadLayerPartRequest extends js.Object {
  /**
    * The base64-encoded layer part payload.
    */
  var layerPartBlob: LayerPartBlob = js.native
  /**
    * The integer value of the first byte of the layer part.
    */
  var partFirstByte: PartSize = js.native
  /**
    * The integer value of the last byte of the layer part.
    */
  var partLastByte: PartSize = js.native
  /**
    * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to which you are uploading layer parts.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the layer part upload.
    */
  var uploadId: UploadId = js.native
}

object UploadLayerPartRequest {
  @scala.inline
  def apply(
    layerPartBlob: LayerPartBlob,
    partFirstByte: PartSize,
    partLastByte: PartSize,
    repositoryName: RepositoryName,
    uploadId: UploadId
  ): UploadLayerPartRequest = {
    val __obj = js.Dynamic.literal(layerPartBlob = layerPartBlob.asInstanceOf[js.Any], partFirstByte = partFirstByte.asInstanceOf[js.Any], partLastByte = partLastByte.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLayerPartRequest]
  }
  @scala.inline
  implicit class UploadLayerPartRequestOps[Self <: UploadLayerPartRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerPartBlobUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerPartBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerPartBlob(value: LayerPartBlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerPartBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartFirstByte(value: PartSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partFirstByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartLastByte(value: PartSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partLastByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadId(value: UploadId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistryId(value: RegistryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(js.undefined)
        ret
    }
  }
  
}

