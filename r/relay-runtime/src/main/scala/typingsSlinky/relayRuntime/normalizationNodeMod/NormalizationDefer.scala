package typingsSlinky.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayRuntimeStrings.Defer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizationDefer
  extends NormalizationSelectableNode
     with NormalizationSelection {
  
  val `if`: String | Null = js.native
  
  val kind: Defer = js.native
  
  val label: String = js.native
  
  val metadata: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  val selections: js.Array[NormalizationSelection] = js.native
}
object NormalizationDefer {
  
  @scala.inline
  def apply(kind: Defer, label: String, selections: js.Array[NormalizationSelection]): NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationDefer]
  }
  
  @scala.inline
  implicit class NormalizationDeferOps[Self <: NormalizationDefer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: Defer): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: NormalizationSelection*): Self = this.set("selections", js.Array(value :_*))
    
    @scala.inline
    def setSelections(value: js.Array[NormalizationSelection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf(value: String): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfNull: Self = this.set("if", null)
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMetadataNull: Self = this.set("metadata", null)
  }
}
