package typingsSlinky.gulpModernizr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPrefix extends js.Object {
  var classPrefix: String = js.native
  var enableClasses: Boolean = js.native
  var enableJSClass: Boolean = js.native
}

object ClassPrefix {
  @scala.inline
  def apply(classPrefix: String, enableClasses: Boolean, enableJSClass: Boolean): ClassPrefix = {
    val __obj = js.Dynamic.literal(classPrefix = classPrefix.asInstanceOf[js.Any], enableClasses = enableClasses.asInstanceOf[js.Any], enableJSClass = enableJSClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrefix]
  }
  @scala.inline
  implicit class ClassPrefixOps[Self <: ClassPrefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableClasses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableJSClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableJSClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

