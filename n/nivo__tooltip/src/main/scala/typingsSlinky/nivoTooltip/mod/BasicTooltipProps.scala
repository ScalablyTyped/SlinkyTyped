package typingsSlinky.nivoTooltip.mod

import slinky.core.TagMod
import typingsSlinky.nivoTooltip.anon.Pickanytooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicTooltipProps extends js.Object {
  var color: String = js.native
  var enableChip: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[js.Function1[/* value */ Double | String, Double | String]] = js.native
  var id: TagMod[Any] = js.native
  var renderContent: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var theme: Pickanytooltip = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object BasicTooltipProps {
  @scala.inline
  def apply(color: String, theme: Pickanytooltip): BasicTooltipProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicTooltipProps]
  }
  @scala.inline
  implicit class BasicTooltipPropsOps[Self <: BasicTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: Pickanytooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableChip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableChip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableChip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableChip")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: /* value */ Double | String => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderContent(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderContent")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

