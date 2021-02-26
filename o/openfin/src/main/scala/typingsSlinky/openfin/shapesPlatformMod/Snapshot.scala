package typingsSlinky.openfin.shapesPlatformMod

import typingsSlinky.openfin.anon.MonitorInfo
import typingsSlinky.openfin.windowOptionsMod.WindowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends StObject {
  
  var snapshotDetails: js.UndefOr[MonitorInfo] = js.native
  
  var windows: js.Array[WindowOptions] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(windows: js.Array[WindowOptions]): Snapshot = {
    val __obj = js.Dynamic.literal(windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotMutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotDetails(value: MonitorInfo): Self = StObject.set(x, "snapshotDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotDetailsUndefined: Self = StObject.set(x, "snapshotDetails", js.undefined)
    
    @scala.inline
    def setWindows(value: js.Array[WindowOptions]): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsVarargs(value: WindowOptions*): Self = StObject.set(x, "windows", js.Array(value :_*))
  }
}
