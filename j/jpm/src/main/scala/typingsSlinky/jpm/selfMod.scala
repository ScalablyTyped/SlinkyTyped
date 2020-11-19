package typingsSlinky.jpm

import typingsSlinky.jpm.jpmStrings.downgrade
import typingsSlinky.jpm.jpmStrings.enable
import typingsSlinky.jpm.jpmStrings.install
import typingsSlinky.jpm.jpmStrings.startup
import typingsSlinky.jpm.jpmStrings.upgrade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access data that is bundled with the add-on, and add-on metadata
  */
@JSImport("sdk/self", JSImport.Namespace)
@js.native
object selfMod extends js.Object {
  
  val id: String = js.native
  
  val isPrivateBrowsingSupported: Boolean = js.native
  
  val loadReason: install | enable | startup | upgrade | downgrade = js.native
  
  val name: String = js.native
  
  val uri: String = js.native
  
  val version: String = js.native
  
  @js.native
  object data extends js.Object {
    
    def load(name: String): String = js.native
    
    def url(name: String): String = js.native
  }
}
