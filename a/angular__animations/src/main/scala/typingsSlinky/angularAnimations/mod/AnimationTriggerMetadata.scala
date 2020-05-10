package typingsSlinky.angularAnimations.mod

import typingsSlinky.angularAnimations.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationTriggerMetadata extends AnimationMetadata {
  /**
    * An animation definition object, containing an array of state and transition declarations.
    */
  var definitions: js.Array[AnimationMetadata] = js.native
  /**
    * The trigger name, used to associate it with an element. Unique within the component.
    */
  var name: String = js.native
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: Anon0 | Null = js.native
}

object AnimationTriggerMetadata {
  @scala.inline
  def apply(definitions: js.Array[AnimationMetadata], name: String, `type`: AnimationMetadataType): AnimationTriggerMetadata = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTriggerMetadata]
  }
  @scala.inline
  implicit class AnimationTriggerMetadataOps[Self <: AnimationTriggerMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitions(value: js.Array[AnimationMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Anon0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(null)
        ret
    }
  }
  
}

