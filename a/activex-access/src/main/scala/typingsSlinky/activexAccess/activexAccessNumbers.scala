package typingsSlinky.activexAccess

import typingsSlinky.activexAccess.AccWizObjects.WIZ_CSIDL_FLAGS
import typingsSlinky.activexAccess.AccWizObjects.WIZ_SLGP_FLAGS
import typingsSlinky.activexAccess.AccWizObjects.WIZ_SLR_FLAGS
import typingsSlinky.activexAccess.AccWizObjects.WIZ_SW_FLAGS
import typingsSlinky.activexAccess.Access.AcBrowseToObjectType
import typingsSlinky.activexAccess.Access.AcCloseSave
import typingsSlinky.activexAccess.Access.AcColorIndex
import typingsSlinky.activexAccess.Access.AcCommand
import typingsSlinky.activexAccess.Access.AcControlType
import typingsSlinky.activexAccess.Access.AcCurrentView
import typingsSlinky.activexAccess.Access.AcCursorOnHover
import typingsSlinky.activexAccess.Access.AcDataAccessPageView
import typingsSlinky.activexAccess.Access.AcDataObjectType
import typingsSlinky.activexAccess.Access.AcDataTransferType
import typingsSlinky.activexAccess.Access.AcDefReportView
import typingsSlinky.activexAccess.Access.AcDefView
import typingsSlinky.activexAccess.Access.AcDisplayAs
import typingsSlinky.activexAccess.Access.AcDisplayAsHyperlink
import typingsSlinky.activexAccess.Access.AcExportQuality
import typingsSlinky.activexAccess.Access.AcExportXMLEncoding
import typingsSlinky.activexAccess.Access.AcExportXMLObjectType
import typingsSlinky.activexAccess.Access.AcExportXMLOtherFlags
import typingsSlinky.activexAccess.Access.AcExportXMLSchemaFormat
import typingsSlinky.activexAccess.Access.AcFileFormat
import typingsSlinky.activexAccess.Access.AcFilterType
import typingsSlinky.activexAccess.Access.AcFindField
import typingsSlinky.activexAccess.Access.AcFindMatch
import typingsSlinky.activexAccess.Access.AcFormOpenDataMode
import typingsSlinky.activexAccess.Access.AcFormSection
import typingsSlinky.activexAccess.Access.AcFormView
import typingsSlinky.activexAccess.Access.AcFormatBarLimits
import typingsSlinky.activexAccess.Access.AcFormatConditionOperator
import typingsSlinky.activexAccess.Access.AcFormatConditionType
import typingsSlinky.activexAccess.Access.AcHorizontalAnchor
import typingsSlinky.activexAccess.Access.AcHyperlinkPart
import typingsSlinky.activexAccess.Access.AcImeMode
import typingsSlinky.activexAccess.Access.AcImeSentenceMode
import typingsSlinky.activexAccess.Access.AcImportXMLOption
import typingsSlinky.activexAccess.Access.AcLayoutType
import typingsSlinky.activexAccess.Access.AcModuleType
import typingsSlinky.activexAccess.Access.AcNavigationSpan
import typingsSlinky.activexAccess.Access.AcNewDatabaseFormat
import typingsSlinky.activexAccess.Access.AcObjectType
import typingsSlinky.activexAccess.Access.AcOpenDataMode
import typingsSlinky.activexAccess.Access.AcOutputObjectType
import typingsSlinky.activexAccess.Access.AcPictureCaptionArrangement
import typingsSlinky.activexAccess.Access.AcPrintColor
import typingsSlinky.activexAccess.Access.AcPrintDuplex
import typingsSlinky.activexAccess.Access.AcPrintItemLayout
import typingsSlinky.activexAccess.Access.AcPrintObjQuality
import typingsSlinky.activexAccess.Access.AcPrintOrientation
import typingsSlinky.activexAccess.Access.AcPrintPaperBin
import typingsSlinky.activexAccess.Access.AcPrintPaperSize
import typingsSlinky.activexAccess.Access.AcPrintQuality
import typingsSlinky.activexAccess.Access.AcPrintRange
import typingsSlinky.activexAccess.Access.AcProjectType
import typingsSlinky.activexAccess.Access.AcProperty
import typingsSlinky.activexAccess.Access.AcQuitOption
import typingsSlinky.activexAccess.Access.AcRecord
import typingsSlinky.activexAccess.Access.AcReportSection
import typingsSlinky.activexAccess.Access.AcResourceType
import typingsSlinky.activexAccess.Access.AcSearchDirection
import typingsSlinky.activexAccess.Access.AcSendObjectType
import typingsSlinky.activexAccess.Access.AcSeparatorCharacters
import typingsSlinky.activexAccess.Access.AcSetMenuItemState
import typingsSlinky.activexAccess.Access.AcSharePointListTransferType
import typingsSlinky.activexAccess.Access.AcShowToolbar
import typingsSlinky.activexAccess.Access.AcSplitFormDatasheet
import typingsSlinky.activexAccess.Access.AcSplitFormOrientation
import typingsSlinky.activexAccess.Access.AcSplitFormPrinting
import typingsSlinky.activexAccess.Access.AcSpreadSheetType
import typingsSlinky.activexAccess.Access.AcSysCmdAction
import typingsSlinky.activexAccess.Access.AcTextFormat
import typingsSlinky.activexAccess.Access.AcTextTransferType
import typingsSlinky.activexAccess.Access.AcTransformXMLScriptOption
import typingsSlinky.activexAccess.Access.AcVerticalAnchor
import typingsSlinky.activexAccess.Access.AcView
import typingsSlinky.activexAccess.Access.AcWebBrowserScrollBars
import typingsSlinky.activexAccess.Access.AcWebBrowserState
import typingsSlinky.activexAccess.Access.AcWebUserDisplay
import typingsSlinky.activexAccess.Access.AcWebUserGroupsDisplay
import typingsSlinky.activexAccess.Access.AcWindowMode
import typingsSlinky.activexAccess.Access.Constants
import typingsSlinky.activexAccess.Access.OldConstants
import typingsSlinky.activexAccess.Access.ProcKind
import typingsSlinky.activexAccess.Access.RefKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activexAccessNumbers {
  
  @js.native
  sealed trait `-1`
    extends AcDataObjectType
       with AcFindField
       with AcFormOpenDataMode
       with AcObjectType
       with AcPrintObjQuality
       with AcSendObjectType
       with Constants
       with OldConstants
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  
  @js.native
  sealed trait `-2`
    extends AcPrintObjQuality
       with Constants
  @scala.inline
  def `-2`: `-2` = -2.asInstanceOf[`-2`]
  
  @js.native
  sealed trait `-2147483646` extends OldConstants
  @scala.inline
  def `-2147483646`: `-2147483646` = -2147483646.asInstanceOf[`-2147483646`]
  
  @js.native
  sealed trait `-3`
    extends AcPrintObjQuality
       with Constants
  @scala.inline
  def `-3`: `-3` = -3.asInstanceOf[`-3`]
  
  @js.native
  sealed trait `-4`
    extends AcPrintObjQuality
       with Constants
  @scala.inline
  def `-4`: `-4` = -4.asInstanceOf[`-4`]
  
  @js.native
  sealed trait `-5` extends Constants
  @scala.inline
  def `-5`: `-5` = -5.asInstanceOf[`-5`]
  
  @js.native
  sealed trait `0`
    extends AcCloseSave
       with AcColorIndex
       with AcCurrentView
       with AcCursorOnHover
       with AcDataAccessPageView
       with AcDataObjectType
       with AcDataTransferType
       with AcDefReportView
       with AcDefView
       with AcDisplayAs
       with AcDisplayAsHyperlink
       with AcExportQuality
       with AcExportXMLEncoding
       with AcExportXMLObjectType
       with AcExportXMLSchemaFormat
       with AcFilterType
       with AcFindField
       with AcFindMatch
       with AcFormOpenDataMode
       with AcFormSection
       with AcFormView
       with AcFormatBarLimits
       with AcFormatConditionOperator
       with AcFormatConditionType
       with AcHorizontalAnchor
       with AcHyperlinkPart
       with AcImeMode
       with AcImeSentenceMode
       with AcImportXMLOption
       with AcLayoutType
       with AcModuleType
       with AcNavigationSpan
       with AcNewDatabaseFormat
       with AcObjectType
       with AcOpenDataMode
       with AcOutputObjectType
       with AcPictureCaptionArrangement
       with AcPrintQuality
       with AcPrintRange
       with AcProjectType
       with AcProperty
       with AcQuitOption
       with AcRecord
       with AcReportSection
       with AcResourceType
       with AcSearchDirection
       with AcSendObjectType
       with AcSeparatorCharacters
       with AcSetMenuItemState
       with AcSharePointListTransferType
       with AcShowToolbar
       with AcSplitFormDatasheet
       with AcSplitFormOrientation
       with AcSplitFormPrinting
       with AcSpreadSheetType
       with AcTextFormat
       with AcTextTransferType
       with AcTransformXMLScriptOption
       with AcVerticalAnchor
       with AcView
       with AcWebBrowserScrollBars
       with AcWebBrowserState
       with AcWebUserDisplay
       with AcWebUserGroupsDisplay
       with AcWindowMode
       with Constants
       with OldConstants
       with ProcKind
       with RefKind
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  
  @js.native
  sealed trait `1`
    extends AcCloseSave
       with AcColorIndex
       with AcCommand
       with AcCurrentView
       with AcCursorOnHover
       with AcDataAccessPageView
       with AcDataObjectType
       with AcDataTransferType
       with AcDefReportView
       with AcDefView
       with AcDisplayAs
       with AcDisplayAsHyperlink
       with AcExportQuality
       with AcExportXMLEncoding
       with AcExportXMLObjectType
       with AcExportXMLOtherFlags
       with AcExportXMLSchemaFormat
       with AcFilterType
       with AcFindMatch
       with AcFormOpenDataMode
       with AcFormSection
       with AcFormView
       with AcFormatBarLimits
       with AcFormatConditionOperator
       with AcFormatConditionType
       with AcHorizontalAnchor
       with AcHyperlinkPart
       with AcImeMode
       with AcImeSentenceMode
       with AcImportXMLOption
       with AcLayoutType
       with AcModuleType
       with AcNavigationSpan
       with AcObjectType
       with AcOpenDataMode
       with AcOutputObjectType
       with AcPictureCaptionArrangement
       with AcPrintColor
       with AcPrintDuplex
       with AcPrintOrientation
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcPrintQuality
       with AcPrintRange
       with AcProjectType
       with AcProperty
       with AcQuitOption
       with AcRecord
       with AcReportSection
       with AcResourceType
       with AcSearchDirection
       with AcSendObjectType
       with AcSeparatorCharacters
       with AcSetMenuItemState
       with AcSharePointListTransferType
       with AcShowToolbar
       with AcSplitFormDatasheet
       with AcSplitFormOrientation
       with AcSplitFormPrinting
       with AcSysCmdAction
       with AcTextFormat
       with AcTextTransferType
       with AcTransformXMLScriptOption
       with AcVerticalAnchor
       with AcView
       with AcWebBrowserScrollBars
       with AcWebBrowserState
       with AcWebUserDisplay
       with AcWebUserGroupsDisplay
       with AcWindowMode
       with Constants
       with OldConstants
       with ProcKind
       with RefKind
       with WIZ_SLGP_FLAGS
       with WIZ_SLR_FLAGS
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  
  @js.native
  sealed trait `10`
    extends AcColorIndex
       with AcCommand
       with AcDataObjectType
       with AcExportXMLObjectType
       with AcFileFormat
       with AcImeMode
       with AcNewDatabaseFormat
       with AcObjectType
       with AcOutputObjectType
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcProperty
       with AcSpreadSheetType
       with AcSysCmdAction
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `10`: `10` = 10.asInstanceOf[`10`]
  
  @js.native
  sealed trait `100`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `100`: `100` = 100.asInstanceOf[`100`]
  
  @js.native
  sealed trait `101`
    extends AcControlType
       with Constants
  @scala.inline
  def `101`: `101` = 101.asInstanceOf[`101`]
  
  @js.native
  sealed trait `102`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `102`: `102` = 102.asInstanceOf[`102`]
  
  @js.native
  sealed trait `103`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `103`: `103` = 103.asInstanceOf[`103`]
  
  @js.native
  sealed trait `104`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `104`: `104` = 104.asInstanceOf[`104`]
  
  @js.native
  sealed trait `1048575` extends OldConstants
  @scala.inline
  def `1048575`: `1048575` = 1048575.asInstanceOf[`1048575`]
  
  @js.native
  sealed trait `105`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `105`: `105` = 105.asInstanceOf[`105`]
  
  @js.native
  sealed trait `106`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `106`: `106` = 106.asInstanceOf[`106`]
  
  @js.native
  sealed trait `107`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `107`: `107` = 107.asInstanceOf[`107`]
  
  @js.native
  sealed trait `1073741824` extends OldConstants
  @scala.inline
  def `1073741824`: `1073741824` = 1073741824.asInstanceOf[`1073741824`]
  
  @js.native
  sealed trait `108`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `108`: `108` = 108.asInstanceOf[`108`]
  
  @js.native
  sealed trait `109`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `109`: `109` = 109.asInstanceOf[`109`]
  
  @js.native
  sealed trait `11`
    extends AcColorIndex
       with AcCommand
       with AcObjectType
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcSysCmdAction
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `11`: `11` = 11.asInstanceOf[`11`]
  
  @js.native
  sealed trait `110`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `110`: `110` = 110.asInstanceOf[`110`]
  
  @js.native
  sealed trait `111`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `111`: `111` = 111.asInstanceOf[`111`]
  
  @js.native
  sealed trait `112`
    extends AcCommand
       with AcControlType
       with Constants
       with OldConstants
  @scala.inline
  def `112`: `112` = 112.asInstanceOf[`112`]
  
  @js.native
  sealed trait `113`
    extends AcCommand
       with Constants
  @scala.inline
  def `113`: `113` = 113.asInstanceOf[`113`]
  
  @js.native
  sealed trait `114`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `114`: `114` = 114.asInstanceOf[`114`]
  
  @js.native
  sealed trait `115`
    extends AcCommand
       with Constants
  @scala.inline
  def `115`: `115` = 115.asInstanceOf[`115`]
  
  @js.native
  sealed trait `116`
    extends AcCommand
       with Constants
  @scala.inline
  def `116`: `116` = 116.asInstanceOf[`116`]
  
  @js.native
  sealed trait `117`
    extends AcCommand
       with Constants
  @scala.inline
  def `117`: `117` = 117.asInstanceOf[`117`]
  
  @js.native
  sealed trait `118`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `118`: `118` = 118.asInstanceOf[`118`]
  
  @js.native
  sealed trait `119`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `119`: `119` = 119.asInstanceOf[`119`]
  
  @js.native
  sealed trait `12`
    extends AcColorIndex
       with AcCommand
       with AcFileFormat
       with AcNewDatabaseFormat
       with AcObjectType
       with AcPrintPaperSize
       with AcSysCmdAction
       with Constants
       with OldConstants
  @scala.inline
  def `12`: `12` = 12.asInstanceOf[`12`]
  
  @js.native
  sealed trait `120`
    extends AcCommand
       with Constants
  @scala.inline
  def `120`: `120` = 120.asInstanceOf[`120`]
  
  @js.native
  sealed trait `121`
    extends AcCommand
       with Constants
  @scala.inline
  def `121`: `121` = 121.asInstanceOf[`121`]
  
  @js.native
  sealed trait `122`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `122`: `122` = 122.asInstanceOf[`122`]
  
  @js.native
  sealed trait `123`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `123`: `123` = 123.asInstanceOf[`123`]
  
  @js.native
  sealed trait `124`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `124`: `124` = 124.asInstanceOf[`124`]
  
  @js.native
  sealed trait `125`
    extends AcCommand
       with Constants
  @scala.inline
  def `125`: `125` = 125.asInstanceOf[`125`]
  
  @js.native
  sealed trait `126`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `126`: `126` = 126.asInstanceOf[`126`]
  
  @js.native
  sealed trait `127`
    extends AcCommand
       with AcControlType
       with Constants
  @scala.inline
  def `127`: `127` = 127.asInstanceOf[`127`]
  
  @js.native
  sealed trait `128`
    extends AcCommand
       with AcControlType
       with OldConstants
  @scala.inline
  def `128`: `128` = 128.asInstanceOf[`128`]
  
  @js.native
  sealed trait `129`
    extends AcCommand
       with AcControlType
  @scala.inline
  def `129`: `129` = 129.asInstanceOf[`129`]
  
  @js.native
  sealed trait `13`
    extends AcColorIndex
       with AcCommand
       with AcPrintPaperSize
       with AcSysCmdAction
       with Constants
  @scala.inline
  def `13`: `13` = 13.asInstanceOf[`13`]
  
  @js.native
  sealed trait `130`
    extends AcCommand
       with AcControlType
  @scala.inline
  def `130`: `130` = 130.asInstanceOf[`130`]
  
  @js.native
  sealed trait `131` extends AcCommand
  @scala.inline
  def `131`: `131` = 131.asInstanceOf[`131`]
  
  @js.native
  sealed trait `131072` extends OldConstants
  @scala.inline
  def `131072`: `131072` = 131072.asInstanceOf[`131072`]
  
  @js.native
  sealed trait `132` extends AcCommand
  @scala.inline
  def `132`: `132` = 132.asInstanceOf[`132`]
  
  @js.native
  sealed trait `133` extends AcCommand
  @scala.inline
  def `133`: `133` = 133.asInstanceOf[`133`]
  
  @js.native
  sealed trait `134` extends AcCommand
  @scala.inline
  def `134`: `134` = 134.asInstanceOf[`134`]
  
  @js.native
  sealed trait `135` extends AcCommand
  @scala.inline
  def `135`: `135` = 135.asInstanceOf[`135`]
  
  @js.native
  sealed trait `136` extends AcCommand
  @scala.inline
  def `136`: `136` = 136.asInstanceOf[`136`]
  
  @js.native
  sealed trait `137` extends AcCommand
  @scala.inline
  def `137`: `137` = 137.asInstanceOf[`137`]
  
  @js.native
  sealed trait `138` extends AcCommand
  @scala.inline
  def `138`: `138` = 138.asInstanceOf[`138`]
  
  @js.native
  sealed trait `139` extends AcCommand
  @scala.inline
  def `139`: `139` = 139.asInstanceOf[`139`]
  
  @js.native
  sealed trait `14`
    extends AcColorIndex
       with AcCommand
       with AcPrintPaperBin
       with AcPrintPaperSize
       with Constants
       with OldConstants
  @scala.inline
  def `14`: `14` = 14.asInstanceOf[`14`]
  
  @js.native
  sealed trait `140` extends AcCommand
  @scala.inline
  def `140`: `140` = 140.asInstanceOf[`140`]
  
  @js.native
  sealed trait `141` extends AcCommand
  @scala.inline
  def `141`: `141` = 141.asInstanceOf[`141`]
  
  @js.native
  sealed trait `142` extends AcCommand
  @scala.inline
  def `142`: `142` = 142.asInstanceOf[`142`]
  
  @js.native
  sealed trait `143` extends AcCommand
  @scala.inline
  def `143`: `143` = 143.asInstanceOf[`143`]
  
  @js.native
  sealed trait `144`
    extends AcCommand
       with Constants
       with OldConstants
  @scala.inline
  def `144`: `144` = 144.asInstanceOf[`144`]
  
  @js.native
  sealed trait `145` extends AcCommand
  @scala.inline
  def `145`: `145` = 145.asInstanceOf[`145`]
  
  @js.native
  sealed trait `146` extends AcCommand
  @scala.inline
  def `146`: `146` = 146.asInstanceOf[`146`]
  
  @js.native
  sealed trait `147` extends AcCommand
  @scala.inline
  def `147`: `147` = 147.asInstanceOf[`147`]
  
  @js.native
  sealed trait `148` extends AcCommand
  @scala.inline
  def `148`: `148` = 148.asInstanceOf[`148`]
  
  @js.native
  sealed trait `149` extends AcCommand
  @scala.inline
  def `149`: `149` = 149.asInstanceOf[`149`]
  
  @js.native
  sealed trait `15`
    extends AcColorIndex
       with AcCommand
       with AcPrintPaperBin
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `15`: `15` = 15.asInstanceOf[`15`]
  
  @js.native
  sealed trait `150` extends AcCommand
  @scala.inline
  def `150`: `150` = 150.asInstanceOf[`150`]
  
  @js.native
  sealed trait `151` extends AcCommand
  @scala.inline
  def `151`: `151` = 151.asInstanceOf[`151`]
  
  @js.native
  sealed trait `152` extends AcCommand
  @scala.inline
  def `152`: `152` = 152.asInstanceOf[`152`]
  
  @js.native
  sealed trait `153` extends AcCommand
  @scala.inline
  def `153`: `153` = 153.asInstanceOf[`153`]
  
  @js.native
  sealed trait `154` extends AcCommand
  @scala.inline
  def `154`: `154` = 154.asInstanceOf[`154`]
  
  @js.native
  sealed trait `155` extends AcCommand
  @scala.inline
  def `155`: `155` = 155.asInstanceOf[`155`]
  
  @js.native
  sealed trait `156` extends AcCommand
  @scala.inline
  def `156`: `156` = 156.asInstanceOf[`156`]
  
  @js.native
  sealed trait `157` extends AcCommand
  @scala.inline
  def `157`: `157` = 157.asInstanceOf[`157`]
  
  @js.native
  sealed trait `158` extends AcCommand
  @scala.inline
  def `158`: `158` = 158.asInstanceOf[`158`]
  
  @js.native
  sealed trait `159` extends AcCommand
  @scala.inline
  def `159`: `159` = 159.asInstanceOf[`159`]
  
  @js.native
  sealed trait `16`
    extends AcCommand
       with AcExportXMLOtherFlags
       with AcPrintPaperSize
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `16`: `16` = 16.asInstanceOf[`16`]
  
  @js.native
  sealed trait `160` extends AcCommand
  @scala.inline
  def `160`: `160` = 160.asInstanceOf[`160`]
  
  @js.native
  sealed trait `161` extends AcCommand
  @scala.inline
  def `161`: `161` = 161.asInstanceOf[`161`]
  
  @js.native
  sealed trait `162` extends AcCommand
  @scala.inline
  def `162`: `162` = 162.asInstanceOf[`162`]
  
  @js.native
  sealed trait `163` extends AcCommand
  @scala.inline
  def `163`: `163` = 163.asInstanceOf[`163`]
  
  @js.native
  sealed trait `164` extends AcCommand
  @scala.inline
  def `164`: `164` = 164.asInstanceOf[`164`]
  
  @js.native
  sealed trait `165` extends AcCommand
  @scala.inline
  def `165`: `165` = 165.asInstanceOf[`165`]
  
  @js.native
  sealed trait `167` extends AcCommand
  @scala.inline
  def `167`: `167` = 167.asInstanceOf[`167`]
  
  @js.native
  sealed trait `16777216` extends OldConstants
  @scala.inline
  def `16777216`: `16777216` = 16777216.asInstanceOf[`16777216`]
  
  @js.native
  sealed trait `168` extends AcCommand
  @scala.inline
  def `168`: `168` = 168.asInstanceOf[`168`]
  
  @js.native
  sealed trait `169` extends AcCommand
  @scala.inline
  def `169`: `169` = 169.asInstanceOf[`169`]
  
  @js.native
  sealed trait `17`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `17`: `17` = 17.asInstanceOf[`17`]
  
  @js.native
  sealed trait `170` extends AcCommand
  @scala.inline
  def `170`: `170` = 170.asInstanceOf[`170`]
  
  @js.native
  sealed trait `171` extends AcCommand
  @scala.inline
  def `171`: `171` = 171.asInstanceOf[`171`]
  
  @js.native
  sealed trait `172` extends AcCommand
  @scala.inline
  def `172`: `172` = 172.asInstanceOf[`172`]
  
  @js.native
  sealed trait `173` extends AcCommand
  @scala.inline
  def `173`: `173` = 173.asInstanceOf[`173`]
  
  @js.native
  sealed trait `175` extends AcCommand
  @scala.inline
  def `175`: `175` = 175.asInstanceOf[`175`]
  
  @js.native
  sealed trait `176` extends AcCommand
  @scala.inline
  def `176`: `176` = 176.asInstanceOf[`176`]
  
  @js.native
  sealed trait `177` extends AcCommand
  @scala.inline
  def `177`: `177` = 177.asInstanceOf[`177`]
  
  @js.native
  sealed trait `178` extends AcCommand
  @scala.inline
  def `178`: `178` = 178.asInstanceOf[`178`]
  
  @js.native
  sealed trait `179` extends AcCommand
  @scala.inline
  def `179`: `179` = 179.asInstanceOf[`179`]
  
  @js.native
  sealed trait `18`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `18`: `18` = 18.asInstanceOf[`18`]
  
  @js.native
  sealed trait `180` extends AcCommand
  @scala.inline
  def `180`: `180` = 180.asInstanceOf[`180`]
  
  @js.native
  sealed trait `181` extends AcCommand
  @scala.inline
  def `181`: `181` = 181.asInstanceOf[`181`]
  
  @js.native
  sealed trait `182` extends AcCommand
  @scala.inline
  def `182`: `182` = 182.asInstanceOf[`182`]
  
  @js.native
  sealed trait `183` extends AcCommand
  @scala.inline
  def `183`: `183` = 183.asInstanceOf[`183`]
  
  @js.native
  sealed trait `184` extends AcCommand
  @scala.inline
  def `184`: `184` = 184.asInstanceOf[`184`]
  
  @js.native
  sealed trait `185` extends AcCommand
  @scala.inline
  def `185`: `185` = 185.asInstanceOf[`185`]
  
  @js.native
  sealed trait `186` extends AcCommand
  @scala.inline
  def `186`: `186` = 186.asInstanceOf[`186`]
  
  @js.native
  sealed trait `187` extends AcCommand
  @scala.inline
  def `187`: `187` = 187.asInstanceOf[`187`]
  
  @js.native
  sealed trait `188` extends AcCommand
  @scala.inline
  def `188`: `188` = 188.asInstanceOf[`188`]
  
  @js.native
  sealed trait `189` extends AcCommand
  @scala.inline
  def `189`: `189` = 189.asInstanceOf[`189`]
  
  @js.native
  sealed trait `19`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `19`: `19` = 19.asInstanceOf[`19`]
  
  @js.native
  sealed trait `190` extends AcCommand
  @scala.inline
  def `190`: `190` = 190.asInstanceOf[`190`]
  
  @js.native
  sealed trait `191` extends AcCommand
  @scala.inline
  def `191`: `191` = 191.asInstanceOf[`191`]
  
  @js.native
  sealed trait `192` extends AcCommand
  @scala.inline
  def `192`: `192` = 192.asInstanceOf[`192`]
  
  @js.native
  sealed trait `193` extends AcCommand
  @scala.inline
  def `193`: `193` = 193.asInstanceOf[`193`]
  
  @js.native
  sealed trait `194` extends AcCommand
  @scala.inline
  def `194`: `194` = 194.asInstanceOf[`194`]
  
  @js.native
  sealed trait `195` extends AcCommand
  @scala.inline
  def `195`: `195` = 195.asInstanceOf[`195`]
  
  @js.native
  sealed trait `1953` extends AcPrintItemLayout
  @scala.inline
  def `1953`: `1953` = 1953.asInstanceOf[`1953`]
  
  @js.native
  sealed trait `1954` extends AcPrintItemLayout
  @scala.inline
  def `1954`: `1954` = 1954.asInstanceOf[`1954`]
  
  @js.native
  sealed trait `196` extends AcCommand
  @scala.inline
  def `196`: `196` = 196.asInstanceOf[`196`]
  
  @js.native
  sealed trait `197` extends AcCommand
  @scala.inline
  def `197`: `197` = 197.asInstanceOf[`197`]
  
  @js.native
  sealed trait `198` extends AcCommand
  @scala.inline
  def `198`: `198` = 198.asInstanceOf[`198`]
  
  @js.native
  sealed trait `199` extends AcCommand
  @scala.inline
  def `199`: `199` = 199.asInstanceOf[`199`]
  
  @js.native
  sealed trait `2`
    extends AcBrowseToObjectType
       with AcCloseSave
       with AcColorIndex
       with AcCommand
       with AcCurrentView
       with AcDataObjectType
       with AcDataTransferType
       with AcDefView
       with AcDisplayAs
       with AcDisplayAsHyperlink
       with AcExportXMLObjectType
       with AcExportXMLOtherFlags
       with AcFileFormat
       with AcFindMatch
       with AcFormOpenDataMode
       with AcFormSection
       with AcFormView
       with AcFormatBarLimits
       with AcFormatConditionOperator
       with AcFormatConditionType
       with AcHorizontalAnchor
       with AcHyperlinkPart
       with AcImeMode
       with AcImeSentenceMode
       with AcImportXMLOption
       with AcLayoutType
       with AcObjectType
       with AcOpenDataMode
       with AcOutputObjectType
       with AcPictureCaptionArrangement
       with AcPrintColor
       with AcPrintDuplex
       with AcPrintOrientation
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcPrintQuality
       with AcPrintRange
       with AcProjectType
       with AcProperty
       with AcQuitOption
       with AcRecord
       with AcReportSection
       with AcSearchDirection
       with AcSendObjectType
       with AcSeparatorCharacters
       with AcSetMenuItemState
       with AcShowToolbar
       with AcSplitFormOrientation
       with AcSpreadSheetType
       with AcSysCmdAction
       with AcTextTransferType
       with AcTransformXMLScriptOption
       with AcVerticalAnchor
       with AcView
       with AcWebBrowserScrollBars
       with AcWebBrowserState
       with AcWebUserDisplay
       with AcWindowMode
       with Constants
       with OldConstants
       with ProcKind
       with WIZ_CSIDL_FLAGS
       with WIZ_SLGP_FLAGS
       with WIZ_SLR_FLAGS
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  
  @js.native
  sealed trait `20`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `20`: `20` = 20.asInstanceOf[`20`]
  
  @js.native
  sealed trait `200` extends AcCommand
  @scala.inline
  def `200`: `200` = 200.asInstanceOf[`200`]
  
  @js.native
  sealed trait `201` extends AcCommand
  @scala.inline
  def `201`: `201` = 201.asInstanceOf[`201`]
  
  @js.native
  sealed trait `202` extends AcCommand
  @scala.inline
  def `202`: `202` = 202.asInstanceOf[`202`]
  
  @js.native
  sealed trait `203` extends AcCommand
  @scala.inline
  def `203`: `203` = 203.asInstanceOf[`203`]
  
  @js.native
  sealed trait `204` extends AcCommand
  @scala.inline
  def `204`: `204` = 204.asInstanceOf[`204`]
  
  @js.native
  sealed trait `205` extends AcCommand
  @scala.inline
  def `205`: `205` = 205.asInstanceOf[`205`]
  
  @js.native
  sealed trait `206` extends AcCommand
  @scala.inline
  def `206`: `206` = 206.asInstanceOf[`206`]
  
  @js.native
  sealed trait `207` extends AcCommand
  @scala.inline
  def `207`: `207` = 207.asInstanceOf[`207`]
  
  @js.native
  sealed trait `208` extends AcCommand
  @scala.inline
  def `208`: `208` = 208.asInstanceOf[`208`]
  
  @js.native
  sealed trait `209` extends AcCommand
  @scala.inline
  def `209`: `209` = 209.asInstanceOf[`209`]
  
  @js.native
  sealed trait `21`
    extends AcCommand
       with AcPrintPaperSize
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `21`: `21` = 21.asInstanceOf[`21`]
  
  @js.native
  sealed trait `210` extends AcCommand
  @scala.inline
  def `210`: `210` = 210.asInstanceOf[`210`]
  
  @js.native
  sealed trait `211` extends AcCommand
  @scala.inline
  def `211`: `211` = 211.asInstanceOf[`211`]
  
  @js.native
  sealed trait `212` extends AcCommand
  @scala.inline
  def `212`: `212` = 212.asInstanceOf[`212`]
  
  @js.native
  sealed trait `213` extends AcCommand
  @scala.inline
  def `213`: `213` = 213.asInstanceOf[`213`]
  
  @js.native
  sealed trait `214` extends AcCommand
  @scala.inline
  def `214`: `214` = 214.asInstanceOf[`214`]
  
  @js.native
  sealed trait `215` extends AcCommand
  @scala.inline
  def `215`: `215` = 215.asInstanceOf[`215`]
  
  @js.native
  sealed trait `216` extends AcCommand
  @scala.inline
  def `216`: `216` = 216.asInstanceOf[`216`]
  
  @js.native
  sealed trait `217` extends AcCommand
  @scala.inline
  def `217`: `217` = 217.asInstanceOf[`217`]
  
  @js.native
  sealed trait `218` extends AcCommand
  @scala.inline
  def `218`: `218` = 218.asInstanceOf[`218`]
  
  @js.native
  sealed trait `219` extends AcCommand
  @scala.inline
  def `219`: `219` = 219.asInstanceOf[`219`]
  
  @js.native
  sealed trait `22`
    extends AcCommand
       with AcPrintPaperSize
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `22`: `22` = 22.asInstanceOf[`22`]
  
  @js.native
  sealed trait `220` extends AcCommand
  @scala.inline
  def `220`: `220` = 220.asInstanceOf[`220`]
  
  @js.native
  sealed trait `221` extends AcCommand
  @scala.inline
  def `221`: `221` = 221.asInstanceOf[`221`]
  
  @js.native
  sealed trait `222` extends AcCommand
  @scala.inline
  def `222`: `222` = 222.asInstanceOf[`222`]
  
  @js.native
  sealed trait `223` extends AcCommand
  @scala.inline
  def `223`: `223` = 223.asInstanceOf[`223`]
  
  @js.native
  sealed trait `224` extends AcCommand
  @scala.inline
  def `224`: `224` = 224.asInstanceOf[`224`]
  
  @js.native
  sealed trait `225` extends AcCommand
  @scala.inline
  def `225`: `225` = 225.asInstanceOf[`225`]
  
  @js.native
  sealed trait `226` extends AcCommand
  @scala.inline
  def `226`: `226` = 226.asInstanceOf[`226`]
  
  @js.native
  sealed trait `227` extends AcCommand
  @scala.inline
  def `227`: `227` = 227.asInstanceOf[`227`]
  
  @js.native
  sealed trait `228` extends AcCommand
  @scala.inline
  def `228`: `228` = 228.asInstanceOf[`228`]
  
  @js.native
  sealed trait `229` extends AcCommand
  @scala.inline
  def `229`: `229` = 229.asInstanceOf[`229`]
  
  @js.native
  sealed trait `23`
    extends AcCommand
       with AcPrintPaperSize
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `23`: `23` = 23.asInstanceOf[`23`]
  
  @js.native
  sealed trait `230` extends AcCommand
  @scala.inline
  def `230`: `230` = 230.asInstanceOf[`230`]
  
  @js.native
  sealed trait `231` extends AcCommand
  @scala.inline
  def `231`: `231` = 231.asInstanceOf[`231`]
  
  @js.native
  sealed trait `232` extends AcCommand
  @scala.inline
  def `232`: `232` = 232.asInstanceOf[`232`]
  
  @js.native
  sealed trait `233` extends AcCommand
  @scala.inline
  def `233`: `233` = 233.asInstanceOf[`233`]
  
  @js.native
  sealed trait `234` extends AcCommand
  @scala.inline
  def `234`: `234` = 234.asInstanceOf[`234`]
  
  @js.native
  sealed trait `235` extends AcCommand
  @scala.inline
  def `235`: `235` = 235.asInstanceOf[`235`]
  
  @js.native
  sealed trait `236` extends AcCommand
  @scala.inline
  def `236`: `236` = 236.asInstanceOf[`236`]
  
  @js.native
  sealed trait `237` extends AcCommand
  @scala.inline
  def `237`: `237` = 237.asInstanceOf[`237`]
  
  @js.native
  sealed trait `238` extends AcCommand
  @scala.inline
  def `238`: `238` = 238.asInstanceOf[`238`]
  
  @js.native
  sealed trait `239` extends AcCommand
  @scala.inline
  def `239`: `239` = 239.asInstanceOf[`239`]
  
  @js.native
  sealed trait `24`
    extends AcCommand
       with AcPrintPaperSize
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `24`: `24` = 24.asInstanceOf[`24`]
  
  @js.native
  sealed trait `240`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `240`: `240` = 240.asInstanceOf[`240`]
  
  @js.native
  sealed trait `241` extends AcCommand
  @scala.inline
  def `241`: `241` = 241.asInstanceOf[`241`]
  
  @js.native
  sealed trait `242` extends AcCommand
  @scala.inline
  def `242`: `242` = 242.asInstanceOf[`242`]
  
  @js.native
  sealed trait `243` extends AcCommand
  @scala.inline
  def `243`: `243` = 243.asInstanceOf[`243`]
  
  @js.native
  sealed trait `244` extends AcCommand
  @scala.inline
  def `244`: `244` = 244.asInstanceOf[`244`]
  
  @js.native
  sealed trait `245` extends AcCommand
  @scala.inline
  def `245`: `245` = 245.asInstanceOf[`245`]
  
  @js.native
  sealed trait `246` extends AcCommand
  @scala.inline
  def `246`: `246` = 246.asInstanceOf[`246`]
  
  @js.native
  sealed trait `247` extends AcCommand
  @scala.inline
  def `247`: `247` = 247.asInstanceOf[`247`]
  
  @js.native
  sealed trait `248` extends AcCommand
  @scala.inline
  def `248`: `248` = 248.asInstanceOf[`248`]
  
  @js.native
  sealed trait `249` extends AcCommand
  @scala.inline
  def `249`: `249` = 249.asInstanceOf[`249`]
  
  @js.native
  sealed trait `25`
    extends AcCommand
       with AcPrintPaperSize
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `25`: `25` = 25.asInstanceOf[`25`]
  
  @js.native
  sealed trait `250` extends AcCommand
  @scala.inline
  def `250`: `250` = 250.asInstanceOf[`250`]
  
  @js.native
  sealed trait `251` extends AcCommand
  @scala.inline
  def `251`: `251` = 251.asInstanceOf[`251`]
  
  @js.native
  sealed trait `252` extends AcCommand
  @scala.inline
  def `252`: `252` = 252.asInstanceOf[`252`]
  
  @js.native
  sealed trait `253` extends AcCommand
  @scala.inline
  def `253`: `253` = 253.asInstanceOf[`253`]
  
  @js.native
  sealed trait `254` extends AcCommand
  @scala.inline
  def `254`: `254` = 254.asInstanceOf[`254`]
  
  @js.native
  sealed trait `255` extends AcCommand
  @scala.inline
  def `255`: `255` = 255.asInstanceOf[`255`]
  
  @js.native
  sealed trait `256`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
       with OldConstants
  @scala.inline
  def `256`: `256` = 256.asInstanceOf[`256`]
  
  @js.native
  sealed trait `257` extends AcCommand
  @scala.inline
  def `257`: `257` = 257.asInstanceOf[`257`]
  
  @js.native
  sealed trait `258`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `258`: `258` = 258.asInstanceOf[`258`]
  
  @js.native
  sealed trait `259`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `259`: `259` = 259.asInstanceOf[`259`]
  
  @js.native
  sealed trait `26`
    extends AcCommand
       with AcPrintPaperSize
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `26`: `26` = 26.asInstanceOf[`26`]
  
  @js.native
  sealed trait `260`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `260`: `260` = 260.asInstanceOf[`260`]
  
  @js.native
  sealed trait `261`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `261`: `261` = 261.asInstanceOf[`261`]
  
  @js.native
  sealed trait `262`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `262`: `262` = 262.asInstanceOf[`262`]
  
  @js.native
  sealed trait `262144` extends OldConstants
  @scala.inline
  def `262144`: `262144` = 262144.asInstanceOf[`262144`]
  
  @js.native
  sealed trait `263`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `263`: `263` = 263.asInstanceOf[`263`]
  
  @js.native
  sealed trait `264`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `264`: `264` = 264.asInstanceOf[`264`]
  
  @js.native
  sealed trait `265`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `265`: `265` = 265.asInstanceOf[`265`]
  
  @js.native
  sealed trait `266`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `266`: `266` = 266.asInstanceOf[`266`]
  
  @js.native
  sealed trait `267`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `267`: `267` = 267.asInstanceOf[`267`]
  
  @js.native
  sealed trait `268` extends OldConstants
  @scala.inline
  def `268`: `268` = 268.asInstanceOf[`268`]
  
  @js.native
  sealed trait `269`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `269`: `269` = 269.asInstanceOf[`269`]
  
  @js.native
  sealed trait `27`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `27`: `27` = 27.asInstanceOf[`27`]
  
  @js.native
  sealed trait `270`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `270`: `270` = 270.asInstanceOf[`270`]
  
  @js.native
  sealed trait `271` extends AcCommand
  @scala.inline
  def `271`: `271` = 271.asInstanceOf[`271`]
  
  @js.native
  sealed trait `272` extends AcCommand
  @scala.inline
  def `272`: `272` = 272.asInstanceOf[`272`]
  
  @js.native
  sealed trait `273` extends AcCommand
  @scala.inline
  def `273`: `273` = 273.asInstanceOf[`273`]
  
  @js.native
  sealed trait `274` extends AcCommand
  @scala.inline
  def `274`: `274` = 274.asInstanceOf[`274`]
  
  @js.native
  sealed trait `275` extends AcCommand
  @scala.inline
  def `275`: `275` = 275.asInstanceOf[`275`]
  
  @js.native
  sealed trait `276` extends AcCommand
  @scala.inline
  def `276`: `276` = 276.asInstanceOf[`276`]
  
  @js.native
  sealed trait `277` extends AcCommand
  @scala.inline
  def `277`: `277` = 277.asInstanceOf[`277`]
  
  @js.native
  sealed trait `278` extends AcCommand
  @scala.inline
  def `278`: `278` = 278.asInstanceOf[`278`]
  
  @js.native
  sealed trait `279` extends AcCommand
  @scala.inline
  def `279`: `279` = 279.asInstanceOf[`279`]
  
  @js.native
  sealed trait `28`
    extends AcCommand
       with AcPrintPaperSize
  @scala.inline
  def `28`: `28` = 28.asInstanceOf[`28`]
  
  @js.native
  sealed trait `280` extends AcCommand
  @scala.inline
  def `280`: `280` = 280.asInstanceOf[`280`]
  
  @js.native
  sealed trait `281` extends AcCommand
  @scala.inline
  def `281`: `281` = 281.asInstanceOf[`281`]
  
  @js.native
  sealed trait `282` extends AcCommand
  @scala.inline
  def `282`: `282` = 282.asInstanceOf[`282`]
  
  @js.native
  sealed trait `283` extends AcCommand
  @scala.inline
  def `283`: `283` = 283.asInstanceOf[`283`]
  
  @js.native
  sealed trait `284` extends AcCommand
  @scala.inline
  def `284`: `284` = 284.asInstanceOf[`284`]
  
  @js.native
  sealed trait `285` extends AcCommand
  @scala.inline
  def `285`: `285` = 285.asInstanceOf[`285`]
  
  @js.native
  sealed trait `286` extends AcCommand
  @scala.inline
  def `286`: `286` = 286.asInstanceOf[`286`]
  
  @js.native
  sealed trait `287` extends AcCommand
  @scala.inline
  def `287`: `287` = 287.asInstanceOf[`287`]
  
  @js.native
  sealed trait `288` extends AcCommand
  @scala.inline
  def `288`: `288` = 288.asInstanceOf[`288`]
  
  @js.native
  sealed trait `289` extends AcCommand
  @scala.inline
  def `289`: `289` = 289.asInstanceOf[`289`]
  
  @js.native
  sealed trait `29`
    extends AcCommand
       with AcPrintPaperSize
  @scala.inline
  def `29`: `29` = 29.asInstanceOf[`29`]
  
  @js.native
  sealed trait `290` extends AcCommand
  @scala.inline
  def `290`: `290` = 290.asInstanceOf[`290`]
  
  @js.native
  sealed trait `291` extends AcCommand
  @scala.inline
  def `291`: `291` = 291.asInstanceOf[`291`]
  
  @js.native
  sealed trait `292` extends AcCommand
  @scala.inline
  def `292`: `292` = 292.asInstanceOf[`292`]
  
  @js.native
  sealed trait `293` extends AcCommand
  @scala.inline
  def `293`: `293` = 293.asInstanceOf[`293`]
  
  @js.native
  sealed trait `294` extends AcCommand
  @scala.inline
  def `294`: `294` = 294.asInstanceOf[`294`]
  
  @js.native
  sealed trait `295` extends AcCommand
  @scala.inline
  def `295`: `295` = 295.asInstanceOf[`295`]
  
  @js.native
  sealed trait `296` extends AcCommand
  @scala.inline
  def `296`: `296` = 296.asInstanceOf[`296`]
  
  @js.native
  sealed trait `297` extends AcCommand
  @scala.inline
  def `297`: `297` = 297.asInstanceOf[`297`]
  
  @js.native
  sealed trait `298` extends AcCommand
  @scala.inline
  def `298`: `298` = 298.asInstanceOf[`298`]
  
  @js.native
  sealed trait `299` extends AcCommand
  @scala.inline
  def `299`: `299` = 299.asInstanceOf[`299`]
  
  @js.native
  sealed trait `3`
    extends AcBrowseToObjectType
       with AcColorIndex
       with AcCommand
       with AcCurrentView
       with AcDataObjectType
       with AcDefView
       with AcExportXMLObjectType
       with AcFormSection
       with AcFormView
       with AcFormatConditionOperator
       with AcFormatConditionType
       with AcHyperlinkPart
       with AcImeMode
       with AcImeSentenceMode
       with AcObjectType
       with AcOutputObjectType
       with AcPictureCaptionArrangement
       with AcPrintDuplex
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcPrintQuality
       with AcProperty
       with AcRecord
       with AcReportSection
       with AcSendObjectType
       with AcSeparatorCharacters
       with AcSetMenuItemState
       with AcSplitFormOrientation
       with AcSpreadSheetType
       with AcSysCmdAction
       with AcTextTransferType
       with AcView
       with AcWebBrowserState
       with AcWebUserDisplay
       with AcWindowMode
       with Constants
       with OldConstants
       with ProcKind
       with WIZ_CSIDL_FLAGS
       with WIZ_SW_FLAGS
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  
  @js.native
  sealed trait `30`
    extends AcCommand
       with AcPrintPaperSize
  @scala.inline
  def `30`: `30` = 30.asInstanceOf[`30`]
  
  @js.native
  sealed trait `300` extends AcCommand
  @scala.inline
  def `300`: `300` = 300.asInstanceOf[`300`]
  
  @js.native
  sealed trait `301` extends AcCommand
  @scala.inline
  def `301`: `301` = 301.asInstanceOf[`301`]
  
  @js.native
  sealed trait `302` extends AcCommand
  @scala.inline
  def `302`: `302` = 302.asInstanceOf[`302`]
  
  @js.native
  sealed trait `303` extends AcCommand
  @scala.inline
  def `303`: `303` = 303.asInstanceOf[`303`]
  
  @js.native
  sealed trait `304` extends AcCommand
  @scala.inline
  def `304`: `304` = 304.asInstanceOf[`304`]
  
  @js.native
  sealed trait `305` extends AcCommand
  @scala.inline
  def `305`: `305` = 305.asInstanceOf[`305`]
  
  @js.native
  sealed trait `306` extends AcCommand
  @scala.inline
  def `306`: `306` = 306.asInstanceOf[`306`]
  
  @js.native
  sealed trait `307` extends AcCommand
  @scala.inline
  def `307`: `307` = 307.asInstanceOf[`307`]
  
  @js.native
  sealed trait `308` extends AcCommand
  @scala.inline
  def `308`: `308` = 308.asInstanceOf[`308`]
  
  @js.native
  sealed trait `309` extends AcCommand
  @scala.inline
  def `309`: `309` = 309.asInstanceOf[`309`]
  
  @js.native
  sealed trait `31`
    extends AcCommand
       with AcPrintPaperSize
  @scala.inline
  def `31`: `31` = 31.asInstanceOf[`31`]
  
  @js.native
  sealed trait `310` extends AcCommand
  @scala.inline
  def `310`: `310` = 310.asInstanceOf[`310`]
  
  @js.native
  sealed trait `311` extends AcCommand
  @scala.inline
  def `311`: `311` = 311.asInstanceOf[`311`]
  
  @js.native
  sealed trait `312` extends AcCommand
  @scala.inline
  def `312`: `312` = 312.asInstanceOf[`312`]
  
  @js.native
  sealed trait `313` extends AcCommand
  @scala.inline
  def `313`: `313` = 313.asInstanceOf[`313`]
  
  @js.native
  sealed trait `314` extends AcCommand
  @scala.inline
  def `314`: `314` = 314.asInstanceOf[`314`]
  
  @js.native
  sealed trait `315` extends AcCommand
  @scala.inline
  def `315`: `315` = 315.asInstanceOf[`315`]
  
  @js.native
  sealed trait `316` extends AcCommand
  @scala.inline
  def `316`: `316` = 316.asInstanceOf[`316`]
  
  @js.native
  sealed trait `317` extends AcCommand
  @scala.inline
  def `317`: `317` = 317.asInstanceOf[`317`]
  
  @js.native
  sealed trait `318` extends AcCommand
  @scala.inline
  def `318`: `318` = 318.asInstanceOf[`318`]
  
  @js.native
  sealed trait `319` extends AcCommand
  @scala.inline
  def `319`: `319` = 319.asInstanceOf[`319`]
  
  @js.native
  sealed trait `32`
    extends AcCommand
       with AcExportXMLOtherFlags
       with AcPrintPaperSize
       with Constants
       with OldConstants
  @scala.inline
  def `32`: `32` = 32.asInstanceOf[`32`]
  
  @js.native
  sealed trait `321` extends AcCommand
  @scala.inline
  def `321`: `321` = 321.asInstanceOf[`321`]
  
  @js.native
  sealed trait `322` extends AcCommand
  @scala.inline
  def `322`: `322` = 322.asInstanceOf[`322`]
  
  @js.native
  sealed trait `323` extends AcCommand
  @scala.inline
  def `323`: `323` = 323.asInstanceOf[`323`]
  
  @js.native
  sealed trait `324` extends AcCommand
  @scala.inline
  def `324`: `324` = 324.asInstanceOf[`324`]
  
  @js.native
  sealed trait `325` extends AcCommand
  @scala.inline
  def `325`: `325` = 325.asInstanceOf[`325`]
  
  @js.native
  sealed trait `326` extends AcCommand
  @scala.inline
  def `326`: `326` = 326.asInstanceOf[`326`]
  
  @js.native
  sealed trait `327` extends AcCommand
  @scala.inline
  def `327`: `327` = 327.asInstanceOf[`327`]
  
  @js.native
  sealed trait `328` extends AcCommand
  @scala.inline
  def `328`: `328` = 328.asInstanceOf[`328`]
  
  @js.native
  sealed trait `329` extends AcCommand
  @scala.inline
  def `329`: `329` = 329.asInstanceOf[`329`]
  
  @js.native
  sealed trait `33`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `33`: `33` = 33.asInstanceOf[`33`]
  
  @js.native
  sealed trait `330` extends AcCommand
  @scala.inline
  def `330`: `330` = 330.asInstanceOf[`330`]
  
  @js.native
  sealed trait `331` extends AcCommand
  @scala.inline
  def `331`: `331` = 331.asInstanceOf[`331`]
  
  @js.native
  sealed trait `332` extends AcCommand
  @scala.inline
  def `332`: `332` = 332.asInstanceOf[`332`]
  
  @js.native
  sealed trait `333` extends AcCommand
  @scala.inline
  def `333`: `333` = 333.asInstanceOf[`333`]
  
  @js.native
  sealed trait `334` extends AcCommand
  @scala.inline
  def `334`: `334` = 334.asInstanceOf[`334`]
  
  @js.native
  sealed trait `335` extends AcCommand
  @scala.inline
  def `335`: `335` = 335.asInstanceOf[`335`]
  
  @js.native
  sealed trait `33554432` extends OldConstants
  @scala.inline
  def `33554432`: `33554432` = 33554432.asInstanceOf[`33554432`]
  
  @js.native
  sealed trait `336` extends AcCommand
  @scala.inline
  def `336`: `336` = 336.asInstanceOf[`336`]
  
  @js.native
  sealed trait `337` extends AcCommand
  @scala.inline
  def `337`: `337` = 337.asInstanceOf[`337`]
  
  @js.native
  sealed trait `338` extends AcCommand
  @scala.inline
  def `338`: `338` = 338.asInstanceOf[`338`]
  
  @js.native
  sealed trait `339` extends AcCommand
  @scala.inline
  def `339`: `339` = 339.asInstanceOf[`339`]
  
  @js.native
  sealed trait `34`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `34`: `34` = 34.asInstanceOf[`34`]
  
  @js.native
  sealed trait `340` extends AcCommand
  @scala.inline
  def `340`: `340` = 340.asInstanceOf[`340`]
  
  @js.native
  sealed trait `341` extends AcCommand
  @scala.inline
  def `341`: `341` = 341.asInstanceOf[`341`]
  
  @js.native
  sealed trait `342` extends AcCommand
  @scala.inline
  def `342`: `342` = 342.asInstanceOf[`342`]
  
  @js.native
  sealed trait `343` extends AcCommand
  @scala.inline
  def `343`: `343` = 343.asInstanceOf[`343`]
  
  @js.native
  sealed trait `344` extends AcCommand
  @scala.inline
  def `344`: `344` = 344.asInstanceOf[`344`]
  
  @js.native
  sealed trait `346` extends AcCommand
  @scala.inline
  def `346`: `346` = 346.asInstanceOf[`346`]
  
  @js.native
  sealed trait `347` extends AcCommand
  @scala.inline
  def `347`: `347` = 347.asInstanceOf[`347`]
  
  @js.native
  sealed trait `349` extends AcCommand
  @scala.inline
  def `349`: `349` = 349.asInstanceOf[`349`]
  
  @js.native
  sealed trait `35`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `35`: `35` = 35.asInstanceOf[`35`]
  
  @js.native
  sealed trait `350` extends AcCommand
  @scala.inline
  def `350`: `350` = 350.asInstanceOf[`350`]
  
  @js.native
  sealed trait `351` extends AcCommand
  @scala.inline
  def `351`: `351` = 351.asInstanceOf[`351`]
  
  @js.native
  sealed trait `352` extends AcCommand
  @scala.inline
  def `352`: `352` = 352.asInstanceOf[`352`]
  
  @js.native
  sealed trait `353` extends AcCommand
  @scala.inline
  def `353`: `353` = 353.asInstanceOf[`353`]
  
  @js.native
  sealed trait `354` extends AcCommand
  @scala.inline
  def `354`: `354` = 354.asInstanceOf[`354`]
  
  @js.native
  sealed trait `355` extends AcCommand
  @scala.inline
  def `355`: `355` = 355.asInstanceOf[`355`]
  
  @js.native
  sealed trait `356` extends AcCommand
  @scala.inline
  def `356`: `356` = 356.asInstanceOf[`356`]
  
  @js.native
  sealed trait `357` extends AcCommand
  @scala.inline
  def `357`: `357` = 357.asInstanceOf[`357`]
  
  @js.native
  sealed trait `358` extends AcCommand
  @scala.inline
  def `358`: `358` = 358.asInstanceOf[`358`]
  
  @js.native
  sealed trait `359` extends AcCommand
  @scala.inline
  def `359`: `359` = 359.asInstanceOf[`359`]
  
  @js.native
  sealed trait `36`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `36`: `36` = 36.asInstanceOf[`36`]
  
  @js.native
  sealed trait `360` extends AcCommand
  @scala.inline
  def `360`: `360` = 360.asInstanceOf[`360`]
  
  @js.native
  sealed trait `361` extends AcCommand
  @scala.inline
  def `361`: `361` = 361.asInstanceOf[`361`]
  
  @js.native
  sealed trait `362` extends AcCommand
  @scala.inline
  def `362`: `362` = 362.asInstanceOf[`362`]
  
  @js.native
  sealed trait `363` extends AcCommand
  @scala.inline
  def `363`: `363` = 363.asInstanceOf[`363`]
  
  @js.native
  sealed trait `364` extends AcCommand
  @scala.inline
  def `364`: `364` = 364.asInstanceOf[`364`]
  
  @js.native
  sealed trait `365` extends AcCommand
  @scala.inline
  def `365`: `365` = 365.asInstanceOf[`365`]
  
  @js.native
  sealed trait `366` extends AcCommand
  @scala.inline
  def `366`: `366` = 366.asInstanceOf[`366`]
  
  @js.native
  sealed trait `368` extends AcCommand
  @scala.inline
  def `368`: `368` = 368.asInstanceOf[`368`]
  
  @js.native
  sealed trait `369` extends AcCommand
  @scala.inline
  def `369`: `369` = 369.asInstanceOf[`369`]
  
  @js.native
  sealed trait `37`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `37`: `37` = 37.asInstanceOf[`37`]
  
  @js.native
  sealed trait `370` extends AcCommand
  @scala.inline
  def `370`: `370` = 370.asInstanceOf[`370`]
  
  @js.native
  sealed trait `371` extends AcCommand
  @scala.inline
  def `371`: `371` = 371.asInstanceOf[`371`]
  
  @js.native
  sealed trait `372` extends AcCommand
  @scala.inline
  def `372`: `372` = 372.asInstanceOf[`372`]
  
  @js.native
  sealed trait `373` extends AcCommand
  @scala.inline
  def `373`: `373` = 373.asInstanceOf[`373`]
  
  @js.native
  sealed trait `374` extends AcCommand
  @scala.inline
  def `374`: `374` = 374.asInstanceOf[`374`]
  
  @js.native
  sealed trait `375` extends AcCommand
  @scala.inline
  def `375`: `375` = 375.asInstanceOf[`375`]
  
  @js.native
  sealed trait `376` extends AcCommand
  @scala.inline
  def `376`: `376` = 376.asInstanceOf[`376`]
  
  @js.native
  sealed trait `377` extends AcCommand
  @scala.inline
  def `377`: `377` = 377.asInstanceOf[`377`]
  
  @js.native
  sealed trait `378` extends AcCommand
  @scala.inline
  def `378`: `378` = 378.asInstanceOf[`378`]
  
  @js.native
  sealed trait `379` extends AcCommand
  @scala.inline
  def `379`: `379` = 379.asInstanceOf[`379`]
  
  @js.native
  sealed trait `38`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `38`: `38` = 38.asInstanceOf[`38`]
  
  @js.native
  sealed trait `380` extends AcCommand
  @scala.inline
  def `380`: `380` = 380.asInstanceOf[`380`]
  
  @js.native
  sealed trait `381` extends AcCommand
  @scala.inline
  def `381`: `381` = 381.asInstanceOf[`381`]
  
  @js.native
  sealed trait `382` extends AcCommand
  @scala.inline
  def `382`: `382` = 382.asInstanceOf[`382`]
  
  @js.native
  sealed trait `383` extends AcCommand
  @scala.inline
  def `383`: `383` = 383.asInstanceOf[`383`]
  
  @js.native
  sealed trait `384` extends AcCommand
  @scala.inline
  def `384`: `384` = 384.asInstanceOf[`384`]
  
  @js.native
  sealed trait `385` extends AcCommand
  @scala.inline
  def `385`: `385` = 385.asInstanceOf[`385`]
  
  @js.native
  sealed trait `386` extends AcCommand
  @scala.inline
  def `386`: `386` = 386.asInstanceOf[`386`]
  
  @js.native
  sealed trait `387` extends AcCommand
  @scala.inline
  def `387`: `387` = 387.asInstanceOf[`387`]
  
  @js.native
  sealed trait `388` extends AcCommand
  @scala.inline
  def `388`: `388` = 388.asInstanceOf[`388`]
  
  @js.native
  sealed trait `389` extends AcCommand
  @scala.inline
  def `389`: `389` = 389.asInstanceOf[`389`]
  
  @js.native
  sealed trait `39`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `39`: `39` = 39.asInstanceOf[`39`]
  
  @js.native
  sealed trait `390` extends AcCommand
  @scala.inline
  def `390`: `390` = 390.asInstanceOf[`390`]
  
  @js.native
  sealed trait `391` extends AcCommand
  @scala.inline
  def `391`: `391` = 391.asInstanceOf[`391`]
  
  @js.native
  sealed trait `394` extends AcCommand
  @scala.inline
  def `394`: `394` = 394.asInstanceOf[`394`]
  
  @js.native
  sealed trait `395` extends AcCommand
  @scala.inline
  def `395`: `395` = 395.asInstanceOf[`395`]
  
  @js.native
  sealed trait `396` extends AcCommand
  @scala.inline
  def `396`: `396` = 396.asInstanceOf[`396`]
  
  @js.native
  sealed trait `397` extends AcCommand
  @scala.inline
  def `397`: `397` = 397.asInstanceOf[`397`]
  
  @js.native
  sealed trait `398` extends AcCommand
  @scala.inline
  def `398`: `398` = 398.asInstanceOf[`398`]
  
  @js.native
  sealed trait `399` extends AcCommand
  @scala.inline
  def `399`: `399` = 399.asInstanceOf[`399`]
  
  @js.native
  sealed trait `4`
    extends AcColorIndex
       with AcCommand
       with AcCurrentView
       with AcDefView
       with AcExportXMLOtherFlags
       with AcFormSection
       with AcFormView
       with AcFormatConditionOperator
       with AcHyperlinkPart
       with AcImeMode
       with AcObjectType
       with AcPictureCaptionArrangement
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcProperty
       with AcRecord
       with AcReportSection
       with AcSpreadSheetType
       with AcSysCmdAction
       with AcTextTransferType
       with AcView
       with AcWebBrowserState
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
       with WIZ_SLR_FLAGS
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  
  @js.native
  sealed trait `40`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `40`: `40` = 40.asInstanceOf[`40`]
  
  @js.native
  sealed trait `400` extends AcCommand
  @scala.inline
  def `400`: `400` = 400.asInstanceOf[`400`]
  
  @js.native
  sealed trait `401` extends AcCommand
  @scala.inline
  def `401`: `401` = 401.asInstanceOf[`401`]
  
  @js.native
  sealed trait `402` extends AcCommand
  @scala.inline
  def `402`: `402` = 402.asInstanceOf[`402`]
  
  @js.native
  sealed trait `403` extends AcCommand
  @scala.inline
  def `403`: `403` = 403.asInstanceOf[`403`]
  
  @js.native
  sealed trait `404` extends AcCommand
  @scala.inline
  def `404`: `404` = 404.asInstanceOf[`404`]
  
  @js.native
  sealed trait `405` extends AcCommand
  @scala.inline
  def `405`: `405` = 405.asInstanceOf[`405`]
  
  @js.native
  sealed trait `406` extends AcCommand
  @scala.inline
  def `406`: `406` = 406.asInstanceOf[`406`]
  
  @js.native
  sealed trait `407` extends AcCommand
  @scala.inline
  def `407`: `407` = 407.asInstanceOf[`407`]
  
  @js.native
  sealed trait `408` extends AcCommand
  @scala.inline
  def `408`: `408` = 408.asInstanceOf[`408`]
  
  @js.native
  sealed trait `409` extends AcCommand
  @scala.inline
  def `409`: `409` = 409.asInstanceOf[`409`]
  
  @js.native
  sealed trait `4096` extends OldConstants
  @scala.inline
  def `4096`: `4096` = 4096.asInstanceOf[`4096`]
  
  @js.native
  sealed trait `4097` extends OldConstants
  @scala.inline
  def `4097`: `4097` = 4097.asInstanceOf[`4097`]
  
  @js.native
  sealed trait `4098` extends OldConstants
  @scala.inline
  def `4098`: `4098` = 4098.asInstanceOf[`4098`]
  
  @js.native
  sealed trait `41`
    extends AcCommand
       with AcPrintPaperSize
       with Constants
  @scala.inline
  def `41`: `41` = 41.asInstanceOf[`41`]
  
  @js.native
  sealed trait `410` extends AcCommand
  @scala.inline
  def `410`: `410` = 410.asInstanceOf[`410`]
  
  @js.native
  sealed trait `411` extends AcCommand
  @scala.inline
  def `411`: `411` = 411.asInstanceOf[`411`]
  
  @js.native
  sealed trait `412` extends AcCommand
  @scala.inline
  def `412`: `412` = 412.asInstanceOf[`412`]
  
  @js.native
  sealed trait `413` extends AcCommand
  @scala.inline
  def `413`: `413` = 413.asInstanceOf[`413`]
  
  @js.native
  sealed trait `414` extends AcCommand
  @scala.inline
  def `414`: `414` = 414.asInstanceOf[`414`]
  
  @js.native
  sealed trait `415` extends AcCommand
  @scala.inline
  def `415`: `415` = 415.asInstanceOf[`415`]
  
  @js.native
  sealed trait `416` extends AcCommand
  @scala.inline
  def `416`: `416` = 416.asInstanceOf[`416`]
  
  @js.native
  sealed trait `417` extends AcCommand
  @scala.inline
  def `417`: `417` = 417.asInstanceOf[`417`]
  
  @js.native
  sealed trait `418` extends AcCommand
  @scala.inline
  def `418`: `418` = 418.asInstanceOf[`418`]
  
  @js.native
  sealed trait `419` extends AcCommand
  @scala.inline
  def `419`: `419` = 419.asInstanceOf[`419`]
  
  @js.native
  sealed trait `42`
    extends AcCommand
       with Constants
  @scala.inline
  def `42`: `42` = 42.asInstanceOf[`42`]
  
  @js.native
  sealed trait `420` extends AcCommand
  @scala.inline
  def `420`: `420` = 420.asInstanceOf[`420`]
  
  @js.native
  sealed trait `421` extends AcCommand
  @scala.inline
  def `421`: `421` = 421.asInstanceOf[`421`]
  
  @js.native
  sealed trait `422` extends AcCommand
  @scala.inline
  def `422`: `422` = 422.asInstanceOf[`422`]
  
  @js.native
  sealed trait `423` extends AcCommand
  @scala.inline
  def `423`: `423` = 423.asInstanceOf[`423`]
  
  @js.native
  sealed trait `424` extends AcCommand
  @scala.inline
  def `424`: `424` = 424.asInstanceOf[`424`]
  
  @js.native
  sealed trait `425` extends AcCommand
  @scala.inline
  def `425`: `425` = 425.asInstanceOf[`425`]
  
  @js.native
  sealed trait `426` extends AcCommand
  @scala.inline
  def `426`: `426` = 426.asInstanceOf[`426`]
  
  @js.native
  sealed trait `427` extends AcCommand
  @scala.inline
  def `427`: `427` = 427.asInstanceOf[`427`]
  
  @js.native
  sealed trait `428` extends AcCommand
  @scala.inline
  def `428`: `428` = 428.asInstanceOf[`428`]
  
  @js.native
  sealed trait `429` extends AcCommand
  @scala.inline
  def `429`: `429` = 429.asInstanceOf[`429`]
  
  @js.native
  sealed trait `43`
    extends AcCommand
       with Constants
  @scala.inline
  def `43`: `43` = 43.asInstanceOf[`43`]
  
  @js.native
  sealed trait `430` extends AcCommand
  @scala.inline
  def `430`: `430` = 430.asInstanceOf[`430`]
  
  @js.native
  sealed trait `431` extends AcCommand
  @scala.inline
  def `431`: `431` = 431.asInstanceOf[`431`]
  
  @js.native
  sealed trait `432` extends AcCommand
  @scala.inline
  def `432`: `432` = 432.asInstanceOf[`432`]
  
  @js.native
  sealed trait `433` extends AcCommand
  @scala.inline
  def `433`: `433` = 433.asInstanceOf[`433`]
  
  @js.native
  sealed trait `434` extends AcCommand
  @scala.inline
  def `434`: `434` = 434.asInstanceOf[`434`]
  
  @js.native
  sealed trait `435` extends AcCommand
  @scala.inline
  def `435`: `435` = 435.asInstanceOf[`435`]
  
  @js.native
  sealed trait `436` extends AcCommand
  @scala.inline
  def `436`: `436` = 436.asInstanceOf[`436`]
  
  @js.native
  sealed trait `437` extends AcCommand
  @scala.inline
  def `437`: `437` = 437.asInstanceOf[`437`]
  
  @js.native
  sealed trait `438` extends AcCommand
  @scala.inline
  def `438`: `438` = 438.asInstanceOf[`438`]
  
  @js.native
  sealed trait `439` extends AcCommand
  @scala.inline
  def `439`: `439` = 439.asInstanceOf[`439`]
  
  @js.native
  sealed trait `44`
    extends AcCommand
       with Constants
  @scala.inline
  def `44`: `44` = 44.asInstanceOf[`44`]
  
  @js.native
  sealed trait `440` extends AcCommand
  @scala.inline
  def `440`: `440` = 440.asInstanceOf[`440`]
  
  @js.native
  sealed trait `441` extends AcCommand
  @scala.inline
  def `441`: `441` = 441.asInstanceOf[`441`]
  
  @js.native
  sealed trait `442` extends AcCommand
  @scala.inline
  def `442`: `442` = 442.asInstanceOf[`442`]
  
  @js.native
  sealed trait `443` extends AcCommand
  @scala.inline
  def `443`: `443` = 443.asInstanceOf[`443`]
  
  @js.native
  sealed trait `444` extends AcCommand
  @scala.inline
  def `444`: `444` = 444.asInstanceOf[`444`]
  
  @js.native
  sealed trait `445` extends AcCommand
  @scala.inline
  def `445`: `445` = 445.asInstanceOf[`445`]
  
  @js.native
  sealed trait `446` extends AcCommand
  @scala.inline
  def `446`: `446` = 446.asInstanceOf[`446`]
  
  @js.native
  sealed trait `447` extends AcCommand
  @scala.inline
  def `447`: `447` = 447.asInstanceOf[`447`]
  
  @js.native
  sealed trait `448` extends AcCommand
  @scala.inline
  def `448`: `448` = 448.asInstanceOf[`448`]
  
  @js.native
  sealed trait `449` extends AcCommand
  @scala.inline
  def `449`: `449` = 449.asInstanceOf[`449`]
  
  @js.native
  sealed trait `45`
    extends AcCommand
       with Constants
  @scala.inline
  def `45`: `45` = 45.asInstanceOf[`45`]
  
  @js.native
  sealed trait `450` extends AcCommand
  @scala.inline
  def `450`: `450` = 450.asInstanceOf[`450`]
  
  @js.native
  sealed trait `451` extends AcCommand
  @scala.inline
  def `451`: `451` = 451.asInstanceOf[`451`]
  
  @js.native
  sealed trait `452` extends AcCommand
  @scala.inline
  def `452`: `452` = 452.asInstanceOf[`452`]
  
  @js.native
  sealed trait `453` extends AcCommand
  @scala.inline
  def `453`: `453` = 453.asInstanceOf[`453`]
  
  @js.native
  sealed trait `454` extends AcCommand
  @scala.inline
  def `454`: `454` = 454.asInstanceOf[`454`]
  
  @js.native
  sealed trait `455` extends AcCommand
  @scala.inline
  def `455`: `455` = 455.asInstanceOf[`455`]
  
  @js.native
  sealed trait `456` extends AcCommand
  @scala.inline
  def `456`: `456` = 456.asInstanceOf[`456`]
  
  @js.native
  sealed trait `457` extends AcCommand
  @scala.inline
  def `457`: `457` = 457.asInstanceOf[`457`]
  
  @js.native
  sealed trait `458` extends AcCommand
  @scala.inline
  def `458`: `458` = 458.asInstanceOf[`458`]
  
  @js.native
  sealed trait `459` extends AcCommand
  @scala.inline
  def `459`: `459` = 459.asInstanceOf[`459`]
  
  @js.native
  sealed trait `46`
    extends AcCommand
       with Constants
  @scala.inline
  def `46`: `46` = 46.asInstanceOf[`46`]
  
  @js.native
  sealed trait `460` extends AcCommand
  @scala.inline
  def `460`: `460` = 460.asInstanceOf[`460`]
  
  @js.native
  sealed trait `461` extends AcCommand
  @scala.inline
  def `461`: `461` = 461.asInstanceOf[`461`]
  
  @js.native
  sealed trait `462` extends AcCommand
  @scala.inline
  def `462`: `462` = 462.asInstanceOf[`462`]
  
  @js.native
  sealed trait `463` extends AcCommand
  @scala.inline
  def `463`: `463` = 463.asInstanceOf[`463`]
  
  @js.native
  sealed trait `464` extends AcCommand
  @scala.inline
  def `464`: `464` = 464.asInstanceOf[`464`]
  
  @js.native
  sealed trait `465` extends AcCommand
  @scala.inline
  def `465`: `465` = 465.asInstanceOf[`465`]
  
  @js.native
  sealed trait `466` extends AcCommand
  @scala.inline
  def `466`: `466` = 466.asInstanceOf[`466`]
  
  @js.native
  sealed trait `467` extends AcCommand
  @scala.inline
  def `467`: `467` = 467.asInstanceOf[`467`]
  
  @js.native
  sealed trait `468` extends AcCommand
  @scala.inline
  def `468`: `468` = 468.asInstanceOf[`468`]
  
  @js.native
  sealed trait `469` extends AcCommand
  @scala.inline
  def `469`: `469` = 469.asInstanceOf[`469`]
  
  @js.native
  sealed trait `47`
    extends AcCommand
       with Constants
  @scala.inline
  def `47`: `47` = 47.asInstanceOf[`47`]
  
  @js.native
  sealed trait `470` extends AcCommand
  @scala.inline
  def `470`: `470` = 470.asInstanceOf[`470`]
  
  @js.native
  sealed trait `471` extends AcCommand
  @scala.inline
  def `471`: `471` = 471.asInstanceOf[`471`]
  
  @js.native
  sealed trait `472` extends AcCommand
  @scala.inline
  def `472`: `472` = 472.asInstanceOf[`472`]
  
  @js.native
  sealed trait `473` extends AcCommand
  @scala.inline
  def `473`: `473` = 473.asInstanceOf[`473`]
  
  @js.native
  sealed trait `474` extends AcCommand
  @scala.inline
  def `474`: `474` = 474.asInstanceOf[`474`]
  
  @js.native
  sealed trait `475` extends AcCommand
  @scala.inline
  def `475`: `475` = 475.asInstanceOf[`475`]
  
  @js.native
  sealed trait `476` extends AcCommand
  @scala.inline
  def `476`: `476` = 476.asInstanceOf[`476`]
  
  @js.native
  sealed trait `477` extends AcCommand
  @scala.inline
  def `477`: `477` = 477.asInstanceOf[`477`]
  
  @js.native
  sealed trait `478` extends AcCommand
  @scala.inline
  def `478`: `478` = 478.asInstanceOf[`478`]
  
  @js.native
  sealed trait `479` extends AcCommand
  @scala.inline
  def `479`: `479` = 479.asInstanceOf[`479`]
  
  @js.native
  sealed trait `48`
    extends AcCommand
       with Constants
       with OldConstants
  @scala.inline
  def `48`: `48` = 48.asInstanceOf[`48`]
  
  @js.native
  sealed trait `480` extends AcCommand
  @scala.inline
  def `480`: `480` = 480.asInstanceOf[`480`]
  
  @js.native
  sealed trait `481` extends AcCommand
  @scala.inline
  def `481`: `481` = 481.asInstanceOf[`481`]
  
  @js.native
  sealed trait `482` extends AcCommand
  @scala.inline
  def `482`: `482` = 482.asInstanceOf[`482`]
  
  @js.native
  sealed trait `483` extends AcCommand
  @scala.inline
  def `483`: `483` = 483.asInstanceOf[`483`]
  
  @js.native
  sealed trait `484` extends AcCommand
  @scala.inline
  def `484`: `484` = 484.asInstanceOf[`484`]
  
  @js.native
  sealed trait `485` extends AcCommand
  @scala.inline
  def `485`: `485` = 485.asInstanceOf[`485`]
  
  @js.native
  sealed trait `486` extends AcCommand
  @scala.inline
  def `486`: `486` = 486.asInstanceOf[`486`]
  
  @js.native
  sealed trait `487` extends AcCommand
  @scala.inline
  def `487`: `487` = 487.asInstanceOf[`487`]
  
  @js.native
  sealed trait `488` extends AcCommand
  @scala.inline
  def `488`: `488` = 488.asInstanceOf[`488`]
  
  @js.native
  sealed trait `489` extends AcCommand
  @scala.inline
  def `489`: `489` = 489.asInstanceOf[`489`]
  
  @js.native
  sealed trait `49`
    extends AcCommand
       with Constants
  @scala.inline
  def `49`: `49` = 49.asInstanceOf[`49`]
  
  @js.native
  sealed trait `490` extends AcCommand
  @scala.inline
  def `490`: `490` = 490.asInstanceOf[`490`]
  
  @js.native
  sealed trait `491` extends AcCommand
  @scala.inline
  def `491`: `491` = 491.asInstanceOf[`491`]
  
  @js.native
  sealed trait `492` extends AcCommand
  @scala.inline
  def `492`: `492` = 492.asInstanceOf[`492`]
  
  @js.native
  sealed trait `493` extends AcCommand
  @scala.inline
  def `493`: `493` = 493.asInstanceOf[`493`]
  
  @js.native
  sealed trait `494` extends AcCommand
  @scala.inline
  def `494`: `494` = 494.asInstanceOf[`494`]
  
  @js.native
  sealed trait `495` extends AcCommand
  @scala.inline
  def `495`: `495` = 495.asInstanceOf[`495`]
  
  @js.native
  sealed trait `496` extends AcCommand
  @scala.inline
  def `496`: `496` = 496.asInstanceOf[`496`]
  
  @js.native
  sealed trait `497` extends AcCommand
  @scala.inline
  def `497`: `497` = 497.asInstanceOf[`497`]
  
  @js.native
  sealed trait `498` extends AcCommand
  @scala.inline
  def `498`: `498` = 498.asInstanceOf[`498`]
  
  @js.native
  sealed trait `499` extends AcCommand
  @scala.inline
  def `499`: `499` = 499.asInstanceOf[`499`]
  
  @js.native
  sealed trait `5`
    extends AcColorIndex
       with AcCommand
       with AcCurrentView
       with AcDefView
       with AcFormView
       with AcFormatConditionOperator
       with AcHyperlinkPart
       with AcImeMode
       with AcObjectType
       with AcOutputObjectType
       with AcPictureCaptionArrangement
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcProperty
       with AcRecord
       with AcReportSection
       with AcSendObjectType
       with AcSpreadSheetType
       with AcSysCmdAction
       with AcTextTransferType
       with AcView
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
       with WIZ_SW_FLAGS
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  
  @js.native
  sealed trait `50`
    extends AcCommand
       with Constants
  @scala.inline
  def `50`: `50` = 50.asInstanceOf[`50`]
  
  @js.native
  sealed trait `500` extends AcCommand
  @scala.inline
  def `500`: `500` = 500.asInstanceOf[`500`]
  
  @js.native
  sealed trait `501` extends AcCommand
  @scala.inline
  def `501`: `501` = 501.asInstanceOf[`501`]
  
  @js.native
  sealed trait `504` extends AcCommand
  @scala.inline
  def `504`: `504` = 504.asInstanceOf[`504`]
  
  @js.native
  sealed trait `505` extends AcCommand
  @scala.inline
  def `505`: `505` = 505.asInstanceOf[`505`]
  
  @js.native
  sealed trait `506` extends AcCommand
  @scala.inline
  def `506`: `506` = 506.asInstanceOf[`506`]
  
  @js.native
  sealed trait `507` extends AcCommand
  @scala.inline
  def `507`: `507` = 507.asInstanceOf[`507`]
  
  @js.native
  sealed trait `508` extends AcCommand
  @scala.inline
  def `508`: `508` = 508.asInstanceOf[`508`]
  
  @js.native
  sealed trait `51`
    extends AcCommand
       with Constants
  @scala.inline
  def `51`: `51` = 51.asInstanceOf[`51`]
  
  @js.native
  sealed trait `511` extends AcCommand
  @scala.inline
  def `511`: `511` = 511.asInstanceOf[`511`]
  
  @js.native
  sealed trait `513` extends AcCommand
  @scala.inline
  def `513`: `513` = 513.asInstanceOf[`513`]
  
  @js.native
  sealed trait `514` extends AcCommand
  @scala.inline
  def `514`: `514` = 514.asInstanceOf[`514`]
  
  @js.native
  sealed trait `515` extends AcCommand
  @scala.inline
  def `515`: `515` = 515.asInstanceOf[`515`]
  
  @js.native
  sealed trait `516` extends AcCommand
  @scala.inline
  def `516`: `516` = 516.asInstanceOf[`516`]
  
  @js.native
  sealed trait `517` extends AcCommand
  @scala.inline
  def `517`: `517` = 517.asInstanceOf[`517`]
  
  @js.native
  sealed trait `519` extends AcCommand
  @scala.inline
  def `519`: `519` = 519.asInstanceOf[`519`]
  
  @js.native
  sealed trait `52`
    extends AcCommand
       with Constants
  @scala.inline
  def `52`: `52` = 52.asInstanceOf[`52`]
  
  @js.native
  sealed trait `520` extends AcCommand
  @scala.inline
  def `520`: `520` = 520.asInstanceOf[`520`]
  
  @js.native
  sealed trait `521` extends AcCommand
  @scala.inline
  def `521`: `521` = 521.asInstanceOf[`521`]
  
  @js.native
  sealed trait `522` extends AcCommand
  @scala.inline
  def `522`: `522` = 522.asInstanceOf[`522`]
  
  @js.native
  sealed trait `524` extends AcCommand
  @scala.inline
  def `524`: `524` = 524.asInstanceOf[`524`]
  
  @js.native
  sealed trait `524288` extends OldConstants
  @scala.inline
  def `524288`: `524288` = 524288.asInstanceOf[`524288`]
  
  @js.native
  sealed trait `525` extends AcCommand
  @scala.inline
  def `525`: `525` = 525.asInstanceOf[`525`]
  
  @js.native
  sealed trait `526` extends AcCommand
  @scala.inline
  def `526`: `526` = 526.asInstanceOf[`526`]
  
  @js.native
  sealed trait `527` extends AcCommand
  @scala.inline
  def `527`: `527` = 527.asInstanceOf[`527`]
  
  @js.native
  sealed trait `528` extends AcCommand
  @scala.inline
  def `528`: `528` = 528.asInstanceOf[`528`]
  
  @js.native
  sealed trait `529` extends AcCommand
  @scala.inline
  def `529`: `529` = 529.asInstanceOf[`529`]
  
  @js.native
  sealed trait `53`
    extends AcCommand
       with Constants
  @scala.inline
  def `53`: `53` = 53.asInstanceOf[`53`]
  
  @js.native
  sealed trait `530` extends AcCommand
  @scala.inline
  def `530`: `530` = 530.asInstanceOf[`530`]
  
  @js.native
  sealed trait `531` extends AcCommand
  @scala.inline
  def `531`: `531` = 531.asInstanceOf[`531`]
  
  @js.native
  sealed trait `532` extends AcCommand
  @scala.inline
  def `532`: `532` = 532.asInstanceOf[`532`]
  
  @js.native
  sealed trait `533` extends AcCommand
  @scala.inline
  def `533`: `533` = 533.asInstanceOf[`533`]
  
  @js.native
  sealed trait `534` extends AcCommand
  @scala.inline
  def `534`: `534` = 534.asInstanceOf[`534`]
  
  @js.native
  sealed trait `535` extends AcCommand
  @scala.inline
  def `535`: `535` = 535.asInstanceOf[`535`]
  
  @js.native
  sealed trait `536` extends AcCommand
  @scala.inline
  def `536`: `536` = 536.asInstanceOf[`536`]
  
  @js.native
  sealed trait `536870912` extends OldConstants
  @scala.inline
  def `536870912`: `536870912` = 536870912.asInstanceOf[`536870912`]
  
  @js.native
  sealed trait `537` extends AcCommand
  @scala.inline
  def `537`: `537` = 537.asInstanceOf[`537`]
  
  @js.native
  sealed trait `538` extends AcCommand
  @scala.inline
  def `538`: `538` = 538.asInstanceOf[`538`]
  
  @js.native
  sealed trait `539` extends AcCommand
  @scala.inline
  def `539`: `539` = 539.asInstanceOf[`539`]
  
  @js.native
  sealed trait `54`
    extends AcCommand
       with Constants
  @scala.inline
  def `54`: `54` = 54.asInstanceOf[`54`]
  
  @js.native
  sealed trait `540` extends AcCommand
  @scala.inline
  def `540`: `540` = 540.asInstanceOf[`540`]
  
  @js.native
  sealed trait `541` extends AcCommand
  @scala.inline
  def `541`: `541` = 541.asInstanceOf[`541`]
  
  @js.native
  sealed trait `542` extends AcCommand
  @scala.inline
  def `542`: `542` = 542.asInstanceOf[`542`]
  
  @js.native
  sealed trait `543` extends AcCommand
  @scala.inline
  def `543`: `543` = 543.asInstanceOf[`543`]
  
  @js.native
  sealed trait `544` extends AcCommand
  @scala.inline
  def `544`: `544` = 544.asInstanceOf[`544`]
  
  @js.native
  sealed trait `545` extends AcCommand
  @scala.inline
  def `545`: `545` = 545.asInstanceOf[`545`]
  
  @js.native
  sealed trait `546` extends AcCommand
  @scala.inline
  def `546`: `546` = 546.asInstanceOf[`546`]
  
  @js.native
  sealed trait `547` extends AcCommand
  @scala.inline
  def `547`: `547` = 547.asInstanceOf[`547`]
  
  @js.native
  sealed trait `548` extends AcCommand
  @scala.inline
  def `548`: `548` = 548.asInstanceOf[`548`]
  
  @js.native
  sealed trait `549` extends AcCommand
  @scala.inline
  def `549`: `549` = 549.asInstanceOf[`549`]
  
  @js.native
  sealed trait `55`
    extends AcCommand
       with Constants
  @scala.inline
  def `55`: `55` = 55.asInstanceOf[`55`]
  
  @js.native
  sealed trait `550` extends AcCommand
  @scala.inline
  def `550`: `550` = 550.asInstanceOf[`550`]
  
  @js.native
  sealed trait `551` extends AcCommand
  @scala.inline
  def `551`: `551` = 551.asInstanceOf[`551`]
  
  @js.native
  sealed trait `552` extends AcCommand
  @scala.inline
  def `552`: `552` = 552.asInstanceOf[`552`]
  
  @js.native
  sealed trait `553` extends AcCommand
  @scala.inline
  def `553`: `553` = 553.asInstanceOf[`553`]
  
  @js.native
  sealed trait `554` extends AcCommand
  @scala.inline
  def `554`: `554` = 554.asInstanceOf[`554`]
  
  @js.native
  sealed trait `555` extends AcCommand
  @scala.inline
  def `555`: `555` = 555.asInstanceOf[`555`]
  
  @js.native
  sealed trait `556` extends AcCommand
  @scala.inline
  def `556`: `556` = 556.asInstanceOf[`556`]
  
  @js.native
  sealed trait `557` extends AcCommand
  @scala.inline
  def `557`: `557` = 557.asInstanceOf[`557`]
  
  @js.native
  sealed trait `558` extends AcCommand
  @scala.inline
  def `558`: `558` = 558.asInstanceOf[`558`]
  
  @js.native
  sealed trait `559` extends AcCommand
  @scala.inline
  def `559`: `559` = 559.asInstanceOf[`559`]
  
  @js.native
  sealed trait `56`
    extends AcCommand
       with Constants
  @scala.inline
  def `56`: `56` = 56.asInstanceOf[`56`]
  
  @js.native
  sealed trait `560` extends AcCommand
  @scala.inline
  def `560`: `560` = 560.asInstanceOf[`560`]
  
  @js.native
  sealed trait `561` extends AcCommand
  @scala.inline
  def `561`: `561` = 561.asInstanceOf[`561`]
  
  @js.native
  sealed trait `562` extends AcCommand
  @scala.inline
  def `562`: `562` = 562.asInstanceOf[`562`]
  
  @js.native
  sealed trait `563` extends AcCommand
  @scala.inline
  def `563`: `563` = 563.asInstanceOf[`563`]
  
  @js.native
  sealed trait `564` extends AcCommand
  @scala.inline
  def `564`: `564` = 564.asInstanceOf[`564`]
  
  @js.native
  sealed trait `565` extends AcCommand
  @scala.inline
  def `565`: `565` = 565.asInstanceOf[`565`]
  
  @js.native
  sealed trait `566` extends AcCommand
  @scala.inline
  def `566`: `566` = 566.asInstanceOf[`566`]
  
  @js.native
  sealed trait `567` extends AcCommand
  @scala.inline
  def `567`: `567` = 567.asInstanceOf[`567`]
  
  @js.native
  sealed trait `568` extends AcCommand
  @scala.inline
  def `568`: `568` = 568.asInstanceOf[`568`]
  
  @js.native
  sealed trait `569` extends AcCommand
  @scala.inline
  def `569`: `569` = 569.asInstanceOf[`569`]
  
  @js.native
  sealed trait `57`
    extends AcCommand
       with Constants
  @scala.inline
  def `57`: `57` = 57.asInstanceOf[`57`]
  
  @js.native
  sealed trait `570` extends AcCommand
  @scala.inline
  def `570`: `570` = 570.asInstanceOf[`570`]
  
  @js.native
  sealed trait `571` extends AcCommand
  @scala.inline
  def `571`: `571` = 571.asInstanceOf[`571`]
  
  @js.native
  sealed trait `572` extends AcCommand
  @scala.inline
  def `572`: `572` = 572.asInstanceOf[`572`]
  
  @js.native
  sealed trait `573` extends AcCommand
  @scala.inline
  def `573`: `573` = 573.asInstanceOf[`573`]
  
  @js.native
  sealed trait `574` extends AcCommand
  @scala.inline
  def `574`: `574` = 574.asInstanceOf[`574`]
  
  @js.native
  sealed trait `575` extends AcCommand
  @scala.inline
  def `575`: `575` = 575.asInstanceOf[`575`]
  
  @js.native
  sealed trait `576` extends AcCommand
  @scala.inline
  def `576`: `576` = 576.asInstanceOf[`576`]
  
  @js.native
  sealed trait `577` extends AcCommand
  @scala.inline
  def `577`: `577` = 577.asInstanceOf[`577`]
  
  @js.native
  sealed trait `578` extends AcCommand
  @scala.inline
  def `578`: `578` = 578.asInstanceOf[`578`]
  
  @js.native
  sealed trait `579` extends AcCommand
  @scala.inline
  def `579`: `579` = 579.asInstanceOf[`579`]
  
  @js.native
  sealed trait `58` extends AcCommand
  @scala.inline
  def `58`: `58` = 58.asInstanceOf[`58`]
  
  @js.native
  sealed trait `580` extends AcCommand
  @scala.inline
  def `580`: `580` = 580.asInstanceOf[`580`]
  
  @js.native
  sealed trait `581` extends AcCommand
  @scala.inline
  def `581`: `581` = 581.asInstanceOf[`581`]
  
  @js.native
  sealed trait `582` extends AcCommand
  @scala.inline
  def `582`: `582` = 582.asInstanceOf[`582`]
  
  @js.native
  sealed trait `583` extends AcCommand
  @scala.inline
  def `583`: `583` = 583.asInstanceOf[`583`]
  
  @js.native
  sealed trait `584` extends AcCommand
  @scala.inline
  def `584`: `584` = 584.asInstanceOf[`584`]
  
  @js.native
  sealed trait `585` extends AcCommand
  @scala.inline
  def `585`: `585` = 585.asInstanceOf[`585`]
  
  @js.native
  sealed trait `586` extends AcCommand
  @scala.inline
  def `586`: `586` = 586.asInstanceOf[`586`]
  
  @js.native
  sealed trait `587` extends AcCommand
  @scala.inline
  def `587`: `587` = 587.asInstanceOf[`587`]
  
  @js.native
  sealed trait `588` extends AcCommand
  @scala.inline
  def `588`: `588` = 588.asInstanceOf[`588`]
  
  @js.native
  sealed trait `589` extends AcCommand
  @scala.inline
  def `589`: `589` = 589.asInstanceOf[`589`]
  
  @js.native
  sealed trait `59` extends AcCommand
  @scala.inline
  def `59`: `59` = 59.asInstanceOf[`59`]
  
  @js.native
  sealed trait `590` extends AcCommand
  @scala.inline
  def `590`: `590` = 590.asInstanceOf[`590`]
  
  @js.native
  sealed trait `591` extends AcCommand
  @scala.inline
  def `591`: `591` = 591.asInstanceOf[`591`]
  
  @js.native
  sealed trait `592` extends AcCommand
  @scala.inline
  def `592`: `592` = 592.asInstanceOf[`592`]
  
  @js.native
  sealed trait `593` extends AcCommand
  @scala.inline
  def `593`: `593` = 593.asInstanceOf[`593`]
  
  @js.native
  sealed trait `594` extends AcCommand
  @scala.inline
  def `594`: `594` = 594.asInstanceOf[`594`]
  
  @js.native
  sealed trait `595` extends AcCommand
  @scala.inline
  def `595`: `595` = 595.asInstanceOf[`595`]
  
  @js.native
  sealed trait `596` extends AcCommand
  @scala.inline
  def `596`: `596` = 596.asInstanceOf[`596`]
  
  @js.native
  sealed trait `597` extends AcCommand
  @scala.inline
  def `597`: `597` = 597.asInstanceOf[`597`]
  
  @js.native
  sealed trait `598` extends AcCommand
  @scala.inline
  def `598`: `598` = 598.asInstanceOf[`598`]
  
  @js.native
  sealed trait `599` extends AcCommand
  @scala.inline
  def `599`: `599` = 599.asInstanceOf[`599`]
  
  @js.native
  sealed trait `6`
    extends AcColorIndex
       with AcCommand
       with AcCurrentView
       with AcFormView
       with AcFormatConditionOperator
       with AcImeMode
       with AcObjectType
       with AcOutputObjectType
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcProperty
       with AcReportSection
       with AcSendObjectType
       with AcSpreadSheetType
       with AcSysCmdAction
       with AcTextTransferType
       with AcView
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
  
  @js.native
  sealed trait `60` extends AcCommand
  @scala.inline
  def `60`: `60` = 60.asInstanceOf[`60`]
  
  @js.native
  sealed trait `600` extends AcCommand
  @scala.inline
  def `600`: `600` = 600.asInstanceOf[`600`]
  
  @js.native
  sealed trait `601` extends AcCommand
  @scala.inline
  def `601`: `601` = 601.asInstanceOf[`601`]
  
  @js.native
  sealed trait `602` extends AcCommand
  @scala.inline
  def `602`: `602` = 602.asInstanceOf[`602`]
  
  @js.native
  sealed trait `603` extends AcCommand
  @scala.inline
  def `603`: `603` = 603.asInstanceOf[`603`]
  
  @js.native
  sealed trait `604` extends AcCommand
  @scala.inline
  def `604`: `604` = 604.asInstanceOf[`604`]
  
  @js.native
  sealed trait `605` extends AcCommand
  @scala.inline
  def `605`: `605` = 605.asInstanceOf[`605`]
  
  @js.native
  sealed trait `606` extends AcCommand
  @scala.inline
  def `606`: `606` = 606.asInstanceOf[`606`]
  
  @js.native
  sealed trait `607` extends AcCommand
  @scala.inline
  def `607`: `607` = 607.asInstanceOf[`607`]
  
  @js.native
  sealed trait `608` extends AcCommand
  @scala.inline
  def `608`: `608` = 608.asInstanceOf[`608`]
  
  @js.native
  sealed trait `609` extends AcCommand
  @scala.inline
  def `609`: `609` = 609.asInstanceOf[`609`]
  
  @js.native
  sealed trait `61` extends AcCommand
  @scala.inline
  def `61`: `61` = 61.asInstanceOf[`61`]
  
  @js.native
  sealed trait `610` extends AcCommand
  @scala.inline
  def `610`: `610` = 610.asInstanceOf[`610`]
  
  @js.native
  sealed trait `611` extends AcCommand
  @scala.inline
  def `611`: `611` = 611.asInstanceOf[`611`]
  
  @js.native
  sealed trait `612` extends AcCommand
  @scala.inline
  def `612`: `612` = 612.asInstanceOf[`612`]
  
  @js.native
  sealed trait `613` extends AcCommand
  @scala.inline
  def `613`: `613` = 613.asInstanceOf[`613`]
  
  @js.native
  sealed trait `614` extends AcCommand
  @scala.inline
  def `614`: `614` = 614.asInstanceOf[`614`]
  
  @js.native
  sealed trait `615` extends AcCommand
  @scala.inline
  def `615`: `615` = 615.asInstanceOf[`615`]
  
  @js.native
  sealed trait `616` extends AcCommand
  @scala.inline
  def `616`: `616` = 616.asInstanceOf[`616`]
  
  @js.native
  sealed trait `617` extends AcCommand
  @scala.inline
  def `617`: `617` = 617.asInstanceOf[`617`]
  
  @js.native
  sealed trait `618` extends AcCommand
  @scala.inline
  def `618`: `618` = 618.asInstanceOf[`618`]
  
  @js.native
  sealed trait `619` extends AcCommand
  @scala.inline
  def `619`: `619` = 619.asInstanceOf[`619`]
  
  @js.native
  sealed trait `62` extends AcCommand
  @scala.inline
  def `62`: `62` = 62.asInstanceOf[`62`]
  
  @js.native
  sealed trait `620` extends AcCommand
  @scala.inline
  def `620`: `620` = 620.asInstanceOf[`620`]
  
  @js.native
  sealed trait `621` extends AcCommand
  @scala.inline
  def `621`: `621` = 621.asInstanceOf[`621`]
  
  @js.native
  sealed trait `622` extends AcCommand
  @scala.inline
  def `622`: `622` = 622.asInstanceOf[`622`]
  
  @js.native
  sealed trait `623` extends AcCommand
  @scala.inline
  def `623`: `623` = 623.asInstanceOf[`623`]
  
  @js.native
  sealed trait `624` extends AcCommand
  @scala.inline
  def `624`: `624` = 624.asInstanceOf[`624`]
  
  @js.native
  sealed trait `625` extends AcCommand
  @scala.inline
  def `625`: `625` = 625.asInstanceOf[`625`]
  
  @js.native
  sealed trait `626` extends AcCommand
  @scala.inline
  def `626`: `626` = 626.asInstanceOf[`626`]
  
  @js.native
  sealed trait `627` extends AcCommand
  @scala.inline
  def `627`: `627` = 627.asInstanceOf[`627`]
  
  @js.native
  sealed trait `628` extends AcCommand
  @scala.inline
  def `628`: `628` = 628.asInstanceOf[`628`]
  
  @js.native
  sealed trait `629` extends AcCommand
  @scala.inline
  def `629`: `629` = 629.asInstanceOf[`629`]
  
  @js.native
  sealed trait `63` extends AcCommand
  @scala.inline
  def `63`: `63` = 63.asInstanceOf[`63`]
  
  @js.native
  sealed trait `630` extends AcCommand
  @scala.inline
  def `630`: `630` = 630.asInstanceOf[`630`]
  
  @js.native
  sealed trait `631` extends AcCommand
  @scala.inline
  def `631`: `631` = 631.asInstanceOf[`631`]
  
  @js.native
  sealed trait `632` extends AcCommand
  @scala.inline
  def `632`: `632` = 632.asInstanceOf[`632`]
  
  @js.native
  sealed trait `633` extends AcCommand
  @scala.inline
  def `633`: `633` = 633.asInstanceOf[`633`]
  
  @js.native
  sealed trait `634` extends AcCommand
  @scala.inline
  def `634`: `634` = 634.asInstanceOf[`634`]
  
  @js.native
  sealed trait `635` extends AcCommand
  @scala.inline
  def `635`: `635` = 635.asInstanceOf[`635`]
  
  @js.native
  sealed trait `636` extends AcCommand
  @scala.inline
  def `636`: `636` = 636.asInstanceOf[`636`]
  
  @js.native
  sealed trait `637` extends AcCommand
  @scala.inline
  def `637`: `637` = 637.asInstanceOf[`637`]
  
  @js.native
  sealed trait `638` extends AcCommand
  @scala.inline
  def `638`: `638` = 638.asInstanceOf[`638`]
  
  @js.native
  sealed trait `639` extends AcCommand
  @scala.inline
  def `639`: `639` = 639.asInstanceOf[`639`]
  
  @js.native
  sealed trait `64`
    extends AcCommand
       with OldConstants
  @scala.inline
  def `64`: `64` = 64.asInstanceOf[`64`]
  
  @js.native
  sealed trait `640` extends AcCommand
  @scala.inline
  def `640`: `640` = 640.asInstanceOf[`640`]
  
  @js.native
  sealed trait `641` extends AcCommand
  @scala.inline
  def `641`: `641` = 641.asInstanceOf[`641`]
  
  @js.native
  sealed trait `642` extends AcCommand
  @scala.inline
  def `642`: `642` = 642.asInstanceOf[`642`]
  
  @js.native
  sealed trait `643` extends AcCommand
  @scala.inline
  def `643`: `643` = 643.asInstanceOf[`643`]
  
  @js.native
  sealed trait `644` extends AcCommand
  @scala.inline
  def `644`: `644` = 644.asInstanceOf[`644`]
  
  @js.native
  sealed trait `645` extends AcCommand
  @scala.inline
  def `645`: `645` = 645.asInstanceOf[`645`]
  
  @js.native
  sealed trait `646` extends AcCommand
  @scala.inline
  def `646`: `646` = 646.asInstanceOf[`646`]
  
  @js.native
  sealed trait `647` extends AcCommand
  @scala.inline
  def `647`: `647` = 647.asInstanceOf[`647`]
  
  @js.native
  sealed trait `648` extends AcCommand
  @scala.inline
  def `648`: `648` = 648.asInstanceOf[`648`]
  
  @js.native
  sealed trait `649` extends AcCommand
  @scala.inline
  def `649`: `649` = 649.asInstanceOf[`649`]
  
  @js.native
  sealed trait `65`
    extends AcCommand
       with Constants
  @scala.inline
  def `65`: `65` = 65.asInstanceOf[`65`]
  
  @js.native
  sealed trait `650` extends AcCommand
  @scala.inline
  def `650`: `650` = 650.asInstanceOf[`650`]
  
  @js.native
  sealed trait `651` extends AcCommand
  @scala.inline
  def `651`: `651` = 651.asInstanceOf[`651`]
  
  @js.native
  sealed trait `652` extends AcCommand
  @scala.inline
  def `652`: `652` = 652.asInstanceOf[`652`]
  
  @js.native
  sealed trait `653` extends AcCommand
  @scala.inline
  def `653`: `653` = 653.asInstanceOf[`653`]
  
  @js.native
  sealed trait `654` extends AcCommand
  @scala.inline
  def `654`: `654` = 654.asInstanceOf[`654`]
  
  @js.native
  sealed trait `655` extends AcCommand
  @scala.inline
  def `655`: `655` = 655.asInstanceOf[`655`]
  
  @js.native
  sealed trait `65536` extends OldConstants
  @scala.inline
  def `65536`: `65536` = 65536.asInstanceOf[`65536`]
  
  @js.native
  sealed trait `65542`
    extends Constants
       with OldConstants
  @scala.inline
  def `65542`: `65542` = 65542.asInstanceOf[`65542`]
  
  @js.native
  sealed trait `65548`
    extends Constants
       with OldConstants
  @scala.inline
  def `65548`: `65548` = 65548.asInstanceOf[`65548`]
  
  @js.native
  sealed trait `656` extends AcCommand
  @scala.inline
  def `656`: `656` = 656.asInstanceOf[`656`]
  
  @js.native
  sealed trait `657` extends AcCommand
  @scala.inline
  def `657`: `657` = 657.asInstanceOf[`657`]
  
  @js.native
  sealed trait `658` extends AcCommand
  @scala.inline
  def `658`: `658` = 658.asInstanceOf[`658`]
  
  @js.native
  sealed trait `659` extends AcCommand
  @scala.inline
  def `659`: `659` = 659.asInstanceOf[`659`]
  
  @js.native
  sealed trait `66`
    extends AcCommand
       with Constants
  @scala.inline
  def `66`: `66` = 66.asInstanceOf[`66`]
  
  @js.native
  sealed trait `660` extends AcCommand
  @scala.inline
  def `660`: `660` = 660.asInstanceOf[`660`]
  
  @js.native
  sealed trait `661` extends AcCommand
  @scala.inline
  def `661`: `661` = 661.asInstanceOf[`661`]
  
  @js.native
  sealed trait `662` extends AcCommand
  @scala.inline
  def `662`: `662` = 662.asInstanceOf[`662`]
  
  @js.native
  sealed trait `663` extends AcCommand
  @scala.inline
  def `663`: `663` = 663.asInstanceOf[`663`]
  
  @js.native
  sealed trait `664` extends AcCommand
  @scala.inline
  def `664`: `664` = 664.asInstanceOf[`664`]
  
  @js.native
  sealed trait `665` extends AcCommand
  @scala.inline
  def `665`: `665` = 665.asInstanceOf[`665`]
  
  @js.native
  sealed trait `666` extends AcCommand
  @scala.inline
  def `666`: `666` = 666.asInstanceOf[`666`]
  
  @js.native
  sealed trait `667` extends AcCommand
  @scala.inline
  def `667`: `667` = 667.asInstanceOf[`667`]
  
  @js.native
  sealed trait `668` extends AcCommand
  @scala.inline
  def `668`: `668` = 668.asInstanceOf[`668`]
  
  @js.native
  sealed trait `669` extends AcCommand
  @scala.inline
  def `669`: `669` = 669.asInstanceOf[`669`]
  
  @js.native
  sealed trait `67`
    extends AcCommand
       with Constants
  @scala.inline
  def `67`: `67` = 67.asInstanceOf[`67`]
  
  @js.native
  sealed trait `670` extends AcCommand
  @scala.inline
  def `670`: `670` = 670.asInstanceOf[`670`]
  
  @js.native
  sealed trait `671` extends AcCommand
  @scala.inline
  def `671`: `671` = 671.asInstanceOf[`671`]
  
  @js.native
  sealed trait `672` extends AcCommand
  @scala.inline
  def `672`: `672` = 672.asInstanceOf[`672`]
  
  @js.native
  sealed trait `673` extends AcCommand
  @scala.inline
  def `673`: `673` = 673.asInstanceOf[`673`]
  
  @js.native
  sealed trait `674` extends AcCommand
  @scala.inline
  def `674`: `674` = 674.asInstanceOf[`674`]
  
  @js.native
  sealed trait `675` extends AcCommand
  @scala.inline
  def `675`: `675` = 675.asInstanceOf[`675`]
  
  @js.native
  sealed trait `676` extends AcCommand
  @scala.inline
  def `676`: `676` = 676.asInstanceOf[`676`]
  
  @js.native
  sealed trait `677` extends AcCommand
  @scala.inline
  def `677`: `677` = 677.asInstanceOf[`677`]
  
  @js.native
  sealed trait `678` extends AcCommand
  @scala.inline
  def `678`: `678` = 678.asInstanceOf[`678`]
  
  @js.native
  sealed trait `679` extends AcCommand
  @scala.inline
  def `679`: `679` = 679.asInstanceOf[`679`]
  
  @js.native
  sealed trait `68`
    extends AcCommand
       with Constants
  @scala.inline
  def `68`: `68` = 68.asInstanceOf[`68`]
  
  @js.native
  sealed trait `680` extends AcCommand
  @scala.inline
  def `680`: `680` = 680.asInstanceOf[`680`]
  
  @js.native
  sealed trait `681` extends AcCommand
  @scala.inline
  def `681`: `681` = 681.asInstanceOf[`681`]
  
  @js.native
  sealed trait `682` extends AcCommand
  @scala.inline
  def `682`: `682` = 682.asInstanceOf[`682`]
  
  @js.native
  sealed trait `683` extends AcCommand
  @scala.inline
  def `683`: `683` = 683.asInstanceOf[`683`]
  
  @js.native
  sealed trait `684` extends AcCommand
  @scala.inline
  def `684`: `684` = 684.asInstanceOf[`684`]
  
  @js.native
  sealed trait `685` extends AcCommand
  @scala.inline
  def `685`: `685` = 685.asInstanceOf[`685`]
  
  @js.native
  sealed trait `686` extends AcCommand
  @scala.inline
  def `686`: `686` = 686.asInstanceOf[`686`]
  
  @js.native
  sealed trait `687` extends AcCommand
  @scala.inline
  def `687`: `687` = 687.asInstanceOf[`687`]
  
  @js.native
  sealed trait `688` extends AcCommand
  @scala.inline
  def `688`: `688` = 688.asInstanceOf[`688`]
  
  @js.native
  sealed trait `689` extends AcCommand
  @scala.inline
  def `689`: `689` = 689.asInstanceOf[`689`]
  
  @js.native
  sealed trait `69`
    extends AcCommand
       with Constants
  @scala.inline
  def `69`: `69` = 69.asInstanceOf[`69`]
  
  @js.native
  sealed trait `690` extends AcCommand
  @scala.inline
  def `690`: `690` = 690.asInstanceOf[`690`]
  
  @js.native
  sealed trait `691` extends AcCommand
  @scala.inline
  def `691`: `691` = 691.asInstanceOf[`691`]
  
  @js.native
  sealed trait `692` extends AcCommand
  @scala.inline
  def `692`: `692` = 692.asInstanceOf[`692`]
  
  @js.native
  sealed trait `693` extends AcCommand
  @scala.inline
  def `693`: `693` = 693.asInstanceOf[`693`]
  
  @js.native
  sealed trait `694` extends AcCommand
  @scala.inline
  def `694`: `694` = 694.asInstanceOf[`694`]
  
  @js.native
  sealed trait `695` extends AcCommand
  @scala.inline
  def `695`: `695` = 695.asInstanceOf[`695`]
  
  @js.native
  sealed trait `696` extends AcCommand
  @scala.inline
  def `696`: `696` = 696.asInstanceOf[`696`]
  
  @js.native
  sealed trait `697` extends AcCommand
  @scala.inline
  def `697`: `697` = 697.asInstanceOf[`697`]
  
  @js.native
  sealed trait `698` extends AcCommand
  @scala.inline
  def `698`: `698` = 698.asInstanceOf[`698`]
  
  @js.native
  sealed trait `699` extends AcCommand
  @scala.inline
  def `699`: `699` = 699.asInstanceOf[`699`]
  
  @js.native
  sealed trait `7`
    extends AcColorIndex
       with AcCommand
       with AcCurrentView
       with AcDataObjectType
       with AcExportXMLObjectType
       with AcFileFormat
       with AcFormatConditionOperator
       with AcImeMode
       with AcObjectType
       with AcOutputObjectType
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcProperty
       with AcReportSection
       with AcSpreadSheetType
       with AcSysCmdAction
       with AcTextTransferType
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
       with WIZ_SW_FLAGS
  @scala.inline
  def `7`: `7` = 7.asInstanceOf[`7`]
  
  @js.native
  sealed trait `70`
    extends AcCommand
       with Constants
  @scala.inline
  def `70`: `70` = 70.asInstanceOf[`70`]
  
  @js.native
  sealed trait `700` extends AcCommand
  @scala.inline
  def `700`: `700` = 700.asInstanceOf[`700`]
  
  @js.native
  sealed trait `701` extends AcCommand
  @scala.inline
  def `701`: `701` = 701.asInstanceOf[`701`]
  
  @js.native
  sealed trait `702` extends AcCommand
  @scala.inline
  def `702`: `702` = 702.asInstanceOf[`702`]
  
  @js.native
  sealed trait `703` extends AcCommand
  @scala.inline
  def `703`: `703` = 703.asInstanceOf[`703`]
  
  @js.native
  sealed trait `704` extends AcCommand
  @scala.inline
  def `704`: `704` = 704.asInstanceOf[`704`]
  
  @js.native
  sealed trait `705` extends AcCommand
  @scala.inline
  def `705`: `705` = 705.asInstanceOf[`705`]
  
  @js.native
  sealed trait `706` extends AcCommand
  @scala.inline
  def `706`: `706` = 706.asInstanceOf[`706`]
  
  @js.native
  sealed trait `707` extends AcCommand
  @scala.inline
  def `707`: `707` = 707.asInstanceOf[`707`]
  
  @js.native
  sealed trait `708` extends AcCommand
  @scala.inline
  def `708`: `708` = 708.asInstanceOf[`708`]
  
  @js.native
  sealed trait `709` extends AcCommand
  @scala.inline
  def `709`: `709` = 709.asInstanceOf[`709`]
  
  @js.native
  sealed trait `71`
    extends AcCommand
       with Constants
  @scala.inline
  def `71`: `71` = 71.asInstanceOf[`71`]
  
  @js.native
  sealed trait `710` extends AcCommand
  @scala.inline
  def `710`: `710` = 710.asInstanceOf[`710`]
  
  @js.native
  sealed trait `711` extends AcCommand
  @scala.inline
  def `711`: `711` = 711.asInstanceOf[`711`]
  
  @js.native
  sealed trait `712` extends AcCommand
  @scala.inline
  def `712`: `712` = 712.asInstanceOf[`712`]
  
  @js.native
  sealed trait `713` extends AcCommand
  @scala.inline
  def `713`: `713` = 713.asInstanceOf[`713`]
  
  @js.native
  sealed trait `714` extends AcCommand
  @scala.inline
  def `714`: `714` = 714.asInstanceOf[`714`]
  
  @js.native
  sealed trait `715` extends AcCommand
  @scala.inline
  def `715`: `715` = 715.asInstanceOf[`715`]
  
  @js.native
  sealed trait `716` extends AcCommand
  @scala.inline
  def `716`: `716` = 716.asInstanceOf[`716`]
  
  @js.native
  sealed trait `717` extends AcCommand
  @scala.inline
  def `717`: `717` = 717.asInstanceOf[`717`]
  
  @js.native
  sealed trait `718` extends AcCommand
  @scala.inline
  def `718`: `718` = 718.asInstanceOf[`718`]
  
  @js.native
  sealed trait `719` extends AcCommand
  @scala.inline
  def `719`: `719` = 719.asInstanceOf[`719`]
  
  @js.native
  sealed trait `72`
    extends AcCommand
       with Constants
  @scala.inline
  def `72`: `72` = 72.asInstanceOf[`72`]
  
  @js.native
  sealed trait `720` extends AcCommand
  @scala.inline
  def `720`: `720` = 720.asInstanceOf[`720`]
  
  @js.native
  sealed trait `721` extends AcCommand
  @scala.inline
  def `721`: `721` = 721.asInstanceOf[`721`]
  
  @js.native
  sealed trait `722` extends AcCommand
  @scala.inline
  def `722`: `722` = 722.asInstanceOf[`722`]
  
  @js.native
  sealed trait `723` extends AcCommand
  @scala.inline
  def `723`: `723` = 723.asInstanceOf[`723`]
  
  @js.native
  sealed trait `724` extends AcCommand
  @scala.inline
  def `724`: `724` = 724.asInstanceOf[`724`]
  
  @js.native
  sealed trait `73`
    extends AcCommand
       with Constants
  @scala.inline
  def `73`: `73` = 73.asInstanceOf[`73`]
  
  @js.native
  sealed trait `74`
    extends AcCommand
       with Constants
  @scala.inline
  def `74`: `74` = 74.asInstanceOf[`74`]
  
  @js.native
  sealed trait `75`
    extends AcCommand
       with Constants
  @scala.inline
  def `75`: `75` = 75.asInstanceOf[`75`]
  
  @js.native
  sealed trait `76`
    extends AcCommand
       with Constants
  @scala.inline
  def `76`: `76` = 76.asInstanceOf[`76`]
  
  @js.native
  sealed trait `77`
    extends AcCommand
       with Constants
  @scala.inline
  def `77`: `77` = 77.asInstanceOf[`77`]
  
  @js.native
  sealed trait `78`
    extends AcCommand
       with Constants
  @scala.inline
  def `78`: `78` = 78.asInstanceOf[`78`]
  
  @js.native
  sealed trait `79`
    extends AcCommand
       with Constants
  @scala.inline
  def `79`: `79` = 79.asInstanceOf[`79`]
  
  @js.native
  sealed trait `8`
    extends AcColorIndex
       with AcCommand
       with AcExportXMLOtherFlags
       with AcFileFormat
       with AcImeMode
       with AcObjectType
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcProperty
       with AcReportSection
       with AcSpreadSheetType
       with AcSysCmdAction
       with AcTextTransferType
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `8`: `8` = 8.asInstanceOf[`8`]
  
  @js.native
  sealed trait `80`
    extends AcCommand
       with Constants
       with OldConstants
  @scala.inline
  def `80`: `80` = 80.asInstanceOf[`80`]
  
  @js.native
  sealed trait `81`
    extends AcCommand
       with Constants
  @scala.inline
  def `81`: `81` = 81.asInstanceOf[`81`]
  
  @js.native
  sealed trait `82`
    extends AcCommand
       with Constants
  @scala.inline
  def `82`: `82` = 82.asInstanceOf[`82`]
  
  @js.native
  sealed trait `83` extends Constants
  @scala.inline
  def `83`: `83` = 83.asInstanceOf[`83`]
  
  @js.native
  sealed trait `84`
    extends AcCommand
       with Constants
  @scala.inline
  def `84`: `84` = 84.asInstanceOf[`84`]
  
  @js.native
  sealed trait `85`
    extends AcCommand
       with Constants
  @scala.inline
  def `85`: `85` = 85.asInstanceOf[`85`]
  
  @js.native
  sealed trait `86`
    extends AcCommand
       with Constants
  @scala.inline
  def `86`: `86` = 86.asInstanceOf[`86`]
  
  @js.native
  sealed trait `87`
    extends AcCommand
       with Constants
  @scala.inline
  def `87`: `87` = 87.asInstanceOf[`87`]
  
  @js.native
  sealed trait `88`
    extends AcCommand
       with Constants
  @scala.inline
  def `88`: `88` = 88.asInstanceOf[`88`]
  
  @js.native
  sealed trait `89`
    extends AcCommand
       with Constants
  @scala.inline
  def `89`: `89` = 89.asInstanceOf[`89`]
  
  @js.native
  sealed trait `9`
    extends AcColorIndex
       with AcCommand
       with AcDataObjectType
       with AcExportXMLObjectType
       with AcFileFormat
       with AcImeMode
       with AcNewDatabaseFormat
       with AcObjectType
       with AcOutputObjectType
       with AcPrintPaperBin
       with AcPrintPaperSize
       with AcProperty
       with AcSpreadSheetType
       with AcSysCmdAction
       with AcTextTransferType
       with Constants
       with OldConstants
       with WIZ_CSIDL_FLAGS
  @scala.inline
  def `9`: `9` = 9.asInstanceOf[`9`]
  
  @js.native
  sealed trait `90`
    extends AcCommand
       with Constants
  @scala.inline
  def `90`: `90` = 90.asInstanceOf[`90`]
  
  @js.native
  sealed trait `91` extends AcCommand
  @scala.inline
  def `91`: `91` = 91.asInstanceOf[`91`]
  
  @js.native
  sealed trait `92` extends AcCommand
  @scala.inline
  def `92`: `92` = 92.asInstanceOf[`92`]
  
  @js.native
  sealed trait `93` extends AcCommand
  @scala.inline
  def `93`: `93` = 93.asInstanceOf[`93`]
  
  @js.native
  sealed trait `94` extends AcCommand
  @scala.inline
  def `94`: `94` = 94.asInstanceOf[`94`]
  
  @js.native
  sealed trait `95` extends AcCommand
  @scala.inline
  def `95`: `95` = 95.asInstanceOf[`95`]
  
  @js.native
  sealed trait `96`
    extends AcCommand
       with Constants
       with OldConstants
  @scala.inline
  def `96`: `96` = 96.asInstanceOf[`96`]
  
  @js.native
  sealed trait `97`
    extends AcCommand
       with Constants
  @scala.inline
  def `97`: `97` = 97.asInstanceOf[`97`]
  
  @js.native
  sealed trait `98` extends Constants
  @scala.inline
  def `98`: `98` = 98.asInstanceOf[`98`]
  
  @js.native
  sealed trait `99`
    extends AcCommand
       with Constants
  @scala.inline
  def `99`: `99` = 99.asInstanceOf[`99`]
}
