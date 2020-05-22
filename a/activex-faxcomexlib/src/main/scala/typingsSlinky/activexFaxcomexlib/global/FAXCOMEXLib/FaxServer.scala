package typingsSlinky.activexFaxcomexlib.global.FAXCOMEXLib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FAX_SERVER_APIVERSION_ENUM
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FAX_SERVER_EVENTS_TYPE_ENUM
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxDeviceProviders
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxDevices
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxServer Class */
@JSGlobal("FAXCOMEXLib.FaxServer")
@js.native
class FaxServer protected ()
  extends typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer {
  /** Version of the fax server API */
  /* CompleteClass */
  override val APIVersion: FAX_SERVER_APIVERSION_ENUM = js.native
  /** The fax server activity status object */
  /* CompleteClass */
  override val Activity: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxActivity = js.native
  /** Fax server configuration */
  /* CompleteClass */
  override val Configuration: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxConfiguration = js.native
  /** FaxAccount for the current connection */
  /* CompleteClass */
  override val CurrentAccount: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccount = js.native
  /** Is fax server built in debug environment */
  /* CompleteClass */
  override val Debug: Boolean = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxServer_typekey")
  override var FAXCOMEXLibDotFaxServer_typekey: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer = js.native
  /** The FaxAccountSet configuration object */
  /* CompleteClass */
  override val FaxAccountSet: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccountSet = js.native
  /** The fax folders object */
  /* CompleteClass */
  override val Folders: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxFolders = js.native
  /** The inbound routing configuration object */
  /* CompleteClass */
  override val InboundRouting: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRouting = js.native
  /** The logging options configuration object */
  /* CompleteClass */
  override val LoggingOptions: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxLoggingOptions = js.native
  /** The major part of the fax server's build number */
  /* CompleteClass */
  override val MajorBuild: Double = js.native
  /** The major part of the fax server's version number */
  /* CompleteClass */
  override val MajorVersion: Double = js.native
  /** The minor part of the fax server's build number */
  /* CompleteClass */
  override val MinorBuild: Double = js.native
  /** The minor part of the fax server's version number */
  /* CompleteClass */
  override val MinorVersion: Double = js.native
  /** The outbound routing configuration object */
  /* CompleteClass */
  override val OutboundRouting: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting = js.native
  /** The receipt options configuration object */
  /* CompleteClass */
  override val ReceiptOptions: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxReceiptOptions = js.native
  /** Events the fax Server is listening to */
  /* CompleteClass */
  override val RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM = js.native
  /** The security configuration object */
  /* CompleteClass */
  override val Security: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity = js.native
  /** The security configuration object */
  /* CompleteClass */
  override val Security2: typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity2 = js.native
  /** The name of the fax server */
  /* CompleteClass */
  override val ServerName: String = js.native
  /** Connect to the fax server */
  /* CompleteClass */
  override def Connect(bstrServerName: String): Unit = js.native
  /** Disconnect from the fax server */
  /* CompleteClass */
  override def Disconnect(): Unit = js.native
  /** The collection of device providers */
  /* CompleteClass */
  override def GetDeviceProviders(): FaxDeviceProviders = js.native
  /** The collection of all available devices */
  /* CompleteClass */
  override def GetDevices(): FaxDevices = js.native
  /** Return server level extention property */
  /* CompleteClass */
  override def GetExtensionProperty(bstrGUID: String): js.Any = js.native
  /** Set bit-wise combination of events the fax server listens to */
  /* CompleteClass */
  override def ListenToServerEvents(EventTypes: FAX_SERVER_EVENTS_TYPE_ENUM): Unit = js.native
  /** Register device provider */
  /* CompleteClass */
  override def RegisterDeviceProvider(
    bstrGUID: String,
    bstrFriendlyName: String,
    bstrImageName: String,
    TspName: String,
    lFSPIVersion: Double
  ): Unit = js.native
  /** Register inbound routing extension */
  /* CompleteClass */
  override def RegisterInboundRoutingExtension(bstrExtensionName: String, bstrFriendlyName: String, bstrImageName: String, vMethods: js.Any): Unit = js.native
  /** Set server level extention property */
  /* CompleteClass */
  override def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit = js.native
  /** Unregister device provider */
  /* CompleteClass */
  override def UnregisterDeviceProvider(bstrUniqueName: String): Unit = js.native
  /** Unregister inbound routing extension */
  /* CompleteClass */
  override def UnregisterInboundRoutingExtension(bstrExtensionUniqueName: String): Unit = js.native
}

