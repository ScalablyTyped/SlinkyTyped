package typingsSlinky.acorn

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.acorn.mod.Node
import typingsSlinky.acorn.mod.Options
import typingsSlinky.acorn.mod.Parser
import typingsSlinky.acorn.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    def apply(): js.Iterator[Token] = js.native
    
    def getToken(): /* import warning: importer.ImportType#apply Failed type conversion: acorn.acorn.Token[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.iterator * / any] */ js.Any = js.native
  }
  
  @js.native
  trait TypeofParser
    extends Instantiable2[/* options */ Options, /* input */ String, Parser]
       with Instantiable3[/* options */ Options, /* input */ String, /* startPos */ Double, Parser] {
    
    def extend(
      plugins: (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Parser */ /* BaseParser */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Parser */ js.Any
        ])*
    ): /* import warning: importer.ImportType#apply Failed type conversion: typeof Parser */ js.Any = js.native
    
    def parse(input: String): Node = js.native
    def parse(input: String, options: Options): Node = js.native
    
    def parseExpressionAt(input: String, pos: Double): Node = js.native
    def parseExpressionAt(input: String, pos: Double, options: Options): Node = js.native
    
    def tokenizer(input: String): Call = js.native
    def tokenizer(input: String, options: Options): Call = js.native
  }
}
