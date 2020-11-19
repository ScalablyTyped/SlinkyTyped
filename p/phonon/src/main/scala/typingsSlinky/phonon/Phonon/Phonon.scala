package typingsSlinky.phonon.Phonon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.awesomplete.mod.Options
import typingsSlinky.phonon.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*** Main object ***/
@js.native
trait Phonon extends js.Object {
  
  def ajax(request: PhononAjaxObject): PhononAjaxReturnObject = js.native
  
  def alert(text: String): PhononDialogComponent = js.native
  def alert(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: js.UndefOr[scala.Nothing],
    textOk: String
  ): PhononDialogComponent = js.native
  def alert(text: String, title: js.UndefOr[scala.Nothing], cancelable: Boolean): PhononDialogComponent = js.native
  def alert(text: String, title: js.UndefOr[scala.Nothing], cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def alert(text: String, title: String): PhononDialogComponent = js.native
  def alert(text: String, title: String, cancelable: js.UndefOr[scala.Nothing], textOk: String): PhononDialogComponent = js.native
  def alert(text: String, title: String, cancelable: Boolean): PhononDialogComponent = js.native
  def alert(text: String, title: String, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  
  def autocomplete(input: String): js.Any = js.native
  def autocomplete(input: String, o: Options): js.Any = js.native
  def autocomplete(input: Element): js.Any = js.native
  def autocomplete(input: Element, o: Options): js.Any = js.native
  def autocomplete(input: HTMLElement): js.Any = js.native
  def autocomplete(input: HTMLElement, o: Options): js.Any = js.native
  
  var browser: PhononBrowserObject = js.native
  
  def confirm(text: String): PhononDialogComponent = js.native
  def confirm(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: js.UndefOr[scala.Nothing],
    textOk: js.UndefOr[scala.Nothing],
    textCancel: String
  ): PhononDialogComponent = js.native
  def confirm(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: js.UndefOr[scala.Nothing],
    textOk: String
  ): PhononDialogComponent = js.native
  def confirm(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: js.UndefOr[scala.Nothing],
    textOk: String,
    textCancel: String
  ): PhononDialogComponent = js.native
  def confirm(text: String, title: js.UndefOr[scala.Nothing], cancelable: Boolean): PhononDialogComponent = js.native
  def confirm(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: Boolean,
    textOk: js.UndefOr[scala.Nothing],
    textCancel: String
  ): PhononDialogComponent = js.native
  def confirm(text: String, title: js.UndefOr[scala.Nothing], cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def confirm(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: Boolean,
    textOk: String,
    textCancel: String
  ): PhononDialogComponent = js.native
  def confirm(text: String, title: String): PhononDialogComponent = js.native
  def confirm(
    text: String,
    title: String,
    cancelable: js.UndefOr[scala.Nothing],
    textOk: js.UndefOr[scala.Nothing],
    textCancel: String
  ): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: js.UndefOr[scala.Nothing], textOk: String): PhononDialogComponent = js.native
  def confirm(
    text: String,
    title: String,
    cancelable: js.UndefOr[scala.Nothing],
    textOk: String,
    textCancel: String
  ): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Boolean): PhononDialogComponent = js.native
  def confirm(
    text: String,
    title: String,
    cancelable: Boolean,
    textOk: js.UndefOr[scala.Nothing],
    textCancel: String
  ): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Boolean, textOk: String, textCancel: String): PhononDialogComponent = js.native
  
  var device: PhononDeviceObject = js.native
  
  def dialog(id: String): PhononCustomDialogComponent = js.native
  
  var event: PhononEventObject = js.native
  
  def i18n(): PhononI18n = js.native
  
  def indicator(title: String): PhononIndicatorComponent = js.native
  def indicator(title: String, cancelable: Boolean): PhononIndicatorComponent = js.native
  
  def navigator(): PhononNavigator = js.native
  
  def notif(textOrId: String): PhononNotifComponent = js.native
  def notif(
    textOrId: String,
    timeout: js.UndefOr[scala.Nothing],
    showButton: js.UndefOr[scala.Nothing],
    textButton: String
  ): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: js.UndefOr[scala.Nothing], showButton: Boolean): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: js.UndefOr[scala.Nothing], showButton: Boolean, textButton: String): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Double): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Double, showButton: js.UndefOr[scala.Nothing], textButton: String): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Double, showButton: Boolean): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Double, showButton: Boolean, textButton: String): PhononNotifComponent = js.native
  
  def onReady(callback: js.Function0[Unit]): Unit = js.native
  
  def options(options: PhononOptions): Unit = js.native
  
  def panel(id: String): PhononPanelComponent = js.native
  
  def popover(): PhononPopoverComponent = js.native
  def popover(id: String): PhononPopoverComponent = js.native
  
  def preloader(element: String): PhononPreloaderComponent = js.native
  def preloader(element: Element): PhononPreloaderComponent = js.native
  
  def prompt(text: String): PhononDialogComponent = js.native
  def prompt(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: js.UndefOr[scala.Nothing],
    textOk: js.UndefOr[scala.Nothing],
    textCancel: String
  ): PhononDialogComponent = js.native
  def prompt(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: js.UndefOr[scala.Nothing],
    textOk: String
  ): PhononDialogComponent = js.native
  def prompt(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: js.UndefOr[scala.Nothing],
    textOk: String,
    textCancel: String
  ): PhononDialogComponent = js.native
  def prompt(text: String, title: js.UndefOr[scala.Nothing], cancelable: Boolean): PhononDialogComponent = js.native
  def prompt(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: Boolean,
    textOk: js.UndefOr[scala.Nothing],
    textCancel: String
  ): PhononDialogComponent = js.native
  def prompt(text: String, title: js.UndefOr[scala.Nothing], cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def prompt(
    text: String,
    title: js.UndefOr[scala.Nothing],
    cancelable: Boolean,
    textOk: String,
    textCancel: String
  ): PhononDialogComponent = js.native
  def prompt(text: String, title: String): PhononDialogComponent = js.native
  def prompt(
    text: String,
    title: String,
    cancelable: js.UndefOr[scala.Nothing],
    textOk: js.UndefOr[scala.Nothing],
    textCancel: String
  ): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: js.UndefOr[scala.Nothing], textOk: String): PhononDialogComponent = js.native
  def prompt(
    text: String,
    title: String,
    cancelable: js.UndefOr[scala.Nothing],
    textOk: String,
    textCancel: String
  ): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Boolean): PhononDialogComponent = js.native
  def prompt(
    text: String,
    title: String,
    cancelable: Boolean,
    textOk: js.UndefOr[scala.Nothing],
    textCancel: String
  ): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Boolean, textOk: String, textCancel: String): PhononDialogComponent = js.native
  
  def sidePanel(id: String): PhononSidePanelComponent = js.native
  
  def tab(): PhononTabComponent = js.native
  
  def updateLocale(language: String): Unit = js.native
}
