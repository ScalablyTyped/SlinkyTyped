package typingsSlinky.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-openload", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Exports a Singleton of the Openload class by default
    * @param config The base config containing the user credentials
    * @returns An Openload singleton
    */
  def apply(config: OpenloadConfig): Openload = js.native
}
