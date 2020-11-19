package typingsSlinky.grammarkdown

import typingsSlinky.grammarkdown.emitterEmitterMod.Emitter
import typingsSlinky.grammarkdown.nodesMod.LexicalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/emitter/ecmarkup", JSImport.Namespace)
@js.native
object ecmarkupMod extends js.Object {
  
  @js.native
  class EcmarkupEmitter () extends Emitter {
    
    var emitLinkAnchor: js.Any = js.native
    
    var emitNodeWithLink: js.Any = js.native
    
    /* protected */ def emitPlaceholder(node: LexicalSymbol): Unit = js.native
  }
}
