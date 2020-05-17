package typingsSlinky.openapiFramework.basePathMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openapiFramework.anon.Enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePath extends js.Object {
  val path: String = js.native
  val variables: StringDictionary[Enum] = js.native
  def hasVariables(): Boolean = js.native
}

object BasePath {
  @scala.inline
  def apply(hasVariables: () => Boolean, path: String, variables: StringDictionary[Enum]): BasePath = {
    val __obj = js.Dynamic.literal(hasVariables = js.Any.fromFunction0(hasVariables), path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePath]
  }
  @scala.inline
  implicit class BasePathOps[Self <: BasePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasVariables(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVariables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[Enum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

