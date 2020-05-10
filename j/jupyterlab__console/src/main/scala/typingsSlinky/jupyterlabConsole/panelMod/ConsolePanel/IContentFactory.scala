package typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The console panel renderer.
  */
@js.native
trait IContentFactory
  extends typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory {
  /**
    * Create a new console panel.
    */
  def createConsole(options: typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IOptions): CodeConsole = js.native
}

/**
  * The console renderer token.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]

