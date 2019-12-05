package typingsSlinky.atJupyterlabExtensionmanager

import slinky.core.facade.ReactElement
import typingsSlinky.atJupyterlabExtensionmanager.libModelMod.IEntry
import typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod.CollapsibleSection.IProperties
import typingsSlinky.atJupyterlabServices.atJupyterlabServicesMod.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager", JSImport.Namespace)
@js.native
object atJupyterlabExtensionmanagerMod extends js.Object {
  @js.native
  class CollapsibleSection protected ()
    extends typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod.CollapsibleSection {
    def this(props: IProperties) = this()
  }
  
  @js.native
  class ExtensionView protected ()
    extends typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod.ExtensionView {
    def this(serviceManager: ServiceManager) = this()
  }
  
  @js.native
  class ListModel protected ()
    extends typingsSlinky.atJupyterlabExtensionmanager.libModelMod.ListModel {
    def this(serviceManager: ServiceManager) = this()
  }
  
  @js.native
  class SearchBar protected ()
    extends typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod.SearchBar {
    def this(props: typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod.SearchBar.IProperties) = this()
  }
  
  @js.native
  /**
    * Create a Searcher object.
    *
    * @param repoUri The URI of the NPM registry to use.
    * @param cdnUri The URI of the CDN to use for fetching full package data.
    */
  class Searcher ()
    extends typingsSlinky.atJupyterlabExtensionmanager.libQueryMod.Searcher {
    def this(repoUri: String) = this()
    def this(repoUri: String, cdnUri: String) = this()
  }
  
  def isJupyterOrg(name: String): Boolean = js.native
  @js.native
  object ListModel extends js.Object {
    /**
      * Utility function to check whether an entry can be updated.
      *
      * @param entry The entry to check.
      */
    def entryHasUpdate(entry: IEntry): Boolean = js.native
  }
  
  @js.native
  object ListView extends js.Object {
    def apply(props: typingsSlinky.atJupyterlabExtensionmanager.libWidgetMod.ListView.IProperties): ReactElement = js.native
  }
  
}

