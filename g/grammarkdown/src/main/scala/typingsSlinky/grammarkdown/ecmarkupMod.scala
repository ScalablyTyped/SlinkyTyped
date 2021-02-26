package typingsSlinky.grammarkdown

import typingsSlinky.grammarkdown.emitterEmitterMod.Emitter
import typingsSlinky.grammarkdown.nodesMod.LexicalSymbol
import typingsSlinky.grammarkdown.optionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecmarkupMod {
  
  @JSImport("grammarkdown/dist/emitter/ecmarkup", "EcmarkupEmitter")
  @js.native
  class EcmarkupEmitter protected () extends Emitter {
    def this(options: CompilerOptions) = this()
    
    var emitLinkAnchor: js.Any = js.native
    
    var emitNodeWithLink: js.Any = js.native
    
    /* protected */ def emitPlaceholder(node: LexicalSymbol): Unit = js.native
  }
}
