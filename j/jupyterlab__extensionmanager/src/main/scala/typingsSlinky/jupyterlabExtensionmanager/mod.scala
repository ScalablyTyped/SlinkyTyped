package typingsSlinky.jupyterlabExtensionmanager

import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabExtensionmanager.modelMod.IEntry
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import typingsSlinky.jupyterlabServices.mod.ServiceManager
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/extensionmanager", "CollapsibleSection")
  @js.native
  class CollapsibleSection protected ()
    extends typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection {
    def this(props: IProperties) = this()
  }
  
  @JSImport("@jupyterlab/extensionmanager", "ExtensionView")
  @js.native
  class ExtensionView protected ()
    extends typingsSlinky.jupyterlabExtensionmanager.widgetMod.ExtensionView {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
  }
  
  @JSImport("@jupyterlab/extensionmanager", "ListModel")
  @js.native
  class ListModel protected ()
    extends typingsSlinky.jupyterlabExtensionmanager.modelMod.ListModel {
    def this(serviceManager: ServiceManager, settings: ISettings) = this()
  }
  object ListModel {
    
    /**
      * Utility function to check whether an entry can be updated.
      *
      * @param entry The entry to check.
      */
    @JSImport("@jupyterlab/extensionmanager", "ListModel.entryHasUpdate")
    @js.native
    def entryHasUpdate(entry: IEntry): Boolean = js.native
    
    @JSImport("@jupyterlab/extensionmanager", "ListModel.isDisclaimed")
    @js.native
    def isDisclaimed(): Boolean = js.native
    
    @JSImport("@jupyterlab/extensionmanager", "ListModel.toogleDisclaimed")
    @js.native
    def toogleDisclaimed(): Unit = js.native
  }
  
  object ListView {
    
    @JSImport("@jupyterlab/extensionmanager", "ListView")
    @js.native
    def apply(props: typingsSlinky.jupyterlabExtensionmanager.widgetMod.ListView.IProperties): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/extensionmanager", "Lister")
  @js.native
  /**
    * Create a Lister object.
    */
  class Lister ()
    extends typingsSlinky.jupyterlabExtensionmanager.listingsMod.Lister
  
  @JSImport("@jupyterlab/extensionmanager", "SearchBar")
  @js.native
  class SearchBar protected ()
    extends typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar {
    def this(props: typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties) = this()
  }
  
  @JSImport("@jupyterlab/extensionmanager", "Searcher")
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
  
  @JSImport("@jupyterlab/extensionmanager", "isJupyterOrg")
  @js.native
  def isJupyterOrg(name: String): Boolean = js.native
}
