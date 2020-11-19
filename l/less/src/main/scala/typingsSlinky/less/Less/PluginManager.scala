package typingsSlinky.less.Less

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginManager extends js.Object {
  
  def addPreProcessor(preProcessor: PreProcessor): Unit = js.native
  def addPreProcessor(preProcessor: PreProcessor, priority: Double): Unit = js.native
}
