package typingsSlinky.markdownIt

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.libMod.MarkdownItConstructor
import typingsSlinky.markdownIt.libMod.Options
import typingsSlinky.markdownIt.libMod.PresetName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it", JSImport.Namespace)
  @js.native
  val ^ : MarkdownItConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("markdown-it", JSImport.Namespace)
  @js.native
  class Class () extends MarkdownIt {
    def this(options: Options) = this()
    def this(presetName: PresetName) = this()
    def this(presetName: PresetName, options: Options) = this()
  }
  
  type _To = MarkdownItConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MarkdownItConstructor = ^
}
