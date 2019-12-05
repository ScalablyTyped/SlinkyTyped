package typingsSlinky.atJupyterlabConsole.libPanelMod.ConsolePanel

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The console panel renderer.
  */
trait IContentFactory
  extends typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole.IContentFactory {
  /**
    * Create a new console panel.
    */
  def createConsole(options: typingsSlinky.atJupyterlabConsole.libWidgetMod.CodeConsole.IOptions): CodeConsole
}

/**
  * The console renderer token.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]

