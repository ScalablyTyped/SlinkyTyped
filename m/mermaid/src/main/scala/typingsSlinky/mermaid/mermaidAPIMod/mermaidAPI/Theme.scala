package typingsSlinky.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mermaid.mermaidStrings.default
  - typings.mermaid.mermaidStrings.forest
  - typings.mermaid.mermaidStrings.dark
  - typings.mermaid.mermaidStrings.neutral
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsSlinky.mermaid.mermaidStrings.dark = this.cast("dark")
  @scala.inline
  def default: typingsSlinky.mermaid.mermaidStrings.default = this.cast("default")
  @scala.inline
  def forest: typingsSlinky.mermaid.mermaidStrings.forest = this.cast("forest")
  @scala.inline
  def neutral: typingsSlinky.mermaid.mermaidStrings.neutral = this.cast("neutral")
}

