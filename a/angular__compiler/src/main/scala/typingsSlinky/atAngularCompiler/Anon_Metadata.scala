package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metadata extends js.Object {
  var metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata
  var summary: CompileTypeSummary
}

object Anon_Metadata {
  @scala.inline
  def apply(
    metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata,
    summary: CompileTypeSummary
  ): Anon_Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Metadata]
  }
}

