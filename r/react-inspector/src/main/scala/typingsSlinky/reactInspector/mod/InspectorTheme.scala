package typingsSlinky.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactInspector.reactInspectorStrings.chromeLight
  - typingsSlinky.reactInspector.reactInspectorStrings.chromeDark
  - typingsSlinky.reactInspector.mod.InspectorThemeDefinition
*/
trait InspectorTheme extends js.Object

object InspectorTheme {
  @scala.inline
  def chromeLight: typingsSlinky.reactInspector.reactInspectorStrings.chromeLight = "chromeLight".asInstanceOf[typingsSlinky.reactInspector.reactInspectorStrings.chromeLight]
  @scala.inline
  def chromeDark: typingsSlinky.reactInspector.reactInspectorStrings.chromeDark = "chromeDark".asInstanceOf[typingsSlinky.reactInspector.reactInspectorStrings.chromeDark]
  @scala.inline
  implicit def apply(value: InspectorThemeDefinition): InspectorTheme = value.asInstanceOf[InspectorTheme]
}

