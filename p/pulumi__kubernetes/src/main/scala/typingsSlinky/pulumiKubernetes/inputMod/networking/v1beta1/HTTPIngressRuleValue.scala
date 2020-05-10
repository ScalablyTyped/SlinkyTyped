package typingsSlinky.pulumiKubernetes.inputMod.networking.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example:
  * http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC
  * 3986, this resource will be used to match against everything after the last '/' and before
  * the first '?' or '#'.
  */
@js.native
trait HTTPIngressRuleValue extends js.Object {
  /**
    * A collection of paths that map requests to backends.
    */
  var paths: Input[js.Array[Input[HTTPIngressPath]]] = js.native
}

object HTTPIngressRuleValue {
  @scala.inline
  def apply(paths: Input[js.Array[Input[HTTPIngressPath]]]): HTTPIngressRuleValue = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPIngressRuleValue]
  }
  @scala.inline
  implicit class HTTPIngressRuleValueOps[Self <: HTTPIngressRuleValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaths(value: Input[js.Array[Input[HTTPIngressPath]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

