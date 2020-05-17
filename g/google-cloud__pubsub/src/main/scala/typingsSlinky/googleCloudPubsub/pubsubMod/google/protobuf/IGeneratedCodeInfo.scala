package typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf

import typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GeneratedCodeInfo. */
@js.native
trait IGeneratedCodeInfo extends js.Object {
  /** GeneratedCodeInfo annotation */
  var annotation: js.UndefOr[js.Array[IAnnotation] | Null] = js.native
}

object IGeneratedCodeInfo {
  @scala.inline
  def apply(): IGeneratedCodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeneratedCodeInfo]
  }
  @scala.inline
  implicit class IGeneratedCodeInfoOps[Self <: IGeneratedCodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: js.Array[IAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(null)
        ret
    }
  }
  
}

