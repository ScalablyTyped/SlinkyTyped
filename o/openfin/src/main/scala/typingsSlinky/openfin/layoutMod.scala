package typingsSlinky.openfin

import typingsSlinky.openfin.GoldenLayout.Config
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.utilsMod.LayoutPresetTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  @JSImport("openfin/_v2/api/platform/layout", JSImport.Default)
  @js.native
  class default () extends LayoutModule
  
  @JSImport("openfin/_v2/api/platform/layout", "Layout")
  @js.native
  class Layout protected () extends StObject {
    def this(identity: Identity) = this()
    
    /**
      * Replaces a Platform window's layout with a preset layout arrangement using the existing Views attached to the window.
      * The preset options are `columns`, `grid`, `rows`, and `tabs`.
      * @param { PresetLayoutOptions } options Mandatory object with `presetType` property that sets which preset layout arrangement to use.
      * The preset options are `columns`, `grid`, `rows`, and `tabs`.
      * @return { Promise<void> }
      * @tutorial Layout.applyPreset
      */
    def applyPreset(options: PresetLayoutOptions): js.Promise[Unit] = js.native
    
    /**
      * Returns the configuration of the window's layout.  Returns the same information that is returned for all windows in getSnapshot.
      * @return { Promise<LayoutConfig> }
      * @tutorial Layout.getConfig
      */
    def getConfig(): js.Promise[Config] = js.native
    
    var identity: Identity = js.native
    
    def init(): js.Promise[Layout] = js.native
    def init(options: InitLayoutOptions): js.Promise[Layout] = js.native
    
    var platform: js.Any = js.native
    
    /**
      * Replaces a Platform window's layout with a new layout.  Any views that were in the old layout but not the new layout
      * will be destroyed.
      * @param { LayoutConfig } layout New layout to implement in the target window.
      * Please see explanation of a layout {@link https://developers.openfin.co/docs/platform-api#section-layout here}.
      * @return { Promise<void> }
      * @tutorial Layout.replace
      */
    def replace(layout: Config): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait InitLayoutOptions extends StObject {
    
    var containerId: js.UndefOr[String] = js.native
    
    var layout: js.UndefOr[Config] = js.native
  }
  object InitLayoutOptions {
    
    @scala.inline
    def apply(): InitLayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitLayoutOptions]
    }
    
    @scala.inline
    implicit class InitLayoutOptionsMutableBuilder[Self <: InitLayoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setLayout(value: Config): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    }
  }
  
  @js.native
  trait LayoutModule extends StObject {
    
    /**
      * Asynchronously returns a Layout object that represents a Window's layout.
      * @return {Promise.<Layout>}
      * @tutorial Layout.getCurrent
      * @static
      */
    def getCurrent(): js.Promise[Layout] = js.native
    
    /**
      * Synchronously returns a Layout object that represents a Window's layout.
      * @return {Layout}
      * @tutorial Layout.getCurrentSync
      * @static
      */
    def getCurrentSync(): Layout = js.native
    
    /**
      * Initialize the window's Layout.  Must be called from a custom window that has a 'layout' option set upon creation of that window.
      * If a containerId is not provided, this method attempts to find an element with the id `layout-container`.
      * A Layout will <a href="tutorial-Layout.DOMEvents.html">emit events locally</a> on the DOM element representing the layout-container.
      * In order to capture the relevant events during Layout initiation, set up the listeners on the DOM element prior to calling `init`.
      * @param { InitLayoutOptions } [options] - Layout init options.
      * @return { Promise<Layout> }
      * @static
      * @experimental
      * @tutorial Layout.init
      */
    def init(): js.Promise[Layout] = js.native
    def init(options: InitLayoutOptions): js.Promise[Layout] = js.native
    
    /**
      * Asynchronously returns a Layout object that represents a Window's layout.
      * @param { Identity } identity
      * @return {Promise.<Layout>}
      * @tutorial Layout.wrap
      * @static
      */
    def wrap(identity: Identity): js.Promise[Layout] = js.native
    
    /**
      * Synchronously returns a Layout object that represents a Window's layout.
      * @param { Identity } identity
      * @return {Layout}
      * @tutorial Layout.wrapSync
      * @static
      */
    def wrapSync(identity: Identity): Layout = js.native
  }
  
  @js.native
  trait PresetLayoutOptions extends StObject {
    
    var presetType: LayoutPresetTypes = js.native
  }
  object PresetLayoutOptions {
    
    @scala.inline
    def apply(presetType: LayoutPresetTypes): PresetLayoutOptions = {
      val __obj = js.Dynamic.literal(presetType = presetType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetLayoutOptions]
    }
    
    @scala.inline
    implicit class PresetLayoutOptionsMutableBuilder[Self <: PresetLayoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPresetType(value: LayoutPresetTypes): Self = StObject.set(x, "presetType", value.asInstanceOf[js.Any])
    }
  }
}
