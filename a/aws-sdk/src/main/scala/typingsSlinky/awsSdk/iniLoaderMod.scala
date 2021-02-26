package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iniLoaderMod {
  
  @JSImport("aws-sdk/lib/shared-ini/ini-loader", "IniLoader")
  @js.native
  class IniLoader () extends StObject {
    
    /** Remove all cached files. Used after config files are updated. */
    def clearCachedFiles(): Unit = js.native
    
    /**
      * Load configurations from config/credentials files and cache them 
      * for later use. If no file is specified it will try to load default
      * files.
      * @returns {object} object of all profile information in the file
      */
    def loadFrom(options: LoadFileOptions): IniFileContent = js.native
  }
  
  @JSImport("aws-sdk/lib/shared-ini/ini-loader", "parseFile")
  @js.native
  def parseFile(filename: String, isConfig: Boolean): IniFileContent = js.native
  
  type IniFileContent = StringDictionary[StringDictionary[String]]
  
  @js.native
  trait LoadFileOptions extends StObject {
    
    var filename: js.UndefOr[String] = js.native
    
    var isConfig: js.UndefOr[Boolean] = js.native
  }
  object LoadFileOptions {
    
    @scala.inline
    def apply(): LoadFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadFileOptions]
    }
    
    @scala.inline
    implicit class LoadFileOptionsMutableBuilder[Self <: LoadFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setIsConfig(value: Boolean): Self = StObject.set(x, "isConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsConfigUndefined: Self = StObject.set(x, "isConfig", js.undefined)
    }
  }
}
