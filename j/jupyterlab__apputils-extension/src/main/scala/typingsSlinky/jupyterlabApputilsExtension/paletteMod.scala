package typingsSlinky.jupyterlabApputilsExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabApputils.commandpaletteMod.ICommandPalette
import typingsSlinky.phosphorWidgets.mod.CommandPalette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils-extension/lib/palette", JSImport.Namespace)
@js.native
object paletteMod extends js.Object {
  @js.native
  class Palette protected () extends ICommandPalette {
    /**
      * Create a palette instance.
      */
    def this(palette: CommandPalette) = this()
    var _palette: js.Any = js.native
  }
  
  @js.native
  object Palette extends js.Object {
    /**
      * Activate the command palette.
      */
    def activate(app: JupyterFrontEnd[IShell]): ICommandPalette = js.native
    /**
      * Restore the command palette.
      */
    def restore(app: JupyterFrontEnd[IShell], restorer: ILayoutRestorer): Unit = js.native
  }
  
}

