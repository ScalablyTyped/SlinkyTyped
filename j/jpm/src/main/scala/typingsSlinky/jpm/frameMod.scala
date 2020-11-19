package typingsSlinky.jpm

import typingsSlinky.jpm.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create HTML iframes, using bundled HTML, CSS and JavaScript,
  * that can be added to a designated area of the Firefox user interface. At the moment you can only add frames to a toolbar
  */
@JSImport("sdk/ui/frame", JSImport.Namespace)
@js.native
object frameMod extends js.Object {
  
  def Frame(options: Name): typingsSlinky.jpm.FFAddonSDK.Frame = js.native
}
