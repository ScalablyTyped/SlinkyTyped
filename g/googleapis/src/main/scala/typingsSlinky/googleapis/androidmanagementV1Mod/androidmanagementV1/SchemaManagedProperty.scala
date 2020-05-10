package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Managed property.
  */
@js.native
trait SchemaManagedProperty extends js.Object {
  /**
    * The default value of the property. BUNDLE_ARRAY properties don&#39;t have
    * a default value.
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /**
    * A longer description of the property, providing more detail of what it
    * affects. Localized.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * For CHOICE or MULTISELECT properties, the list of possible entries.
    */
  var entries: js.UndefOr[js.Array[SchemaManagedPropertyEntry]] = js.native
  /**
    * The unique key that the app uses to identify the property, e.g.
    * &quot;com.google.android.gm.fieldname&quot;.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * For BUNDLE_ARRAY properties, the list of nested properties. A
    * BUNDLE_ARRAY property is at most two levels deep.
    */
  var nestedProperties: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
  /**
    * The name of the property. Localized.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of the property.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaManagedProperty {
  @scala.inline
  def apply(): SchemaManagedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedProperty]
  }
  @scala.inline
  implicit class SchemaManagedPropertyOps[Self <: SchemaManagedProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: js.Array[SchemaManagedPropertyEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedProperties(value: js.Array[SchemaManagedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

