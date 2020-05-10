package typingsSlinky.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeatures extends js.Object {
  var excluded_permissions: js.Array[String] = js.native
  var features: js.Array[_] = js.native
  var interactions: AnonFollowingBoolean = js.native
  var permissions: js.Array[_] = js.native
}

object AnonFeatures {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    features: js.Array[_],
    interactions: AnonFollowingBoolean,
    permissions: js.Array[_]
  ): AnonFeatures = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatures]
  }
  @scala.inline
  implicit class AnonFeaturesOps[Self <: AnonFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcluded_permissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded_permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractions(value: AnonFollowingBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

