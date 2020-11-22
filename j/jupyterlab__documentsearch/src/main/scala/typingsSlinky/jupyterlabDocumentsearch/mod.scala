package typingsSlinky.jupyterlabDocumentsearch

import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/documentsearch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ISearchProviderRegistry: Token[typingsSlinky.jupyterlabDocumentsearch.tokensMod.ISearchProviderRegistry] = js.native
  
  @js.native
  class CodeMirrorSearchProvider ()
    extends typingsSlinky.jupyterlabDocumentsearch.codemirrorsearchproviderMod.CodeMirrorSearchProvider
  /* static members */
  @js.native
  object CodeMirrorSearchProvider extends js.Object {
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean = js.native
  }
  
  @js.native
  class NotebookSearchProvider ()
    extends typingsSlinky.jupyterlabDocumentsearch.notebooksearchproviderMod.NotebookSearchProvider
  /* static members */
  @js.native
  object NotebookSearchProvider extends js.Object {
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = js.native
  }
  
  @js.native
  class SearchInstance protected ()
    extends typingsSlinky.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance {
    def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
  }
  
  @js.native
  class SearchProviderRegistry ()
    extends typingsSlinky.jupyterlabDocumentsearch.searchproviderregistryMod.SearchProviderRegistry
  
  @js.native
  class SearchState ()
    extends typingsSlinky.jupyterlabDocumentsearch.codemirrorsearchproviderMod.SearchState
}
