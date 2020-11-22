package typingsSlinky.grumblerScripts

import typingsSlinky.grumblerScripts.anon.Version
import typingsSlinky.grumblerScripts.typesMod.WebpackConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grumbler-scripts/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  
  def getCurrentVersion(pkg: Version): String = js.native
  
  def getKarmaConfig(karma: js.Object): js.Object = js.native
  def getKarmaConfig(karma: js.Object, cfg: js.Object): js.Object = js.native
  
  def getNextVersion(pkg: Version): String = js.native
  def getNextVersion(pkg: Version, level: String): String = js.native
  
  def getWebpackConfig(): js.Object = js.native
  def getWebpackConfig(options: WebpackConfigOptions): js.Object = js.native
  
  @js.native
  object ENV extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.grumblerScripts.constantsMod.ENV with String] = js.native
    
    /* "demo" */ val DEMO: typingsSlinky.grumblerScripts.constantsMod.ENV.DEMO with String = js.native
    
    /* "local" */ val LOCAL: typingsSlinky.grumblerScripts.constantsMod.ENV.LOCAL with String = js.native
    
    /* "production" */ val PRODUCTION: typingsSlinky.grumblerScripts.constantsMod.ENV.PRODUCTION with String = js.native
    
    /* "sandbox" */ val SANDBOX: typingsSlinky.grumblerScripts.constantsMod.ENV.SANDBOX with String = js.native
    
    /* "stage" */ val STAGE: typingsSlinky.grumblerScripts.constantsMod.ENV.STAGE with String = js.native
    
    /* "test" */ val TEST: typingsSlinky.grumblerScripts.constantsMod.ENV.TEST with String = js.native
  }
}
