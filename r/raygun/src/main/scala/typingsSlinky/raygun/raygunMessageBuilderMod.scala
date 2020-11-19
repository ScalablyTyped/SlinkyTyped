package typingsSlinky.raygun

import typingsSlinky.raygun.typesMod.CustomData
import typingsSlinky.raygun.typesMod.Message
import typingsSlinky.raygun.typesMod.MessageBuilderOptions
import typingsSlinky.raygun.typesMod.MessageBuilding
import typingsSlinky.raygun.typesMod.RawUserData
import typingsSlinky.raygun.typesMod.RequestParams
import typingsSlinky.raygun.typesMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raygun/build/raygun.messageBuilder", JSImport.Namespace)
@js.native
object raygunMessageBuilderMod extends js.Object {
  
  @js.native
  class RaygunMessageBuilder () extends js.Object {
    def this(options: MessageBuilderOptions) = this()
    
    var _filters: js.Array[String] = js.native
    
    def build(): Message = js.native
    
    var extractUserProperties: js.Any = js.native
    
    var message: MessageBuilding = js.native
    
    var options: MessageBuilderOptions = js.native
    
    def setEnvironmentDetails(): this.type = js.native
    
    def setErrorDetails(error: js.Any): this.type = js.native
    
    def setMachineName(): this.type = js.native
    def setMachineName(machineName: String): this.type = js.native
    
    def setRequestDetails(): this.type = js.native
    def setRequestDetails(request: RequestParams): this.type = js.native
    
    def setTags(tags: js.Array[Tag]): this.type = js.native
    
    def setUser(user: js.Function0[UserMessageData]): this.type = js.native
    def setUser(user: UserMessageData): this.type = js.native
    
    def setUserCustomData(): this.type = js.native
    def setUserCustomData(customData: CustomData): this.type = js.native
    
    def setVersion(version: String): this.type = js.native
  }
  
  type UserMessageData = js.UndefOr[RawUserData | String]
}
