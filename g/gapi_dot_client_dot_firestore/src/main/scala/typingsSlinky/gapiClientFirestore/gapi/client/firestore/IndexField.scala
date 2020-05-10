package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexField extends js.Object {
  /**
    * The path of the field. Must match the field path specification described
    * by google.firestore.v1beta1.Document.fields.
    * Special field path `__name__` may be used by itself or at the end of a
    * path. `__type__` may be used only at the end of path.
    */
  var fieldPath: js.UndefOr[String] = js.native
  /** The field's mode. */
  var mode: js.UndefOr[String] = js.native
}

object IndexField {
  @scala.inline
  def apply(): IndexField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexField]
  }
  @scala.inline
  implicit class IndexFieldOps[Self <: IndexField] (val x: Self) extends AnyVal {
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
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

