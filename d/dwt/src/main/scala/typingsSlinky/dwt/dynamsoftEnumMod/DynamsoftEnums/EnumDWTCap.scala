package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCap extends StObject
/** Capabilities */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_Cap")
@js.native
object EnumDWTCap extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCap with Double] = js.native
  
  /** Turns specific audible alarms on and off. */
  @js.native
  sealed trait CAP_ALARMS extends EnumDWTCap
  /* 4120 */ val CAP_ALARMS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_ALARMS with Double = js.native
  
  /**
    * The volume of a device's audible alarm. Note that this control affects the volume of all alarms;
    * no specific volume control for individual types of alarms is provided.
    */
  @js.native
  sealed trait CAP_ALARMVOLUME extends EnumDWTCap
  /* 4121 */ val CAP_ALARMVOLUME: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_ALARMVOLUME with Double = js.native
  
  /** The name or other identifying information about the Author of the image. It may include a copyright string. */
  @js.native
  sealed trait CAP_AUTHOR extends EnumDWTCap
  /* 4096 */ val CAP_AUTHOR: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTHOR with Double = js.native
  
  /**
    * If TRUE, the Source will automatically feed the next page from the document feeder after the
    * number of frames negotiated for capture from each page are acquired. CAP_FEEDERENABLED
    * must be TRUE to use this capability.
    */
  @js.native
  sealed trait CAP_AUTOFEED extends EnumDWTCap
  /* 4103 */ val CAP_AUTOFEED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTOFEED with Double = js.native
  
  /**
    * The number of images to automatically capture. This does not refer to the number of images to
    * be sent to the Application, use CAP_XFERCOUNT for that.
    */
  @js.native
  sealed trait CAP_AUTOMATICCAPTURE extends EnumDWTCap
  /* 4122 */ val CAP_AUTOMATICCAPTURE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTOMATICCAPTURE with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait CAP_AUTOMATICSENSEMEDIUM extends EnumDWTCap
  /* 4155 */ val CAP_AUTOMATICSENSEMEDIUM: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTOMATICSENSEMEDIUM with Double = js.native
  
  /**
    * This capability is intended to boost the performance of a Source. The fundamental assumption
    * behind AutoScan is that the device is able to capture the number of images indicated by the
    * value of CAP_XFERCOUNT without waiting for the Application to request the image transfers.
    * This is only possible if the device has internal buffers capable of caching the images it captures.
    * The default behavior is undefined, because some high volume devices are incapable of anything
    * but CAP_AUTOSCAN being equal to TRUE. However, if a Source supports FALSE, it should use it
    * as the mandatory default, since this best describes the behavior of pre-1.8 TWAIN Applications.
    */
  @js.native
  sealed trait CAP_AUTOSCAN extends EnumDWTCap
  /* 4112 */ val CAP_AUTOSCAN: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_AUTOSCAN with Double = js.native
  
  /** The minutes of battery power remaining to the device. */
  @js.native
  sealed trait CAP_BATTERYMINUTES extends EnumDWTCap
  /* 4146 */ val CAP_BATTERYMINUTES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_BATTERYMINUTES with Double = js.native
  
  /** When used with CapGet(), return the percentage of battery power level on camera. If -1 is returned, it indicates that the battery is not present.  */
  @js.native
  sealed trait CAP_BATTERYPERCENTAGE extends EnumDWTCap
  /* 4147 */ val CAP_BATTERYPERCENTAGE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_BATTERYPERCENTAGE with Double = js.native
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_CAMERAENABLED extends EnumDWTCap
  /* 4150 */ val CAP_CAMERAENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAMERAENABLED with Double = js.native
  
  /** Added 2.0    */
  @js.native
  sealed trait CAP_CAMERAORDER extends EnumDWTCap
  /* 4151 */ val CAP_CAMERAORDER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAMERAORDER with Double = js.native
  
  /** This capability queries the Source for UI support for preview mode. If TRUE, the Source supports preview UI. */
  @js.native
  sealed trait CAP_CAMERAPREVIEWUI extends EnumDWTCap
  /* 4129 */ val CAP_CAMERAPREVIEWUI: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAMERAPREVIEWUI with Double = js.native
  
  /** Added 1.91  */
  @js.native
  sealed trait CAP_CAMERASIDE extends EnumDWTCap
  /* 4148 */ val CAP_CAMERASIDE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAMERASIDE with Double = js.native
  
  /** A general note about the acquired image. */
  @js.native
  sealed trait CAP_CAPTION extends EnumDWTCap
  /* 4097 */ val CAP_CAPTION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CAPTION with Double = js.native
  
  /** CapGet() reports the presence of data in the scanner's buffers. CapSet() with a value of TWCB_CLEAR immediately clears the buffers. */
  @js.native
  sealed trait CAP_CLEARBUFFERS extends EnumDWTCap
  /* 4125 */ val CAP_CLEARBUFFERS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CLEARBUFFERS with Double = js.native
  
  /**
    * If TRUE, the Source will eject the current page being acquired from and will leave the feeder
    * acquire area empty.
    * If CAP_AUTOFEED is TRUE, a fresh page will be advanced.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_CLEARPAGE extends EnumDWTCap
  /* 4104 */ val CAP_CLEARPAGE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CLEARPAGE with Double = js.native
  
  @js.native
  sealed trait CAP_CUSTOMDSDATA extends EnumDWTCap
  /* 4117 */ val CAP_CUSTOMDSDATA: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CUSTOMDSDATA with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait CAP_CUSTOMINTERFACEGUID extends EnumDWTCap
  /* 4156 */ val CAP_CUSTOMINTERFACEGUID: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_CUSTOMINTERFACEGUID with Double = js.native
  
  /**
    * If TRUE, the physical hardware (e.g., scanner, digital camera, image database, etc.) that
    * represents the image source is attached, powered on, and communicating.
    */
  @js.native
  sealed trait CAP_DEVICEONLINE extends EnumDWTCap
  /* 4111 */ val CAP_DEVICEONLINE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_DEVICEONLINE with Double = js.native
  
  /**
    * The date and time of the device's clock.
    * Managed in the form "YYYY/MM/DD HH=mm=SS=sss" where YYYY is the year, MM is the
    * numerical month, DD is the numerical day, HH is the hour, mm is the minute, SS is the second,
    * and sss is the millisecond.
    */
  @js.native
  sealed trait CAP_DEVICETIMEDATE extends EnumDWTCap
  /* 4127 */ val CAP_DEVICETIMEDATE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_DEVICETIMEDATE with Double = js.native
  
  /**
    * This indicates whether the scanner supports duplex. If so, it further indicates whether one-path
    * or two-path duplex is supported.
    */
  @js.native
  sealed trait CAP_DUPLEX extends EnumDWTCap
  /* 4114 */ val CAP_DUPLEX: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_DUPLEX with Double = js.native
  
  /**
    * The user can set the duplex option to be TRUE or FALSE. If TRUE, the scanner scans both sides
    * of a paper; otherwise, the scanner will scan only one side of the image.
    */
  @js.native
  sealed trait CAP_DUPLEXENABLED extends EnumDWTCap
  /* 4115 */ val CAP_DUPLEXENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_DUPLEXENABLED with Double = js.native
  
  /** Allows an application to query a source to see if it implements the new user interface settings dialog.  */
  @js.native
  sealed trait CAP_ENABLEDSUIONLY extends EnumDWTCap
  /* 4116 */ val CAP_ENABLEDSUIONLY: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_ENABLEDSUIONLY with Double = js.native
  
  /**
    * Allows the application to specify the starting endorser / imprinter number. All other endorser/
    * imprinter properties should be handled through the data source's user interface.
    * The user can set the starting number for the endorser.
    */
  @js.native
  sealed trait CAP_ENDORSER extends EnumDWTCap
  /* 4118 */ val CAP_ENDORSER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_ENDORSER with Double = js.native
  
  /** Allows the application and Source to negotiate capabilities to be used in States 5 and 6. */
  @js.native
  sealed trait CAP_EXTENDEDCAPS extends EnumDWTCap
  /* 4102 */ val CAP_EXTENDEDCAPS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_EXTENDEDCAPS with Double = js.native
  
  /**
    * Helps the Application determine any special actions it may need to take when negotiating
    * frames with the Source. Allowed values are listed in <see cref="TWCapFeederAlignment"/>.
    * TWFA_NONE= The alignment is free-floating. Applications should assume
    * that the origin for frames is on the left.
    * TWFA_LEFT= The alignment is to the left.
    * TWFA_CENTER= The alignment is centered. This means that the paper will
    * be fed in the middle of the ICAP_PHYSICALWIDTH of the
    * device. If this is set, then the Application should calculate
    * any frames with a left offset of zero.
    * TWFA_RIGHT= The alignment is to the right.
    */
  @js.native
  sealed trait CAP_FEEDERALIGNMENT extends EnumDWTCap
  /* 4141 */ val CAP_FEEDERALIGNMENT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERALIGNMENT with Double = js.native
  
  /**
    * If TRUE, Source must acquire data from the document feeder acquire area and other feeder
    * capabilities can be used. If FALSE, Source must acquire data from the non-feeder acquire area
    * and no other feeder capabilities can be used.
    */
  @js.native
  sealed trait CAP_FEEDERENABLED extends EnumDWTCap
  /* 4098 */ val CAP_FEEDERENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERENABLED with Double = js.native
  
  /** Reflect whether there are documents loaded in the Source's feeder. */
  @js.native
  sealed trait CAP_FEEDERLOADED extends EnumDWTCap
  /* 4099 */ val CAP_FEEDERLOADED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERLOADED with Double = js.native
  
  /**
    * TWFO_FIRSTPAGEFIRST if the feeder starts with the top of the first page.
    * TWFO_LASTPAGEFIRST is the feeder starts with the top of the last page.
    */
  @js.native
  sealed trait CAP_FEEDERORDER extends EnumDWTCap
  /* 4142 */ val CAP_FEEDERORDER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERORDER with Double = js.native
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_FEEDERPOCKET extends EnumDWTCap
  /* 4154 */ val CAP_FEEDERPOCKET: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERPOCKET with Double = js.native
  
  /** Added 2.0   */
  @js.native
  sealed trait CAP_FEEDERPREP extends EnumDWTCap
  /* 4153 */ val CAP_FEEDERPREP: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDERPREP with Double = js.native
  
  /**
    * If TRUE, the Source will eject the current page and advance the next page in the document feeder
    * into the feeder acquire area.
    * If CAP_AUTOFEED is TRUE, the same action just described will occur and CAP_AUTOFEED will
    * remain active.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_FEEDPAGE extends EnumDWTCap
  /* 4105 */ val CAP_FEEDPAGE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_FEEDPAGE with Double = js.native
  
  /**
    * If TRUE, the Source will display a progress indicator during acquisition and transfer, regardless
    * of whether the Source's user interface is active. If FALSE, the progress indicator will be
    * suppressed if the Source's user interface is inactive.
    * The Source will continue to display device-specific instructions and error messages even with
    * the Source user interface and progress indicators turned off.
    */
  @js.native
  sealed trait CAP_INDICATORS extends EnumDWTCap
  /* 4107 */ val CAP_INDICATORS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_INDICATORS with Double = js.native
  
  /**
    * Allows Application and Source to identify which languages they have in common for the exchange of string data,
    * and to select the language of the internal UI. Since the TWLG_xxxx codes include language and country data, there is no separate
    * capability for selecting the country.
    */
  @js.native
  sealed trait CAP_LANGUAGE extends EnumDWTCap
  /* 4140 */ val CAP_LANGUAGE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_LANGUAGE with Double = js.native
  
  /** Describes the number of pages that the scanner can buffer when CAP_AUTOSCAN is enabled. */
  @js.native
  sealed trait CAP_MAXBATCHBUFFERS extends EnumDWTCap
  /* 4126 */ val CAP_MAXBATCHBUFFERS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_MAXBATCHBUFFERS with Double = js.native
  
  /** Added 2.0  */
  @js.native
  sealed trait CAP_MICRENABLED extends EnumDWTCap
  /* 4152 */ val CAP_MICRENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_MICRENABLED with Double = js.native
  
  /** Nothing. */
  @js.native
  sealed trait CAP_NONE extends EnumDWTCap
  /* 0 */ val CAP_NONE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_NONE with Double = js.native
  
  /** This capability determines whether the device has a paper sensor that can detect documents on the ADF or Flatbed. */
  @js.native
  sealed trait CAP_PAPERDETECTABLE extends EnumDWTCap
  /* 4109 */ val CAP_PAPERDETECTABLE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PAPERDETECTABLE with Double = js.native
  
  /** CapGet() reports the kinds of power available to the device. CapGetCurrent() reports the current power supply in use. */
  @js.native
  sealed trait CAP_POWERSUPPLY extends EnumDWTCap
  /* 4128 */ val CAP_POWERSUPPLY: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_POWERSUPPLY with Double = js.native
  
  /**
    * CapGet() returns the current list of available printer devices, along with the one currently being used for negotiation.
    * CapSet() selects the current device for negotiation, and optionally constrains the list.
    * Top/Bottom refers to duplex devices, and indicates if the printer is writing on the top or the bottom of the sheet of paper.
    * Simplex devices use the top settings. Before/After indicates whether printing occurs before or after the sheet of paper has been scanned.
    */
  @js.native
  sealed trait CAP_PRINTER extends EnumDWTCap
  /* 4134 */ val CAP_PRINTER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTER with Double = js.native
  
  /** Turns the current CAP_PRINTER device on or off. */
  @js.native
  sealed trait CAP_PRINTERENABLED extends EnumDWTCap
  /* 4135 */ val CAP_PRINTERENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERENABLED with Double = js.native
  
  /** The User can set the starting number for the current CAP_PRINTER device. */
  @js.native
  sealed trait CAP_PRINTERINDEX extends EnumDWTCap
  /* 4136 */ val CAP_PRINTERINDEX: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERINDEX with Double = js.native
  
  /**
    * Specifies the appropriate current CAP_PRINTER device mode.
    * Note=
    * O TWPM_SINGLESTRING specifies that the printed text will consist of a single string.
    * O TWPM _MULTISTRING specifies that the printed text will consist of an enumerated list of
    * strings to be printed in order.
    * O TWPM _COMPOUNDSTRING specifies that the printed string will consist of a compound of a
    * String followed by a value followed by a suffix string.
    */
  @js.native
  sealed trait CAP_PRINTERMODE extends EnumDWTCap
  /* 4137 */ val CAP_PRINTERMODE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERMODE with Double = js.native
  
  /**
    * Specifies the string(s) that are to be used in the string component when the current
    * CAP_PRINTER device is enabled.
    */
  @js.native
  sealed trait CAP_PRINTERSTRING extends EnumDWTCap
  /* 4138 */ val CAP_PRINTERSTRING: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERSTRING with Double = js.native
  
  /** Specifies the string that shall be used as the current CAP_PRINTER device's suffix. */
  @js.native
  sealed trait CAP_PRINTERSUFFIX extends EnumDWTCap
  /* 4139 */ val CAP_PRINTERSUFFIX: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_PRINTERSUFFIX with Double = js.native
  
  /**
    * Indicates whether the physical hardware (e.g. scanner, digital camera) is capable of acquiring
    * multiple images of the same page without changes to the physical registration of that page.
    */
  @js.native
  sealed trait CAP_REACQUIREALLOWED extends EnumDWTCap
  /* 4144 */ val CAP_REACQUIREALLOWED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_REACQUIREALLOWED with Double = js.native
  
  /**
    * If TRUE, the Source will return the current page to the input side of the document feeder and
    * feed the last page from the output side of the feeder back into the acquisition area.
    * If CAP_AUTOFEED is TRUE, automatic feeding will continue after all negotiated frames from this
    * page are acquired.
    * CAP_FEEDERENABLED must equal TRUE to use this capability.
    * This capability must have been negotiated as an extended capability to be used in States 5 and 6.
    */
  @js.native
  sealed trait CAP_REWINDPAGE extends EnumDWTCap
  /* 4106 */ val CAP_REWINDPAGE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_REWINDPAGE with Double = js.native
  
  /** Added 1.91   */
  @js.native
  sealed trait CAP_SEGMENTED extends EnumDWTCap
  /* 4149 */ val CAP_SEGMENTED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_SEGMENTED with Double = js.native
  
  /**
    * A string containing the serial number of the currently selected device in the Source. Multiple
    * devices may all report the same serial number.
    */
  @js.native
  sealed trait CAP_SERIALNUMBER extends EnumDWTCap
  /* 4132 */ val CAP_SERIALNUMBER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_SERIALNUMBER with Double = js.native
  
  /**
    * Returns a list of all the capabilities for which the Source will answer inquiries. Does not indicate
    * which capabilities the Source will allow to be set by the application. Some capabilities can only
    * be set if certain setup work has been done so the Source cannot globally answer which
    * capabilities are "set-able."
    */
  @js.native
  sealed trait CAP_SUPPORTEDCAPS extends EnumDWTCap
  /* 4101 */ val CAP_SUPPORTEDCAPS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_SUPPORTEDCAPS with Double = js.native
  
  /**
    * Returns a list of all the capabilities for which the Source will answer inquiries. Does not indicate
    * which capabilities the Source will allow to be set by the application. Some capabilities can only
    * be set if certain setup work has been done so the Source cannot globally answer which
    * capabilities are "set-able."
    */
  @js.native
  sealed trait CAP_SUPPORTEDCAPSEXT extends EnumDWTCap
  /* 4108 */ val CAP_SUPPORTEDCAPSEXT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_SUPPORTEDCAPSEXT with Double = js.native
  
  /**
    * Allows an application to request the delivery of thumbnail representations for the set of images
    * that are to be delivered.
    * Setting CAP_THUMBNAILSENABLED to TRUE turns on thumbnail mode. Images transferred
    * thereafter will be sent at thumbnail size (exact thumbnail size is determined by the Data Source).
    * Setting this capability to FALSE turns thumbnail mode off and returns full size images.
    */
  @js.native
  sealed trait CAP_THUMBNAILSENABLED extends EnumDWTCap
  /* 4113 */ val CAP_THUMBNAILSENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_THUMBNAILSENABLED with Double = js.native
  
  /**
    * For automatic capture, this value selects the number of milliseconds before the first picture is to
    * be taken, or the first image is to be scanned.
    */
  @js.native
  sealed trait CAP_TIMEBEFOREFIRSTCAPTURE extends EnumDWTCap
  /* 4123 */ val CAP_TIMEBEFOREFIRSTCAPTURE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_TIMEBEFOREFIRSTCAPTURE with Double = js.native
  
  /** For automatic capture, this value selects the milliseconds to wait between pictures taken, or images scanned. */
  @js.native
  sealed trait CAP_TIMEBETWEENCAPTURES extends EnumDWTCap
  /* 4124 */ val CAP_TIMEBETWEENCAPTURES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_TIMEBETWEENCAPTURES with Double = js.native
  
  /**
    * The date and time the image was acquired.
    * Stored in the form "YYYY/MM/DD HH=mm=SS.sss" where YYYY is the year, MM is the
    * numerical month, DD is the numerical day, HH is the hour, mm is the minute, SS is the second,
    * and sss is the millisecond.
    */
  @js.native
  sealed trait CAP_TIMEDATE extends EnumDWTCap
  /* 4100 */ val CAP_TIMEDATE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_TIMEDATE with Double = js.native
  
  /**
    * If TRUE, indicates that this Source supports acquisition with the UI disabled; i.e.,
    * TW_USERINTERFACE's ShowUI field can be set to FALSE. If FALSE, indicates that this Source
    * can only support acquisition with the UI enabled.
    */
  @js.native
  sealed trait CAP_UICONTROLLABLE extends EnumDWTCap
  /* 4110 */ val CAP_UICONTROLLABLE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_UICONTROLLABLE with Double = js.native
  
  /** The application is willing to accept this number of images. */
  @js.native
  sealed trait CAP_XFERCOUNT extends EnumDWTCap
  /* 1 */ val CAP_XFERCOUNT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.CAP_XFERCOUNT with Double = js.native
  
  /** TRUE enables and FALSE disables the Source's Auto-brightness function (if any). */
  @js.native
  sealed trait ICAP_AUTOBRIGHT extends EnumDWTCap
  /* 4352 */ val ICAP_AUTOBRIGHT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOBRIGHT with Double = js.native
  
  /**
    * Use this capability to have the Source discard blank images. The Application never sees these
    * images during the scanning session.
    * TWBP_DISABLE – this must be the default state for the Source. It indicates that all images will
    * be delivered to the Application, none of them will be discarded.
    * TWBP_AUTO – if this is used, then the Source will decide if an image is blank or not and discard
    * as appropriate.
    * If the specified value is a positive number in the range 0 to 231–1, then this capability will use it
    * as the byte size cutoff point to identify which images are to be discarded. If the size of the image
    * is less than or equal to this value, then it will be discarded. If the size of the image is greater
    * than this value, then it will be kept so that it can be transferred to the Application.
    */
  @js.native
  sealed trait ICAP_AUTODISCARDBLANKPAGES extends EnumDWTCap
  /* 4404 */ val ICAP_AUTODISCARDBLANKPAGES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTODISCARDBLANKPAGES with Double = js.native
  
  /** Turns automatic border detection on and off. */
  @js.native
  sealed trait ICAP_AUTOMATICBORDERDETECTION extends EnumDWTCap
  /* 4432 */ val ICAP_AUTOMATICBORDERDETECTION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICBORDERDETECTION with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCOLORENABLED extends EnumDWTCap
  /* 4441 */ val ICAP_AUTOMATICCOLORENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICCOLORENABLED with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE extends EnumDWTCap
  /* 4442 */ val ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICCOLORNONCOLORPIXELTYPE with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICCROPUSESFRAME extends EnumDWTCap
  /* 4439 */ val ICAP_AUTOMATICCROPUSESFRAME: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICCROPUSESFRAME with Double = js.native
  
  /** Turns automatic deskew correction on and off. */
  @js.native
  sealed trait ICAP_AUTOMATICDESKEW extends EnumDWTCap
  /* 4433 */ val ICAP_AUTOMATICDESKEW: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICDESKEW with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_AUTOMATICLENGTHDETECTION extends EnumDWTCap
  /* 4440 */ val ICAP_AUTOMATICLENGTHDETECTION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICLENGTHDETECTION with Double = js.native
  
  /**
    * When TRUE this capability depends on intelligent features within the Source to automatically
    * rotate the image to the correct position.
    */
  @js.native
  sealed trait ICAP_AUTOMATICROTATE extends EnumDWTCap
  /* 4434 */ val ICAP_AUTOMATICROTATE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOMATICROTATE with Double = js.native
  
  /** Added 2.0   */
  @js.native
  sealed trait ICAP_AUTOSIZE extends EnumDWTCap
  /* 4438 */ val ICAP_AUTOSIZE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_AUTOSIZE with Double = js.native
  
  /** Turns bar code detection on and off. */
  @js.native
  sealed trait ICAP_BARCODEDETECTIONENABLED extends EnumDWTCap
  /* 4407 */ val ICAP_BARCODEDETECTIONENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODEDETECTIONENABLED with Double = js.native
  
  /** Restricts the number of times a search will be retried if none are found on each page. */
  @js.native
  sealed trait ICAP_BARCODEMAXRETRIES extends EnumDWTCap
  /* 4412 */ val ICAP_BARCODEMAXRETRIES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODEMAXRETRIES with Double = js.native
  
  /** The maximum number of supported search priorities. */
  @js.native
  sealed trait ICAP_BARCODEMAXSEARCHPRIORITIES extends EnumDWTCap
  /* 4409 */ val ICAP_BARCODEMAXSEARCHPRIORITIES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODEMAXSEARCHPRIORITIES with Double = js.native
  
  /** Restricts bar code searching to certain orientations, or prioritizes one orientation over the other. */
  @js.native
  sealed trait ICAP_BARCODESEARCHMODE extends EnumDWTCap
  /* 4411 */ val ICAP_BARCODESEARCHMODE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODESEARCHMODE with Double = js.native
  
  /** A prioritized list of bar code types dictating the order in which bar codes will be sought. */
  @js.native
  sealed trait ICAP_BARCODESEARCHPRIORITIES extends EnumDWTCap
  /* 4410 */ val ICAP_BARCODESEARCHPRIORITIES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODESEARCHPRIORITIES with Double = js.native
  
  /** Restricts the total time spent on searching for a bar code on each page. */
  @js.native
  sealed trait ICAP_BARCODETIMEOUT extends EnumDWTCap
  /* 4413 */ val ICAP_BARCODETIMEOUT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BARCODETIMEOUT with Double = js.native
  
  /**
    * Specifies the pixel bit depths for the Current value of ICAP_PIXELTYPE. For example, when
    * using ICAP_PIXELTYPE=TWPT_GRAY, this capability specifies whether this is 8-bit gray or 4-bit gray.
    * This depth applies to all the data channels (for instance, the R, G, and B channels will all have
    * this same bit depth for RGB data).
    */
  @js.native
  sealed trait ICAP_BITDEPTH extends EnumDWTCap
  /* 4395 */ val ICAP_BITDEPTH: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BITDEPTH with Double = js.native
  
  /**
    * Specifies the Reduction Method the Source should use to reduce the bit depth of the data. Most
    * commonly used with ICAP_PIXELTYPE=TWPT_BW to reduce gray data to black and white.
    */
  @js.native
  sealed trait ICAP_BITDEPTHREDUCTION extends EnumDWTCap
  /* 4396 */ val ICAP_BITDEPTHREDUCTION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BITDEPTHREDUCTION with Double = js.native
  
  /**
    * Specifies how the bytes in an image are filled by the Source. TWBO_MSBFIRST indicates that the leftmost bit in the byte (usually bit 7) is
    * the byte's Most Significant Bit.
    */
  @js.native
  sealed trait ICAP_BITORDER extends EnumDWTCap
  /* 4380 */ val ICAP_BITORDER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BITORDER with Double = js.native
  
  /** Used for CCITT data compression only. Indicates the bit order representation of the stored compressed codes. */
  @js.native
  sealed trait ICAP_BITORDERCODES extends EnumDWTCap
  /* 4390 */ val ICAP_BITORDERCODES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BITORDERCODES with Double = js.native
  
  /** The brightness values available within the Source. */
  @js.native
  sealed trait ICAP_BRIGHTNESS extends EnumDWTCap
  /* 4353 */ val ICAP_BRIGHTNESS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_BRIGHTNESS with Double = js.native
  
  /**
    * Used for CCITT Group 3 2-dimensional compression. The 'K' factor indicates how often the
    * new compression baseline should be re-established. A value of 2 or 4 is common in facsimile
    * communication. A value of zero in this field will indicate an infinite K factor—the baseline is
    * only calculated at the beginning of the transfer.
    */
  @js.native
  sealed trait ICAP_CCITTKFACTOR extends EnumDWTCap
  /* 4381 */ val ICAP_CCITTKFACTOR: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_CCITTKFACTOR with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_COLORMANAGEMENTENABLED extends EnumDWTCap
  /* 4443 */ val ICAP_COLORMANAGEMENTENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_COLORMANAGEMENTENABLED with Double = js.native
  
  /**
    * Allows the application and Source to identify which compression schemes they have in
    * common for Buffered Memory and File transfers.
    * Note for File transfers=
    * Since only certain file formats support compression, this capability must be negotiated after
    * setting the desired file format with ICAP_IMAGEFILEFORMAT.
    */
  @js.native
  sealed trait ICAP_COMPRESSION extends EnumDWTCap
  /* 256 */ val ICAP_COMPRESSION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_COMPRESSION with Double = js.native
  
  /** The contrast values available within the Source. */
  @js.native
  sealed trait ICAP_CONTRAST extends EnumDWTCap
  /* 4355 */ val ICAP_CONTRAST: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_CONTRAST with Double = js.native
  
  /** Specifies the square-cell halftone (dithering) matrix the Source should use to halftone the image. */
  @js.native
  sealed trait ICAP_CUSTHALFTONE extends EnumDWTCap
  /* 4356 */ val ICAP_CUSTHALFTONE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_CUSTHALFTONE with Double = js.native
  
  /** Specifies the exposure time used to capture the image, in seconds. */
  @js.native
  sealed trait ICAP_EXPOSURETIME extends EnumDWTCap
  /* 4357 */ val ICAP_EXPOSURETIME: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_EXPOSURETIME with Double = js.native
  
  /**
    * Allows the application to query the data source to see if it supports extended image attribute capabilities,
    * such as Barcode Recognition, Shaded Area Detection and Removal, Skew detection and Removal, and so on.
    */
  @js.native
  sealed trait ICAP_EXTIMAGEINFO extends EnumDWTCap
  /* 4399 */ val ICAP_EXTIMAGEINFO: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_EXTIMAGEINFO with Double = js.native
  
  /** Added 1.91   */
  @js.native
  sealed trait ICAP_FEEDERTYPE extends EnumDWTCap
  /* 4436 */ val ICAP_FEEDERTYPE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FEEDERTYPE with Double = js.native
  
  /**
    * Describes the color characteristic of the subtractive filter applied to the image data.
    * Multiple filters may be applied to a single acquisition.
    */
  @js.native
  sealed trait ICAP_FILTER extends EnumDWTCap
  /* 4358 */ val ICAP_FILTER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FILTER with Double = js.native
  
  /** Specifies whether or not the image was acquired using a flash. */
  @js.native
  sealed trait ICAP_FLASHUSED extends EnumDWTCap
  /* 4359 */ val ICAP_FLASHUSED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FLASHUSED with Double = js.native
  
  /**
    * For devices that support flash. CapSet() selects the flash to be used (if any). CapGet() reports the current setting.
    * This capability replaces ICAP_FLASHUSED, which is only able to negotiate the flash being on or off.
    */
  @js.native
  sealed trait ICAP_FLASHUSED2 extends EnumDWTCap
  /* 4422 */ val ICAP_FLASHUSED2: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FLASHUSED2 with Double = js.native
  
  /**
    * Flip rotation is used to properly orient images that flip orientation every other image.
    * TWFR_BOOK The images to be scanned are viewed in book form, flipping each page from left to right or right to left.
    * TWFR_FANFOLD The images to be scanned are viewed in fanfold paper style, flipping each page up or down.
    */
  @js.native
  sealed trait ICAP_FLIPROTATION extends EnumDWTCap
  /* 4406 */ val ICAP_FLIPROTATION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FLIPROTATION with Double = js.native
  
  /** The list of frames the Source will acquire on each page. */
  @js.native
  sealed trait ICAP_FRAMES extends EnumDWTCap
  /* 4372 */ val ICAP_FRAMES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_FRAMES with Double = js.native
  
  /** Gamma correction value for the image data. */
  @js.native
  sealed trait ICAP_GAMMA extends EnumDWTCap
  /* 4360 */ val ICAP_GAMMA: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_GAMMA with Double = js.native
  
  /** A list of names of the halftone patterns available within the Source. */
  @js.native
  sealed trait ICAP_HALFTONES extends EnumDWTCap
  /* 4361 */ val ICAP_HALFTONES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_HALFTONES with Double = js.native
  
  /**
    * Specifies which value in an image should be interpreted as the lightest "highlight." All values
    * "lighter" than this value will be clipped to this value. Whether lighter values are smaller or
    * larger can be determined by examining the Current value of ICAP_PIXELFLAVOR.
    */
  @js.native
  sealed trait ICAP_HIGHLIGHT extends EnumDWTCap
  /* 4362 */ val ICAP_HIGHLIGHT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_HIGHLIGHT with Double = js.native
  
  /** Added 1.91  */
  @js.native
  sealed trait ICAP_ICCPROFILE extends EnumDWTCap
  /* 4437 */ val ICAP_ICCPROFILE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_ICCPROFILE with Double = js.native
  
  /**
    * Informs the application which file formats the Source can generate (CapGet()). Tells the Source which file formats the application can handle (CapSet()).
    * TWFF_TIFF Used for document
    * TWFF_PICT Native Macintosh
    * TWFF_BMP Native Microsoft
    * TWFF_XBM Used for document
    * TWFF_JFIF Wrapper for JPEG
    * TWFF_FPX FlashPix, used with digital
    * TWFF_TIFFMULTI Multi-page TIFF files
    * TWFF_PNG An image format standard intended for use on the web, replaces GIF
    * TWFF_SPIFF A standard from JPEG, intended to replace JFIF, also supports JBIG
    * TWFF_EXIF File format for use with digital cameras.
    */
  @js.native
  sealed trait ICAP_IMAGEFILEFORMAT extends EnumDWTCap
  /* 4364 */ val ICAP_IMAGEFILEFORMAT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_IMAGEFILEFORMAT with Double = js.native
  
  /** For devices that support image enhancement filtering. This capability selects the algorithm used to improve the quality of the image. */
  @js.native
  sealed trait ICAP_IMAGEFILTER extends EnumDWTCap
  /* 4423 */ val ICAP_IMAGEFILTER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_IMAGEFILTER with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_IMAGEMERGE extends EnumDWTCap
  /* 4444 */ val ICAP_IMAGEMERGE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_IMAGEMERGE with Double = js.native
  
  /** Added 2.1  */
  @js.native
  sealed trait ICAP_IMAGEMERGEHEIGHTTHRESHOLD extends EnumDWTCap
  /* 4445 */ val ICAP_IMAGEMERGEHEIGHTTHRESHOLD: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_IMAGEMERGEHEIGHTTHRESHOLD with Double = js.native
  
  /**
    * Allows the application and Source to agree upon a common set of color descriptors that are
    * made available by the Source. This ICAP is only useful for JPEG-compressed buffered memory image transfers.
    */
  @js.native
  sealed trait ICAP_JPEGPIXELTYPE extends EnumDWTCap
  /* 4392 */ val ICAP_JPEGPIXELTYPE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_JPEGPIXELTYPE with Double = js.native
  
  /** Added 1.9  */
  @js.native
  sealed trait ICAP_JPEGQUALITY extends EnumDWTCap
  /* 4435 */ val ICAP_JPEGQUALITY: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_JPEGQUALITY with Double = js.native
  
  /** TRUE means the lamp is currently, or should be set to ON. Sources may not support CapSet() operations.  */
  @js.native
  sealed trait ICAP_LAMPSTATE extends EnumDWTCap
  /* 4365 */ val ICAP_LAMPSTATE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_LAMPSTATE with Double = js.native
  
  /** Describes whether the image was captured transmissively or reflectively. */
  @js.native
  sealed trait ICAP_LIGHTPATH extends EnumDWTCap
  /* 4382 */ val ICAP_LIGHTPATH: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_LIGHTPATH with Double = js.native
  
  /** Describes the general color characteristic of the light source used to acquire the image. */
  @js.native
  sealed trait ICAP_LIGHTSOURCE extends EnumDWTCap
  /* 4366 */ val ICAP_LIGHTSOURCE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_LIGHTSOURCE with Double = js.native
  
  /**
    * The maximum number of frames the Source can provide or the application can accept per page.
    * This is a bounding capability only. It does not establish current or future behavior.
    */
  @js.native
  sealed trait ICAP_MAXFRAMES extends EnumDWTCap
  /* 4378 */ val ICAP_MAXFRAMES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_MAXFRAMES with Double = js.native
  
  /** Allows the source to define the minimum height (Y-axis) that the source can acquire. */
  @js.native
  sealed trait ICAP_MINIMUMHEIGHT extends EnumDWTCap
  /* 4400 */ val ICAP_MINIMUMHEIGHT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_MINIMUMHEIGHT with Double = js.native
  
  /** Allows the source to define theminimum width (X-axis) that the source can acquire. */
  @js.native
  sealed trait ICAP_MINIMUMWIDTH extends EnumDWTCap
  /* 4401 */ val ICAP_MINIMUMWIDTH: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_MINIMUMWIDTH with Double = js.native
  
  /** For devices that support noise filtering. This capability selects the algorithm used to remove noise. */
  @js.native
  sealed trait ICAP_NOISEFILTER extends EnumDWTCap
  /* 4424 */ val ICAP_NOISEFILTER: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_NOISEFILTER with Double = js.native
  
  /**
    * Defines which edge of the "paper" the image's "top" is aligned with. This information is used to adjust the frames to match the
    * scanning orientation of the paper. For instance, if an ICAP_SUPPORTEDSIZE of TWSS_ISOA4 has been negotiated,
    * and ICAP_ORIENTATION is set to TWOR_LANDSCAPE, then the Source must rotate the frame it downloads to the scanner to reflect the
    * orientation of the paper. Please note that setting ICAP_ORIENTATION does not affect the values reported by ICAP_FRAMES;
    * it just causes the Source to use them in a different way. The upper-left of the image is defined as the location where both the primary and
    * secondary scans originate. (The X axis is the primary scan direction and the Y axis is the secondary scan direction.)
    * For a flatbed scanner, the light bar moves in the secondary scan direction. For a handheld scanner, the scanner is drug in the
    * secondary scan direction. For a digital camera, the secondary direction is the vertical axis when the viewed image is considered upright.
    */
  @js.native
  sealed trait ICAP_ORIENTATION extends EnumDWTCap
  /* 4368 */ val ICAP_ORIENTATION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_ORIENTATION with Double = js.native
  
  /**
    * Overscan is used to scan outside of the boundaries described by ICAP_FRAMES, and is used to help acquire image data that
    * may be lost because of skewing.
    * This is primarily of use for transport scanners which rely on edge detection to begin scanning.
    * If overscan is supported, then the device is capable of scanning in the inter-document gap to get the skewed image information.
    */
  @js.native
  sealed trait ICAP_OVERSCAN extends EnumDWTCap
  /* 4425 */ val ICAP_OVERSCAN: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_OVERSCAN with Double = js.native
  
  /** Turns patch code detection on and off. */
  @js.native
  sealed trait ICAP_PATCHCODEDETECTIONENABLED extends EnumDWTCap
  /* 4415 */ val ICAP_PATCHCODEDETECTIONENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODEDETECTIONENABLED with Double = js.native
  
  /** Restricts the number of times a search will be retried if none are found on each page. */
  @js.native
  sealed trait ICAP_PATCHCODEMAXRETRIES extends EnumDWTCap
  /* 4420 */ val ICAP_PATCHCODEMAXRETRIES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODEMAXRETRIES with Double = js.native
  
  /** The maximum number of supported search priorities. */
  @js.native
  sealed trait ICAP_PATCHCODEMAXSEARCHPRIORITIES extends EnumDWTCap
  /* 4417 */ val ICAP_PATCHCODEMAXSEARCHPRIORITIES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODEMAXSEARCHPRIORITIES with Double = js.native
  
  /** Restricts patch code searching to certain orientations, or prioritizes one orientation over the other. */
  @js.native
  sealed trait ICAP_PATCHCODESEARCHMODE extends EnumDWTCap
  /* 4419 */ val ICAP_PATCHCODESEARCHMODE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODESEARCHMODE with Double = js.native
  
  /** A prioritized list of patch code types dictating the order in which patch codes will be sought. */
  @js.native
  sealed trait ICAP_PATCHCODESEARCHPRIORITIES extends EnumDWTCap
  /* 4418 */ val ICAP_PATCHCODESEARCHPRIORITIES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODESEARCHPRIORITIES with Double = js.native
  
  /** Restricts the total time spent on searching for a patch code on each page. */
  @js.native
  sealed trait ICAP_PATCHCODETIMEOUT extends EnumDWTCap
  /* 4421 */ val ICAP_PATCHCODETIMEOUT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PATCHCODETIMEOUT with Double = js.native
  
  /** The maximum physical height (Y-axis) the Source can acquire (measured in units of ICAP_UNITS). */
  @js.native
  sealed trait ICAP_PHYSICALHEIGHT extends EnumDWTCap
  /* 4370 */ val ICAP_PHYSICALHEIGHT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PHYSICALHEIGHT with Double = js.native
  
  /** The maximum physical width (X-axis) the Source can acquire (measured in units of ICAP_UNITS). */
  @js.native
  sealed trait ICAP_PHYSICALWIDTH extends EnumDWTCap
  /* 4369 */ val ICAP_PHYSICALWIDTH: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PHYSICALWIDTH with Double = js.native
  
  /** Sense of the pixel whose numeric value is zero (minimum data value).  */
  @js.native
  sealed trait ICAP_PIXELFLAVOR extends EnumDWTCap
  /* 4383 */ val ICAP_PIXELFLAVOR: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PIXELFLAVOR with Double = js.native
  
  /**
    * Used only for CCITT data compression. Specifies whether the compressed codes' pixel "sense"
    * will be inverted from the Current value of ICAP_PIXELFLAVOR prior to transfer.
    */
  @js.native
  sealed trait ICAP_PIXELFLAVORCODES extends EnumDWTCap
  /* 4391 */ val ICAP_PIXELFLAVORCODES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PIXELFLAVORCODES with Double = js.native
  
  /** The type of pixel data that a Source is capable of acquiring (for example, black and white, gray, RGB, etc.). */
  @js.native
  sealed trait ICAP_PIXELTYPE extends EnumDWTCap
  /* 257 */ val ICAP_PIXELTYPE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PIXELTYPE with Double = js.native
  
  /**
    * Allows the application and Source to identify which color data formats are available. There are
    * two options, "planar" and "chunky."
    */
  @js.native
  sealed trait ICAP_PLANARCHUNKY extends EnumDWTCap
  /* 4384 */ val ICAP_PLANARCHUNKY: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_PLANARCHUNKY with Double = js.native
  
  /**
    * How the Source can/should rotate the scanned image data prior to transfer. This doesn't use
    * ICAP_UNITS. It is always measured in degrees. Any applied value is additive with any
    * rotation specified in ICAP_ORIENTATION.
    */
  @js.native
  sealed trait ICAP_ROTATION extends EnumDWTCap
  /* 4385 */ val ICAP_ROTATION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_ROTATION with Double = js.native
  
  /**
    * Specifies which value in an image should be interpreted as the darkest "shadow." All values
    * "darker" than this value will be clipped to this value.
    */
  @js.native
  sealed trait ICAP_SHADOW extends EnumDWTCap
  /* 4371 */ val ICAP_SHADOW: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SHADOW with Double = js.native
  
  /** Provides a list of bar code types that can be detected by the current Data Source. */
  @js.native
  sealed trait ICAP_SUPPORTEDBARCODETYPES extends EnumDWTCap
  /* 4408 */ val ICAP_SUPPORTEDBARCODETYPES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SUPPORTEDBARCODETYPES with Double = js.native
  
  /** Added 2.1   */
  @js.native
  sealed trait ICAP_SUPPORTEDEXTIMAGEINFO extends EnumDWTCap
  /* 4446 */ val ICAP_SUPPORTEDEXTIMAGEINFO: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SUPPORTEDEXTIMAGEINFO with Double = js.native
  
  /** A list of patch code types that may be detected by the current Data Source. */
  @js.native
  sealed trait ICAP_SUPPORTEDPATCHCODETYPES extends EnumDWTCap
  /* 4416 */ val ICAP_SUPPORTEDPATCHCODETYPES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SUPPORTEDPATCHCODETYPES with Double = js.native
  
  /**
    * For devices that support fixed frame sizes.
    * Defined sizes match typical page sizes. This specifies the size(s) the Source can/should use to acquire image data.
    */
  @js.native
  sealed trait ICAP_SUPPORTEDSIZES extends EnumDWTCap
  /* 4386 */ val ICAP_SUPPORTEDSIZES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_SUPPORTEDSIZES with Double = js.native
  
  /**
    * Specifies the dividing line between black and white. This is the value the Source will use to
    * threshold, if needed, when ICAP_PIXELTYPE=TWPT_BW.
    * The value is normalized so there are no units of measure associated with this ICAP.
    */
  @js.native
  sealed trait ICAP_THRESHOLD extends EnumDWTCap
  /* 4387 */ val ICAP_THRESHOLD: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_THRESHOLD with Double = js.native
  
  /** This is used with buffered memory transfers. If TRUE, Source can provide application with tiled image data. */
  @js.native
  sealed trait ICAP_TILES extends EnumDWTCap
  /* 4379 */ val ICAP_TILES: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_TILES with Double = js.native
  
  /** Used only with CCITT data compression. Specifies the minimum number of words of compressed codes (compressed data) to be transmitted per line. */
  @js.native
  sealed trait ICAP_TIMEFILL extends EnumDWTCap
  /* 4394 */ val ICAP_TIMEFILL: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_TIMEFILL with Double = js.native
  
  /**
    * If TRUE the Source will issue a MSG_XFERREADY before starting the scan.
    * Note= The Source may need to scan the image before initiating the transfer.
    * This is the case if the scanned image is rotated or merged with another scanned image.
    */
  @js.native
  sealed trait ICAP_UNDEFINEDIMAGESIZE extends EnumDWTCap
  /* 4397 */ val ICAP_UNDEFINEDIMAGESIZE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_UNDEFINEDIMAGESIZE with Double = js.native
  
  /**
    * Unless a quantity is dimensionless or uses a specified unit of measure, ICAP_UNITS determines
    * the unit of measure for all quantities.
    */
  @js.native
  sealed trait ICAP_UNITS extends EnumDWTCap
  /* 258 */ val ICAP_UNITS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_UNITS with Double = js.native
  
  /** Allows the application and Source to identify which transfer mechanisms the source supports. */
  @js.native
  sealed trait ICAP_XFERMECH extends EnumDWTCap
  /* 259 */ val ICAP_XFERMECH: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_XFERMECH with Double = js.native
  
  /**
    * The native optical resolution along the X-axis of the device being controlled by the Source. Most
    * devices will respond with a single value (TW_ONEVALUE).
    * This is NOT a list of all resolutions that can be generated by the device. Rather, this is the
    * resolution of the device's optics. Measured in units of pixels per unit as defined by
    * ICAP_UNITS (pixels per TWUN_PIXELS yields dimensionless data).
    */
  @js.native
  sealed trait ICAP_XNATIVERESOLUTION extends EnumDWTCap
  /* 4374 */ val ICAP_XNATIVERESOLUTION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_XNATIVERESOLUTION with Double = js.native
  
  /**
    * All the X-axis resolutions the Source can provide.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data). That is, when the units are TWUN_PIXELS, both
    * ICAP_XRESOLUTION and ICAP_YRESOLUTION shall report 1 pixel/pixel. Some data sources
    * like to report the actual number of pixels that the device reports, but that response is more
    * appropriate in ICAP_PHYSICALHEIGHT and ICAP_PHYSICALWIDTH.
    */
  @js.native
  sealed trait ICAP_XRESOLUTION extends EnumDWTCap
  /* 4376 */ val ICAP_XRESOLUTION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_XRESOLUTION with Double = js.native
  
  /**
    * All the X-axis scaling values available. A value of '1.0' is equivalent to 100% scaling.
    * Do not use values less than or equal to zero.
    */
  @js.native
  sealed trait ICAP_XSCALING extends EnumDWTCap
  /* 4388 */ val ICAP_XSCALING: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_XSCALING with Double = js.native
  
  /**
    * The native optical resolution along the Y-axis of the device being controlled by the Source.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data).
    */
  @js.native
  sealed trait ICAP_YNATIVERESOLUTION extends EnumDWTCap
  /* 4375 */ val ICAP_YNATIVERESOLUTION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_YNATIVERESOLUTION with Double = js.native
  
  /**
    * All the Y-axis resolutions the Source can provide.
    * Measured in units of pixels per unit as defined by ICAP_UNITS (pixels per TWUN_PIXELS
    * yields dimensionless data). That is, when the units are TWUN_PIXELS, both
    * ICAP_XRESOLUTION and ICAP_YRESOLUTION shall report 1 pixel/pixel. Some data sources
    * like to report the actual number of pixels that the device reports, but that response is more
    * appropriate in ICAP_PHYSICALHEIGHT and ICAP_PHYSICALWIDTH.
    */
  @js.native
  sealed trait ICAP_YRESOLUTION extends EnumDWTCap
  /* 4377 */ val ICAP_YRESOLUTION: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_YRESOLUTION with Double = js.native
  
  /**
    * All the Y-axis scaling values available. A value of '1.0' is equivalent to 100% scaling. Do not use values less than or equal to zero.
    * There are no units inherent with this data as it is normalized to 1.0 being "unscaled."
    */
  @js.native
  sealed trait ICAP_YSCALING extends EnumDWTCap
  /* 4389 */ val ICAP_YSCALING: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_YSCALING with Double = js.native
  
  /** When used with CapGet(), returns all camera supported lens zooming range.  */
  @js.native
  sealed trait ICAP_ZOOMFACTOR extends EnumDWTCap
  /* 4414 */ val ICAP_ZOOMFACTOR: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCap.ICAP_ZOOMFACTOR with Double = js.native
}
