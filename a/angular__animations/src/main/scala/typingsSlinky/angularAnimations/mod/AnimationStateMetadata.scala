package typingsSlinky.angularAnimations.mod

import typingsSlinky.angularAnimations.anon.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStateMetadata extends AnimationMetadata {
  /**
    * The state name, unique within the component.
    */
  var name: String = js.native
  /**
    * An options object containing
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation.
    */
  var options: js.UndefOr[Params] = js.native
  /**
    *  The CSS styles associated with this state.
    */
  var styles: AnimationStyleMetadata = js.native
}

object AnimationStateMetadata {
  @scala.inline
  def apply(name: String, styles: AnimationStyleMetadata, `type`: AnimationMetadataType): AnimationStateMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateMetadata]
  }
  @scala.inline
  implicit class AnimationStateMetadataOps[Self <: AnimationStateMetadata] (val x: Self) extends AnyVal {
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
    def withStyles(value: AnimationStyleMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

