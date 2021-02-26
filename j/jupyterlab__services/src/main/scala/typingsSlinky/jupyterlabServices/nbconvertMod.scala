package typingsSlinky.jupyterlabServices

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabServices.anon.Outputmimetype
import typingsSlinky.jupyterlabServices.nbconvertMod.NbConvertManager.IExportFormats
import typingsSlinky.jupyterlabServices.nbconvertMod.NbConvertManager.IOptions
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nbconvertMod {
  
  @JSImport("@jupyterlab/services/lib/nbconvert", "NbConvertManager")
  @js.native
  /**
    * Create a new nbconvert manager.
    */
  class NbConvertManager () extends StObject {
    def this(options: IOptions) = this()
    
    /**
      * Get whether the application should be built.
      */
    def getExportFormats(): js.Promise[IExportFormats] = js.native
    
    /**
      * The server settings used to make API requests.
      */
    val serverSettings: ISettings = js.native
  }
  object NbConvertManager {
    
    /**
      * A namespace for nbconvert API interfaces.
      */
    type IExportFormats = /**
      * The list of supported export formats.
      */
    StringDictionary[Outputmimetype]
    
    /**
      * The instantiation options for a setting manager.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The server settings used to make API requests.
        */
      var serverSettings: js.UndefOr[ISettings] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  object NbConvert {
    
    /**
      * The interface for the build manager.
      */
    type IManager = NbConvertManager
  }
}
