package typingsSlinky.aureliaPal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature extends js.Object {
  /**
    * Does the runtime environment support native HTMLTemplateElement?
    */
  var htmlTemplateElement: Boolean = js.native
  /**
    * Does the runtime environment support native DOM mutation observers?
    */
  var mutationObserver: Boolean = js.native
  /**
    * Does the runtime environment support the css scoped attribute?
    */
  var scopedCSS: Boolean = js.native
  /**
    * Does the runtime environment support ShadowDOM?
    */
  var shadowDOM: Boolean = js.native
}

object Feature {
  @scala.inline
  def apply(htmlTemplateElement: Boolean, mutationObserver: Boolean, scopedCSS: Boolean, shadowDOM: Boolean): Feature = {
    val __obj = js.Dynamic.literal(htmlTemplateElement = htmlTemplateElement.asInstanceOf[js.Any], mutationObserver = mutationObserver.asInstanceOf[js.Any], scopedCSS = scopedCSS.asInstanceOf[js.Any], shadowDOM = shadowDOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  @scala.inline
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlTemplateElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTemplateElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutationObserver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopedCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopedCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowDOM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

