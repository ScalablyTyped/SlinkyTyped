package typingsSlinky.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput extends js.Object {
  
  /**
    * The ARN of the destination Kinesis data stream to write to.
    */
  var resourceArn: String = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput {
  
  @scala.inline
  def apply(resourceArn: String): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput] (val x: Self) extends AnyVal {
    
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
    def setResourceArn(value: String): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
  }
}
