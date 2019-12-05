package typingsSlinky.reactDashMce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMceMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.tinymce.tinymceMod.Editor

  type EventHandler = js.Function2[/* event */ js.Any, /* editor */ Editor, Unit]
  type TinyMCE = ReactComponentClass[ReactMCEProps]
}
