package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThemeAliasResponse extends StObject {
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * Information about the theme alias.
    */
  var ThemeAlias: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ThemeAlias] = js.native
}
object DescribeThemeAliasResponse {
  
  @scala.inline
  def apply(): DescribeThemeAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThemeAliasResponse]
  }
  
  @scala.inline
  implicit class DescribeThemeAliasResponseMutableBuilder[Self <: DescribeThemeAliasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setThemeAlias(value: ThemeAlias): Self = StObject.set(x, "ThemeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeAliasUndefined: Self = StObject.set(x, "ThemeAlias", js.undefined)
  }
}
