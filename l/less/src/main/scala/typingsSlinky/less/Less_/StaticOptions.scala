package typingsSlinky.less.Less_

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticOptions extends js.Object {
  var async: Boolean = js.native
  var fileAsync: Boolean = js.native
  var modifyVars: StringDictionary[String] = js.native
}

object StaticOptions {
  @scala.inline
  def apply(async: Boolean, fileAsync: Boolean, modifyVars: StringDictionary[String]): StaticOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fileAsync = fileAsync.asInstanceOf[js.Any], modifyVars = modifyVars.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
  @scala.inline
  implicit class StaticOptionsOps[Self <: StaticOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyVars(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyVars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

