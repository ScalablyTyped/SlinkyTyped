package typingsSlinky.awsSdk.iniLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/shared-ini/ini-loader", "IniLoader")
@js.native
class IniLoader () extends js.Object {
  
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
