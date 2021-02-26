package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2NodeProperty extends StObject {
  
  /** The property name. */
  var name: js.UndefOr[String] = js.native
  
  /** The property value. */
  var value: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2NodeProperty {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2NodeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2NodeProperty]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2NodePropertyMutableBuilder[Self <: BuildBazelRemoteExecutionV2NodeProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
