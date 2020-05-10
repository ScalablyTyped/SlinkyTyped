package typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A field in an index. The field_path describes which field is indexed, the
  * value_mode describes how the field value is indexed.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2IndexField extends js.Object {
  /**
    * Indicates that this field supports operations on `array_value`s.
    */
  var arrayConfig: js.UndefOr[String] = js.native
  /**
    * Can be __name__. For single field indexes, this must match the name of
    * the field or may be omitted.
    */
  var fieldPath: js.UndefOr[String] = js.native
  /**
    * Indicates that this field supports ordering by the specified order or
    * comparing using =, &lt;, &lt;=, &gt;, &gt;=.
    */
  var order: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1beta2IndexField {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2IndexField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexField]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2IndexFieldOps[Self <: SchemaGoogleFirestoreAdminV1beta2IndexField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayConfig")(js.undefined)
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
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

