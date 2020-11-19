package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.compilerContextMod.CompilerContextDocument
import typingsSlinky.relayCompiler.irvisitorMod.VisitNode
import typingsSlinky.relayCompiler.schemaMod.CompositeTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fragment
  extends CompilerContextDocument
     with Definition
     with GeneratedDefinition
     with IR
     with Node
     with VisitNode {
  
  var argumentDefinitions: js.Array[ArgumentDefinition] = js.native
  
  var directives: js.Array[Directive] = js.native
  
  var kind: typingsSlinky.relayCompiler.relayCompilerStrings.Fragment = js.native
  
  var loc: Location = js.native
  
  var metadata: Metadata = js.native
  
  var name: String = js.native
  
  var selections: js.Array[Selection] = js.native
  
  var `type`: CompositeTypeID = js.native
}
object Fragment {
  
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: CompositeTypeID
  ): Fragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
    
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
    def setArgumentDefinitionsVarargs(value: ArgumentDefinition*): Self = this.set("argumentDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setArgumentDefinitions(value: js.Array[ArgumentDefinition]): Self = this.set("argumentDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.relayCompiler.relayCompilerStrings.Fragment): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: Selection*): Self = this.set("selections", js.Array(value :_*))
    
    @scala.inline
    def setSelections(value: js.Array[Selection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CompositeTypeID): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
