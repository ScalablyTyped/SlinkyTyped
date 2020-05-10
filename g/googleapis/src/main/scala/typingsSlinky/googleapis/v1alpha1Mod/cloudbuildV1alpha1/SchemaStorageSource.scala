package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the source in an archive file in Google Cloud Storage.
  */
@js.native
trait SchemaStorageSource extends js.Object {
  /**
    * Google Cloud Storage bucket containing the source (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage generation for the object. If the generation is
    * omitted, the latest generation will be used.
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage object containing the source.  This object must be a
    * gzipped archive file (`.tar.gz`) containing source to build.
    */
  var `object`: js.UndefOr[String] = js.native
}

object SchemaStorageSource {
  @scala.inline
  def apply(): SchemaStorageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStorageSource]
  }
  @scala.inline
  implicit class SchemaStorageSourceOps[Self <: SchemaStorageSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
  }
  
}

