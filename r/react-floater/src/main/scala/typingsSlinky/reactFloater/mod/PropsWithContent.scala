package typingsSlinky.reactFloater.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsWithContent extends Props {
  /**
    * The Floater content. It can be anything that can be rendered.
    * This is the only required props, unless you pass a component.
    */
  var content: TagMod[Any] = js.native
}

object PropsWithContent {
  @scala.inline
  def apply(): PropsWithContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsWithContent]
  }
  @scala.inline
  implicit class PropsWithContentOps[Self <: PropsWithContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
  }
  
}

