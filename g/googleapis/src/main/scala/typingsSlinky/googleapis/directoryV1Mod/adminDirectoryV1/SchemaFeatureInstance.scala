package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a &quot;feature instance&quot;.
  */
@js.native
trait SchemaFeatureInstance extends js.Object {
  /**
    * The feature that this is an instance of. A calendar resource may have
    * multiple instances of a feature.
    */
  var feature: js.UndefOr[SchemaFeature] = js.native
}

object SchemaFeatureInstance {
  @scala.inline
  def apply(): SchemaFeatureInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureInstance]
  }
  @scala.inline
  implicit class SchemaFeatureInstanceOps[Self <: SchemaFeatureInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeature(value: SchemaFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(js.undefined)
        ret
    }
  }
  
}

