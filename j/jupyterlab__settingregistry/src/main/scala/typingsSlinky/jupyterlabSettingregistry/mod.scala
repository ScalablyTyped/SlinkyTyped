package typingsSlinky.jupyterlabSettingregistry

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabSettingregistry.settingregistryMod.SettingRegistry.IOptions
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IShortcut
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/settingregistry", "DefaultSchemaValidator")
  @js.native
  /**
    * Instantiate a schema validator.
    */
  class DefaultSchemaValidator ()
    extends typingsSlinky.jupyterlabSettingregistry.settingregistryMod.DefaultSchemaValidator
  
  object ISettingRegistry extends Shortcut {
    
    @JSImport("@jupyterlab/settingregistry", "ISettingRegistry")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry] = js.native
    
    /**
      * A namespace for plugin functionality.
      */
    object IPlugin
    
    type _To = Token[typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry]
    
    /* This means you don't have to write `^`, but can instead just say `ISettingRegistry.foo` */
    override def _to: Token[typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry] = ^
  }
  
  @JSImport("@jupyterlab/settingregistry", "SettingRegistry")
  @js.native
  class SettingRegistry protected ()
    extends typingsSlinky.jupyterlabSettingregistry.settingregistryMod.SettingRegistry {
    /**
      * Create a new setting registry.
      */
    def this(options: IOptions) = this()
  }
  object SettingRegistry {
    
    /**
      * Reconcile default and user shortcuts and return the composite list.
      *
      * @param defaults - The list of default shortcuts.
      *
      * @param user - The list of user shortcut overrides and additions.
      *
      * @returns A loadable list of shortcuts (omitting disabled and overridden).
      */
    @JSImport("@jupyterlab/settingregistry", "SettingRegistry.reconcileShortcuts")
    @js.native
    def reconcileShortcuts(defaults: js.Array[IShortcut], user: js.Array[IShortcut]): js.Array[IShortcut] = js.native
  }
  
  @JSImport("@jupyterlab/settingregistry", "Settings")
  @js.native
  class Settings protected ()
    extends typingsSlinky.jupyterlabSettingregistry.settingregistryMod.Settings {
    /**
      * Instantiate a new plugin settings manager.
      */
    def this(options: typingsSlinky.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions) = this()
  }
}
