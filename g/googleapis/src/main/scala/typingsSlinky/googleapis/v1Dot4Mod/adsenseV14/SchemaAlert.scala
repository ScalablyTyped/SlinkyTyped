package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAlert extends js.Object {
  /**
    * Unique identifier of this alert. This should be considered an opaque
    * identifier; it is not safe to rely on it being in any particular format.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this alert can be dismissed.
    */
  var isDismissible: js.UndefOr[Boolean] = js.native
  /**
    * Kind of resource this is, in this case adsense#alert.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The localized alert message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Severity of this alert. Possible values: INFO, WARNING, SEVERE.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * Type of this alert. Possible values: SELF_HOLD, MIGRATED_TO_BILLING3,
    * ADDRESS_PIN_VERIFICATION, PHONE_PIN_VERIFICATION, CORPORATE_ENTITY,
    * GRAYLISTED_PUBLISHER, API_HOLD.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAlert {
  @scala.inline
  def apply(): SchemaAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlert]
  }
  @scala.inline
  implicit class SchemaAlertOps[Self <: SchemaAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDismissible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDismissible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDismissible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDismissible")(js.undefined)
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
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
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

