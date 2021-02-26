package typingsSlinky.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderClientExtension extends ReaderSelection {
  
  val kind: String = js.native
  
  // 'ClientExtension';
  val selections: js.Array[ReaderSelection] = js.native
}
object ReaderClientExtension {
  
  @scala.inline
  def apply(kind: String, selections: js.Array[ReaderSelection]): ReaderClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderClientExtension]
  }
  
  @scala.inline
  implicit class ReaderClientExtensionMutableBuilder[Self <: ReaderClientExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
