package typingsSlinky.atJupyterlabOutputarea.libWidgetMod

import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.ExecutionCount
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputPrompt extends Widget {
  /**
    * The execution count for the prompt.
    */
  var executionCount: ExecutionCount = js.native
}

