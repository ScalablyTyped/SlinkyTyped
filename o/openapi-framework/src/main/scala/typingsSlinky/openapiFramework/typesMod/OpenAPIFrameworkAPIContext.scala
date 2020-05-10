package typingsSlinky.openapiFramework.typesMod

import typingsSlinky.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFrameworkAPIContext extends js.Object {
  var basePaths: js.Array[default] = js.native
  def getApiDoc(): js.Any = js.native
}

object OpenAPIFrameworkAPIContext {
  @scala.inline
  def apply(basePaths: js.Array[default], getApiDoc: () => js.Any): OpenAPIFrameworkAPIContext = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], getApiDoc = js.Any.fromFunction0(getApiDoc))
    __obj.asInstanceOf[OpenAPIFrameworkAPIContext]
  }
  @scala.inline
  implicit class OpenAPIFrameworkAPIContextOps[Self <: OpenAPIFrameworkAPIContext] (val x: Self) extends AnyVal {
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
  }
  
}

