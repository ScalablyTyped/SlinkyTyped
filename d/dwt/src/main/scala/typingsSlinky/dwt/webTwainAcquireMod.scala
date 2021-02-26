package typingsSlinky.dwt

import typingsSlinky.dwt.anon.AutoBorderDetection
import typingsSlinky.dwt.anon.BDuplex
import typingsSlinky.dwt.anon.BShowIndicator
import typingsSlinky.dwt.anon.CompressionType
import typingsSlinky.dwt.anon.CurrentPageNum
import typingsSlinky.dwt.anon.Format
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapSupportedSizes
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapType
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapValueType
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDUPLEX
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDriver
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMagType
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMessageType
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTransferMode
import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType
import typingsSlinky.dwt.webTwainEditMod.WebTwainEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainAcquireMod {
  
  @js.native
  trait Capabilities extends StObject {
    
    /**
      * Specifies how to set capabilities
      */
    var capabilities: js.Array[CapabilitySetup] = js.native
    
    /**
      * Whether to "ignore" or "fail" the request if an exception occurs. This is an overall setting that is inherited by all capabilities.
      */
    var exceptition: String = js.native
  }
  object Capabilities {
    
    @scala.inline
    def apply(capabilities: js.Array[CapabilitySetup], exceptition: String): Capabilities = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], exceptition = exceptition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(value: js.Array[CapabilitySetup]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesVarargs(value: CapabilitySetup*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
      
      @scala.inline
      def setExceptition(value: String): Self = StObject.set(x, "exceptition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CapabilityDetails extends StObject {
    
    /**
      * The Capability.
      */
    var capability: ValueAndLabel = js.native
    
    /**
      * The container type of the Capability
      */
    var conType: ValueAndLabel = js.native
    
    /**
      * The index for the current value of the Capability
      */
    var curIndex: Double = js.native
    
    /**
      * The current value of the Capability
      */
    var curValue: ValueAndLabel = js.native
    
    /**
      * The index for the default value of the Capability
      */
    var defIndex: Double = js.native
    
    /**
      * The operation types that are supported by the Capability. Types include {"get", "set", "reset" "getdefault", "getcurrent"}
      */
    var query: js.Array[String] = js.native
    
    /**
      * The value type of the Capability. Value types include
      * TWTY_BOOL: 6
      * TWTY_FIX32: 7
      * TWTY_FRAME: 8
      * TWTY_INT8: 0
      * TWTY_INT16: 1
      * TWTY_INT32: 2
      * TWTY_STR32: 9
      * TWTY_STR64: 10
      * TWTY_STR128: 11
      * TWTY_STR255: 12
      * TWTY_UINT8: 3
      * TWTY_UINT16: 4
      * TWTY_int: 5
      */
    var valueType: ValueAndLabel = js.native
    
    /**
      * The available values of the Capability
      */
    var values: js.Array[ValueAndLabel] = js.native
  }
  object CapabilityDetails {
    
    @scala.inline
    def apply(
      capability: ValueAndLabel,
      conType: ValueAndLabel,
      curIndex: Double,
      curValue: ValueAndLabel,
      defIndex: Double,
      query: js.Array[String],
      valueType: ValueAndLabel,
      values: js.Array[ValueAndLabel]
    ): CapabilityDetails = {
      val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], conType = conType.asInstanceOf[js.Any], curIndex = curIndex.asInstanceOf[js.Any], curValue = curValue.asInstanceOf[js.Any], defIndex = defIndex.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapabilityDetails]
    }
    
    @scala.inline
    implicit class CapabilityDetailsMutableBuilder[Self <: CapabilityDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapability(value: ValueAndLabel): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConType(value: ValueAndLabel): Self = StObject.set(x, "conType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurIndex(value: Double): Self = StObject.set(x, "curIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurValue(value: ValueAndLabel): Self = StObject.set(x, "curValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefIndex(value: Double): Self = StObject.set(x, "defIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: js.Array[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryVarargs(value: String*): Self = StObject.set(x, "query", js.Array(value :_*))
      
      @scala.inline
      def setValueType(value: ValueAndLabel): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[ValueAndLabel]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: ValueAndLabel*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CapabilitySetup extends StObject {
    
    /**
      * Specify a capability
      */
    var capability: EnumDWTCap | Double = js.native
    
    /**
      * The value to set to the capability or the value of the capability after setting.
      */
    var curValue: Double | String = js.native
    
    var errorCode: js.UndefOr[Double] = js.native
    
    var errorString: js.UndefOr[String] = js.native
    
    /**
      * Whether to "ignore" or "fail" the request if an exception occurs when setting this specific capability.
      */
    var exception: js.UndefOr[String] = js.native
  }
  object CapabilitySetup {
    
    @scala.inline
    def apply(capability: EnumDWTCap | Double, curValue: Double | String): CapabilitySetup = {
      val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], curValue = curValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapabilitySetup]
    }
    
    @scala.inline
    implicit class CapabilitySetupMutableBuilder[Self <: CapabilitySetup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapability(value: EnumDWTCap | Double): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurValue(value: Double | String): Self = StObject.set(x, "curValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      @scala.inline
      def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStringUndefined: Self = StObject.set(x, "errorString", js.undefined)
      
      @scala.inline
      def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    }
  }
  
  @js.native
  trait DeviceConfiguration extends StObject {
    
    /**
      * Whether to close the built-in User Interface after aquisition. Only valid when {IfShowUI} is true.
      */
    var IfDisableSourceAfterAcquire: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to scan one side or both sides of each paper.
      */
    var IfDuplexEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to use the document feeder or the flatbed of the device.
      */
    var IfFeederEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to retrieve extended information about the image after it's transferred.
      */
    var IfGetExtImageInfo: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to retrieve information about the image after it's transferred.
      */
    var IfGetImageInfo: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to show the built-in User Interface from the device vendor
      */
    var IfShowUI: js.UndefOr[Boolean] = js.native
    
    /**
      * How a pixel is represented. Basically it means whether to scan in color, grey or black & white
      */
    var PixelType: js.UndefOr[EnumDWTPixelType | Double | String] = js.native
    
    /**
      * How detailed is the acquisition. Measured by dots per pixel (DPI)
      */
    var Resolution: js.UndefOr[Double] = js.native
    
    /**
      * How much extended information is retrieved. Only valid when {IfGetExtImageInfo} is true.
      */
    var extendedImageInfoQueryLevel: js.UndefOr[Double] = js.native
  }
  object DeviceConfiguration {
    
    @scala.inline
    def apply(): DeviceConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceConfiguration]
    }
    
    @scala.inline
    implicit class DeviceConfigurationMutableBuilder[Self <: DeviceConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtendedImageInfoQueryLevel(value: Double): Self = StObject.set(x, "extendedImageInfoQueryLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedImageInfoQueryLevelUndefined: Self = StObject.set(x, "extendedImageInfoQueryLevel", js.undefined)
      
      @scala.inline
      def setIfDisableSourceAfterAcquire(value: Boolean): Self = StObject.set(x, "IfDisableSourceAfterAcquire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfDisableSourceAfterAcquireUndefined: Self = StObject.set(x, "IfDisableSourceAfterAcquire", js.undefined)
      
      @scala.inline
      def setIfDuplexEnabled(value: Boolean): Self = StObject.set(x, "IfDuplexEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfDuplexEnabledUndefined: Self = StObject.set(x, "IfDuplexEnabled", js.undefined)
      
      @scala.inline
      def setIfFeederEnabled(value: Boolean): Self = StObject.set(x, "IfFeederEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfFeederEnabledUndefined: Self = StObject.set(x, "IfFeederEnabled", js.undefined)
      
      @scala.inline
      def setIfGetExtImageInfo(value: Boolean): Self = StObject.set(x, "IfGetExtImageInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfGetExtImageInfoUndefined: Self = StObject.set(x, "IfGetExtImageInfo", js.undefined)
      
      @scala.inline
      def setIfGetImageInfo(value: Boolean): Self = StObject.set(x, "IfGetImageInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfGetImageInfoUndefined: Self = StObject.set(x, "IfGetImageInfo", js.undefined)
      
      @scala.inline
      def setIfShowUI(value: Boolean): Self = StObject.set(x, "IfShowUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfShowUIUndefined: Self = StObject.set(x, "IfShowUI", js.undefined)
      
      @scala.inline
      def setPixelType(value: EnumDWTPixelType | Double | String): Self = StObject.set(x, "PixelType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelTypeUndefined: Self = StObject.set(x, "PixelType", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    }
  }
  
  @js.native
  trait ScanSetup extends StObject {
    
    /**
      * Whether to ignore or fail the acquistion when an exception is raised. Set "ignore" or "fail".
      */
    var exception: js.UndefOr[String] = js.native
    
    /**
      * Set how the transfer is done.
      */
    var fileXfer: js.UndefOr[CompressionType] = js.native
    
    /**
      * A callback triggered before the scan, after the scan and after each page has been transferred.
      */
    var funcScanStatus: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.native
    
    /**
      * Set where the scanned images are inserted.
      */
    var insertingIndex: js.UndefOr[Double] = js.native
    
    var moreSettings: js.UndefOr[AutoBorderDetection] = js.native
    
    /**
      * Set up how the scanned images are outputted.
      */
    var outputSetup: js.UndefOr[Format] = js.native
    
    /**
      * The profile is a base64 string, if present, it overrides settings and more settings.
      */
    var profile: js.UndefOr[String] = js.native
    
    /**
      * The name of the data source (the scanner). If not set, the default data source is used.
      */
    var scanner: js.UndefOr[String] = js.native
    
    /**
      * Basic settings.
      */
    var settings: js.UndefOr[BDuplex] = js.native
    
    /**
      * An id that specifies this specific setup.
      */
    var setupId: js.UndefOr[String] = js.native
    
    /**
      * The TWAIN transfer mode.
      */
    var transferMode: js.UndefOr[EnumDWTTransferMode | Double] = js.native
    
    var ui: js.UndefOr[BShowIndicator] = js.native
  }
  object ScanSetup {
    
    @scala.inline
    def apply(): ScanSetup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanSetup]
    }
    
    @scala.inline
    implicit class ScanSetupMutableBuilder[Self <: ScanSetup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      @scala.inline
      def setFileXfer(value: CompressionType): Self = StObject.set(x, "fileXfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileXferUndefined: Self = StObject.set(x, "fileXfer", js.undefined)
      
      @scala.inline
      def setFuncScanStatus(value: /* status */ Status => Unit): Self = StObject.set(x, "funcScanStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFuncScanStatusUndefined: Self = StObject.set(x, "funcScanStatus", js.undefined)
      
      @scala.inline
      def setInsertingIndex(value: Double): Self = StObject.set(x, "insertingIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertingIndexUndefined: Self = StObject.set(x, "insertingIndex", js.undefined)
      
      @scala.inline
      def setMoreSettings(value: AutoBorderDetection): Self = StObject.set(x, "moreSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreSettingsUndefined: Self = StObject.set(x, "moreSettings", js.undefined)
      
      @scala.inline
      def setOutputSetup(value: Format): Self = StObject.set(x, "outputSetup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSetupUndefined: Self = StObject.set(x, "outputSetup", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setScanner(value: String): Self = StObject.set(x, "scanner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScannerUndefined: Self = StObject.set(x, "scanner", js.undefined)
      
      @scala.inline
      def setSettings(value: BDuplex): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSetupId(value: String): Self = StObject.set(x, "setupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupIdUndefined: Self = StObject.set(x, "setupId", js.undefined)
      
      @scala.inline
      def setTransferMode(value: EnumDWTTransferMode | Double): Self = StObject.set(x, "transferMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferModeUndefined: Self = StObject.set(x, "transferMode", js.undefined)
      
      @scala.inline
      def setUi(value: BShowIndicator): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    }
  }
  
  @js.native
  trait SourceDetails extends StObject {
    
    /**
      * Information about the driver if it's DriverType is "ICA"
      */
    var DeviceInfo: js.UndefOr[js.Any] = js.native
    
    /**
      * The driver type which can be "TWAIN" | "ICA" | "SANE"
      */
    var DriverType: js.UndefOr[String] = js.native
    
    /**
      * Whether it is the current source.
      */
    var IsCurrentSource: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether it is the default source.
      */
    var IsDefaultSource: js.UndefOr[Boolean] = js.native
    
    /**
      * The manufacturer of the data source. E.g. "TWAIN Working Group".
      */
    var Manufacturer: js.UndefOr[String] = js.native
    
    /**
      * The family name of the data source. E.g. "Software Scan".
      */
    var ProductFamily: js.UndefOr[String] = js.native
    
    /**
      * The name of the data source. E.g. "TWAIN2 FreeImage Software Scanner".
      */
    var ProductName: js.UndefOr[String] = js.native
    
    /**
      * The version of the protocol based on which the data source is developed.
      */
    var ProtocolMajor: js.UndefOr[Double] = js.native
    
    var ProtocolMinor: js.UndefOr[Double] = js.native
    
    /**
      * Supported Groups
      */
    var SupportedGroups: js.UndefOr[Double] = js.native
    
    /**
      * Detailed version of the data source.
      */
    var Version: js.UndefOr[typingsSlinky.dwt.webTwainAcquireMod.Version] = js.native
  }
  object SourceDetails {
    
    @scala.inline
    def apply(): SourceDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceDetails]
    }
    
    @scala.inline
    implicit class SourceDetailsMutableBuilder[Self <: SourceDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceInfo(value: js.Any): Self = StObject.set(x, "DeviceInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceInfoUndefined: Self = StObject.set(x, "DeviceInfo", js.undefined)
      
      @scala.inline
      def setDriverType(value: String): Self = StObject.set(x, "DriverType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverTypeUndefined: Self = StObject.set(x, "DriverType", js.undefined)
      
      @scala.inline
      def setIsCurrentSource(value: Boolean): Self = StObject.set(x, "IsCurrentSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCurrentSourceUndefined: Self = StObject.set(x, "IsCurrentSource", js.undefined)
      
      @scala.inline
      def setIsDefaultSource(value: Boolean): Self = StObject.set(x, "IsDefaultSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDefaultSourceUndefined: Self = StObject.set(x, "IsDefaultSource", js.undefined)
      
      @scala.inline
      def setManufacturer(value: String): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
      
      @scala.inline
      def setProductFamily(value: String): Self = StObject.set(x, "ProductFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductFamilyUndefined: Self = StObject.set(x, "ProductFamily", js.undefined)
      
      @scala.inline
      def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
      
      @scala.inline
      def setProtocolMajor(value: Double): Self = StObject.set(x, "ProtocolMajor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolMajorUndefined: Self = StObject.set(x, "ProtocolMajor", js.undefined)
      
      @scala.inline
      def setProtocolMinor(value: Double): Self = StObject.set(x, "ProtocolMinor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolMinorUndefined: Self = StObject.set(x, "ProtocolMinor", js.undefined)
      
      @scala.inline
      def setSupportedGroups(value: Double): Self = StObject.set(x, "SupportedGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedGroupsUndefined: Self = StObject.set(x, "SupportedGroups", js.undefined)
      
      @scala.inline
      def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  @js.native
  trait Status extends StObject {
    
    var bScanCompleted: js.UndefOr[Boolean] = js.native
    
    var event: js.UndefOr[String] = js.native
    
    var result: js.UndefOr[CurrentPageNum] = js.native
  }
  object Status {
    
    @scala.inline
    def apply(): Status = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBScanCompleted(value: Boolean): Self = StObject.set(x, "bScanCompleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBScanCompletedUndefined: Self = StObject.set(x, "bScanCompleted", js.undefined)
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setResult(value: CurrentPageNum): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  @js.native
  trait TiffTag extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var tagIdentifier: js.UndefOr[Double] = js.native
    
    var useBase64Encoding: js.UndefOr[Boolean] = js.native
  }
  object TiffTag {
    
    @scala.inline
    def apply(): TiffTag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TiffTag]
    }
    
    @scala.inline
    implicit class TiffTagMutableBuilder[Self <: TiffTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setTagIdentifier(value: Double): Self = StObject.set(x, "tagIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagIdentifierUndefined: Self = StObject.set(x, "tagIdentifier", js.undefined)
      
      @scala.inline
      def setUseBase64Encoding(value: Boolean): Self = StObject.set(x, "useBase64Encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBase64EncodingUndefined: Self = StObject.set(x, "useBase64Encoding", js.undefined)
    }
  }
  
  @js.native
  trait ValueAndLabel extends StObject {
    
    /**
      * Label or name of the item
      */
    var label: String = js.native
    
    /**
      * Numeric representation of the item
      */
    var value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double = js.native
  }
  object ValueAndLabel {
    
    @scala.inline
    def apply(label: String, value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double): ValueAndLabel = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueAndLabel]
    }
    
    @scala.inline
    implicit class ValueAndLabelMutableBuilder[Self <: ValueAndLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: EnumDWTCap | EnumDWTCapType | EnumDWTCapValueType | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Version extends StObject {
    
    var Country: js.UndefOr[Double] = js.native
    
    var Info: js.UndefOr[String] = js.native
    
    var Language: js.UndefOr[Double] = js.native
    
    var MajorNum: js.UndefOr[Double] = js.native
    
    var MinorNum: js.UndefOr[Double] = js.native
  }
  object Version {
    
    @scala.inline
    def apply(): Version = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Version]
    }
    
    @scala.inline
    implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: Double): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
      
      @scala.inline
      def setLanguage(value: Double): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
      
      @scala.inline
      def setMajorNum(value: Double): Self = StObject.set(x, "MajorNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorNumUndefined: Self = StObject.set(x, "MajorNum", js.undefined)
      
      @scala.inline
      def setMinorNum(value: Double): Self = StObject.set(x, "MinorNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorNumUndefined: Self = StObject.set(x, "MinorNum", js.undefined)
    }
  }
  
  @js.native
  trait WebTwainAcquire extends WebTwainEdit {
    
    /**
      * Start image acquisition.
      * @param deviceConfiguration Configuration for the acquisition.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def AcquireImage(): Unit = js.native
    def AcquireImage(
      deviceConfiguration: js.UndefOr[scala.Nothing],
      successCallBack: js.UndefOr[scala.Nothing],
      failureCallBack: js.Function3[
          /* deviceConfiguration */ DeviceConfiguration, 
          /* errorCode */ Double, 
          /* errorString */ String, 
          Unit
        ]
    ): Unit = js.native
    def AcquireImage(deviceConfiguration: js.UndefOr[scala.Nothing], successCallBack: js.Function0[Unit]): Unit = js.native
    def AcquireImage(
      deviceConfiguration: js.UndefOr[scala.Nothing],
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function3[
          /* deviceConfiguration */ DeviceConfiguration, 
          /* errorCode */ Double, 
          /* errorString */ String, 
          Unit
        ]
    ): Unit = js.native
    def AcquireImage(deviceConfiguration: DeviceConfiguration): Unit = js.native
    def AcquireImage(
      deviceConfiguration: DeviceConfiguration,
      successCallBack: js.UndefOr[scala.Nothing],
      failureCallBack: js.Function3[
          /* deviceConfiguration */ DeviceConfiguration, 
          /* errorCode */ Double, 
          /* errorString */ String, 
          Unit
        ]
    ): Unit = js.native
    def AcquireImage(deviceConfiguration: DeviceConfiguration, successCallBack: js.Function0[Unit]): Unit = js.native
    def AcquireImage(
      deviceConfiguration: DeviceConfiguration,
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function3[
          /* deviceConfiguration */ DeviceConfiguration, 
          /* errorCode */ Double, 
          /* errorString */ String, 
          Unit
        ]
    ): Unit = js.native
    def AcquireImage(
      successCallBack: js.UndefOr[scala.Nothing],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    def AcquireImage(successCallBack: js.Function0[Unit]): Unit = js.native
    def AcquireImage(
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Return or set the pixel bit depth for the current value of `PixelType`.
      */
    var BitDepth: Double = js.native
    
    /**
      * Return or set the brightness to be used for scanning by the data source.
      */
    var Brightness: Double = js.native
    
    /**
      * Cancels all pending transfers.
      */
    def CancelAllPendingTransfers(): Boolean = js.native
    
    /**
      * [Deprecation] Return or set the index (0-based) of
      * a list to indicate the Current Value when the value of
      * the CapType property is TWON_ENUMERATION. If the data type
      * of the capability is String, the list is in CapItemsString property.
      * For other data types, the list is in CapItems property. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapCurrentIndex: Double = js.native
    
    /**
      * [Deprecation] Return or set the current value in a range when the
      * value of the CapType property is TWON_RANGE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapCurrentValue: Double = js.native
    
    /**
      * [Deprecation] Return the index (0-based) of a list to indicate the
      * Default Value when the value of the CapType property is TWON_ENUMERATION.
      * If the data type of the capability is String, the list is in CapItemsString property.
      *  For other data types, the list is in CapItems property. This is a runtime, read-only property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    val CapDefaultIndex: Double = js.native
    
    /**
      * [Deprecation] Return the default value in a range when the value of the
      * CapType property is TWON_RANGE. This is a runtime, read-only property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapDefaultValue: Double = js.native
    
    /**
      * [Deprecation] Retruns the description for a capability
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapDescription: String = js.native
    
    /**
      * [Deprecation] Gets information of the capability specified by the Capability property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGet(): Boolean = js.native
    
    /**
      * [Deprecation] Return the Source's current Value for the specified capability.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetCurrent(): Boolean = js.native
    
    /**
      * [Deprecation] Return the Source's Default Value for the specified capability.
      * This is the Source's preferred default value.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetDefault(): Boolean = js.native
    
    /**
      * [Deprecation] Return the value of the bottom-most edge of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index specifies the value of which frame to get. The index is 0-based.
      */
    def CapGetFrameBottom(index: Double): Double = js.native
    
    /**
      * [Deprecation] Return the value (in Unit) of the left-most edge of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index specifies the value of which frame to get. The index is 0-based.
      */
    def CapGetFrameLeft(index: Double): Double = js.native
    
    /**
      * [Deprecation] Return the value (in Unit) of the left-most edge of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index specifies the value of which frame to get. The index is 0-based.
      */
    def CapGetFrameRight(index: Double): Double = js.native
    
    /**
      * [Deprecation] Return the value (in Unit) of the top-most edge of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index specifies the value of which frame to get. The index is 0-based.
      */
    def CapGetFrameTop(index: Double): Double = js.native
    
    /**
      * [Deprecation] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetHelp(index: Double): Double = js.native
    
    /**
      * [Deprecation] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetLabel(index: Double): Double = js.native
    
    /**
      * [Deprecation] Use getCapabilities() and setCapabilities() instead.
      */
    def CapGetLabels(index: Double): Double = js.native
    
    /**
      * [Deprecation] Queries whether the Source supports a particular operation on the capability.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param {Dynamsoft.EnumDWT_MessageType} messageType specifies the type of capability operation.
      */
    def CapIfSupported(messageType: EnumDWTMessageType): Boolean = js.native
    
    /**
      * [Deprecation] Return or set the maximum value in a range when the
      * value of the CapType property is TWON_RANGE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapMaxValue: Double = js.native
    
    /**
      * [Deprecation] Return or set the minimum value in a range when the
      * value of the CapType property is TWON_RANGE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapMinValue: Double = js.native
    
    /**
      * [Deprecation] Return or set how many items are in the list when the
      *  value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
      * For String data type, the list is in CapItemsString property.
      * For other data types, the list is in CapItems property.
      * This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapNumItems: Double = js.native
    
    /**
      * [Deprecation] Changes the Current Value of the capability specified by
      * Capability property back to its power-on value.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapReset(): Boolean = js.native
    
    /**
      * [Deprecation] Sets the current capability using the container type specified by
      * CapType property. The current capability is specified by Capability property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    def CapSet(): Boolean = js.native
    
    /**
      * [Deprecation] Sets the values of the specified frame.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index  specifies the values of which frame to set. The index is 0-based.
      * @param left the value (in Unit) of the left-most edge of the specified frame.
      * @param top the value (in Unit) of the top-most edge of the specified frame.
      * @param right  the value (in Unit) of the right-most edge of the specified frame.
      * @param bottom  the value (in Unit) of the bottom-most edge of the specified frame.
      */
    def CapSetFrame(index: Double, left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
    
    /**
      * [Deprecation] Return or set the step size in a range when the value
      * of the CapType property is TWON_RANGE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapStepSize: Double = js.native
    
    /**
      * [Deprecation] Return or set the type of capability container used
      * to exchange capability information between application and source.
      * This is a runtime property.
      */
    var CapType: EnumDWTCapType = js.native
    
    /**
      * [Deprecation] Return or set the value of the capability specified by
      *  Capability property when the value of the CapType property is TWON_ONEVALUE.
      * This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapValue: Double = js.native
    
    /**
      * [Deprecation] Return or set the string value for a capability when the
      * value of the CapType property is TWON_ONEVALUE. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapValueString: String = js.native
    
    /**
      * [Deprecation] Return or set the value type for reading the value of a capability.
      *  This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var CapValueType: Double = js.native
    
    /**
      * [Deprecation] Specifies the capabiltiy to be negotiated. This is a runtime property.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      */
    var Capability: EnumDWTCap = js.native
    
    /**
      * Close the data source (a TWAIN/ICA/SANE device which in most cases is a scanner) to free it to be used by other applications.
      */
    def CloseSource(): Boolean = js.native
    
    /**
      * Close the data source (a TWAIN/ICA/SANE device which in most cases is a scanner) to free it to be used by other applications.
      */
    def CloseSourceAsync(): js.Promise[Boolean] = js.native
    
    /**
      * Closes and unloads Data Source Manager.
      */
    def CloseSourceManager(): Boolean = js.native
    
    /**
      * Closes and unloads Data Source Manager.
      */
    def CloseSourceManagerAsync(): js.Promise[Boolean] = js.native
    
    /**
      * Closes the scanning process to release resources on the machine.
      */
    def CloseWorkingProcess(): Boolean = js.native
    
    /**
      * Return or set Contrast to be used for scanning by the data source.
      */
    var Contrast: Double = js.native
    
    /**
      * Return the device name of current source.
      */
    val CurrentSourceName: String = js.native
    
    /**
      * Return a value that indicates the data source status.
      */
    var DataSourceStatus: Double = js.native
    
    /**
      * Return the name of the default source.
      */
    var DefaultSourceName: String = js.native
    
    /**
      * Disable the data source (a TWAIN/ICA/SANE device which in most cases is a scanner) to stop the acquiring process. If the data source's user interface is displayed, it will be closed.
      */
    def DisableSource(): Boolean = js.native
    
    /**
      * Return whether the source supports duplex. If yes, it further returns the level of duplex the data source supports.
      */
    val Duplex: EnumDWTDUPLEX | Double = js.native
    
    /**
      * Enable the data source to start the acquiring process.
      */
    def EnableSource(): Boolean = js.native
    
    /**
      * Display the TWAIN source's built-in user interface.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def EnableSourceUI(
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Ejects the current page and begins scanning the next page in the document feeder.
      */
    def FeedPage(): Boolean = js.native
    
    /**
      * Get the cap item value of the capability specified by Capability property,
      * when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index Index is 0-based. It is the index of the cap item.
      */
    def GetCapItems(index: Double): Double = js.native
    
    /**
      * Returns the cap item value of the capability specified by Capability property,
      * when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index Index is 0-based. It is the index of the cap item.
      */
    def GetCapItemsString(index: Double): String = js.native
    
    /**
      * Get the custom data source data and saves the data in a specified file.
      * @param fileName The path of the file to save the data source data to.
      */
    def GetCustomDSData(fileName: String): Boolean = js.native
    
    /**
      * Gets custom DS data and returns it in a base64 string.
      */
    def GetCustomDSDataEx(): String = js.native
    
    /**
      * Inspect the current data source and return whether it is a scanner, a webcam, etc.
      */
    def GetDeviceType(): Double = js.native
    
    /**
      * Get the name of a data source by its index in data source manager source list.
      * @param index The index of the data source.
      */
    def GetSourceNameItems(index: Double): String = js.native
    
    def GetSourceNames(): js.Array[SourceDetails | String] = js.native
    def GetSourceNames(bIncludeDetails: Boolean): js.Array[SourceDetails | String] = js.native
    
    /**
      * Return all available data sources (scanners, etc.) and optionally all detailed information about them.
      * @param bIncludeDetails Whether to return more details about the data sources or just their names.
      */
    def GetSourceNamesAsync(bIncludeDetails: Boolean): js.Promise[js.Array[SourceDetails | String]] = js.native
    
    /**
      * Return or set whether to enable the data source's auto-brightness feature.
      */
    var IfAutoBright: Boolean = js.native
    
    /**
      * Return or set whether the data source (the scanner) discards blank images during scanning automatically.
      */
    var IfAutoDiscardBlankpages: Boolean = js.native
    
    /**
      * Return or set whether to enable the data source's automatic document feeding process.
      */
    var IfAutoFeed: Boolean = js.native
    
    /**
      * Return or set whether to enable the data source's automatic document scanning process.
      */
    var IfAutoScan: Boolean = js.native
    
    /**
      * Return or set whether to enable the data source's automatic border detection feature.
      */
    var IfAutomaticBorderDetection: Boolean = js.native
    
    /**
      * Return or set whether to enable the data source's automatic skew correction feature.
      */
    var IfAutomaticDeskew: Boolean = js.native
    
    /**
      * Return or set whether to close the user interface after all images have been acquired.
      */
    var IfDisableSourceAfterAcquire: Boolean = js.native
    
    /**
      * Return or set whether to enable duplex scanning (in other words, whether to scan both sides of the paper).
      */
    var IfDuplexEnabled: Boolean = js.native
    
    /**
      * Return or set whether a data source's Automatic Document Feeder (ADF) is enabled for scanning.
      */
    var IfFeederEnabled: Boolean = js.native
    
    /**
      * Return whether or not there are documents loaded in the data source's feeder.
      */
    val IfFeederLoaded: Boolean = js.native
    
    /**
      * Return whether the Source has a paper sensor that can detect pages on the ADF or Flatbed.
      */
    val IfPaperDetectable: Boolean = js.native
    
    /**
      * Return or set whether the data source displays a progress indicator during acquisition and transfer.
      */
    var IfShowIndicator: Boolean = js.native
    
    /**
      * Return or set whether the data source displays the user interface when scanning.
      */
    var IfShowUI: Boolean = js.native
    
    /**
      * Return whether the data source supports acquisitions with the UI (User Interface) disabled.
      */
    val IfUIControllable: Boolean = js.native
    
    /**
      * Return or set whether the new TWAIN DSM (data source Manager) is used for acquisitions. The new TWAIN DSM is a DLL called 'TWAINDSM.dll' while the default | old DSM is called 'twain_32.dll'.
      */
    var IfUseTwainDSM: Boolean = js.native
    
    /**
      * Return the bit depth of the current image.
      */
    val ImageBitsPerPixel: Double = js.native
    
    /**
      * Return or set whether to use TWAIN or ICA protocol on macOS.
      */
    var ImageCaptureDriverType: EnumDWTDriver | Double = js.native
    
    /**
      * Return the document number of the current image.
      */
    val ImageLayoutDocumentNumber: Double = js.native
    
    /**
      * Return the value of the bottom edge of the current image frame (in Unit).
      */
    val ImageLayoutFrameBottom: Double = js.native
    
    /**
      * Return the value of the left edge of the current image frame (in Unit).
      */
    val ImageLayoutFrameLeft: Double = js.native
    
    /**
      * Return the value of the right edge of the current image frame (in Unit).
      */
    val ImageLayoutFrameRight: Double = js.native
    
    /**
      * Return the value of the top edge of the current image frame (in Unit).
      */
    val ImageLayoutFrameTop: Double = js.native
    
    /**
      * Return the page number of the current image.
      */
    val ImageLayoutPageNumber: Double = js.native
    
    /**
      * Return the length of the current image.
      */
    val ImageLength: Double = js.native
    
    /**
      * Return the pixel type of the current image.
      */
    val ImagePixelType: EnumDWTPixelType | Double = js.native
    
    /**
      * Return the width of the current image.
      */
    val ImageWidth: Double = js.native
    
    /**
      * Return the horizontal resolution of the current image.
      */
    val ImageXResolution: Double = js.native
    
    /**
      * Return the vertical resolution of the current image.
      */
    val ImageYResolution: Double = js.native
    
    /**
      * Return the data of the magnetic data if the data source supports magnetic data recognition.
      */
    val MagData: String = js.native
    
    /**
      * Return the type of the magnetic data if the data source supports magnetic data recognition.
      */
    val MagType: EnumDWTMagType | Double = js.native
    
    /**
      * Load a data source to get it ready to acquire images.
      */
    def OpenSource(): Boolean = js.native
    
    /**
      * Return all available data sources (scanners, etc.) and optionally all detailed information about them.
      * @param bIncludeDetails Whether to return more details about the data sources or just their names.
      */
    /**
      * Load a data source to get it ready to acquire images.
      */
    def OpenSourceAsync(): js.Promise[Boolean] = js.native
    
    /**
      * Load and open data source manager.
      */
    def OpenSourceManager(): Boolean = js.native
    
    /**
      * Load and open data source manager.
      */
    def OpenSourceManagerAsync(): js.Promise[Boolean] = js.native
    
    /**
      * Return or set the page size the data source uses to acquire images.
      */
    var PageSize: EnumDWTCapSupportedSizes | Double = js.native
    
    /**
      * Return the number of transfers the data source is ready to supply upon demand.
      */
    val PendingXfers: Double = js.native
    
    /**
      * Return or set the pixel flavor to be used for acquiring images.
      */
    var PixelFlavor: Double = js.native
    
    /**
      * Return or set the pixel type used when acquiring images.
      */
    var PixelType: EnumDWTPixelType | Double = js.native
    
    /**
      * Reset the image layout in the data source.
      */
    def ResetImageLayout(): Boolean = js.native
    
    /**
      * Return or set the resolution used when acquiring images.
      */
    var Resolution: Double = js.native
    
    /**
      * If called while {IfFeederEnabled} property is true, the data source will return the current page to the input area and return the last page from the output area into the acquisition area.
      */
    def RewindPage(): Boolean = js.native
    
    /**
      * Bring up the Source Selection User Interface (UI) for the user to choose a data source.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def SelectSource(): Boolean | Unit = js.native
    def SelectSource(
      successCallBack: js.UndefOr[scala.Nothing],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Boolean | Unit = js.native
    def SelectSource(successCallBack: js.Function0[Unit]): Boolean | Unit = js.native
    def SelectSource(
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Boolean | Unit = js.native
    
    /**
      * Bring up the Source Selection User Interface (UI) for the user to choose a data source.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def SelectSourceAsync(): js.Promise[Boolean] = js.native
    def SelectSourceAsync(
      successCallBack: js.UndefOr[scala.Nothing],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): js.Promise[Boolean] = js.native
    def SelectSourceAsync(successCallBack: js.Function0[Unit]): js.Promise[Boolean] = js.native
    def SelectSourceAsync(
      successCallBack: js.Function0[Unit],
      failureCallBack: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Select a data source by its index.
      * @param index The index of the data source.
      */
    def SelectSourceByIndex(index: Double): Boolean = js.native
    
    /**
      * Select a data source by its index.
      * @param index The index of the data source.
      */
    def SelectSourceByIndexAsync(index: Double): js.Promise[Boolean] = js.native
    
    /**
      * [Deprecation] Set the value of the specified cap item.
      * @param index Index is 0-based. It is the index of the cap item.
      * @param newVal For string type, please use CapItemsstring property.
      */
    def SetCapItems(index: Double, newVal: Double): Unit = js.native
    
    /**
      * [Deprecation] Set the cap item value of the capability specified by Capability property,
      * when the value of the CapType property is TWON_ARRAY or TWON_ENUMERATION.
      * [Alternative] Use getCapabilities() and setCapabilities() instead.
      * @param index Index is 0-based. It is the index of the cap item.
      * @param newVal The new value to be set.
      */
    def SetCapItemsString(index: Double, newVal: String): Unit = js.native
    
    /**
      * Sets custom data source data to be used for scanning, the data is stored in a file which can be regarded as a scanning profile.
      * @param fileName The path  of the file.
      */
    def SetCustomDSData(fileName: String): Boolean = js.native
    
    /**
      * Set custom data source data to be used for scanning, the input is a base64 string.
      * @param dsDataString The string that contains custom data source data.
      */
    def SetCustomDSDataEx(dsDataString: String): Boolean = js.native
    
    def SetFileXferInfo(fileName: String, fileFormat: Double): Boolean = js.native
    /**
      * Set the file transfer information to be used in File Transfer mode.
      * @param fileName The path to transfer the file to.
      * @param fileFormat The format of the file.
      */
    def SetFileXferInfo(fileName: String, fileFormat: EnumDWTFileFormat): Boolean = js.native
    
    /**
      * Set the left, top, right, and bottom sides of the image layout
      * rectangle for the current data source. The image layout rectangle
      * defines a frame of the data source's scanning area to be acquired.
      * @param left Specify the rectangle (leftmost coordinate).
      * @param top Specify the rectangle (topmost coordinate).
      * @param right Specify the rectangle (rightmost coordinate).
      * @param bottom Specify the rectangle (bottommost coordinate).
      */
    def SetImageLayout(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
    
    /**
      * Sets a timer which stops the data source opening process once it expires.
      * @param duration Define the duration of the timer (in milliseconds).
      */
    def SetOpenSourceTimeout(duration: Double): Boolean = js.native
    
    /**
      * Returns how many data sources are available on the local system.
      */
    val SourceCount: Double = js.native
    
    /**
      * Return or set the data source's transfer mode.
      */
    var TransferMode: EnumDWTTransferMode | Double = js.native
    
    /**
      * Return or set the unit of measure for all quantities.
      */
    var Unit: EnumDWTUnitType | Double = js.native
    
    /**
      * Return and set the number of images your application is willing to accept for each scan job.
      */
    var XferCount: Double = js.native
    
    /**
      * Gets detailed information about all capabilities of the current data source.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument capabilityDetails Detailed information about the specified capabilities.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def getCapabilities(
      succssCallback: js.Function1[/* capabilityDetails */ js.Array[CapabilityDetails], Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Sets up one or multiple capabilities in one call.
      * @param capabilities A object that describes how to set capabilities.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument capabilities The capabilities to set.
      */
    def setCapabilities(
      capabilities: Capabilities,
      succssCallback: js.Function1[/* capabilities */ Capabilities, Unit],
      failureCallback: js.Function1[/* capabilities */ Capabilities, Unit]
    ): Unit = js.native
    
    /**
      * Start the acquisition by passing all settings at once.
      * @param scanSetup Configuration for the acquisition.
      */
    def startScan(scanSetup: ScanSetup): js.Promise[ScanSetup] = js.native
  }
}
