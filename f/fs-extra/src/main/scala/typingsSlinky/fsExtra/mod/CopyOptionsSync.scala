package typingsSlinky.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOptionsSync extends CopyOptions {
  
  @JSName("filter")
  var filter_CopyOptionsSync: js.UndefOr[CopyFilterSync] = js.native
}
object CopyOptionsSync {
  
  @scala.inline
  def apply(): CopyOptionsSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptionsSync]
  }
  
  @scala.inline
  implicit class CopyOptionsSyncMutableBuilder[Self <: CopyOptionsSync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: (/* src */ String, /* dest */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
