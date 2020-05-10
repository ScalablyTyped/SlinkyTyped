package typingsSlinky.awsSdkClientXrayNode.typesValueWithServiceIdsMod

import typingsSlinky.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue
import typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueWithServiceIds extends js.Object {
  /**
    * <p>Values of the annotation.</p>
    */
  var AnnotationValue: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue] = js.native
  /**
    * <p>Services to which the annotation applies.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[ServiceId] | js.Iterable[ServiceId]] = js.native
}

object ValueWithServiceIds {
  @scala.inline
  def apply(): ValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueWithServiceIds]
  }
  @scala.inline
  implicit class ValueWithServiceIdsOps[Self <: ValueWithServiceIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationValue(value: AnnotationValue): Self = {
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
    def withServiceIdsIterable(value: js.Iterable[ServiceId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceIds(value: js.Array[ServiceId] | js.Iterable[ServiceId]): Self = {
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

