package typingsSlinky.jupyterlabDocumentsearch

import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch/lib/searchinstance", JSImport.Namespace)
@js.native
object searchinstanceMod extends js.Object {
  @js.native
  class SearchInstance protected () extends IDisposable {
    def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
    var _activeProvider: js.Any = js.native
    var _displayState: js.Any = js.native
    var _displayUpdateSignal: js.Any = js.native
    var _disposed: js.Any = js.native
    var _highlightNext: js.Any = js.native
    var _highlightPrevious: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _onCaseSensitiveToggled: js.Any = js.native
    var _onRegexToggled: js.Any = js.native
    var _replaceAll: js.Any = js.native
    var _replaceCurrent: js.Any = js.native
    var _searchWidget: js.Any = js.native
    var _startQuery: js.Any = js.native
    var _updateDisplay: js.Any = js.native
    var _widget: js.Any = js.native
    /**
      * A signal emitted when the object is disposed.
      */
    val disposed: ISignal[this.type, Unit] = js.native
    /**
      * The search provider.
      */
    val provider: ISearchProvider[Widget] = js.native
    /**
      * The search widget.
      */
    val searchWidget: Widget = js.native
    /**
      * Display search widget.
      */
    def _displaySearchWidget(): Unit = js.native
    /**
      * Focus the search widget input.
      */
    def focusInput(): Unit = js.native
    /**
      * Updates the match index and total display in the search widget.
      */
    def updateIndices(): Unit = js.native
  }
  
}

