package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
  */
@js.native
trait HTTPIngressRuleValue extends js.Object {
  
  /**
    * A collection of paths that map requests to backends.
    */
  var paths: js.Array[HTTPIngressPath] = js.native
}
object HTTPIngressRuleValue {
  
  @scala.inline
  def apply(paths: js.Array[HTTPIngressPath]): HTTPIngressRuleValue = {
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPathsVarargs(value: HTTPIngressPath*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[HTTPIngressPath]): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
}
