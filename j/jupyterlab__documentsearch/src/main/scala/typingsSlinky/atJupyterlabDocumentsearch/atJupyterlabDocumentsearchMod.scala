package typingsSlinky.atJupyterlabDocumentsearch

import typingsSlinky.atJupyterlabDocumentsearch.libInterfacesMod.ISearchProvider
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch", JSImport.Namespace)
@js.native
object atJupyterlabDocumentsearchMod extends js.Object {
  @js.native
  class CodeMirrorSearchProvider ()
    extends typingsSlinky.atJupyterlabDocumentsearch.libProvidersCodemirrorsearchproviderMod.CodeMirrorSearchProvider
  
  @js.native
  class NotebookSearchProvider ()
    extends typingsSlinky.atJupyterlabDocumentsearch.libProvidersNotebooksearchproviderMod.NotebookSearchProvider
  
  @js.native
  class SearchInstance protected ()
    extends typingsSlinky.atJupyterlabDocumentsearch.libSearchinstanceMod.SearchInstance {
    def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
  }
  
  @js.native
  class SearchProviderRegistry ()
    extends typingsSlinky.atJupyterlabDocumentsearch.libSearchproviderregistryMod.SearchProviderRegistry
  
  @js.native
  class SearchState ()
    extends typingsSlinky.atJupyterlabDocumentsearch.libProvidersCodemirrorsearchproviderMod.SearchState
  
  val ISearchProviderRegistry: Token[typingsSlinky.atJupyterlabDocumentsearch.libTokensMod.ISearchProviderRegistry] = js.native
  /* static members */
  @js.native
  object CodeMirrorSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NotebookSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = js.native
  }
  
}

