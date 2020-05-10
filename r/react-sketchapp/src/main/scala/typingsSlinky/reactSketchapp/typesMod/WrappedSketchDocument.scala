package typingsSlinky.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedSketchDocument extends js.Object {
  var sketchObject: SketchDocument | SketchDocumentData = js.native
}

object WrappedSketchDocument {
  @scala.inline
  def apply(sketchObject: SketchDocument | SketchDocumentData): WrappedSketchDocument = {
    val __obj = js.Dynamic.literal(sketchObject = sketchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedSketchDocument]
  }
  @scala.inline
  implicit class WrappedSketchDocumentOps[Self <: WrappedSketchDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSketchObject(value: SketchDocument | SketchDocumentData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sketchObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

