package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for build operations.
  */
@js.native
trait SchemaBuildOperationMetadata extends js.Object {
  /**
    * The build that the operation is tracking.
    */
  var build: js.UndefOr[SchemaBuild] = js.native
}

object SchemaBuildOperationMetadata {
  @scala.inline
  def apply(): SchemaBuildOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildOperationMetadata]
  }
  @scala.inline
  implicit class SchemaBuildOperationMetadataOps[Self <: SchemaBuildOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: SchemaBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
  }
  
}

