package typingsSlinky.ionic

import typingsSlinky.ionic.anon.PartialConfigFile
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.ConfigFile
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionicCliFramework.configMod.BaseConfigOptions
import typingsSlinky.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/config", JSImport.Namespace)
@js.native
object libConfigMod extends js.Object {
  
  val CONFIG_FILE: /* "config.json" */ String = js.native
  
  val DEFAULT_CONFIG_DIRECTORY: String = js.native
  
  val GLOBAL_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  def parseGlobalOptions(pargv: js.Array[String]): ParsedArgs = js.native
  
  @js.native
  class Config protected () extends IConfig {
    def this(p: String) = this()
    def this(p: String, options: BaseConfigOptions) = this()
    
    def provideDefaults(config: PartialConfigFile): ConfigFile = js.native
  }
}
