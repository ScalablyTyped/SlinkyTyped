package typingsSlinky.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGConditionalProcessingAttributes extends js.Object {
  var requiredExtensions: js.UndefOr[Boolean] = js.native
  var requiredFeatures: js.UndefOr[String] = js.native
  var systemLanguage: js.UndefOr[String] = js.native
}

object SVGConditionalProcessingAttributes {
  @scala.inline
  def apply(): SVGConditionalProcessingAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGConditionalProcessingAttributes]
  }
  @scala.inline
  implicit class SVGConditionalProcessingAttributesOps[Self <: SVGConditionalProcessingAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequiredExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredFeatures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemLanguage")(js.undefined)
        ret
    }
  }
  
}

