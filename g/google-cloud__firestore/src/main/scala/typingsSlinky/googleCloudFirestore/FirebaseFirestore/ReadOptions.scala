package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadOptions extends js.Object {
  /**
    * Specifies the set of fields to return and reduces the amount of data
    * transmitted by the backend.
    *
    * Adding a field mask does not filter results. Documents do not need to
    * contain values for all the fields in the mask to be part of the result
    * set.
    */
  val fieldMask: js.UndefOr[js.Array[String | FieldPath]] = js.native
}

object ReadOptions {
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  @scala.inline
  implicit class ReadOptionsOps[Self <: ReadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldMask(value: js.Array[String | FieldPath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMask")(js.undefined)
        ret
    }
  }
  
}

