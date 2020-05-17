package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata = js.native
  var summary: CompileTypeSummary = js.native
}

object Metadata {
  @scala.inline
  def apply(
    metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata,
    summary: CompileTypeSummary
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(
      value: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: CompileTypeSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

