package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortRange extends StObject {
  
  /**
    * The first port in the port range.
    */
  var Begin: js.UndefOr[Integer] = js.native
  
  /**
    * The last port in the port range.
    */
  var End: js.UndefOr[Integer] = js.native
}
object PortRange {
  
  @scala.inline
  def apply(): PortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit class PortRangeMutableBuilder[Self <: PortRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: Integer): Self = StObject.set(x, "Begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "Begin", js.undefined)
    
    @scala.inline
    def setEnd(value: Integer): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
  }
}
