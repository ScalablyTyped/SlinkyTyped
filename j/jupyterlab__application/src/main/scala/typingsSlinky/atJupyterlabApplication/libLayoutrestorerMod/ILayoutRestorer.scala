package typingsSlinky.atJupyterlabApplication.libLayoutrestorerMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typingsSlinky.atJupyterlabCoreutils.libInterfacesMod.IRestorable
import typingsSlinky.atJupyterlabCoreutils.libInterfacesMod.IRestorer
import typingsSlinky.atJupyterlabCoreutils.libInterfacesMod.IRestorer.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typingsSlinky.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayoutRestorer
  extends IRestorer[IRestorable[IObservableDisposable, js.Any], IObservableDisposable, js.Any] {
  /**
    * A promise resolved when the layout restorer is ready to receive signals.
    */
  @JSName("restored")
  var restored_ILayoutRestorer: js.Promise[Unit]
  /**
    * Add a widget to be tracked by the layout restorer.
    */
  def add(widget: Widget, name: String): Unit
  /**
    * Restore the widgets of a particular widget tracker.
    *
    * @param tracker - The widget tracker whose widgets will be restored.
    *
    * @param options - The restoration options.
    */
  def restore[T /* <: Widget */](tracker: WidgetTracker[T], options: IOptions[T]): js.Promise[_]
}

@JSImport("@jupyterlab/application/lib/layoutrestorer", "ILayoutRestorer")
@js.native
object ILayoutRestorer extends TopLevel[Token[ILayoutRestorer]]

