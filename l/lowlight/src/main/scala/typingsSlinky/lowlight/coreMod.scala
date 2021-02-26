package typingsSlinky.lowlight

import typingsSlinky.lowlight.lowlight.HighlightAutoOptions
import typingsSlinky.lowlight.lowlight.HighlightAutoResult
import typingsSlinky.lowlight.lowlight.HighlightOptions
import typingsSlinky.lowlight.lowlight.HighlightResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("lowlight/lib/core", "highlight")
  @js.native
  def highlight(language: String, value: String): HighlightResult = js.native
  @JSImport("lowlight/lib/core", "highlight")
  @js.native
  def highlight(language: String, value: String, options: HighlightOptions): HighlightResult = js.native
  
  @JSImport("lowlight/lib/core", "highlightAuto")
  @js.native
  def highlightAuto(value: String): HighlightAutoResult = js.native
  @JSImport("lowlight/lib/core", "highlightAuto")
  @js.native
  def highlightAuto(value: String, options: HighlightAutoOptions): HighlightAutoResult = js.native
  
  @JSImport("lowlight/lib/core", "registerLanguage")
  @js.native
  def registerLanguage(name: String, syntax: js.Function): Unit = js.native
}
