package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSHasOptionalTypeAnnotation extends js.Object {
  var typeAnnotation: TSTypeAnnotationKind | Null = js.native
}

object TSHasOptionalTypeAnnotation {
  @scala.inline
  def apply(): TSHasOptionalTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TSHasOptionalTypeAnnotation]
  }
  @scala.inline
  implicit class TSHasOptionalTypeAnnotationOps[Self <: TSHasOptionalTypeAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeAnnotation(value: TSTypeAnnotationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(null)
        ret
    }
  }
  
}

