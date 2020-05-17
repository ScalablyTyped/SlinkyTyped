package typingsSlinky.reactElemental.mod

import slinky.core.TagMod
import typingsSlinky.reactElemental.anon.Primary
import typingsSlinky.reactElemental.anon.PrimaryDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementalProps extends js.Object {
  val children: TagMod[Any] = js.native
  val colorOpts: js.UndefOr[PrimaryDark] = js.native
  val fontOpts: js.UndefOr[Primary] = js.native
}

object ElementalProps {
  @scala.inline
  def apply(): ElementalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementalProps]
  }
  @scala.inline
  implicit class ElementalPropsOps[Self <: ElementalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withColorOpts(value: PrimaryDark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withFontOpts(value: Primary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontOpts")(js.undefined)
        ret
    }
  }
  
}

