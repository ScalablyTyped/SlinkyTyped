package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeatures extends js.Object {
  /** List of the 3D-related features your app requires. */
  var features: js.Array[webgl] = js.native
}

object AnonFeatures {
  @scala.inline
  def apply(features: js.Array[webgl]): AnonFeatures = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatures]
  }
  @scala.inline
  implicit class AnonFeaturesOps[Self <: AnonFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[webgl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

