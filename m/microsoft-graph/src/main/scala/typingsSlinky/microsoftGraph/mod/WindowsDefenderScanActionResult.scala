package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsDefenderScanActionResult extends DeviceActionResult {
  
  // Scan type either full scan or quick scan
  var scanType: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsDefenderScanActionResult {
  
  @scala.inline
  def apply(): WindowsDefenderScanActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDefenderScanActionResult]
  }
  
  @scala.inline
  implicit class WindowsDefenderScanActionResultMutableBuilder[Self <: WindowsDefenderScanActionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScanType(value: NullableOption[String]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanTypeNull: Self = StObject.set(x, "scanType", null)
    
    @scala.inline
    def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
  }
}
