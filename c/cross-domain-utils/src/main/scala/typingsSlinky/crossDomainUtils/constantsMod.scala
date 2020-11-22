package typingsSlinky.crossDomainUtils

import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.Asterisk
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.aboutColon
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.fileColon
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.iframe
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.mockColon
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cross-domain-utils/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val WILDCARD: Asterisk = js.native
  
  @js.native
  object PROTOCOL extends js.Object {
    
    var ABOUT: aboutColon = js.native
    
    var FILE: fileColon = js.native
    
    var MOCK: mockColon = js.native
  }
  
  @js.native
  object WINDOW_TYPE extends js.Object {
    
    var IFRAME: iframe = js.native
    
    var POPUP: popup = js.native
  }
}
