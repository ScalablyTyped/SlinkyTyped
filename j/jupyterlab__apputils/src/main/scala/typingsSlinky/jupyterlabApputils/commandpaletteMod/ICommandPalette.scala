package typingsSlinky.jupyterlabApputils.commandpaletteMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.phosphorCoreutils.mod.Token
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandPalette extends js.Object {
  /**
    * The placeholder text of the command palette's search input.
    */
  var placeholder: String = js.native
  /**
    * Activate the command palette for user input.
    */
  def activate(): Unit = js.native
  /**
    * Add a command item to the command palette.
    *
    * @param options - The options for creating the command item.
    *
    * @returns A disposable that will remove the item from the palette.
    */
  def addItem(options: IPaletteItem): IDisposable = js.native
}

@JSImport("@jupyterlab/apputils/lib/commandpalette", "ICommandPalette")
@js.native
object ICommandPalette extends TopLevel[Token[ICommandPalette]]

