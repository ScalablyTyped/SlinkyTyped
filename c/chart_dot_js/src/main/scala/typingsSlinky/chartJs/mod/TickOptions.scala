package typingsSlinky.chartJs.mod

import typingsSlinky.chartJs.chartJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickOptions extends NestedTickOptions {
  
  var major: js.UndefOr[MajorTickOptions | `false`] = js.native
  
  var minor: js.UndefOr[NestedTickOptions | `false`] = js.native
}
object TickOptions {
  
  @scala.inline
  def apply(): TickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickOptions]
  }
  
  @scala.inline
  implicit class TickOptionsMutableBuilder[Self <: TickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: MajorTickOptions | `false`): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    @scala.inline
    def setMinor(value: NestedTickOptions | `false`): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
  }
}
