package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
  var annotation: typingsSlinky.angularCompiler.coreMod.Directive = js.native
  var metadata: CompileDirectiveMetadata = js.native
}

object Annotation {
  @scala.inline
  def apply(annotation: typingsSlinky.angularCompiler.coreMod.Directive, metadata: CompileDirectiveMetadata): Annotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: typingsSlinky.angularCompiler.coreMod.Directive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: CompileDirectiveMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

