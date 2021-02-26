package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.BuiltinCommand
import typingsSlinky.mfiles.MFiles.CommandLocation
import typingsSlinky.mfiles.MFiles.CommandState
import typingsSlinky.mfiles.MFiles.DefaultIcon
import typingsSlinky.mfiles.MFiles.Event
import typingsSlinky.mfiles.MFiles.ListingEmptinessState
import typingsSlinky.mfiles.MFiles.MFACLComponentOverrideAccess
import typingsSlinky.mfiles.MFiles.MFACLEnforcingMode
import typingsSlinky.mfiles.MFiles.MFACLMode
import typingsSlinky.mfiles.MFiles.MFActionType
import typingsSlinky.mfiles.MFiles.MFAdditionalClassInfoType
import typingsSlinky.mfiles.MFiles.MFApplicationLicenseStatus
import typingsSlinky.mfiles.MFiles.MFAssignmentType
import typingsSlinky.mfiles.MFiles.MFAttachVaultOptionsFlag
import typingsSlinky.mfiles.MFiles.MFAuthType
import typingsSlinky.mfiles.MFiles.MFAutoStateTransitionMode
import typingsSlinky.mfiles.MFiles.MFAutomaticPermissionsOperationOptions
import typingsSlinky.mfiles.MFiles.MFAutomaticValueType
import typingsSlinky.mfiles.MFiles.MFBackupType
import typingsSlinky.mfiles.MFiles.MFBuiltInDocumentClass
import typingsSlinky.mfiles.MFiles.MFBuiltInObjectClass
import typingsSlinky.mfiles.MFiles.MFBuiltInObjectType
import typingsSlinky.mfiles.MFiles.MFBuiltInPropertyDef
import typingsSlinky.mfiles.MFiles.MFBuiltInUserGroup
import typingsSlinky.mfiles.MFiles.MFBuiltInValueList
import typingsSlinky.mfiles.MFiles.MFBuiltInView
import typingsSlinky.mfiles.MFiles.MFConditionType
import typingsSlinky.mfiles.MFiles.MFContentType
import typingsSlinky.mfiles.MFiles.MFCustomApplicationType
import typingsSlinky.mfiles.MFiles.MFDBEngine
import typingsSlinky.mfiles.MFiles.MFDataFunction
import typingsSlinky.mfiles.MFiles.MFDataType
import typingsSlinky.mfiles.MFiles.MFDefaultPropertyType
import typingsSlinky.mfiles.MFiles.MFDependencyRelation
import typingsSlinky.mfiles.MFiles.MFEmailField
import typingsSlinky.mfiles.MFiles.MFEmailImportance
import typingsSlinky.mfiles.MFiles.MFEmailSensitivity
import typingsSlinky.mfiles.MFiles.MFEventHandlerType
import typingsSlinky.mfiles.MFiles.MFExportContentFlag
import typingsSlinky.mfiles.MFiles.MFExpressionType
import typingsSlinky.mfiles.MFiles.MFExtApplicationPlatform
import typingsSlinky.mfiles.MFiles.MFExternalDBRefreshType
import typingsSlinky.mfiles.MFiles.MFFacetFilterStatusFlags
import typingsSlinky.mfiles.MFiles.MFFacetSearchFlags
import typingsSlinky.mfiles.MFiles.MFFileDataStorage
import typingsSlinky.mfiles.MFiles.MFFileFormat
import typingsSlinky.mfiles.MFiles.MFFileInformationType
import typingsSlinky.mfiles.MFiles.MFFileOpenMethod
import typingsSlinky.mfiles.MFiles.MFFileValueType
import typingsSlinky.mfiles.MFiles.MFFolderColumnId
import typingsSlinky.mfiles.MFiles.MFFolderContentItemType
import typingsSlinky.mfiles.MFiles.MFFolderDefType
import typingsSlinky.mfiles.MFiles.MFFolderListingAlgorithm
import typingsSlinky.mfiles.MFiles.MFFolderListingColumnFlags
import typingsSlinky.mfiles.MFiles.MFFolderListingItemGroupingMode
import typingsSlinky.mfiles.MFiles.MFFolderListingViewMode
import typingsSlinky.mfiles.MFiles.MFFolderUIStateLocationType
import typingsSlinky.mfiles.MFiles.MFFullTextSearchFlags
import typingsSlinky.mfiles.MFiles.MFImpersonationType
import typingsSlinky.mfiles.MFiles.MFImportContentFlag
import typingsSlinky.mfiles.MFiles.MFIndirectPropertyIDLevelType
import typingsSlinky.mfiles.MFiles.MFLatestSpecificBehavior
import typingsSlinky.mfiles.MFiles.MFLicenseType
import typingsSlinky.mfiles.MFiles.MFLoginAccountType
import typingsSlinky.mfiles.MFiles.MFLoginServerRole
import typingsSlinky.mfiles.MFiles.MFMetadataStructureItem
import typingsSlinky.mfiles.MFiles.MFMetadataStructureSelectorFlags
import typingsSlinky.mfiles.MFiles.MFMetadataSyncFormat
import typingsSlinky.mfiles.MFiles.MFNamedACLType
import typingsSlinky.mfiles.MFiles.MFNamedValueType
import typingsSlinky.mfiles.MFiles.MFOCRDimensionUnit
import typingsSlinky.mfiles.MFiles.MFOCRLanguage
import typingsSlinky.mfiles.MFiles.MFOCRZoneRecognitionMode
import typingsSlinky.mfiles.MFiles.MFObjectAccess
import typingsSlinky.mfiles.MFiles.MFObjectOperationFlags
import typingsSlinky.mfiles.MFiles.MFObjectTypeAccess
import typingsSlinky.mfiles.MFiles.MFObjectVersionFlag
import typingsSlinky.mfiles.MFiles.MFObjectWindowMode
import typingsSlinky.mfiles.MFiles.MFObjectWindowResultCode
import typingsSlinky.mfiles.MFiles.MFOfflineTransitionResultFlags
import typingsSlinky.mfiles.MFiles.MFOnlineTransitionResultFlags
import typingsSlinky.mfiles.MFiles.MFParentChildBehavior
import typingsSlinky.mfiles.MFiles.MFPermission
import typingsSlinky.mfiles.MFiles.MFPermissionsExpressionType
import typingsSlinky.mfiles.MFiles.MFPredefinedSearchFilterType
import typingsSlinky.mfiles.MFiles.MFProductMode
import typingsSlinky.mfiles.MFiles.MFPropertyDefAccess
import typingsSlinky.mfiles.MFiles.MFRelationshipsMode
import typingsSlinky.mfiles.MFiles.MFScheduledJobType
import typingsSlinky.mfiles.MFiles.MFSearchFlags
import typingsSlinky.mfiles.MFiles.MFServerConnection
import typingsSlinky.mfiles.MFiles.MFSignaturePromptInfoType
import typingsSlinky.mfiles.MFiles.MFSoftwarePlatformType
import typingsSlinky.mfiles.MFiles.MFSpecialObjectFlag
import typingsSlinky.mfiles.MFiles.MFStatusType
import typingsSlinky.mfiles.MFiles.MFStringDataType
import typingsSlinky.mfiles.MFiles.MFTriggerMonth
import typingsSlinky.mfiles.MFiles.MFTriggerType
import typingsSlinky.mfiles.MFiles.MFTriggerWeekDay
import typingsSlinky.mfiles.MFiles.MFTriggerWeekOfMonth
import typingsSlinky.mfiles.MFiles.MFUpdateType
import typingsSlinky.mfiles.MFiles.MFUserAccountVaultRole
import typingsSlinky.mfiles.MFiles.MFUserOrUserGroupType
import typingsSlinky.mfiles.MFiles.MFValidationType
import typingsSlinky.mfiles.MFiles.MFValueListItemPropertyDef
import typingsSlinky.mfiles.MFiles.MFValueListSortingType
import typingsSlinky.mfiles.MFiles.MFVaultAccess
import typingsSlinky.mfiles.MFiles.MFVaultConnectionTestResult
import typingsSlinky.mfiles.MFiles.MFViewCategory
import typingsSlinky.mfiles.MFiles.MFViewFlag
import typingsSlinky.mfiles.MFiles.MFViewType
import typingsSlinky.mfiles.MFiles.MFilesURLType
import typingsSlinky.mfiles.MFiles.MenuLocation
import typingsSlinky.mfiles.MFiles.SearchFeature
import typingsSlinky.mfiles.MFiles.TaskPaneGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mfilesNumbers {
  
  @js.native
  sealed trait `-1`
    extends MFBuiltInView
       with MFFolderColumnId
       with MFFolderListingItemGroupingMode
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  
  @js.native
  sealed trait `-10` extends MFFolderColumnId
  @scala.inline
  def `-10`: `-10` = -10.asInstanceOf[`-10`]
  
  @js.native
  sealed trait `-100` extends MFBuiltInObjectClass
  @scala.inline
  def `-100`: `-100` = -100.asInstanceOf[`-100`]
  
  @js.native
  sealed trait `-1000000` extends MFFolderColumnId
  @scala.inline
  def `-1000000`: `-1000000` = -1000000.asInstanceOf[`-1000000`]
  
  @js.native
  sealed trait `-1000001` extends MFFolderColumnId
  @scala.inline
  def `-1000001`: `-1000001` = -1000001.asInstanceOf[`-1000001`]
  
  @js.native
  sealed trait `-102`
    extends MFBuiltInObjectType
       with MFBuiltInPropertyDef
  @scala.inline
  def `-102`: `-102` = -102.asInstanceOf[`-102`]
  
  @js.native
  sealed trait `-11` extends MFFolderColumnId
  @scala.inline
  def `-11`: `-11` = -11.asInstanceOf[`-11`]
  
  @js.native
  sealed trait `-12` extends MFFolderColumnId
  @scala.inline
  def `-12`: `-12` = -12.asInstanceOf[`-12`]
  
  @js.native
  sealed trait `-13` extends MFFolderColumnId
  @scala.inline
  def `-13`: `-13` = -13.asInstanceOf[`-13`]
  
  @js.native
  sealed trait `-14` extends MFFolderColumnId
  @scala.inline
  def `-14`: `-14` = -14.asInstanceOf[`-14`]
  
  @js.native
  sealed trait `-15` extends MFFolderColumnId
  @scala.inline
  def `-15`: `-15` = -15.asInstanceOf[`-15`]
  
  @js.native
  sealed trait `-16` extends MFFolderColumnId
  @scala.inline
  def `-16`: `-16` = -16.asInstanceOf[`-16`]
  
  @js.native
  sealed trait `-17` extends MFFolderColumnId
  @scala.inline
  def `-17`: `-17` = -17.asInstanceOf[`-17`]
  
  @js.native
  sealed trait `-18` extends MFFolderColumnId
  @scala.inline
  def `-18`: `-18` = -18.asInstanceOf[`-18`]
  
  @js.native
  sealed trait `-19` extends MFFolderColumnId
  @scala.inline
  def `-19`: `-19` = -19.asInstanceOf[`-19`]
  
  @js.native
  sealed trait `-2`
    extends MFBuiltInObjectClass
       with MFFolderColumnId
  @scala.inline
  def `-2`: `-2` = -2.asInstanceOf[`-2`]
  
  @js.native
  sealed trait `-20` extends MFFolderColumnId
  @scala.inline
  def `-20`: `-20` = -20.asInstanceOf[`-20`]
  
  @js.native
  sealed trait `-21` extends MFFolderColumnId
  @scala.inline
  def `-21`: `-21` = -21.asInstanceOf[`-21`]
  
  @js.native
  sealed trait `-22` extends MFFolderColumnId
  @scala.inline
  def `-22`: `-22` = -22.asInstanceOf[`-22`]
  
  @js.native
  sealed trait `-3`
    extends MFBuiltInObjectClass
       with MFFolderColumnId
  @scala.inline
  def `-3`: `-3` = -3.asInstanceOf[`-3`]
  
  @js.native
  sealed trait `-4` extends MFFolderColumnId
  @scala.inline
  def `-4`: `-4` = -4.asInstanceOf[`-4`]
  
  @js.native
  sealed trait `-5` extends MFFolderColumnId
  @scala.inline
  def `-5`: `-5` = -5.asInstanceOf[`-5`]
  
  @js.native
  sealed trait `-6` extends MFFolderColumnId
  @scala.inline
  def `-6`: `-6` = -6.asInstanceOf[`-6`]
  
  @js.native
  sealed trait `-7` extends MFFolderColumnId
  @scala.inline
  def `-7`: `-7` = -7.asInstanceOf[`-7`]
  
  @js.native
  sealed trait `-8` extends MFFolderColumnId
  @scala.inline
  def `-8`: `-8` = -8.asInstanceOf[`-8`]
  
  @js.native
  sealed trait `-9` extends MFFolderColumnId
  @scala.inline
  def `-9`: `-9` = -9.asInstanceOf[`-9`]
  
  @js.native
  sealed trait `-9000` extends MFBuiltInView
  @scala.inline
  def `-9000`: `-9000` = -9000.asInstanceOf[`-9000`]
  
  @js.native
  sealed trait `-9001` extends MFBuiltInView
  @scala.inline
  def `-9001`: `-9001` = -9001.asInstanceOf[`-9001`]
  
  @js.native
  sealed trait `0`
    extends BuiltinCommand
       with CommandLocation
       with CommandState
       with DefaultIcon
       with Event
       with MFACLComponentOverrideAccess
       with MFACLEnforcingMode
       with MFACLMode
       with MFActionType
       with MFAdditionalClassInfoType
       with MFApplicationLicenseStatus
       with MFAssignmentType
       with MFAttachVaultOptionsFlag
       with MFAuthType
       with MFAutoStateTransitionMode
       with MFAutomaticPermissionsOperationOptions
       with MFAutomaticValueType
       with MFBackupType
       with MFBuiltInDocumentClass
       with MFBuiltInObjectType
       with MFBuiltInPropertyDef
       with MFBuiltInValueList
       with MFContentType
       with MFCustomApplicationType
       with MFDBEngine
       with MFDataFunction
       with MFDataType
       with MFDefaultPropertyType
       with MFDependencyRelation
       with MFEmailField
       with MFEmailImportance
       with MFEmailSensitivity
       with MFEventHandlerType
       with MFExportContentFlag
       with MFExpressionType
       with MFExtApplicationPlatform
       with MFExternalDBRefreshType
       with MFFacetFilterStatusFlags
       with MFFacetSearchFlags
       with MFFileDataStorage
       with MFFileFormat
       with MFFileInformationType
       with MFFileOpenMethod
       with MFFileValueType
       with MFFolderContentItemType
       with MFFolderDefType
       with MFFolderListingAlgorithm
       with MFFolderListingItemGroupingMode
       with MFFolderUIStateLocationType
       with MFFullTextSearchFlags
       with MFImpersonationType
       with MFImportContentFlag
       with MFIndirectPropertyIDLevelType
       with MFLatestSpecificBehavior
       with MFLicenseType
       with MFLoginServerRole
       with MFMetadataStructureItem
       with MFMetadataStructureSelectorFlags
       with MFMetadataSyncFormat
       with MFNamedACLType
       with MFOCRDimensionUnit
       with MFOCRLanguage
       with MFOCRZoneRecognitionMode
       with MFObjectAccess
       with MFObjectOperationFlags
       with MFObjectTypeAccess
       with MFObjectVersionFlag
       with MFObjectWindowMode
       with MFObjectWindowResultCode
       with MFOfflineTransitionResultFlags
       with MFOnlineTransitionResultFlags
       with MFParentChildBehavior
       with MFPermission
       with MFPermissionsExpressionType
       with MFPredefinedSearchFilterType
       with MFProductMode
       with MFPropertyDefAccess
       with MFScheduledJobType
       with MFSearchFlags
       with MFSignaturePromptInfoType
       with MFSoftwarePlatformType
       with MFSpecialObjectFlag
       with MFStatusType
       with MFStringDataType
       with MFTriggerType
       with MFUpdateType
       with MFUserAccountVaultRole
       with MFUserOrUserGroupType
       with MFValidationType
       with MFValueListSortingType
       with MFVaultAccess
       with MFVaultConnectionTestResult
       with MFViewCategory
       with MFViewFlag
       with MFViewType
       with MFilesURLType
       with SearchFeature
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  
  @js.native
  sealed trait `1`
    extends BuiltinCommand
       with CommandLocation
       with CommandState
       with DefaultIcon
       with Event
       with ListingEmptinessState
       with MFACLComponentOverrideAccess
       with MFACLEnforcingMode
       with MFACLMode
       with MFActionType
       with MFAdditionalClassInfoType
       with MFApplicationLicenseStatus
       with MFAssignmentType
       with MFAttachVaultOptionsFlag
       with MFAuthType
       with MFAutoStateTransitionMode
       with MFAutomaticPermissionsOperationOptions
       with MFAutomaticValueType
       with MFBackupType
       with MFBuiltInDocumentClass
       with MFBuiltInUserGroup
       with MFBuiltInValueList
       with MFConditionType
       with MFContentType
       with MFCustomApplicationType
       with MFDBEngine
       with MFDataFunction
       with MFDataType
       with MFDefaultPropertyType
       with MFDependencyRelation
       with MFEmailField
       with MFEmailImportance
       with MFEmailSensitivity
       with MFEventHandlerType
       with MFExpressionType
       with MFExtApplicationPlatform
       with MFExternalDBRefreshType
       with MFFacetFilterStatusFlags
       with MFFileDataStorage
       with MFFileFormat
       with MFFileInformationType
       with MFFileOpenMethod
       with MFFileValueType
       with MFFolderContentItemType
       with MFFolderDefType
       with MFFolderListingAlgorithm
       with MFFolderListingColumnFlags
       with MFFolderListingItemGroupingMode
       with MFFolderListingViewMode
       with MFFolderUIStateLocationType
       with MFImpersonationType
       with MFImportContentFlag
       with MFIndirectPropertyIDLevelType
       with MFLatestSpecificBehavior
       with MFLicenseType
       with MFLoginAccountType
       with MFLoginServerRole
       with MFMetadataStructureItem
       with MFMetadataStructureSelectorFlags
       with MFMetadataSyncFormat
       with MFNamedACLType
       with MFOCRDimensionUnit
       with MFOCRLanguage
       with MFOCRZoneRecognitionMode
       with MFObjectAccess
       with MFObjectOperationFlags
       with MFObjectTypeAccess
       with MFObjectVersionFlag
       with MFObjectWindowMode
       with MFObjectWindowResultCode
       with MFOfflineTransitionResultFlags
       with MFOnlineTransitionResultFlags
       with MFParentChildBehavior
       with MFPermission
       with MFPermissionsExpressionType
       with MFPredefinedSearchFilterType
       with MFProductMode
       with MFPropertyDefAccess
       with MFRelationshipsMode
       with MFScheduledJobType
       with MFSearchFlags
       with MFServerConnection
       with MFSignaturePromptInfoType
       with MFSoftwarePlatformType
       with MFSpecialObjectFlag
       with MFStatusType
       with MFStringDataType
       with MFTriggerMonth
       with MFTriggerType
       with MFTriggerWeekDay
       with MFTriggerWeekOfMonth
       with MFUpdateType
       with MFUserAccountVaultRole
       with MFUserOrUserGroupType
       with MFValidationType
       with MFValueListItemPropertyDef
       with MFValueListSortingType
       with MFVaultAccess
       with MFVaultConnectionTestResult
       with MFViewCategory
       with MFViewFlag
       with MFViewType
       with MFilesURLType
       with SearchFeature
       with TaskPaneGroup
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  
  @js.native
  sealed trait `10`
    extends BuiltinCommand
       with Event
       with MFBuiltInObjectType
       with MFBuiltInValueList
       with MFConditionType
       with MFDataType
       with MFEventHandlerType
       with MFFolderUIStateLocationType
       with MFMetadataStructureItem
       with MFOCRLanguage
       with MFScheduledJobType
       with MFStatusType
  @scala.inline
  def `10`: `10` = 10.asInstanceOf[`10`]
  
  @js.native
  sealed trait `100`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `100`: `100` = 100.asInstanceOf[`100`]
  
  @js.native
  sealed trait `10000` extends MFMetadataStructureItem
  @scala.inline
  def `10000`: `10000` = 10000.asInstanceOf[`10000`]
  
  @js.native
  sealed trait `101`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `101`: `101` = 101.asInstanceOf[`101`]
  
  @js.native
  sealed trait `102`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `102`: `102` = 102.asInstanceOf[`102`]
  
  @js.native
  sealed trait `1024`
    extends MFExportContentFlag
       with MFFolderListingItemGroupingMode
       with MFTriggerMonth
       with MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `1024`: `1024` = 1024.asInstanceOf[`1024`]
  
  @js.native
  sealed trait `103`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `103`: `103` = 103.asInstanceOf[`103`]
  
  @js.native
  sealed trait `104`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `104`: `104` = 104.asInstanceOf[`104`]
  
  @js.native
  sealed trait `1048576` extends MFVaultAccess
  @scala.inline
  def `1048576`: `1048576` = 1048576.asInstanceOf[`1048576`]
  
  @js.native
  sealed trait `105`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `105`: `105` = 105.asInstanceOf[`105`]
  
  @js.native
  sealed trait `106`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `106`: `106` = 106.asInstanceOf[`106`]
  
  @js.native
  sealed trait `107`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `107`: `107` = 107.asInstanceOf[`107`]
  
  @js.native
  sealed trait `108`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `108`: `108` = 108.asInstanceOf[`108`]
  
  @js.native
  sealed trait `109`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `109`: `109` = 109.asInstanceOf[`109`]
  
  @js.native
  sealed trait `11`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInView
       with MFConditionType
       with MFDataType
       with MFEventHandlerType
       with MFFolderUIStateLocationType
       with MFOCRLanguage
       with MFStatusType
  @scala.inline
  def `11`: `11` = 11.asInstanceOf[`11`]
  
  @js.native
  sealed trait `110`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `110`: `110` = 110.asInstanceOf[`110`]
  
  @js.native
  sealed trait `111`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `111`: `111` = 111.asInstanceOf[`111`]
  
  @js.native
  sealed trait `112`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `112`: `112` = 112.asInstanceOf[`112`]
  
  @js.native
  sealed trait `113`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `113`: `113` = 113.asInstanceOf[`113`]
  
  @js.native
  sealed trait `114`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `114`: `114` = 114.asInstanceOf[`114`]
  
  @js.native
  sealed trait `115`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `115`: `115` = 115.asInstanceOf[`115`]
  
  @js.native
  sealed trait `116`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `116`: `116` = 116.asInstanceOf[`116`]
  
  @js.native
  sealed trait `117`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `117`: `117` = 117.asInstanceOf[`117`]
  
  @js.native
  sealed trait `118`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `118`: `118` = 118.asInstanceOf[`118`]
  
  @js.native
  sealed trait `119`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `119`: `119` = 119.asInstanceOf[`119`]
  
  @js.native
  sealed trait `12`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInView
       with MFConditionType
       with MFDataType
       with MFEventHandlerType
       with MFFolderUIStateLocationType
       with MFOCRLanguage
       with MFStatusType
  @scala.inline
  def `12`: `12` = 12.asInstanceOf[`12`]
  
  @js.native
  sealed trait `120`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `120`: `120` = 120.asInstanceOf[`120`]
  
  @js.native
  sealed trait `121`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `121`: `121` = 121.asInstanceOf[`121`]
  
  @js.native
  sealed trait `122`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `122`: `122` = 122.asInstanceOf[`122`]
  
  @js.native
  sealed trait `123`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `123`: `123` = 123.asInstanceOf[`123`]
  
  @js.native
  sealed trait `124`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `124`: `124` = 124.asInstanceOf[`124`]
  
  @js.native
  sealed trait `125`
    extends BuiltinCommand
       with Event
       with MFTriggerWeekDay
  @scala.inline
  def `125`: `125` = 125.asInstanceOf[`125`]
  
  @js.native
  sealed trait `126`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `126`: `126` = 126.asInstanceOf[`126`]
  
  @js.native
  sealed trait `127`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `127`: `127` = 127.asInstanceOf[`127`]
  
  @js.native
  sealed trait `128`
    extends BuiltinCommand
       with Event
       with MFExportContentFlag
       with MFImportContentFlag
       with MFTriggerMonth
       with MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `128`: `128` = 128.asInstanceOf[`128`]
  
  @js.native
  sealed trait `129`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `129`: `129` = 129.asInstanceOf[`129`]
  
  @js.native
  sealed trait `13`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInView
       with MFConditionType
       with MFDataType
       with MFEventHandlerType
       with MFFolderUIStateLocationType
       with MFMetadataStructureItem
       with MFOCRLanguage
       with MFStatusType
  @scala.inline
  def `13`: `13` = 13.asInstanceOf[`13`]
  
  @js.native
  sealed trait `130`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `130`: `130` = 130.asInstanceOf[`130`]
  
  @js.native
  sealed trait `131`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `131`: `131` = 131.asInstanceOf[`131`]
  
  @js.native
  sealed trait `131072`
    extends MFFullTextSearchFlags
       with MFVaultAccess
  @scala.inline
  def `131072`: `131072` = 131072.asInstanceOf[`131072`]
  
  @js.native
  sealed trait `132`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `132`: `132` = 132.asInstanceOf[`132`]
  
  @js.native
  sealed trait `133`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `133`: `133` = 133.asInstanceOf[`133`]
  
  @js.native
  sealed trait `134`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `134`: `134` = 134.asInstanceOf[`134`]
  
  @js.native
  sealed trait `134217728` extends MFVaultAccess
  @scala.inline
  def `134217728`: `134217728` = 134217728.asInstanceOf[`134217728`]
  
  @js.native
  sealed trait `135`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `135`: `135` = 135.asInstanceOf[`135`]
  
  @js.native
  sealed trait `136`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `136`: `136` = 136.asInstanceOf[`136`]
  
  @js.native
  sealed trait `137`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `137`: `137` = 137.asInstanceOf[`137`]
  
  @js.native
  sealed trait `138`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `138`: `138` = 138.asInstanceOf[`138`]
  
  @js.native
  sealed trait `139`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `139`: `139` = 139.asInstanceOf[`139`]
  
  @js.native
  sealed trait `14`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInView
       with MFConditionType
       with MFDataType
       with MFEventHandlerType
       with MFFolderUIStateLocationType
       with MFMetadataStructureItem
       with MFOCRLanguage
       with MFStatusType
  @scala.inline
  def `14`: `14` = 14.asInstanceOf[`14`]
  
  @js.native
  sealed trait `140`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `140`: `140` = 140.asInstanceOf[`140`]
  
  @js.native
  sealed trait `141`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `141`: `141` = 141.asInstanceOf[`141`]
  
  @js.native
  sealed trait `142`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `142`: `142` = 142.asInstanceOf[`142`]
  
  @js.native
  sealed trait `143`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `143`: `143` = 143.asInstanceOf[`143`]
  
  @js.native
  sealed trait `144`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `144`: `144` = 144.asInstanceOf[`144`]
  
  @js.native
  sealed trait `145`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `145`: `145` = 145.asInstanceOf[`145`]
  
  @js.native
  sealed trait `146`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `146`: `146` = 146.asInstanceOf[`146`]
  
  @js.native
  sealed trait `147`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `147`: `147` = 147.asInstanceOf[`147`]
  
  @js.native
  sealed trait `148`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `148`: `148` = 148.asInstanceOf[`148`]
  
  @js.native
  sealed trait `149`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `149`: `149` = 149.asInstanceOf[`149`]
  
  @js.native
  sealed trait `15`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInView
       with MFConditionType
       with MFEventHandlerType
       with MFFolderUIStateLocationType
       with MFMetadataStructureItem
       with MFOCRLanguage
       with MFStatusType
  @scala.inline
  def `15`: `15` = 15.asInstanceOf[`15`]
  
  @js.native
  sealed trait `150`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `150`: `150` = 150.asInstanceOf[`150`]
  
  @js.native
  sealed trait `151`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `151`: `151` = 151.asInstanceOf[`151`]
  
  @js.native
  sealed trait `152` extends BuiltinCommand
  @scala.inline
  def `152`: `152` = 152.asInstanceOf[`152`]
  
  @js.native
  sealed trait `153` extends BuiltinCommand
  @scala.inline
  def `153`: `153` = 153.asInstanceOf[`153`]
  
  @js.native
  sealed trait `154` extends BuiltinCommand
  @scala.inline
  def `154`: `154` = 154.asInstanceOf[`154`]
  
  @js.native
  sealed trait `155` extends BuiltinCommand
  @scala.inline
  def `155`: `155` = 155.asInstanceOf[`155`]
  
  @js.native
  sealed trait `156` extends BuiltinCommand
  @scala.inline
  def `156`: `156` = 156.asInstanceOf[`156`]
  
  @js.native
  sealed trait `157` extends BuiltinCommand
  @scala.inline
  def `157`: `157` = 157.asInstanceOf[`157`]
  
  @js.native
  sealed trait `158` extends BuiltinCommand
  @scala.inline
  def `158`: `158` = 158.asInstanceOf[`158`]
  
  @js.native
  sealed trait `159` extends BuiltinCommand
  @scala.inline
  def `159`: `159` = 159.asInstanceOf[`159`]
  
  @js.native
  sealed trait `16`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFAttachVaultOptionsFlag
       with MFBuiltInValueList
       with MFConditionType
       with MFEventHandlerType
       with MFFacetSearchFlags
       with MFImportContentFlag
       with MFMetadataStructureItem
       with MFOCRLanguage
       with MFObjectAccess
       with MFObjectOperationFlags
       with MFSearchFlags
       with MFSpecialObjectFlag
       with MFTriggerMonth
       with MFTriggerWeekDay
       with MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `16`: `16` = 16.asInstanceOf[`16`]
  
  @js.native
  sealed trait `160` extends BuiltinCommand
  @scala.inline
  def `160`: `160` = 160.asInstanceOf[`160`]
  
  @js.native
  sealed trait `161` extends BuiltinCommand
  @scala.inline
  def `161`: `161` = 161.asInstanceOf[`161`]
  
  @js.native
  sealed trait `162` extends BuiltinCommand
  @scala.inline
  def `162`: `162` = 162.asInstanceOf[`162`]
  
  @js.native
  sealed trait `163` extends BuiltinCommand
  @scala.inline
  def `163`: `163` = 163.asInstanceOf[`163`]
  
  @js.native
  sealed trait `16384`
    extends MFImportContentFlag
       with MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `16384`: `16384` = 16384.asInstanceOf[`16384`]
  
  @js.native
  sealed trait `164` extends BuiltinCommand
  @scala.inline
  def `164`: `164` = 164.asInstanceOf[`164`]
  
  @js.native
  sealed trait `165` extends BuiltinCommand
  @scala.inline
  def `165`: `165` = 165.asInstanceOf[`165`]
  
  @js.native
  sealed trait `166` extends BuiltinCommand
  @scala.inline
  def `166`: `166` = 166.asInstanceOf[`166`]
  
  @js.native
  sealed trait `167` extends BuiltinCommand
  @scala.inline
  def `167`: `167` = 167.asInstanceOf[`167`]
  
  @js.native
  sealed trait `16777216` extends MFVaultAccess
  @scala.inline
  def `16777216`: `16777216` = 16777216.asInstanceOf[`16777216`]
  
  @js.native
  sealed trait `168` extends BuiltinCommand
  @scala.inline
  def `168`: `168` = 168.asInstanceOf[`168`]
  
  @js.native
  sealed trait `169` extends BuiltinCommand
  @scala.inline
  def `169`: `169` = 169.asInstanceOf[`169`]
  
  @js.native
  sealed trait `17`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInValueList
       with MFConditionType
       with MFEventHandlerType
       with MFOCRLanguage
  @scala.inline
  def `17`: `17` = 17.asInstanceOf[`17`]
  
  @js.native
  sealed trait `170` extends BuiltinCommand
  @scala.inline
  def `170`: `170` = 170.asInstanceOf[`170`]
  
  @js.native
  sealed trait `171` extends BuiltinCommand
  @scala.inline
  def `171`: `171` = 171.asInstanceOf[`171`]
  
  @js.native
  sealed trait `172` extends BuiltinCommand
  @scala.inline
  def `172`: `172` = 172.asInstanceOf[`172`]
  
  @js.native
  sealed trait `173` extends BuiltinCommand
  @scala.inline
  def `173`: `173` = 173.asInstanceOf[`173`]
  
  @js.native
  sealed trait `174` extends BuiltinCommand
  @scala.inline
  def `174`: `174` = 174.asInstanceOf[`174`]
  
  @js.native
  sealed trait `18`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFEventHandlerType
       with MFOCRLanguage
  @scala.inline
  def `18`: `18` = 18.asInstanceOf[`18`]
  
  @js.native
  sealed trait `19`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFEventHandlerType
       with MFOCRLanguage
  @scala.inline
  def `19`: `19` = 19.asInstanceOf[`19`]
  
  @js.native
  sealed trait `2`
    extends BuiltinCommand
       with CommandLocation
       with CommandState
       with DefaultIcon
       with Event
       with ListingEmptinessState
       with MFACLEnforcingMode
       with MFApplicationLicenseStatus
       with MFAttachVaultOptionsFlag
       with MFAuthType
       with MFAutoStateTransitionMode
       with MFAutomaticValueType
       with MFBuiltInUserGroup
       with MFBuiltInValueList
       with MFConditionType
       with MFContentType
       with MFCustomApplicationType
       with MFDBEngine
       with MFDataFunction
       with MFDataType
       with MFDefaultPropertyType
       with MFDependencyRelation
       with MFEmailField
       with MFEmailImportance
       with MFEmailSensitivity
       with MFEventHandlerType
       with MFExportContentFlag
       with MFExpressionType
       with MFExtApplicationPlatform
       with MFExternalDBRefreshType
       with MFFacetFilterStatusFlags
       with MFFacetSearchFlags
       with MFFileDataStorage
       with MFFileFormat
       with MFFileOpenMethod
       with MFFileValueType
       with MFFolderContentItemType
       with MFFolderDefType
       with MFFolderListingAlgorithm
       with MFFolderListingColumnFlags
       with MFFolderListingViewMode
       with MFFolderUIStateLocationType
       with MFImpersonationType
       with MFIndirectPropertyIDLevelType
       with MFLatestSpecificBehavior
       with MFLicenseType
       with MFLoginAccountType
       with MFLoginServerRole
       with MFMetadataStructureItem
       with MFMetadataStructureSelectorFlags
       with MFMetadataSyncFormat
       with MFNamedACLType
       with MFOCRDimensionUnit
       with MFOCRLanguage
       with MFOCRZoneRecognitionMode
       with MFObjectAccess
       with MFObjectOperationFlags
       with MFObjectTypeAccess
       with MFObjectVersionFlag
       with MFObjectWindowMode
       with MFObjectWindowResultCode
       with MFOfflineTransitionResultFlags
       with MFParentChildBehavior
       with MFPermission
       with MFPermissionsExpressionType
       with MFProductMode
       with MFPropertyDefAccess
       with MFRelationshipsMode
       with MFScheduledJobType
       with MFSearchFlags
       with MFServerConnection
       with MFSignaturePromptInfoType
       with MFSpecialObjectFlag
       with MFStatusType
       with MFTriggerMonth
       with MFTriggerType
       with MFTriggerWeekDay
       with MFTriggerWeekOfMonth
       with MFUpdateType
       with MFUserAccountVaultRole
       with MFUserOrUserGroupType
       with MFValidationType
       with MFValueListItemPropertyDef
       with MFVaultAccess
       with MFViewCategory
       with MFilesURLType
       with SearchFeature
       with TaskPaneGroup
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  
  @js.native
  sealed trait `20`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `20`: `20` = 20.asInstanceOf[`20`]
  
  @js.native
  sealed trait `2048`
    extends MFTriggerMonth
       with MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `2048`: `2048` = 2048.asInstanceOf[`2048`]
  
  @js.native
  sealed trait `21`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `21`: `21` = 21.asInstanceOf[`21`]
  
  @js.native
  sealed trait `22`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `22`: `22` = 22.asInstanceOf[`22`]
  
  @js.native
  sealed trait `23`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `23`: `23` = 23.asInstanceOf[`23`]
  
  @js.native
  sealed trait `24`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `24`: `24` = 24.asInstanceOf[`24`]
  
  @js.native
  sealed trait `25`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `25`: `25` = 25.asInstanceOf[`25`]
  
  @js.native
  sealed trait `256`
    extends MFTriggerMonth
       with MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `256`: `256` = 256.asInstanceOf[`256`]
  
  @js.native
  sealed trait `26`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `26`: `26` = 26.asInstanceOf[`26`]
  
  @js.native
  sealed trait `262144`
    extends MFFullTextSearchFlags
       with MFVaultAccess
  @scala.inline
  def `262144`: `262144` = 262144.asInstanceOf[`262144`]
  
  @js.native
  sealed trait `268435455`
    extends BuiltinCommand
       with CommandLocation
  @scala.inline
  def `268435455`: `268435455` = 268435455.asInstanceOf[`268435455`]
  
  @js.native
  sealed trait `268435456`
    extends MFFullTextSearchFlags
       with MFVaultAccess
  @scala.inline
  def `268435456`: `268435456` = 268435456.asInstanceOf[`268435456`]
  
  @js.native
  sealed trait `27`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `27`: `27` = 27.asInstanceOf[`27`]
  
  @js.native
  sealed trait `28`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `28`: `28` = 28.asInstanceOf[`28`]
  
  @js.native
  sealed trait `29`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `29`: `29` = 29.asInstanceOf[`29`]
  
  @js.native
  sealed trait `3`
    extends BuiltinCommand
       with CommandState
       with Event
       with ListingEmptinessState
       with MFACLEnforcingMode
       with MFApplicationLicenseStatus
       with MFAuthType
       with MFAutoStateTransitionMode
       with MFAutomaticValueType
       with MFBuiltInValueList
       with MFConditionType
       with MFContentType
       with MFDataFunction
       with MFDataType
       with MFDefaultPropertyType
       with MFEmailField
       with MFEmailSensitivity
       with MFEventHandlerType
       with MFExpressionType
       with MFFileDataStorage
       with MFFileOpenMethod
       with MFFileValueType
       with MFFolderContentItemType
       with MFFolderDefType
       with MFFolderListingAlgorithm
       with MFFolderListingViewMode
       with MFFolderUIStateLocationType
       with MFLatestSpecificBehavior
       with MFLicenseType
       with MFMetadataStructureItem
       with MFNamedValueType
       with MFOCRLanguage
       with MFObjectWindowMode
       with MFObjectWindowResultCode
       with MFPermissionsExpressionType
       with MFRelationshipsMode
       with MFScheduledJobType
       with MFStatusType
       with MFTriggerType
       with MFTriggerWeekOfMonth
       with MFUserOrUserGroupType
       with MFValueListItemPropertyDef
       with MFilesURLType
       with TaskPaneGroup
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  
  @js.native
  sealed trait `30`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `30`: `30` = 30.asInstanceOf[`30`]
  
  @js.native
  sealed trait `30000` extends MFPredefinedSearchFilterType
  @scala.inline
  def `30000`: `30000` = 30000.asInstanceOf[`30000`]
  
  @js.native
  sealed trait `30001` extends MFPredefinedSearchFilterType
  @scala.inline
  def `30001`: `30001` = 30001.asInstanceOf[`30001`]
  
  @js.native
  sealed trait `30002` extends MFPredefinedSearchFilterType
  @scala.inline
  def `30002`: `30002` = 30002.asInstanceOf[`30002`]
  
  @js.native
  sealed trait `30003` extends MFPredefinedSearchFilterType
  @scala.inline
  def `30003`: `30003` = 30003.asInstanceOf[`30003`]
  
  @js.native
  sealed trait `30004` extends MFPredefinedSearchFilterType
  @scala.inline
  def `30004`: `30004` = 30004.asInstanceOf[`30004`]
  
  @js.native
  sealed trait `30005` extends MFPredefinedSearchFilterType
  @scala.inline
  def `30005`: `30005` = 30005.asInstanceOf[`30005`]
  
  @js.native
  sealed trait `30006` extends MFPredefinedSearchFilterType
  @scala.inline
  def `30006`: `30006` = 30006.asInstanceOf[`30006`]
  
  @js.native
  sealed trait `30007` extends MFPredefinedSearchFilterType
  @scala.inline
  def `30007`: `30007` = 30007.asInstanceOf[`30007`]
  
  @js.native
  sealed trait `3078` extends MFUserAccountVaultRole
  @scala.inline
  def `3078`: `3078` = 3078.asInstanceOf[`3078`]
  
  @js.native
  sealed trait `31`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `31`: `31` = 31.asInstanceOf[`31`]
  
  @js.native
  sealed trait `32`
    extends BuiltinCommand
       with Event
       with MFAttachVaultOptionsFlag
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFExportContentFlag
       with MFFacetSearchFlags
       with MFImportContentFlag
       with MFOCRLanguage
       with MFObjectOperationFlags
       with MFTriggerMonth
       with MFTriggerWeekDay
       with MFUserAccountVaultRole
       with MFVaultAccess
       with MenuLocation
  @scala.inline
  def `32`: `32` = 32.asInstanceOf[`32`]
  
  @js.native
  sealed trait `32768` extends MFImportContentFlag
  @scala.inline
  def `32768`: `32768` = 32768.asInstanceOf[`32768`]
  
  @js.native
  sealed trait `33`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `33`: `33` = 33.asInstanceOf[`33`]
  
  @js.native
  sealed trait `33554432` extends MFVaultAccess
  @scala.inline
  def `33554432`: `33554432` = 33554432.asInstanceOf[`33554432`]
  
  @js.native
  sealed trait `34`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `34`: `34` = 34.asInstanceOf[`34`]
  
  @js.native
  sealed trait `35`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `35`: `35` = 35.asInstanceOf[`35`]
  
  @js.native
  sealed trait `36`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `36`: `36` = 36.asInstanceOf[`36`]
  
  @js.native
  sealed trait `37`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `37`: `37` = 37.asInstanceOf[`37`]
  
  @js.native
  sealed trait `38`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `38`: `38` = 38.asInstanceOf[`38`]
  
  @js.native
  sealed trait `39`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `39`: `39` = 39.asInstanceOf[`39`]
  
  @js.native
  sealed trait `4`
    extends BuiltinCommand
       with CommandLocation
       with DefaultIcon
       with Event
       with MFApplicationLicenseStatus
       with MFAttachVaultOptionsFlag
       with MFAutoStateTransitionMode
       with MFAutomaticValueType
       with MFBuiltInValueList
       with MFConditionType
       with MFContentType
       with MFDataFunction
       with MFDefaultPropertyType
       with MFEmailField
       with MFEmailSensitivity
       with MFEventHandlerType
       with MFExportContentFlag
       with MFExpressionType
       with MFFacetSearchFlags
       with MFFileValueType
       with MFFolderContentItemType
       with MFFolderDefType
       with MFFolderListingViewMode
       with MFFolderUIStateLocationType
       with MFFullTextSearchFlags
       with MFImportContentFlag
       with MFLoginServerRole
       with MFMetadataStructureItem
       with MFMetadataStructureSelectorFlags
       with MFNamedValueType
       with MFOCRLanguage
       with MFObjectAccess
       with MFObjectOperationFlags
       with MFObjectWindowMode
       with MFPermissionsExpressionType
       with MFScheduledJobType
       with MFSearchFlags
       with MFSpecialObjectFlag
       with MFStatusType
       with MFTriggerMonth
       with MFTriggerType
       with MFTriggerWeekDay
       with MFTriggerWeekOfMonth
       with MFUserAccountVaultRole
       with MFUserOrUserGroupType
       with MFValueListItemPropertyDef
       with MFVaultAccess
       with TaskPaneGroup
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  
  @js.native
  sealed trait `40`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `40`: `40` = 40.asInstanceOf[`40`]
  
  @js.native
  sealed trait `4095` extends MFTriggerMonth
  @scala.inline
  def `4095`: `4095` = 4095.asInstanceOf[`4095`]
  
  @js.native
  sealed trait `4096` extends MFUserAccountVaultRole
  @scala.inline
  def `4096`: `4096` = 4096.asInstanceOf[`4096`]
  
  @js.native
  sealed trait `41`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `41`: `41` = 41.asInstanceOf[`41`]
  
  @js.native
  sealed trait `4194304` extends MFVaultAccess
  @scala.inline
  def `4194304`: `4194304` = 4194304.asInstanceOf[`4194304`]
  
  @js.native
  sealed trait `42`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `42`: `42` = 42.asInstanceOf[`42`]
  
  @js.native
  sealed trait `43`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `43`: `43` = 43.asInstanceOf[`43`]
  
  @js.native
  sealed trait `44`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
       with MenuLocation
  @scala.inline
  def `44`: `44` = 44.asInstanceOf[`44`]
  
  @js.native
  sealed trait `45`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
  @scala.inline
  def `45`: `45` = 45.asInstanceOf[`45`]
  
  @js.native
  sealed trait `46`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
       with MFOCRLanguage
  @scala.inline
  def `46`: `46` = 46.asInstanceOf[`46`]
  
  @js.native
  sealed trait `47`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
  @scala.inline
  def `47`: `47` = 47.asInstanceOf[`47`]
  
  @js.native
  sealed trait `48`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
       with MFEventHandlerType
  @scala.inline
  def `48`: `48` = 48.asInstanceOf[`48`]
  
  @js.native
  sealed trait `49`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `49`: `49` = 49.asInstanceOf[`49`]
  
  @js.native
  sealed trait `5`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFApplicationLicenseStatus
       with MFAutoStateTransitionMode
       with MFBuiltInValueList
       with MFBuiltInView
       with MFConditionType
       with MFDataFunction
       with MFDataType
       with MFDefaultPropertyType
       with MFEmailField
       with MFEventHandlerType
       with MFExpressionType
       with MFFileValueType
       with MFFolderDefType
       with MFFolderListingViewMode
       with MFFolderUIStateLocationType
       with MFMetadataStructureItem
       with MFNamedValueType
       with MFOCRLanguage
       with MFPermissionsExpressionType
       with MFScheduledJobType
       with MFStatusType
       with MFTriggerWeekOfMonth
       with MFValueListItemPropertyDef
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  
  @js.native
  sealed trait `50`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `50`: `50` = 50.asInstanceOf[`50`]
  
  @js.native
  sealed trait `51`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `51`: `51` = 51.asInstanceOf[`51`]
  
  @js.native
  sealed trait `512`
    extends MFTriggerMonth
       with MFUserAccountVaultRole
  @scala.inline
  def `512`: `512` = 512.asInstanceOf[`512`]
  
  @js.native
  sealed trait `52`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `52`: `52` = 52.asInstanceOf[`52`]
  
  @js.native
  sealed trait `524288` extends MFVaultAccess
  @scala.inline
  def `524288`: `524288` = 524288.asInstanceOf[`524288`]
  
  @js.native
  sealed trait `53`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `53`: `53` = 53.asInstanceOf[`53`]
  
  @js.native
  sealed trait `536870912`
    extends MFFullTextSearchFlags
       with MFVaultAccess
  @scala.inline
  def `536870912`: `536870912` = 536870912.asInstanceOf[`536870912`]
  
  @js.native
  sealed trait `54`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `54`: `54` = 54.asInstanceOf[`54`]
  
  @js.native
  sealed trait `55`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `55`: `55` = 55.asInstanceOf[`55`]
  
  @js.native
  sealed trait `56`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `56`: `56` = 56.asInstanceOf[`56`]
  
  @js.native
  sealed trait `57`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `57`: `57` = 57.asInstanceOf[`57`]
  
  @js.native
  sealed trait `58`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `58`: `58` = 58.asInstanceOf[`58`]
  
  @js.native
  sealed trait `59`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `59`: `59` = 59.asInstanceOf[`59`]
  
  @js.native
  sealed trait `6`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFApplicationLicenseStatus
       with MFAutoStateTransitionMode
       with MFBuiltInValueList
       with MFBuiltInView
       with MFConditionType
       with MFDataFunction
       with MFDataType
       with MFDefaultPropertyType
       with MFEmailField
       with MFEventHandlerType
       with MFExpressionType
       with MFFileValueType
       with MFFolderListingViewMode
       with MFFolderUIStateLocationType
       with MFMetadataStructureItem
       with MFNamedValueType
       with MFOCRLanguage
       with MFPermissionsExpressionType
       with MFScheduledJobType
       with MFStatusType
       with MFValueListItemPropertyDef
       with MFilesURLType
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
  
  @js.native
  sealed trait `60`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `60`: `60` = 60.asInstanceOf[`60`]
  
  @js.native
  sealed trait `61`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `61`: `61` = 61.asInstanceOf[`61`]
  
  @js.native
  sealed trait `62`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `62`: `62` = 62.asInstanceOf[`62`]
  
  @js.native
  sealed trait `63`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `63`: `63` = 63.asInstanceOf[`63`]
  
  @js.native
  sealed trait `64`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
       with MFExportContentFlag
       with MFFacetSearchFlags
       with MFImportContentFlag
       with MFObjectOperationFlags
       with MFSpecialObjectFlag
       with MFTriggerMonth
       with MFTriggerWeekDay
       with MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `64`: `64` = 64.asInstanceOf[`64`]
  
  @js.native
  sealed trait `65`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `65`: `65` = 65.asInstanceOf[`65`]
  
  @js.native
  sealed trait `65536` extends MFVaultAccess
  @scala.inline
  def `65536`: `65536` = 65536.asInstanceOf[`65536`]
  
  @js.native
  sealed trait `66`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `66`: `66` = 66.asInstanceOf[`66`]
  
  @js.native
  sealed trait `67`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `67`: `67` = 67.asInstanceOf[`67`]
  
  @js.native
  sealed trait `68`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `68`: `68` = 68.asInstanceOf[`68`]
  
  @js.native
  sealed trait `69`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `69`: `69` = 69.asInstanceOf[`69`]
  
  @js.native
  sealed trait `7`
    extends BuiltinCommand
       with Event
       with MFApplicationLicenseStatus
       with MFAutoStateTransitionMode
       with MFBuiltInValueList
       with MFBuiltInView
       with MFConditionType
       with MFDataFunction
       with MFDataType
       with MFEmailField
       with MFEventHandlerType
       with MFExpressionType
       with MFFileValueType
       with MFFolderListingViewMode
       with MFFolderUIStateLocationType
       with MFMetadataStructureItem
       with MFNamedValueType
       with MFOCRLanguage
       with MFScheduledJobType
       with MFStatusType
       with MFValueListItemPropertyDef
  @scala.inline
  def `7`: `7` = 7.asInstanceOf[`7`]
  
  @js.native
  sealed trait `70`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `70`: `70` = 70.asInstanceOf[`70`]
  
  @js.native
  sealed trait `71`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `71`: `71` = 71.asInstanceOf[`71`]
  
  @js.native
  sealed trait `72`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `72`: `72` = 72.asInstanceOf[`72`]
  
  @js.native
  sealed trait `73`
    extends BuiltinCommand
       with Event
       with MFEventHandlerType
  @scala.inline
  def `73`: `73` = 73.asInstanceOf[`73`]
  
  @js.native
  sealed trait `74`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `74`: `74` = 74.asInstanceOf[`74`]
  
  @js.native
  sealed trait `75`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `75`: `75` = 75.asInstanceOf[`75`]
  
  @js.native
  sealed trait `76`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `76`: `76` = 76.asInstanceOf[`76`]
  
  @js.native
  sealed trait `77`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `77`: `77` = 77.asInstanceOf[`77`]
  
  @js.native
  sealed trait `78`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `78`: `78` = 78.asInstanceOf[`78`]
  
  @js.native
  sealed trait `79`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `79`: `79` = 79.asInstanceOf[`79`]
  
  @js.native
  sealed trait `8`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFApplicationLicenseStatus
       with MFAttachVaultOptionsFlag
       with MFBuiltInValueList
       with MFBuiltInView
       with MFConditionType
       with MFDataFunction
       with MFDataType
       with MFEmailField
       with MFEventHandlerType
       with MFExportContentFlag
       with MFFacetSearchFlags
       with MFFolderListingViewMode
       with MFFolderUIStateLocationType
       with MFLoginServerRole
       with MFMetadataStructureItem
       with MFMetadataStructureSelectorFlags
       with MFNamedValueType
       with MFOCRLanguage
       with MFObjectAccess
       with MFObjectOperationFlags
       with MFScheduledJobType
       with MFSpecialObjectFlag
       with MFStatusType
       with MFTriggerMonth
       with MFTriggerWeekDay
       with MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `8`: `8` = 8.asInstanceOf[`8`]
  
  @js.native
  sealed trait `80`
    extends BuiltinCommand
       with Event
  @scala.inline
  def `80`: `80` = 80.asInstanceOf[`80`]
  
  @js.native
  sealed trait `81`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `81`: `81` = 81.asInstanceOf[`81`]
  
  @js.native
  sealed trait `8192`
    extends MFUserAccountVaultRole
       with MFVaultAccess
  @scala.inline
  def `8192`: `8192` = 8192.asInstanceOf[`8192`]
  
  @js.native
  sealed trait `82`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `82`: `82` = 82.asInstanceOf[`82`]
  
  @js.native
  sealed trait `83`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `83`: `83` = 83.asInstanceOf[`83`]
  
  @js.native
  sealed trait `8388608` extends MFVaultAccess
  @scala.inline
  def `8388608`: `8388608` = 8388608.asInstanceOf[`8388608`]
  
  @js.native
  sealed trait `84`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `84`: `84` = 84.asInstanceOf[`84`]
  
  @js.native
  sealed trait `85`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `85`: `85` = 85.asInstanceOf[`85`]
  
  @js.native
  sealed trait `86`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `86`: `86` = 86.asInstanceOf[`86`]
  
  @js.native
  sealed trait `87`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `87`: `87` = 87.asInstanceOf[`87`]
  
  @js.native
  sealed trait `88`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `88`: `88` = 88.asInstanceOf[`88`]
  
  @js.native
  sealed trait `89`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `89`: `89` = 89.asInstanceOf[`89`]
  
  @js.native
  sealed trait `9`
    extends BuiltinCommand
       with DefaultIcon
       with Event
       with MFBuiltInObjectType
       with MFBuiltInValueList
       with MFBuiltInView
       with MFConditionType
       with MFDataFunction
       with MFDataType
       with MFEventHandlerType
       with MFFolderUIStateLocationType
       with MFMetadataStructureItem
       with MFOCRLanguage
       with MFScheduledJobType
       with MFStatusType
  @scala.inline
  def `9`: `9` = 9.asInstanceOf[`9`]
  
  @js.native
  sealed trait `90`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `90`: `90` = 90.asInstanceOf[`90`]
  
  @js.native
  sealed trait `91`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `91`: `91` = 91.asInstanceOf[`91`]
  
  @js.native
  sealed trait `92`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `92`: `92` = 92.asInstanceOf[`92`]
  
  @js.native
  sealed trait `93`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `93`: `93` = 93.asInstanceOf[`93`]
  
  @js.native
  sealed trait `94`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `94`: `94` = 94.asInstanceOf[`94`]
  
  @js.native
  sealed trait `95`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `95`: `95` = 95.asInstanceOf[`95`]
  
  @js.native
  sealed trait `96`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `96`: `96` = 96.asInstanceOf[`96`]
  
  @js.native
  sealed trait `97`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `97`: `97` = 97.asInstanceOf[`97`]
  
  @js.native
  sealed trait `98`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `98`: `98` = 98.asInstanceOf[`98`]
  
  @js.native
  sealed trait `99`
    extends BuiltinCommand
       with Event
       with MFBuiltInPropertyDef
  @scala.inline
  def `99`: `99` = 99.asInstanceOf[`99`]
}
