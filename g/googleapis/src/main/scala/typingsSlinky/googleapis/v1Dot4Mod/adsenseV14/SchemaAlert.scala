package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsDismissible(value: Boolean): Self = this.set("isDismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDismissible: Self = this.set("isDismissible", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
