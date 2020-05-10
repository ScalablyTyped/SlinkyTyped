package typingsSlinky.jupyterlabCsvviewerExtension

import typingsSlinky.jupyterlabCsvviewer.mod.CSVViewer
import typingsSlinky.jupyterlabDocregistry.mod.DocumentWidget
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.phosphorSignaling.mod.ISignal
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer-extension/lib/searchprovider", JSImport.Namespace)
@js.native
object searchproviderMod extends js.Object {
  @js.native
  class CSVSearchProvider () extends ISearchProvider[CSVDocumentWidget] {
    var _changed: js.Any = js.native
    var _query: js.Any = js.native
    var _target: js.Any = js.native
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    @JSName("changed")
    val changed_CSVSearchProvider: ISignal[this.type, Unit] = js.native
  }
  
  /* static members */
  @js.native
  object CSVSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/csvviewer-extension.@jupyterlab/csvviewer-extension/lib/searchprovider.CSVDocumentWidget */ Boolean = js.native
  }
  
  type CSVDocumentWidget = DocumentWidget[CSVViewer, IModel]
}

