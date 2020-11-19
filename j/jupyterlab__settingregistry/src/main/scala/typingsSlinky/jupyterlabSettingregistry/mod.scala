package typingsSlinky.jupyterlabSettingregistry

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabSettingregistry.settingregistryMod.SettingRegistry.IOptions
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IShortcut
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingregistry", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Instantiate a schema validator.
    */
  class DefaultSchemaValidator ()
    extends typingsSlinky.jupyterlabSettingregistry.settingregistryMod.DefaultSchemaValidator
  
  @js.native
  object ISettingRegistry
    extends TopLevel[Token[typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry]] {
    
    /**
      * A namespace for plugin functionality.
      */
    @js.native
    object IPlugin extends js.Object
  }
  
  @js.native
  class SettingRegistry protected ()
    extends typingsSlinky.jupyterlabSettingregistry.settingregistryMod.SettingRegistry {
    /**
      * Create a new setting registry.
      */
    def this(options: IOptions) = this()
  }
  @js.native
  object SettingRegistry extends js.Object {
    
    /**
      * Reconcile default and user shortcuts and return the composite list.
      *
      * @param defaults - The list of default shortcuts.
      *
      * @param user - The list of user shortcut overrides and additions.
      *
      * @returns A loadable list of shortcuts (omitting disabled and overridden).
      */
    def reconcileShortcuts(defaults: js.Array[IShortcut], user: js.Array[IShortcut]): js.Array[IShortcut] = js.native
  }
  
  @js.native
  class Settings protected ()
    extends typingsSlinky.jupyterlabSettingregistry.settingregistryMod.Settings {
    /**
      * Instantiate a new plugin settings manager.
      */
    def this(options: typingsSlinky.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions) = this()
  }
}
