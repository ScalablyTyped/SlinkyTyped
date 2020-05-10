package typingsSlinky.hoistNonReactStatics.mod

import typingsSlinky.hoistNonReactStatics.hoistNonReactStaticsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait REACT_STATICS extends js.Object {
  var childContextTypes: `true` = js.native
  var contextType: `true` = js.native
  var contextTypes: `true` = js.native
  var defaultProps: `true` = js.native
  var displayName: `true` = js.native
  var getDefaultProps: `true` = js.native
  var getDerivedStateFromError: `true` = js.native
  var getDerivedStateFromProps: `true` = js.native
  var mixins: `true` = js.native
  var propTypes: `true` = js.native
  var `type`: `true` = js.native
}

object REACT_STATICS {
  @scala.inline
  def apply(
    childContextTypes: `true`,
    contextType: `true`,
    contextTypes: `true`,
    defaultProps: `true`,
    displayName: `true`,
    getDefaultProps: `true`,
    getDerivedStateFromError: `true`,
    getDerivedStateFromProps: `true`,
    mixins: `true`,
    propTypes: `true`,
    `type`: `true`
  ): REACT_STATICS = {
    val __obj = js.Dynamic.literal(childContextTypes = childContextTypes.asInstanceOf[js.Any], contextType = contextType.asInstanceOf[js.Any], contextTypes = contextTypes.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getDefaultProps = getDefaultProps.asInstanceOf[js.Any], getDerivedStateFromError = getDerivedStateFromError.asInstanceOf[js.Any], getDerivedStateFromProps = getDerivedStateFromProps.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[REACT_STATICS]
  }
  @scala.inline
  implicit class REACT_STATICSOps[Self <: REACT_STATICS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildContextTypes(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextType(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextTypes(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(value.asInstanceOf[js.Any])
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
    def withGetDefaultProps(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDerivedStateFromError(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDerivedStateFromProps(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixins(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
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

