package typingsSlinky.hoistNonReactStatics.mod

import typingsSlinky.hoistNonReactStatics.hoistNonReactStaticsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MEMO_STATICS extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: `true` = js.native
  var compare: `true` = js.native
  var defaultProps: `true` = js.native
  var displayName: `true` = js.native
  var propTypes: `true` = js.native
  var `type`: `true` = js.native
}

object MEMO_STATICS {
  @scala.inline
  def apply(
    DollarDollartypeof: `true`,
    compare: `true`,
    defaultProps: `true`,
    displayName: `true`,
    propTypes: `true`,
    `type`: `true`
  ): MEMO_STATICS = {
    val __obj = js.Dynamic.literal(compare = compare.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MEMO_STATICS]
  }
  @scala.inline
  implicit class MEMO_STATICSOps[Self <: MEMO_STATICS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDollarDollartypeof(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompare(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultProps(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropTypes(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

