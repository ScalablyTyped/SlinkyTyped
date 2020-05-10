package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtRuleNewProps extends ContainerNewProps {
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[String | Double] = js.native
  @JSName("raws")
  var raws_AtRuleNewProps: js.UndefOr[AtRuleRaws] = js.native
}

object AtRuleNewProps {
  @scala.inline
  def apply(): AtRuleNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtRuleNewProps]
  }
  @scala.inline
  implicit class AtRuleNewPropsOps[Self <: AtRuleNewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withRaws(value: AtRuleRaws): Self = {
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
  }
  
}

