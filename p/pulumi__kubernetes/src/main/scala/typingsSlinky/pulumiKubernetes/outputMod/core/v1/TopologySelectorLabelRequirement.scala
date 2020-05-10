package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topology selector requirement is a selector that matches given label. This is an alpha
  * feature and may change in the future.
  */
@js.native
trait TopologySelectorLabelRequirement extends js.Object {
  /**
    * The label key that the selector applies to.
    */
  val key: String = js.native
  /**
    * An array of string values. One value must match the label to be selected. Each entry in
    * Values is ORed.
    */
  val values: js.Array[String] = js.native
}

object TopologySelectorLabelRequirement {
  @scala.inline
  def apply(key: String, values: js.Array[String]): TopologySelectorLabelRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySelectorLabelRequirement]
  }
  @scala.inline
  implicit class TopologySelectorLabelRequirementOps[Self <: TopologySelectorLabelRequirement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

