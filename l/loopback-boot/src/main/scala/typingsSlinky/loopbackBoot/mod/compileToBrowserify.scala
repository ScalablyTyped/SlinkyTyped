package typingsSlinky.loopbackBoot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * compileToBrowserify
  *
  * Compile boot instructions and add them to a browserify bundler.
  * @param options as described in bootLoopBackApp above.
  * @param bundler A browserify bundler created by browserify().
  */
@JSImport("loopback-boot", "compileToBrowserify")
@js.native
class compileToBrowserify protected () extends js.Object {
  def this(options: String, bundler: js.Any) = this()
  def this(options: js.Any, bundler: js.Any) = this()
  
  /**
    * Application identifier used to load the correct boot configuration when
    * building multiple applications using browserify.
    */
  var appId: String = js.native
}
