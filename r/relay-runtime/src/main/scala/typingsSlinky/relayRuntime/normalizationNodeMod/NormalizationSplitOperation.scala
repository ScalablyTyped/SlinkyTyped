package typingsSlinky.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayConcreteNodeMod.GeneratedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizationSplitOperation
  extends GeneratedNode
     with NormalizationSelectableNode {
  
  val kind: String = js.native
  
  val metadata: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  // 'SplitOperation';
  val name: String = js.native
  
  val selections: js.Array[NormalizationSelection] = js.native
}
object NormalizationSplitOperation {
  
  @scala.inline
  def apply(kind: String, name: String, selections: js.Array[NormalizationSelection]): NormalizationSplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationSplitOperation]
  }
  
  @scala.inline
  implicit class NormalizationSplitOperationMutableBuilder[Self <: NormalizationSplitOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
