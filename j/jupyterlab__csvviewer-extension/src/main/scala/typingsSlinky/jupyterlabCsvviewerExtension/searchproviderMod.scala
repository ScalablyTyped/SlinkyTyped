package typingsSlinky.jupyterlabCsvviewerExtension

import typingsSlinky.jupyterlabCsvviewer.mod.CSVViewer
import typingsSlinky.jupyterlabDocregistry.mod.DocumentWidget
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchMatch
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchproviderMod {
  
  @JSImport("@jupyterlab/csvviewer-extension/lib/searchprovider", "CSVSearchProvider")
  @js.native
  class CSVSearchProvider () extends ISearchProvider[CSVDocumentWidget] {
    
    var _changed: js.Any = js.native
    
    var _query: js.Any = js.native
    
    var _target: js.Any = js.native
    
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    @JSName("changed")
    def changed_MCSVSearchProvider: ISignal[this.type, Unit] = js.native
    
    /**
      * Initialize the search using the provided options.  Should update the UI
      * to highlight all matches and "select" whatever the first match should be.
      *
      * @param query A RegExp to be use to perform the search
      * @param searchTarget The widget to be searched
      *
      * @returns A promise that resolves with a list of all matches
      */
    def startQuery(query: js.RegExp, searchTarget: CSVDocumentWidget): js.Promise[js.Array[ISearchMatch]] = js.native
  }
  /* static members */
  object CSVSearchProvider {
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    @JSImport("@jupyterlab/csvviewer-extension/lib/searchprovider", "CSVSearchProvider.canSearchOn")
    @js.native
    def canSearchOn(domain: Widget): /* is @jupyterlab/csvviewer-extension.@jupyterlab/csvviewer-extension/lib/searchprovider.CSVDocumentWidget */ Boolean = js.native
  }
  
  type CSVDocumentWidget = DocumentWidget[CSVViewer, IModel]
}
