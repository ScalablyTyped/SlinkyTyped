package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the source in a supported storage service.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * If provided, get the source from this location in a Cloud Source
    * Repository.
    */
  var repoSource: js.UndefOr[SchemaRepoSource] = js.native
  /**
    * If provided, get the source from this location in Google Cloud Storage.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  @scala.inline
  implicit class SchemaSourceOps[Self <: SchemaSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepoSource(value: SchemaRepoSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoSource")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageSource(value: SchemaStorageSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageSource")(js.undefined)
        ret
    }
  }
  
}

