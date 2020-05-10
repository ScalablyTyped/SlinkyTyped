package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A flag resource.
  */
@js.native
trait SchemaFlag extends js.Object {
  /**
    * For STRING flags, a list of strings that the value can be set to.
    */
  var allowedStringValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * The database version this flag applies to. Can be MYSQL_5_5, MYSQL_5_6,
    * or MYSQL_5_7. MYSQL_5_7 is applicable only to Second Generation
    * instances.
    */
  var appliesTo: js.UndefOr[js.Array[String]] = js.native
  /**
    * True if the flag is only released in Beta.
    */
  var inBeta: js.UndefOr[Boolean] = js.native
  /**
    * This is always sql#flag.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * For INTEGER flags, the maximum allowed value.
    */
  var maxValue: js.UndefOr[String] = js.native
  /**
    * For INTEGER flags, the minimum allowed value.
    */
  var minValue: js.UndefOr[String] = js.native
  /**
    * This is the name of the flag. Flag names always use underscores, not
    * hyphens, e.g. max_allowed_packet
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether changing this flag will trigger a database restart.
    * Only applicable to Second Generation instances.
    */
  var requiresRestart: js.UndefOr[Boolean] = js.native
  /**
    * The type of the flag. Flags are typed to being BOOLEAN, STRING, INTEGER
    * or NONE. NONE is used for flags which do not take a value, such as
    * skip_grant_tables.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaFlag {
  @scala.inline
  def apply(): SchemaFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlag]
  }
  @scala.inline
  implicit class SchemaFlagOps[Self <: SchemaFlag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedStringValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedStringValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedStringValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedStringValues")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliesTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliesTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliesTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliesTo")(js.undefined)
        ret
    }
    @scala.inline
    def withInBeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInBeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBeta")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresRestart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresRestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresRestart")(js.undefined)
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

