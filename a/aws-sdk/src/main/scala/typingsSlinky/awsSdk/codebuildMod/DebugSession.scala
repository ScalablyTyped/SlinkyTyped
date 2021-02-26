package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSession extends StObject {
  
  /**
    * Specifies if session debugging is enabled for this build.
    */
  var sessionEnabled: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * Contains the identifier of the Session Manager session used for the build. To work with the paused build, you open this session to examine, control, and resume the build.
    */
  var sessionTarget: js.UndefOr[NonEmptyString] = js.native
}
object DebugSession {
  
  @scala.inline
  def apply(): DebugSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSession]
  }
  
  @scala.inline
  implicit class DebugSessionMutableBuilder[Self <: DebugSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionEnabled(value: WrapperBoolean): Self = StObject.set(x, "sessionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEnabledUndefined: Self = StObject.set(x, "sessionEnabled", js.undefined)
    
    @scala.inline
    def setSessionTarget(value: NonEmptyString): Self = StObject.set(x, "sessionTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTargetUndefined: Self = StObject.set(x, "sessionTarget", js.undefined)
  }
}
