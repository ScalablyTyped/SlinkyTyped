package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hints for splitting a Source into bundles (parts for parallel processing)
  * using SourceSplitRequest.
  */
@js.native
trait SchemaSourceSplitOptions extends js.Object {
  /**
    * The source should be split into a set of bundles where the estimated size
    * of each is approximately this many bytes.
    */
  var desiredBundleSizeBytes: js.UndefOr[String] = js.native
  /**
    * DEPRECATED in favor of desired_bundle_size_bytes.
    */
  var desiredShardSizeBytes: js.UndefOr[String] = js.native
}

object SchemaSourceSplitOptions {
  @scala.inline
  def apply(): SchemaSourceSplitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitOptions]
  }
  @scala.inline
  implicit class SchemaSourceSplitOptionsOps[Self <: SchemaSourceSplitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredBundleSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredBundleSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredBundleSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredBundleSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredShardSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredShardSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredShardSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredShardSizeBytes")(js.undefined)
        ret
    }
  }
  
}

