package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A managed property of a managed configuration. The property must match one
  * of the properties in the app restrictions schema of the product. Exactly
  * one of the value fields must be populated, and it must match the
  * property&#39;s type in the app restrictions schema.
  */
@js.native
trait SchemaManagedProperty extends js.Object {
  /**
    * The unique key that identifies the property.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The boolean value - this will only be present if type of the property is
    * bool.
    */
  var valueBool: js.UndefOr[Boolean] = js.native
  /**
    * The bundle of managed properties - this will only be present if type of
    * the property is bundle.
    */
  var valueBundle: js.UndefOr[SchemaManagedPropertyBundle] = js.native
  /**
    * The list of bundles of properties - this will only be present if type of
    * the property is bundle_array.
    */
  var valueBundleArray: js.UndefOr[js.Array[SchemaManagedPropertyBundle]] = js.native
  /**
    * The integer value - this will only be present if type of the property is
    * integer.
    */
  var valueInteger: js.UndefOr[Double] = js.native
  /**
    * The string value - this will only be present if type of the property is
    * string, choice or hidden.
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * The list of string values - this will only be present if type of the
    * property is multiselect.
    */
  var valueStringArray: js.UndefOr[js.Array[String]] = js.native
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
    def withValueBool(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBool")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBundle(value: SchemaManagedPropertyBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBundle")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBundleArray(value: js.Array[SchemaManagedPropertyBundle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBundleArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBundleArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBundleArray")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInteger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withValueString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(js.undefined)
        ret
    }
    @scala.inline
    def withValueStringArray(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueStringArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueStringArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueStringArray")(js.undefined)
        ret
    }
  }
  
}

