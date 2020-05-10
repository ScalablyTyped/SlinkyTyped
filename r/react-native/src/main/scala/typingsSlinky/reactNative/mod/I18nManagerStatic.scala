package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nManagerStatic extends js.Object {
  var isRTL: Boolean = js.native
  def allowRTL(allowRTL: Boolean): js.Object = js.native
  def forceRTL(forceRTL: Boolean): js.Object = js.native
}

object I18nManagerStatic {
  @scala.inline
  def apply(allowRTL: Boolean => js.Object, forceRTL: Boolean => js.Object, isRTL: Boolean): I18nManagerStatic = {
    val __obj = js.Dynamic.literal(allowRTL = js.Any.fromFunction1(allowRTL), forceRTL = js.Any.fromFunction1(forceRTL), isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nManagerStatic]
  }
  @scala.inline
  implicit class I18nManagerStaticOps[Self <: I18nManagerStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowRTL(value: Boolean => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRTL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForceRTL(value: Boolean => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRTL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

