package typingsSlinky.egg.mod

import typingsSlinky.egg.anon.PartialEggLoggerOptions
import typingsSlinky.egg.eggStrings.duplicate
import typingsSlinky.egg.eggStrings.ignore
import typingsSlinky.egg.eggStrings.redirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent egg.egg.RemoveSpecProp<egg-logger.egg-logger.EggLoggersOptions, 'type'> */
@js.native
trait EggLoggerConfig extends StObject {
  
  var agentLogName: String = js.native
  
  /** allow debug log at prod, defaults to true */
  var allowDebugAtProd: js.UndefOr[Boolean] = js.native
  
  var appLogName: String = js.native
  
  var buffer: js.UndefOr[Boolean] = js.native
  
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
  
  var consoleLevel: js.UndefOr[typingsSlinky.eggLogger.mod.LoggerLevel] = js.native
  
  var coreLogName: String = js.native
  
  /** custom config of coreLogger */
  var coreLogger: js.UndefOr[PartialEggLoggerOptions] = js.native
  
  var dir: String = js.native
  
  /** disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`. */
  var disableConsoleAfterReady: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var eol: js.UndefOr[String] = js.native
  
  var errorLogName: String = js.native
  
  var level: js.UndefOr[typingsSlinky.eggLogger.mod.LoggerLevel] = js.native
  
  var outputJSON: js.UndefOr[Boolean] = js.native
}
object EggLoggerConfig {
  
  @scala.inline
  def apply(agentLogName: String, appLogName: String, coreLogName: String, dir: String, errorLogName: String): EggLoggerConfig = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggerConfig]
  }
  
  @scala.inline
  implicit class EggLoggerConfigMutableBuilder[Self <: EggLoggerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentLogName(value: String): Self = StObject.set(x, "agentLogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDebugAtProd(value: Boolean): Self = StObject.set(x, "allowDebugAtProd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDebugAtProdUndefined: Self = StObject.set(x, "allowDebugAtProd", js.undefined)
    
    @scala.inline
    def setAppLogName(value: String): Self = StObject.set(x, "appLogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
    
    @scala.inline
    def setConsoleLevel(value: typingsSlinky.eggLogger.mod.LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
    
    @scala.inline
    def setCoreLogName(value: String): Self = StObject.set(x, "coreLogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreLogger(value: PartialEggLoggerOptions): Self = StObject.set(x, "coreLogger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreLoggerUndefined: Self = StObject.set(x, "coreLogger", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableConsoleAfterReady(value: Boolean): Self = StObject.set(x, "disableConsoleAfterReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableConsoleAfterReadyUndefined: Self = StObject.set(x, "disableConsoleAfterReady", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    @scala.inline
    def setErrorLogName(value: String): Self = StObject.set(x, "errorLogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typingsSlinky.eggLogger.mod.LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
  }
}
