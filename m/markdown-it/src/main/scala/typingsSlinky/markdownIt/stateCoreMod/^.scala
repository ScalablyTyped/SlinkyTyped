package typingsSlinky.markdownIt.stateCoreMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/rules_core/state_core", JSImport.Namespace)
@js.native
class ^ protected () extends StateCore {
  def this(src: String, md: MarkdownIt, env: js.Any) = this()
  /* CompleteClass */
  override var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typingsSlinky.markdownIt.tokenMod.^
  ] = js.native
  /* CompleteClass */
  override var env: js.Any = js.native
  /* CompleteClass */
  override var inlineMode: Boolean = js.native
  /**
    * link to parser instance
    */
  /* CompleteClass */
  override var md: MarkdownIt = js.native
  /* CompleteClass */
  override var src: String = js.native
  /* CompleteClass */
  override var tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^] = js.native
}

