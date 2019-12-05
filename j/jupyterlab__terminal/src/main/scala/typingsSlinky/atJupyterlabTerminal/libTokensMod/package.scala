package typingsSlinky.atJupyterlabTerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
  import typingsSlinky.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker

  type ITerminalTracker = IWidgetTracker[
    MainAreaWidget[typingsSlinky.atJupyterlabTerminal.libTokensMod.ITerminal.ITerminal]
  ]
}
