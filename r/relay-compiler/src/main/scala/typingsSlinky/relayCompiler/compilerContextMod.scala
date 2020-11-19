package typingsSlinky.relayCompiler

import typingsSlinky.relayCompiler.iRMod.Fragment
import typingsSlinky.relayCompiler.iRMod.Location
import typingsSlinky.relayCompiler.iRMod.Root
import typingsSlinky.relayCompiler.reporterMod.Reporter
import typingsSlinky.relayCompiler.schemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-compiler/lib/core/CompilerContext", JSImport.Namespace)
@js.native
object compilerContextMod extends js.Object {
  
  @js.native
  class CompilerContext protected () extends js.Object {
    def this(schema: Schema) = this()
    
    def add(node: CompilerContextDocument): CompilerContext = js.native
    
    def addAll(nodes: js.Array[CompilerContextDocument]): CompilerContext = js.native
    
    def applyTransform(transform: IRTransform): CompilerContext = js.native
    def applyTransform(transform: IRTransform, reporter: Reporter): CompilerContext = js.native
    
    def applyTransforms(transforms: js.Array[IRTransform]): CompilerContext = js.native
    def applyTransforms(transforms: js.Array[IRTransform], reporter: Reporter): CompilerContext = js.native
    
    def documents(): js.Array[CompilerContextDocument] = js.native
    
    def forEachDocument(fn: js.Function1[/* doc */ CompilerContextDocument, Unit]): Unit = js.native
    
    def get(name: String): js.UndefOr[CompilerContextDocument] = js.native
    
    def getFragment(name: String): Fragment = js.native
    def getFragment(name: String, referencedFrom: Location): Fragment = js.native
    
    def getRoot(name: String): Root = js.native
    
    def getSchema(): Schema = js.native
    
    def remove(name: String): CompilerContext = js.native
    
    def replace(node: CompilerContextDocument): CompilerContext = js.native
    
    def withMutations(fn: js.Function1[/* context */ this.type, this.type]): CompilerContext = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.relayCompiler.iRMod.Fragment
    - typingsSlinky.relayCompiler.iRMod.Root
    - typingsSlinky.relayCompiler.iRMod.SplitOperation
  */
  trait CompilerContextDocument extends js.Object
  
  type IRTransform = js.Function1[/* context */ CompilerContext, CompilerContext]
}
