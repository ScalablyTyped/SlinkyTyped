package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.FieldTransformSetToServerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldTransform extends js.Object {
  var appendMissingElements: js.UndefOr[ArrayValue] = js.native
  var fieldPath: js.UndefOr[String] = js.native
  var increment: js.UndefOr[Value] = js.native
  var removeAllFromArray: js.UndefOr[ArrayValue] = js.native
  var setToServerValue: js.UndefOr[FieldTransformSetToServerValue] = js.native
}

object FieldTransform {
  @scala.inline
  def apply(): FieldTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldTransform]
  }
  @scala.inline
  implicit class FieldTransformOps[Self <: FieldTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendMissingElements(value: ArrayValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendMissingElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendMissingElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendMissingElements")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPath")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrement(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAllFromArray(value: ArrayValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllFromArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAllFromArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllFromArray")(js.undefined)
        ret
    }
    @scala.inline
    def withSetToServerValue(value: FieldTransformSetToServerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToServerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetToServerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToServerValue")(js.undefined)
        ret
    }
  }
  
}

