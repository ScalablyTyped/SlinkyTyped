package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.coreMod.Directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnnotation extends js.Object {
  var annotation: Directive
  var metadata: CompileDirectiveMetadata
}

object AnonAnnotation {
  @scala.inline
  def apply(annotation: Directive, metadata: CompileDirectiveMetadata): AnonAnnotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnnotation]
  }
}

