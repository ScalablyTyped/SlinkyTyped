package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxServer interface */
@js.native
trait IFaxServer extends js.Object {
  /** Version of the fax server API */
  val APIVersion: FAX_SERVER_APIVERSION_ENUM = js.native
  /** The fax server activity status object */
  val Activity: FaxActivity = js.native
  /** Is fax server built in debug environment */
  val Debug: Boolean = js.native
  /** The fax folders object */
  val Folders: FaxFolders = js.native
  /** The inbound routing configuration object */
  val InboundRouting: FaxInboundRouting = js.native
  /** The logging options configuration object */
  val LoggingOptions: FaxLoggingOptions = js.native
  /** The major part of the fax server's build number */
  val MajorBuild: Double = js.native
  /** The major part of the fax server's version number */
  val MajorVersion: Double = js.native
  /** The minor part of the fax server's build number */
  val MinorBuild: Double = js.native
  /** The minor part of the fax server's version number */
  val MinorVersion: Double = js.native
  /** The outbound routing configuration object */
  val OutboundRouting: FaxOutboundRouting = js.native
  /** The receipt options configuration object */
  val ReceiptOptions: FaxReceiptOptions = js.native
  /** Events the fax Server is listening to */
  val RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM = js.native
  /** The security configuration object */
  val Security: FaxSecurity = js.native
  /** The name of the fax server */
  val ServerName: String = js.native
  /** Connect to the fax server */
  def Connect(bstrServerName: String): Unit = js.native
  /** Disconnect from the fax server */
  def Disconnect(): Unit = js.native
  /** The collection of device providers */
  def GetDeviceProviders(): FaxDeviceProviders = js.native
  /** The collection of all available devices */
  def GetDevices(): FaxDevices = js.native
  /** Return server level extention property */
  def GetExtensionProperty(bstrGUID: String): js.Any = js.native
  /** Set bit-wise combination of events the fax server listens to */
  def ListenToServerEvents(EventTypes: FAX_SERVER_EVENTS_TYPE_ENUM): Unit = js.native
  /** Register device provider */
  def RegisterDeviceProvider(
    bstrGUID: String,
    bstrFriendlyName: String,
    bstrImageName: String,
    TspName: String,
    lFSPIVersion: Double
  ): Unit = js.native
  /** Register inbound routing extension */
  def RegisterInboundRoutingExtension(bstrExtensionName: String, bstrFriendlyName: String, bstrImageName: String, vMethods: js.Any): Unit = js.native
  /** Set server level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit = js.native
  /** Unregister device provider */
  def UnregisterDeviceProvider(bstrUniqueName: String): Unit = js.native
  /** Unregister inbound routing extension */
  def UnregisterInboundRoutingExtension(bstrExtensionUniqueName: String): Unit = js.native
}

object IFaxServer {
  @scala.inline
  def apply(
    APIVersion: FAX_SERVER_APIVERSION_ENUM,
    Activity: FaxActivity,
    Connect: String => Unit,
    Debug: Boolean,
    Disconnect: () => Unit,
    Folders: FaxFolders,
    GetDeviceProviders: () => FaxDeviceProviders,
    GetDevices: () => FaxDevices,
    GetExtensionProperty: String => js.Any,
    InboundRouting: FaxInboundRouting,
    ListenToServerEvents: FAX_SERVER_EVENTS_TYPE_ENUM => Unit,
    LoggingOptions: FaxLoggingOptions,
    MajorBuild: Double,
    MajorVersion: Double,
    MinorBuild: Double,
    MinorVersion: Double,
    OutboundRouting: FaxOutboundRouting,
    ReceiptOptions: FaxReceiptOptions,
    RegisterDeviceProvider: (String, String, String, String, Double) => Unit,
    RegisterInboundRoutingExtension: (String, String, String, js.Any) => Unit,
    RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM,
    Security: FaxSecurity,
    ServerName: String,
    SetExtensionProperty: (String, SafeArray[_]) => Unit,
    UnregisterDeviceProvider: String => Unit,
    UnregisterInboundRoutingExtension: String => Unit
  ): IFaxServer = {
    val __obj = js.Dynamic.literal(APIVersion = APIVersion.asInstanceOf[js.Any], Activity = Activity.asInstanceOf[js.Any], Connect = js.Any.fromFunction1(Connect), Debug = Debug.asInstanceOf[js.Any], Disconnect = js.Any.fromFunction0(Disconnect), Folders = Folders.asInstanceOf[js.Any], GetDeviceProviders = js.Any.fromFunction0(GetDeviceProviders), GetDevices = js.Any.fromFunction0(GetDevices), GetExtensionProperty = js.Any.fromFunction1(GetExtensionProperty), InboundRouting = InboundRouting.asInstanceOf[js.Any], ListenToServerEvents = js.Any.fromFunction1(ListenToServerEvents), LoggingOptions = LoggingOptions.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], OutboundRouting = OutboundRouting.asInstanceOf[js.Any], ReceiptOptions = ReceiptOptions.asInstanceOf[js.Any], RegisterDeviceProvider = js.Any.fromFunction5(RegisterDeviceProvider), RegisterInboundRoutingExtension = js.Any.fromFunction4(RegisterInboundRoutingExtension), RegisteredEvents = RegisteredEvents.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], SetExtensionProperty = js.Any.fromFunction2(SetExtensionProperty), UnregisterDeviceProvider = js.Any.fromFunction1(UnregisterDeviceProvider), UnregisterInboundRoutingExtension = js.Any.fromFunction1(UnregisterInboundRoutingExtension))
    __obj.asInstanceOf[IFaxServer]
  }
  @scala.inline
  implicit class IFaxServerOps[Self <: IFaxServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPIVersion(value: FAX_SERVER_APIVERSION_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivity(value: FaxActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnect(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFolders(value: FaxFolders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeviceProviders(value: () => FaxDeviceProviders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDeviceProviders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDevices(value: () => FaxDevices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDevices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtensionProperty(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetExtensionProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInboundRouting(value: FaxInboundRouting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenToServerEvents(value: FAX_SERVER_EVENTS_TYPE_ENUM => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenToServerEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoggingOptions(value: FaxLoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MajorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundRouting(value: FaxOutboundRouting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiptOptions(value: FaxReceiptOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceiptOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterDeviceProvider(value: (String, String, String, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterDeviceProvider")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withRegisterInboundRoutingExtension(value: (String, String, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterInboundRoutingExtension")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRegisteredEvents(value: FAX_SERVER_EVENTS_TYPE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisteredEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity(value: FaxSecurity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetExtensionProperty(value: (String, SafeArray[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetExtensionProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnregisterDeviceProvider(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnregisterDeviceProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnregisterInboundRoutingExtension(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnregisterInboundRoutingExtension")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

