package typingsSlinky.jupyterlabNotebook

import typingsSlinky.jupyterlabApputils.mod.WidgetTracker
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions
import typingsSlinky.jupyterlabNotebook.panelMod.NotebookPanel
import typingsSlinky.jupyterlabNotebook.tokensMod.INotebookTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/tracker", JSImport.Namespace)
@js.native
object trackerMod extends js.Object {
  @js.native
  class NotebookTracker ()
    extends WidgetTracker[NotebookPanel]
       with INotebookTracker {
    var _activeCell: js.Any = js.native
    var _activeCellChanged: js.Any = js.native
    var _onActiveCellChanged: js.Any = js.native
    var _onSelectionChanged: js.Any = js.native
    var _selectionChanged: js.Any = js.native
    /**
      * A promise that is resolved when the widget tracker has been
      * restored from a serialized state.
      *
      * #### Notes
      * Most client code will not need to use this, since they can wait
      * for the whole application to restore. However, if an extension
      * wants to perform actions during the application restoration, but
      * after the restoration of another widget tracker, they can use
      * this promise.
      */
    /* InferMemberOverrides */
    override val restored: js.Promise[Unit] with js.Promise[js.Any] = js.native
    /**
      * Add a new widget to the tracker.
      *
      * @param widget - The widget being added.
      *
      * #### Notes
      * The widget passed into the tracker is added synchronously; its existence in
      * the tracker can be checked with the `has()` method. The promise this method
      * returns resolves after the widget has been added and saved to an underlying
      * restoration connector, if one is available.
      */
    /* InferMemberOverrides */
    override def add(widget: NotebookPanel): js.Promise[Unit] = js.native
    /* InferMemberOverrides */
    /* protected */ override def onCurrentChanged(): Unit = js.native
    /**
      * Handle the current change event.
      *
      * #### Notes
      * The default implementation is a no-op.
      */
    /* InferMemberOverrides */
    /* protected */ override def onCurrentChanged(value: NotebookPanel): Unit = js.native
    /**
      * Restore the objects in this restorable collection.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def restore(options: IOptions[NotebookPanel]): js.Promise[js.Any] = js.native
    /**
      * Save the restore data for a given widget.
      *
      * @param widget - The widget being saved.
      */
    /* InferMemberOverrides */
    override def save(widget: NotebookPanel): js.Promise[Unit] = js.native
  }
  
}

