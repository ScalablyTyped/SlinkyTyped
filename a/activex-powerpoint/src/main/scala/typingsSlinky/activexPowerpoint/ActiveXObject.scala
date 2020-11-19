package typingsSlinky.activexPowerpoint

import typingsSlinky.activexPowerpoint.PowerPoint.Application
import typingsSlinky.activexPowerpoint.PowerPoint.OLEControl
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.AfterNewPresentation
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.AfterPresentationOpen
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.Cancel
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.ColorSchemeChanged
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.GotFocus
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.LostFocus
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.NewPresentation
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.Pres
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationBeforeClose
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationBeforeSave
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationClose
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationCloseFinal
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationNewSlide
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationOpen
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationPrint
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationSave
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.PresentationSync
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.ProtViewWindow
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.ProtectedViewCloseReason
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowActivate
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowBeforeClose
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowBeforeEdit
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowDeactivate
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowOpen
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.Sel
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.Sld
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SldRange
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SlideSelectionChanged
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SlideShowBegin
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SlideShowEnd
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SlideShowNextBuild
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SlideShowNextClick
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SlideShowNextSlide
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SlideShowOnNext
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SlideShowOnPrevious
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.SyncEventType
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.WindowActivate
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.WindowBeforeDoubleClick
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.WindowBeforeRightClick
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.WindowDeactivate
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.WindowSelectionChange
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.Wn
import typingsSlinky.activexPowerpoint.activexPowerpointStrings.nEffect
import typingsSlinky.activexPowerpoint.anon.CancelProtViewWindow
import typingsSlinky.activexPowerpoint.anon.NEffect
import typingsSlinky.activexPowerpoint.anon.PresWn
import typingsSlinky.activexPowerpoint.anon.SelSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends js.Object {
  
  def on(
    obj: Application,
    event: AfterNewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AfterPresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ColorSchemeChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.SldRange, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeClose,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeSave,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationCloseFinal,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationClose,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationNewSlide,
    argNames: js.Array[Sld],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Sld, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationPrint,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSave,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSync,
    argNames: js.Tuple2[Pres, SyncEventType],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.SyncEventType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.ProtViewWindow, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[ProtViewWindow, ProtectedViewCloseReason, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.ProtectedViewCloseReason, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[ProtViewWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.ProtViewWindow, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.ProtViewWindow, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideSelectionChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.SldRange, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowBegin,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Wn, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowEnd,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Pres, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextBuild,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Wn, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextClick,
    argNames: js.Tuple2[Wn, nEffect],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ NEffect, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextSlide,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Wn, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnNext,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Wn, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnPrevious,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Wn, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ PresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeDoubleClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Sel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeRightClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexPowerpoint.anon.Sel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ PresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ SelSelection, Unit]
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
