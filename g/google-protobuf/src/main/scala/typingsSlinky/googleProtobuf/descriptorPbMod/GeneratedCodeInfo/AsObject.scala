package typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var annotationList: js.Array[
    typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject
  ] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    annotationList: js.Array[
      typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject
    ]
  ): AsObject = {
    val __obj = js.Dynamic.literal(annotationList = annotationList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationList(
      value: js.Array[
          typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo.Annotation.AsObject
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

