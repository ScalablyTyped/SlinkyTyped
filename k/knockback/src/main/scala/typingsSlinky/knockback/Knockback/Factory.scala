package typingsSlinky.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factory extends js.Object {
  def addPathMapping(path: String, create_info: js.Any): js.Any = js.native
  def addPathMappings(factories: js.Any, owner_path: String): js.Any = js.native
  def creatorForPath(obj: js.Any, path: String): js.Any = js.native
  def hasPath(path: String): Boolean = js.native
  def hasPathMappings(factories: js.Any, owner_path: String): Boolean = js.native
}

object Factory {
  @scala.inline
  def apply(
    addPathMapping: (String, js.Any) => js.Any,
    addPathMappings: (js.Any, String) => js.Any,
    creatorForPath: (js.Any, String) => js.Any,
    hasPath: String => Boolean,
    hasPathMappings: (js.Any, String) => Boolean
  ): Factory = {
    val __obj = js.Dynamic.literal(addPathMapping = js.Any.fromFunction2(addPathMapping), addPathMappings = js.Any.fromFunction2(addPathMappings), creatorForPath = js.Any.fromFunction2(creatorForPath), hasPath = js.Any.fromFunction1(hasPath), hasPathMappings = js.Any.fromFunction2(hasPathMappings))
    __obj.asInstanceOf[Factory]
  }
  @scala.inline
  implicit class FactoryOps[Self <: Factory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPathMapping(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPathMapping")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddPathMappings(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPathMappings")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreatorForPath(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorForPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasPath(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasPathMappings(value: (js.Any, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPathMappings")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

