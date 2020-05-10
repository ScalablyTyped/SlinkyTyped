package typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The index configuration for this field.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2IndexConfig extends js.Object {
  /**
    * Output only. Specifies the resource name of the `Field` from which this
    * field&#39;s index configuration is set (when `uses_ancestor_config` is
    * true), or from which it *would* be set if this field had no index
    * configuration (when `uses_ancestor_config` is false).
    */
  var ancestorField: js.UndefOr[String] = js.native
  /**
    * The indexes supported for this field.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta2Index]] = js.native
  /**
    * Output only When true, the `Field`&#39;s index configuration is in the
    * process of being reverted. Once complete, the index config will
    * transition to the same state as the field specified by `ancestor_field`,
    * at which point `uses_ancestor_config` will be `true` and `reverting` will
    * be `false`.
    */
  var reverting: js.UndefOr[Boolean] = js.native
  /**
    * Output only. When true, the `Field`&#39;s index configuration is set from
    * the configuration specified by the `ancestor_field`. When false, the
    * `Field`&#39;s index configuration is defined explicitly.
    */
  var usesAncestorConfig: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleFirestoreAdminV1beta2IndexConfig {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2IndexConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexConfig]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2IndexConfigOps[Self <: SchemaGoogleFirestoreAdminV1beta2IndexConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncestorField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncestorField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorField")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexes(value: js.Array[SchemaGoogleFirestoreAdminV1beta2Index]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(js.undefined)
        ret
    }
    @scala.inline
    def withReverting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverting")(js.undefined)
        ret
    }
    @scala.inline
    def withUsesAncestorConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesAncestorConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsesAncestorConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesAncestorConfig")(js.undefined)
        ret
    }
  }
  
}

