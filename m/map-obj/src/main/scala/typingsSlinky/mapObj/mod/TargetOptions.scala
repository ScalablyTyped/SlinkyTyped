package typingsSlinky.mapObj.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetOptions[TargetObjectType /* <: StringDictionary[js.Any] */] extends Options {
  @JSName("target")
  var target_TargetOptions: TargetObjectType = js.native
}

object TargetOptions {
  @scala.inline
  def apply[TargetObjectType](target: TargetObjectType): TargetOptions[TargetObjectType] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetOptions[TargetObjectType]]
  }
  @scala.inline
  implicit class TargetOptionsOps[Self[targetobjecttype] <: TargetOptions[targetobjecttype], TargetObjectType] (val x: Self[TargetObjectType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TargetObjectType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TargetObjectType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TargetObjectType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TargetObjectType] with Other]
    @scala.inline
    def withTarget(value: TargetObjectType): Self[TargetObjectType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

