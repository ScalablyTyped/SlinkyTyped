package typingsSlinky.grammarkdown

import typingsSlinky.grammarkdown.distOptionsMod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/emitter", JSImport.Namespace)
@js.native
object distEmitterMod extends js.Object {
  @js.native
  class EcmarkupEmitter ()
    extends typingsSlinky.grammarkdown.distEmitterEcmarkupMod.EcmarkupEmitter
  
  @js.native
  class Emitter protected ()
    extends typingsSlinky.grammarkdown.distEmitterEmitterMod.Emitter {
    def this(options: CompilerOptions) = this()
  }
  
  @js.native
  class HtmlEmitter ()
    extends typingsSlinky.grammarkdown.distEmitterHtmlMod.HtmlEmitter
  
  @js.native
  class MarkdownEmitter ()
    extends typingsSlinky.grammarkdown.distEmitterMarkdownMod.MarkdownEmitter
  
}

