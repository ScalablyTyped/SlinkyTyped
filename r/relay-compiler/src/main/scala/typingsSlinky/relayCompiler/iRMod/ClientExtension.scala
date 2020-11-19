package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientExtension
  extends IR
     with Node
     with Selection
     with VisitNode {
  
  var kind: typingsSlinky.relayCompiler.relayCompilerStrings.ClientExtension = js.native
  
  var loc: Location = js.native
  
  var metadata: Metadata = js.native
  
  var selections: js.Array[Selection] = js.native
}
object ClientExtension {
  
  @scala.inline
  def apply(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.ClientExtension,
    loc: Location,
    selections: js.Array[Selection]
  ): ClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientExtension]
  }
  
  @scala.inline
  implicit class ClientExtensionOps[Self <: ClientExtension] (val x: Self) extends AnyVal {
    
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
    def setKind(value: typingsSlinky.relayCompiler.relayCompilerStrings.ClientExtension): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: Selection*): Self = this.set("selections", js.Array(value :_*))
    
    @scala.inline
    def setSelections(value: js.Array[Selection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
