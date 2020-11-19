package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object licensemanagerMod {
  
  type Boolean = scala.Boolean
  
  type BoxBoolean = scala.Boolean
  
  type BoxInteger = scala.Double
  
  type BoxLong = scala.Double
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.licensemanagerMod.ClientApiVersions
  
  type ConsumedLicenseSummaryList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.ConsumedLicenseSummary]
  
  type DateTime = js.Date
  
  type FilterName = java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typingsSlinky.awsSdk.licensemanagerMod.FilterValue]
  
  type Filters = js.Array[typingsSlinky.awsSdk.licensemanagerMod.Filter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQUALS
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_EQUALS
    - typingsSlinky.awsSdk.awsSdkStrings.BEGINS_WITH
    - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
    - java.lang.String
  */
  type InventoryFilterCondition = typingsSlinky.awsSdk.licensemanagerMod._InventoryFilterCondition | java.lang.String
  
  type InventoryFilterList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.InventoryFilter]
  
  type LicenseConfigurationAssociations = js.Array[typingsSlinky.awsSdk.licensemanagerMod.LicenseConfigurationAssociation]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type LicenseConfigurationStatus = typingsSlinky.awsSdk.licensemanagerMod._LicenseConfigurationStatus | java.lang.String
  
  type LicenseConfigurationUsageList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.LicenseConfigurationUsage]
  
  type LicenseConfigurations = js.Array[typingsSlinky.awsSdk.licensemanagerMod.LicenseConfiguration]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.vCPU_
    - typingsSlinky.awsSdk.awsSdkStrings.Instance_
    - typingsSlinky.awsSdk.awsSdkStrings.Core_
    - typingsSlinky.awsSdk.awsSdkStrings.Socket
    - java.lang.String
  */
  type LicenseCountingType = typingsSlinky.awsSdk.licensemanagerMod._LicenseCountingType | java.lang.String
  
  type LicenseOperationFailureList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.LicenseOperationFailure]
  
  type LicenseSpecifications = js.Array[typingsSlinky.awsSdk.licensemanagerMod.LicenseSpecification]
  
  type ManagedResourceSummaryList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.ManagedResourceSummary]
  
  type MetadataList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.Metadata]
  
  type ProductInformationFilterList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.ProductInformationFilter]
  
  type ProductInformationList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.ProductInformation]
  
  type ResourceInventoryList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.ResourceInventory]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EC2_INSTANCE
    - typingsSlinky.awsSdk.awsSdkStrings.EC2_HOST
    - typingsSlinky.awsSdk.awsSdkStrings.EC2_AMI
    - typingsSlinky.awsSdk.awsSdkStrings.RDS
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEMS_MANAGER_MANAGED_INSTANCE
    - java.lang.String
  */
  type ResourceType = typingsSlinky.awsSdk.licensemanagerMod._ResourceType | java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.String]
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.String]
  
  type TagList = js.Array[typingsSlinky.awsSdk.licensemanagerMod.Tag]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-08-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.licensemanagerMod._apiVersion | java.lang.String
}
