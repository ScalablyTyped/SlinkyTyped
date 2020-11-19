package typingsSlinky.mobileDetect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobile-detect", JSImport.Namespace)
@js.native
class ^ protected () extends MobileDetect {
  def this(userAgent: String) = this()
  def this(userAgent: String, maxPhoneWidth: Double) = this()
}
@JSImport("mobile-detect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  // only used internally; if necessary, one can replace, intercept or augment particular methods or values
  var _impl: MobileDetectImpl = js.native
  
  def isPhoneSized(): Boolean = js.native
  def isPhoneSized(maxPhoneWidth: Double): Boolean = js.native
  
  var version: String = js.native
}
