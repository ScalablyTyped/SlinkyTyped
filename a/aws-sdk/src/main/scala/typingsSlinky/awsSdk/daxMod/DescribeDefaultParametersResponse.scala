package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDefaultParametersResponse extends js.Object {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of parameters. Each element in the list represents one parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.native
}
object DescribeDefaultParametersResponse {
  
  @scala.inline
  def apply(): DescribeDefaultParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultParametersResponse]
  }
  
  @scala.inline
  implicit class DescribeDefaultParametersResponseOps[Self <: DescribeDefaultParametersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: ParameterList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
