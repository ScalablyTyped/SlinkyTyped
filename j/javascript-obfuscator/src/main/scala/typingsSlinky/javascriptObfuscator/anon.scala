package typingsSlinky.javascriptObfuscator

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.acorn.anon.Call
import typingsSlinky.acorn.mod.Node
import typingsSlinky.acorn.mod.Options
import typingsSlinky.acorn.mod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait TypeofParser extends Instantiable2[/* options */ Options, /* input */ String, Parser] {
    
    def extend(
      plugins: (js.Function1[
          /* BaseParser */ typingsSlinky.acorn.anon.TypeofParser, 
          typingsSlinky.acorn.anon.TypeofParser
        ])*
    ): typingsSlinky.acorn.anon.TypeofParser = js.native
    
    def parse(input: String): Node = js.native
    def parse(input: String, options: Options): Node = js.native
    
    def parseExpressionAt(input: String, pos: Double): Node = js.native
    def parseExpressionAt(input: String, pos: Double, options: Options): Node = js.native
    
    def tokenizer(input: String): Call = js.native
    def tokenizer(input: String, options: Options): Call = js.native
  }
}
