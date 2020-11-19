package typingsSlinky.awsSdkClientPinpointBrowser.typesSetDimensionMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXCLUSIVE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INCLUSIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDimension extends js.Object {
  
  /**
    * The type of dimension:
    *
    * INCLUSIVE - Endpoints that match the criteria are included in the segment.
    *
    * EXCLUSIVE - Endpoints that match the criteria are excluded from the segment.
    */
  var DimensionType: js.UndefOr[INCLUSIVE | EXCLUSIVE | String] = js.native
  
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  var Values: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
}
object SetDimension {
  
  @scala.inline
  def apply(): SetDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDimension]
  }
  
  @scala.inline
  implicit class SetDimensionOps[Self <: SetDimension] (val x: Self) extends AnyVal {
    
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
    def setDimensionType(value: INCLUSIVE | EXCLUSIVE | String): Self = this.set("DimensionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionType: Self = this.set("DimensionType", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValuesIterable(value: js.Iterable[String]): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String] | js.Iterable[String]): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
