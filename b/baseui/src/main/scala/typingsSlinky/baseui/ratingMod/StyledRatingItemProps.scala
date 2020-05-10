package typingsSlinky.baseui.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledRatingItemProps extends js.Object {
  @JSName("$index")
  var $index: Double = js.native
  @JSName("$isActive")
  var $isActive: Boolean = js.native
  @JSName("$isSelected")
  var $isSelected: Boolean = js.native
  @JSName("$theme")
  var $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
}

object StyledRatingItemProps {
  @scala.inline
  def apply(
    $index: Double,
    $isActive: Boolean,
    $isSelected: Boolean,
    $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ): StyledRatingItemProps = {
    val __obj = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledRatingItemProps]
  }
  @scala.inline
  implicit class StyledRatingItemPropsOps[Self <: StyledRatingItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$theme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

