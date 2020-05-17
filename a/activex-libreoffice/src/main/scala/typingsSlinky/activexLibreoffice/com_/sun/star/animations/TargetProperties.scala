package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of an animated target.
  *
  * This struct collects all global attributes that apply to an animation target. An animation target is anything that is referenced from a given {@link
  * XAnimationNode} tree as a target object.
  */
@js.native
trait TargetProperties extends js.Object {
  var Properties: SafeArray[NamedValue] = js.native
  var Target: js.Any = js.native
}

object TargetProperties {
  @scala.inline
  def apply(Properties: SafeArray[NamedValue], Target: js.Any): TargetProperties = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetProperties]
  }
  @scala.inline
  implicit class TargetPropertiesOps[Self <: TargetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: SafeArray[NamedValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

