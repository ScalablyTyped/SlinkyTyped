package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDevicesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * Used to select a set of devices. A filter is made up of an attribute, an operator, and one or more values.   Attribute: The aspect of a device such as platform or model used as the selection criteria in a device filter. Allowed values include:   ARN: The Amazon Resource Name (ARN) of the device (for example, arn:aws:devicefarm:us-west-2::device:12345Example).   PLATFORM: The device platform. Valid values are ANDROID or IOS.   OS_VERSION: The operating system version (for example, 10.3.2).   MODEL: The device model (for example, iPad 5th Gen).   AVAILABILITY: The current availability of the device. Valid values are AVAILABLE, HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.   FORM_FACTOR: The device form factor. Valid values are PHONE or TABLET.   MANUFACTURER: The device manufacturer (for example, Apple).   REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access. Valid values are TRUE or FALSE.   REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging. Valid values are TRUE or FALSE. Because remote debugging is no longer supported, this attribute is ignored.   INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.   INSTANCE_LABELS: The label of the device instance.   FLEET_TYPE: The fleet type. Valid values are PUBLIC or PRIVATE.     Operator: The filter operator.   The EQUALS operator is available for every attribute except INSTANCE_LABELS.   The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.   The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN attributes.   The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the OS_VERSION attribute.     Values: An array of one or more filter values.   The IN and NOT_IN operators take a values array that has one or more elements.   The other operators require an array with a single element.   In a request, the AVAILABILITY attribute takes the following values: AVAILABLE, HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.    
    */
  var filters: js.UndefOr[DeviceFilters] = js.native
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListDevicesRequest {
  
  @scala.inline
  def apply(): ListDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesRequest]
  }
  
  @scala.inline
  implicit class ListDevicesRequestMutableBuilder[Self <: ListDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setFilters(value: DeviceFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DeviceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
