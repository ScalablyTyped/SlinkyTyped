package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleNewProps extends ContainerNewProps {
  @JSName("raws")
  var raws_RuleNewProps: js.UndefOr[RuleRaws] = js.native
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * An array containing the rule's individual selectors. Groups of selectors
    * are split at commas.
    */
  var selectors: js.UndefOr[js.Array[String]] = js.native
}

object RuleNewProps {
  @scala.inline
  def apply(): RuleNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleNewProps]
  }
  @scala.inline
  implicit class RuleNewPropsOps[Self <: RuleNewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaws(value: RuleRaws): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaws: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raws")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
  }
  
}

