package typingsSlinky.reactFlex.mod

import typingsSlinky.react.mod.Props
import typingsSlinky.reactFlex.reactFlexStrings.`fit-content`
import typingsSlinky.reactFlex.reactFlexStrings.`max-content`
import typingsSlinky.reactFlex.reactFlexStrings.`min-content`
import typingsSlinky.reactFlex.reactFlexStrings.auto
import typingsSlinky.reactFlex.reactFlexStrings.content
import typingsSlinky.reactFlex.reactFlexStrings.fit
import typingsSlinky.reactFlex.reactFlexStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemProps
  extends Props[Flex]
     with CommonFlexProps {
  /**
    * A value for the flex-basis css property. Valid values are: `0` (and `'none'`, which is the same),
    * `'auto'`, `'content'`, `'fit-content'`, `'min-content'`, `'max-content'`, `'fit'`.
    */
  var flexBasis: js.UndefOr[
    Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit
  ] = js.native
  /**
    * A number/string from 0 to 24 for `flex-grow`. Most of the times, using `flex` is just enough.
    */
  var flexGrow: js.UndefOr[Double | String | Boolean] = js.native
  /**
    * A value for the `flex-shrink` css property. From `0` to `24`.
    */
  var flexShrink: js.UndefOr[Double | String] = js.native
}

object ItemProps {
  @scala.inline
  def apply(): ItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemProps]
  }
  @scala.inline
  implicit class ItemPropsOps[Self <: ItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexBasis(value: Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexBasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexGrow(value: Double | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexShrink(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(js.undefined)
        ret
    }
  }
  
}

