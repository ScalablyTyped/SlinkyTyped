package typingsSlinky.cathoQuantum.badgeMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.anon.Components
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeProps extends js.Object {
  var children: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.native
  var inverted: js.UndefOr[Boolean] = js.native
  var number: js.UndefOr[Double] = js.native
  var skin: js.UndefOr[primary | secondary | success | error | neutral] = js.native
  var theme: js.UndefOr[Components] = js.native
}

object BadgeProps {
  @scala.inline
  def apply(): BadgeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeProps]
  }
  @scala.inline
  implicit class BadgePropsOps[Self <: BadgeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[TagMod[Any]] | TagMod[Any]): Self = {
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
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: primary | secondary | success | error | neutral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Components): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

