package typingsSlinky.jupyterlabLauncher.mod

import typingsSlinky.jupyterlabApputils.vdomMod.VDomModel
import typingsSlinky.jupyterlabLauncher.mod.ILauncher.IItemOptions
import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/launcher", "LauncherModel")
@js.native
class LauncherModel ()
  extends VDomModel
     with ILauncher {
  var _items: js.Any = js.native
  /**
    * Add a command item to the launcher, and trigger re-render event for parent
    * widget.
    *
    * @param options - The specification options for a launcher item.
    *
    * @returns A disposable that will remove the item from Launcher, and trigger
    * re-render event for parent widget.
    *
    */
  /* InferMemberOverrides */
  override def add(options: IItemOptions): IDisposable = js.native
  /**
    * Return an iterator of launcher items.
    */
  def items(): IIterator[IItemOptions] = js.native
}

