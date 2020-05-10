package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of properties that uniquely identify a given Docker image.
  */
@js.native
trait SchemaFingerprint extends js.Object {
  /**
    * The layer-id of the final layer in the Docker image&#39;s v1
    * representation. This field can be used as a filter in list requests.
    */
  var v1Name: js.UndefOr[String] = js.native
  /**
    * The ordered list of v2 blobs that represent a given image.
    */
  var v2Blob: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The name of the image&#39;s v2 blobs computed via: [bottom]
    * := v2_blobbottom := sha256(v2_blob[N] + &quot; &quot; + v2_name[N+1])
    * Only the name of the final blob is kept. This field can be used as a
    * filter in list requests.
    */
  var v2Name: js.UndefOr[String] = js.native
}

object SchemaFingerprint {
  @scala.inline
  def apply(): SchemaFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFingerprint]
  }
  @scala.inline
  implicit class SchemaFingerprintOps[Self <: SchemaFingerprint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV1Name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v1Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV1Name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v1Name")(js.undefined)
        ret
    }
    @scala.inline
    def withV2Blob(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2Blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV2Blob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2Blob")(js.undefined)
        ret
    }
    @scala.inline
    def withV2Name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV2Name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2Name")(js.undefined)
        ret
    }
  }
  
}

