package typingsSlinky.awsSdkClientGlacierNode.typesVaultNotificationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VaultNotificationConfig extends js.Object {
  
  /**
    * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
    */
  var Events: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  
  /**
    * <p>The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).</p>
    */
  var SNSTopic: js.UndefOr[String] = js.native
}
object VaultNotificationConfig {
  
  @scala.inline
  def apply(): VaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultNotificationConfig]
  }
  
  @scala.inline
  implicit class VaultNotificationConfigOps[Self <: VaultNotificationConfig] (val x: Self) extends AnyVal {
    
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
    def setEventsVarargs(value: String*): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEventsIterable(value: js.Iterable[String]): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Array[String] | js.Iterable[String]): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    
    @scala.inline
    def setSNSTopic(value: String): Self = this.set("SNSTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSNSTopic: Self = this.set("SNSTopic", js.undefined)
  }
}
