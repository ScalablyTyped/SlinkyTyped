package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container message for hashes of byte content of files, used in
  * SourceProvenance messages to verify integrity of source input to the build.
  */
@js.native
trait SchemaFileHashes extends js.Object {
  /**
    * Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[SchemaHash]] = js.native
}

object SchemaFileHashes {
  @scala.inline
  def apply(): SchemaFileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileHashes]
  }
  @scala.inline
  implicit class SchemaFileHashesOps[Self <: SchemaFileHashes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileHash(value: js.Array[SchemaHash]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHash")(js.undefined)
        ret
    }
  }
  
}

