package typingsSlinky.helmet.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFeaturePolicyOptions extends js.Object {
  var features: StringDictionary[js.Array[String]] = js.native
}

object IFeaturePolicyOptions {
  @scala.inline
  def apply(features: StringDictionary[js.Array[String]]): IFeaturePolicyOptions = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFeaturePolicyOptions]
  }
  @scala.inline
  implicit class IFeaturePolicyOptionsOps[Self <: IFeaturePolicyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

