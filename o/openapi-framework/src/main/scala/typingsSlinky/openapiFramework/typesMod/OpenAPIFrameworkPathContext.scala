package typingsSlinky.openapiFramework.typesMod

import typingsSlinky.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFrameworkPathContext extends js.Object {
  var basePaths: js.Array[default] = js.native
  def getApiDoc(): js.Any = js.native
  def getPathDoc(): js.Any = js.native
}

object OpenAPIFrameworkPathContext {
  @scala.inline
  def apply(basePaths: js.Array[default], getApiDoc: () => js.Any, getPathDoc: () => js.Any): OpenAPIFrameworkPathContext = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc), getPathDoc = js.Any.fromFunction0(getPathDoc))
    __obj.asInstanceOf[OpenAPIFrameworkPathContext]
  }
  @scala.inline
  implicit class OpenAPIFrameworkPathContextOps[Self <: OpenAPIFrameworkPathContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePaths(value: js.Array[default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetApiDoc(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApiDoc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPathDoc(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPathDoc")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

