package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldTransform extends js.Object {
  /**
    * The path of the field. See Document.fields for the field path syntax
    * reference.
    */
  var fieldPath: js.UndefOr[String] = js.native
  /** Sets the field to the given server value. */
  var setToServerValue: js.UndefOr[String] = js.native
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
    def withSetToServerValue(value: String): Self = {
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

