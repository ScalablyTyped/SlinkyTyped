package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Runtime metadata that will be populated in the runtimeMetadata field of the
  * Operation associated with a RunPipeline execution.
  */
@js.native
trait SchemaRuntimeMetadata extends js.Object {
  /**
    * Execution information specific to Google Compute Engine.
    */
  var computeEngine: js.UndefOr[SchemaComputeEngine] = js.native
}

object SchemaRuntimeMetadata {
  @scala.inline
  def apply(): SchemaRuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeMetadata]
  }
  @scala.inline
  implicit class SchemaRuntimeMetadataOps[Self <: SchemaRuntimeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeEngine(value: SchemaComputeEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEngine")(js.undefined)
        ret
    }
  }
  
}

