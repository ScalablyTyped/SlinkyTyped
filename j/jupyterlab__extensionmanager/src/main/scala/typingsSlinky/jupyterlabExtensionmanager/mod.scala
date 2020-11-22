package typingsSlinky.jupyterlabExtensionmanager

import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabExtensionmanager.modelMod.IEntry
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import typingsSlinky.jupyterlabServices.mod.ServiceManager
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/extensionmanager", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isJupyterOrg(name: String): Boolean = js.native
  
  @js.native
  class CollapsibleSection protected ()
    extends typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection {
    def this(props: IProperties) = this()
  }
  
  @js.native
  class ExtensionView protected ()
    extends typingsSlinky.jupyterlabExtensionmanager.widgetMod.ExtensionView {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
  }
  
  @js.native
  class ListModel protected ()
    extends typingsSlinky.jupyterlabExtensionmanager.modelMod.ListModel {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
  }
  @js.native
  object ListModel extends js.Object {
    
    /**
      * Utility function to check whether an entry can be updated.
      *
      * @param entry The entry to check.
      */
    def entryHasUpdate(entry: IEntry): Boolean = js.native
    
    def isDisclaimed(): Boolean = js.native
    
    def toogleDisclaimed(): Unit = js.native
  }
  
  @js.native
  object ListView extends js.Object {
    
    def apply(props: typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView.IProperties): ReactElement = js.native
  }
  
  @js.native
  /**
    * Create a Lister object.
    */
  class Lister ()
    extends typingsSlinky.jupyterlabExtensionmanager.listingsMod.Lister
  
  @js.native
  class SearchBar protected ()
    extends typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar {
    def this(props: typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties) = this()
  }
  
  @js.native
  /**
    * Create a Searcher object.
    *
    * @param repoUri The URI of the NPM registry to use.
    * @param cdnUri The URI of the CDN to use for fetching full package data.
    */
  class Searcher ()
    extends typingsSlinky.jupyterlabExtensionmanager.npmMod.Searcher {
    def this(repoUri: String) = this()
    def this(repoUri: js.UndefOr[scala.Nothing], cdnUri: String) = this()
    def this(repoUri: String, cdnUri: String) = this()
  }
}
