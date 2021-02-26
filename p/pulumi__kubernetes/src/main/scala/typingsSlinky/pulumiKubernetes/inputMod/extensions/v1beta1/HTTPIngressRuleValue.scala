package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
  */
@js.native
trait HTTPIngressRuleValue extends StObject {
  
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
  implicit class HTTPIngressRuleValueMutableBuilder[Self <: HTTPIngressRuleValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: Input[js.Array[Input[HTTPIngressPath]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: Input[HTTPIngressPath]*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
