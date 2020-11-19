package typingsSlinky.bigscreen

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bigscreen", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val element: Element = js.native
  
  val enabled: Boolean = js.native
  
  def exit(): Unit = js.native
  
  def onchange(element: Element): Unit = js.native
  
  def onenter(element: Element): Unit = js.native
  
  def onerror(element: Element, reason: String): Unit = js.native
  
  def onexit(): Unit = js.native
  
  def request(element: Element): Unit = js.native
  def request(
    element: Element,
    onEnter: js.UndefOr[scala.Nothing],
    onExit: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def request(element: Element, onEnter: js.UndefOr[scala.Nothing], onExit: js.Function0[Unit]): Unit = js.native
  def request(
    element: Element,
    onEnter: js.UndefOr[scala.Nothing],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def request(element: Element, onEnter: js.Function1[/* element */ Element, Unit]): Unit = js.native
  def request(
    element: Element,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def request(element: Element, onEnter: js.Function1[/* element */ Element, Unit], onExit: js.Function0[Unit]): Unit = js.native
  def request(
    element: Element,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  
  def toggle(): Unit = js.native
  def toggle(
    element: js.UndefOr[scala.Nothing],
    onEnter: js.UndefOr[scala.Nothing],
    onExit: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def toggle(element: js.UndefOr[scala.Nothing], onEnter: js.UndefOr[scala.Nothing], onExit: js.Function0[Unit]): Unit = js.native
  def toggle(
    element: js.UndefOr[scala.Nothing],
    onEnter: js.UndefOr[scala.Nothing],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def toggle(element: js.UndefOr[scala.Nothing], onEnter: js.Function1[/* element */ Element, Unit]): Unit = js.native
  def toggle(
    element: js.UndefOr[scala.Nothing],
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def toggle(
    element: js.UndefOr[scala.Nothing],
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.Function0[Unit]
  ): Unit = js.native
  def toggle(
    element: js.UndefOr[scala.Nothing],
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def toggle(element: Element): Unit = js.native
  def toggle(
    element: Element,
    onEnter: js.UndefOr[scala.Nothing],
    onExit: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def toggle(element: Element, onEnter: js.UndefOr[scala.Nothing], onExit: js.Function0[Unit]): Unit = js.native
  def toggle(
    element: Element,
    onEnter: js.UndefOr[scala.Nothing],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def toggle(element: Element, onEnter: js.Function1[/* element */ Element, Unit]): Unit = js.native
  def toggle(
    element: Element,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.UndefOr[scala.Nothing],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  def toggle(element: Element, onEnter: js.Function1[/* element */ Element, Unit], onExit: js.Function0[Unit]): Unit = js.native
  def toggle(
    element: Element,
    onEnter: js.Function1[/* element */ Element, Unit],
    onExit: js.Function0[Unit],
    onError: js.Function2[/* element */ Element, /* reason */ String, Unit]
  ): Unit = js.native
  
  def videoEnabled(video: HTMLVideoElement): Boolean = js.native
}
