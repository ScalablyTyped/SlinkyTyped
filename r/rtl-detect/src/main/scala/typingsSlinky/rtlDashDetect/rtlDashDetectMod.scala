package typingsSlinky.rtlDashDetect

import typingsSlinky.rtlDashDetect.rtlDashDetectStrings.ltr
import typingsSlinky.rtlDashDetect.rtlDashDetectStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rtl-detect", JSImport.Namespace)
@js.native
object rtlDashDetectMod extends js.Object {
  def getLangDir(strLocale: String): ltr | rtl = js.native
  def isRtlLang(strLocale: String): js.UndefOr[Boolean] = js.native
}

