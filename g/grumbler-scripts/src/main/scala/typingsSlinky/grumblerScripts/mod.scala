package typingsSlinky.grumblerScripts

import typingsSlinky.grumblerScripts.anon.Version
import typingsSlinky.grumblerScripts.declarationsMod.Values
import typingsSlinky.grumblerScripts.typesMod.WebpackConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grumbler-scripts", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val __DEBUG__ : Boolean = js.native
  
  val __ENV__ : Values[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ENV */ js.Any
  ] = js.native
  
  val __GLOBAL__ : js.Any = js.native
  
  val __LOCAL__ : Boolean = js.native
  
  val __MIN__ : Boolean = js.native
  
  val __PRODUCTION__ : Boolean = js.native
  
  val __SANDBOX__ : Boolean = js.native
  
  val __STAGE__ : Boolean = js.native
  
  val __TEST__ : Boolean = js.native
  
  val __TREE_SHAKE__ : Boolean = js.native
  
  val __UID__ : String = js.native
  
  val __WEB__ : Boolean = js.native
  
  val __WINDOW__ : js.Any = js.native
  
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
