package typingsSlinky.jupyterlabDocumentsearch

import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/documentsearch", "CodeMirrorSearchProvider")
  @js.native
  class CodeMirrorSearchProvider ()
    extends typingsSlinky.jupyterlabDocumentsearch.codemirrorsearchproviderMod.CodeMirrorSearchProvider
  /* static members */
  object CodeMirrorSearchProvider {
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    @JSImport("@jupyterlab/documentsearch", "CodeMirrorSearchProvider.canSearchOn")
    @js.native
    def canSearchOn(domain: Widget): /* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean = js.native
  }
  
  @JSImport("@jupyterlab/documentsearch", "ISearchProviderRegistry")
  @js.native
  val ISearchProviderRegistry: Token[typingsSlinky.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry] = js.native
  
  @JSImport("@jupyterlab/documentsearch", "NotebookSearchProvider")
  @js.native
  class NotebookSearchProvider ()
    extends typingsSlinky.jupyterlabDocumentsearch.notebooksearchproviderMod.NotebookSearchProvider
  /* static members */
  object NotebookSearchProvider {
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    @JSImport("@jupyterlab/documentsearch", "NotebookSearchProvider.canSearchOn")
    @js.native
    def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = js.native
  }
  
  @JSImport("@jupyterlab/documentsearch", "SearchInstance")
  @js.native
  class SearchInstance protected ()
    extends typingsSlinky.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance {
    def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
  }
  
  @JSImport("@jupyterlab/documentsearch", "SearchProviderRegistry")
  @js.native
  class SearchProviderRegistry ()
    extends typingsSlinky.jupyterlabDocumentsearch.searchproviderregistryMod.SearchProviderRegistry
  
  @JSImport("@jupyterlab/documentsearch", "SearchState")
  @js.native
  class SearchState ()
    extends typingsSlinky.jupyterlabDocumentsearch.codemirrorsearchproviderMod.SearchState
}
