package typingsSlinky.grammarkdown

import typingsSlinky.grammarkdown.distEmitterEmitterMod.Emitter
import typingsSlinky.grammarkdown.distNodesMod.LexicalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/emitter/ecmarkup", JSImport.Namespace)
@js.native
object distEmitterEcmarkupMod extends js.Object {
  @js.native
  class EcmarkupEmitter () extends Emitter {
    var emitLinkAnchor: js.Any = js.native
    var emitNodeWithLink: js.Any = js.native
    /* protected */ def emitPlaceholder(node: LexicalSymbol): Unit = js.native
  }
  
}

