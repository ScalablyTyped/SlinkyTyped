package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.allow
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.default_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDownloadBehaviorRequest extends StObject {
  
  /**
    * Whether to allow all or deny all download requests, or use default Chrome behavior if
    * available (otherwise deny). (SetDownloadBehaviorRequestBehavior enum)
    */
  var behavior: deny | allow | default_ = js.native
  
  /**
    * The default path to save downloaded files to. This is requred if behavior is set to 'allow'
    */
  var downloadPath: js.UndefOr[String] = js.native
}
object SetDownloadBehaviorRequest {
  
  @scala.inline
  def apply(behavior: deny | allow | default_): SetDownloadBehaviorRequest = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDownloadBehaviorRequest]
  }
  
  @scala.inline
  implicit class SetDownloadBehaviorRequestMutableBuilder[Self <: SetDownloadBehaviorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: deny | allow | default_): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPath(value: String): Self = StObject.set(x, "downloadPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPathUndefined: Self = StObject.set(x, "downloadPath", js.undefined)
  }
}
