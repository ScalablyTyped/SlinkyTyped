package typingsSlinky.activexDashPowerpoint

import typingsSlinky.activexDashPowerpoint.PowerPoint.Application
import typingsSlinky.activexDashPowerpoint.PowerPoint.OLEControl
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.AfterNewPresentation
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.AfterPresentationOpen
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.Cancel
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.ColorSchemeChanged
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.GotFocus
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.LostFocus
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.NewPresentation
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.Pres
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationBeforeClose
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationBeforeSave
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationClose
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationCloseFinal
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationNewSlide
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationOpen
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationPrint
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationSave
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.PresentationSync
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.ProtViewWindow
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewCloseReason
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowActivate
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowBeforeClose
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowBeforeEdit
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowDeactivate
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowOpen
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.Sel
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.Sld
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SldRange
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SlideSelectionChanged
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowBegin
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowEnd
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowNextBuild
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowNextClick
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowNextSlide
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowOnNext
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowOnPrevious
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.SyncEventType
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.WindowActivate
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.WindowBeforeDoubleClick
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.WindowBeforeRightClick
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.WindowDeactivate
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.WindowSelectionChange
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.Wn
import typingsSlinky.activexDashPowerpoint.activexDashPowerpointStrings.nEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: AfterNewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AfterPresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ColorSchemeChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_SldRange, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeClose,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeSave,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationCloseFinal,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationClose,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationNewSlide,
    argNames: js.Array[Sld],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sld, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationPrint,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSave,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSync,
    argNames: js.Tuple2[Pres, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PresSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[ProtViewWindow, ProtectedViewCloseReason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[ProtViewWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelProtViewWindowBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideSelectionChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_SldRange, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowBegin,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowEnd,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextBuild,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextClick,
    argNames: js.Tuple2[Wn, nEffect],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_NEffect, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextSlide,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnNext,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnPrevious,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeDoubleClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeRightClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sel, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OLEControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OLEControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

