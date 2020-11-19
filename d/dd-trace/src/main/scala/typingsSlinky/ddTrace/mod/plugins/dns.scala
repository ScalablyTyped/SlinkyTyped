package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [dns](https://nodejs.org/api/dns.html) module.
  */
@js.native
trait dns
  extends Integration
     with Analyzable
object dns {
  
  @scala.inline
  def apply(): dns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dns]
  }
}
