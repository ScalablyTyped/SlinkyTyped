package typingsSlinky.acorn

import typingsSlinky.acorn.mod.Node
import typingsSlinky.acorn.mod.Options
import typingsSlinky.acorn.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(): js.Iterator[Token] = js.native
    
    def getToken(): /* import warning: importer.ImportType#apply Failed type conversion: acorn.acorn.Token[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.iterator * / any] */ js.Any = js.native
  }
  
  @js.native
  trait TypeofParser extends StObject {
    
    /* static member */
    def extend(
      plugins: (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Parser */ /* BaseParser */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Parser */ js.Any
        ])*
    ): /* import warning: importer.ImportType#apply Failed type conversion: typeof Parser */ js.Any = js.native
    
    /* static member */
    def parse(input: String): Node = js.native
    def parse(input: String, options: Options): Node = js.native
    
    /* static member */
    def parseExpressionAt(input: String, pos: Double): Node = js.native
    def parseExpressionAt(input: String, pos: Double, options: Options): Node = js.native
    
    /* static member */
    def tokenizer(input: String): Call = js.native
    def tokenizer(input: String, options: Options): Call = js.native
  }
}
