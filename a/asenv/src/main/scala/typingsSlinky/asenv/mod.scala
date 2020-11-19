package typingsSlinky.asenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asenv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getEnv(): String = js.native
  
  def isDevelopment(): Boolean = js.native
  
  def isProduction(): Boolean = js.native
  
  def isTest(): Boolean = js.native
  
  def setEnv(env: String): Unit = js.native
  
  def unlessProduction(handle: js.Function0[_]): js.Any = js.native
}
