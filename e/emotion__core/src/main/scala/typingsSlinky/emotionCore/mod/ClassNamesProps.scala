package typingsSlinky.emotionCore.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNamesProps[Theme] extends js.Object {
  def children(content: ClassNamesContent[Theme]): TagMod[Any] = js.native
}

object ClassNamesProps {
  @scala.inline
  def apply[Theme](children: ClassNamesContent[Theme] => TagMod[Any]): ClassNamesProps[Theme] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ClassNamesProps[Theme]]
  }
  @scala.inline
  implicit class ClassNamesPropsOps[Self[theme] <: ClassNamesProps[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withChildren(value: ClassNamesContent[Theme] => TagMod[Any]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

