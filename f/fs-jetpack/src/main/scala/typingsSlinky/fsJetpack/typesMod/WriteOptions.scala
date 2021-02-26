package typingsSlinky.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteOptions extends StObject {
  
  var atomic: js.UndefOr[Boolean] = js.native
  
  var jsonIndent: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String | Double] = js.native
}
object WriteOptions {
  
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit class WriteOptionsMutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtomic(value: Boolean): Self = StObject.set(x, "atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtomicUndefined: Self = StObject.set(x, "atomic", js.undefined)
    
    @scala.inline
    def setJsonIndent(value: Double): Self = StObject.set(x, "jsonIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonIndentUndefined: Self = StObject.set(x, "jsonIndent", js.undefined)
    
    @scala.inline
    def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
