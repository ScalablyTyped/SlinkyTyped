package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectTypeTargetForBrowsing extends js.Object {
  var TargetObjectType: Double = js.native
  var ViewCollection: Double = js.native
  def Clone(): IObjectTypeTargetForBrowsing = js.native
}

object IObjectTypeTargetForBrowsing {
  @scala.inline
  def apply(Clone: () => IObjectTypeTargetForBrowsing, TargetObjectType: Double, ViewCollection: Double): IObjectTypeTargetForBrowsing = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), TargetObjectType = TargetObjectType.asInstanceOf[js.Any], ViewCollection = ViewCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeTargetForBrowsing]
  }
  @scala.inline
  implicit class IObjectTypeTargetForBrowsingOps[Self <: IObjectTypeTargetForBrowsing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IObjectTypeTargetForBrowsing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetObjectType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewCollection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewCollection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

