package typingsSlinky.grammarkdown

import typingsSlinky.grammarkdown.optionsMod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/emitter", JSImport.Namespace)
@js.native
object emitterMod extends js.Object {
  
  @js.native
  class EcmarkupEmitter ()
    extends typingsSlinky.grammarkdown.ecmarkupMod.EcmarkupEmitter
  
  @js.native
  class Emitter protected ()
    extends typingsSlinky.grammarkdown.emitterEmitterMod.Emitter {
    def this(options: CompilerOptions) = this()
  }
  
  @js.native
  class HtmlEmitter ()
    extends typingsSlinky.grammarkdown.htmlMod.HtmlEmitter
  
  @js.native
  class MarkdownEmitter ()
    extends typingsSlinky.grammarkdown.markdownMod.MarkdownEmitter
}
