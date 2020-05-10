package typingsSlinky.awsSdkClientXrayNode.typesValueWithServiceIdsMod

import typingsSlinky.awsSdkClientXrayNode.typesAnnotationValueMod.UnmarshalledAnnotationValue
import typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledValueWithServiceIds extends ValueWithServiceIds {
  /**
    * <p>Values of the annotation.</p>
    */
  @JSName("AnnotationValue")
  var AnnotationValue_UnmarshalledValueWithServiceIds: js.UndefOr[UnmarshalledAnnotationValue] = js.native
  /**
    * <p>Services to which the annotation applies.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledValueWithServiceIds: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
}

object UnmarshalledValueWithServiceIds {
  @scala.inline
  def apply(): UnmarshalledValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledValueWithServiceIds]
  }
  @scala.inline
  implicit class UnmarshalledValueWithServiceIdsOps[Self <: UnmarshalledValueWithServiceIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationValue(value: UnmarshalledAnnotationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnnotationValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnnotationValue")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceIds(value: js.Array[UnmarshalledServiceId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(js.undefined)
        ret
    }
  }
  
}

