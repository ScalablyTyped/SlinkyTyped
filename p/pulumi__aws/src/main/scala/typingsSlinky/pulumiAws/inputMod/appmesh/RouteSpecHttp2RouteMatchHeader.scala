package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttp2RouteMatchHeader extends js.Object {
  
  /**
    * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
    */
  var invert: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The method and value to match the header value sent with a request. Specify one match method.
    */
  var `match`: js.UndefOr[Input[RouteSpecHttp2RouteMatchHeaderMatch]] = js.native
  
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: Input[String] = js.native
}
object RouteSpecHttp2RouteMatchHeader {
  
  @scala.inline
  def apply(name: Input[String]): RouteSpecHttp2RouteMatchHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteMatchHeader]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteMatchHeaderOps[Self <: RouteSpecHttp2RouteMatchHeader] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvert(value: Input[Boolean]): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setMatch(value: Input[RouteSpecHttp2RouteMatchHeaderMatch]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
}
