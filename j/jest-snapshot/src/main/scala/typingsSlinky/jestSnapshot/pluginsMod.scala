package typingsSlinky.jestSnapshot

import typingsSlinky.prettyFormat.typesMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot/build/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  
  def addSerializer(plugin: Plugin): Unit = js.native
  
  def getSerializers(): js.Array[Plugin] = js.native
}
