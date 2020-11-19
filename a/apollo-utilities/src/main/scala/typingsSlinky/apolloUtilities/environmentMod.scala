package typingsSlinky.apolloUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-utilities/lib/util/environment", JSImport.Namespace)
@js.native
object environmentMod extends js.Object {
  
  def getEnv(): js.UndefOr[String] = js.native
  
  def isDevelopment(): Boolean = js.native
  
  def isEnv(env: String): Boolean = js.native
  
  def isProduction(): Boolean = js.native
  
  def isTest(): Boolean = js.native
}
