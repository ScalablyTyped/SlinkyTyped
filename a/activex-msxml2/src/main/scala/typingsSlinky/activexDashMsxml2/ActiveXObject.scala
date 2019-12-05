package typingsSlinky.activexDashMsxml2

import typingsSlinky.activexDashMsxml2.MSXML2.DOMDocument60
import typingsSlinky.activexDashMsxml2.MSXML2.FreeThreadedDOMDocument60
import typingsSlinky.activexDashMsxml2.activexDashMsxml2Strings.ondataavailable
import typingsSlinky.activexDashMsxml2.activexDashMsxml2Strings.onreadystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  @JSName("on")
  def on_ondataavailable(
    obj: DOMDocument60,
    event: ondataavailable,
    handler: js.ThisFunction1[/* this */ DOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ondataavailable(
    obj: FreeThreadedDOMDocument60,
    event: ondataavailable,
    handler: js.ThisFunction1[/* this */ FreeThreadedDOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_onreadystatechange(
    obj: DOMDocument60,
    event: onreadystatechange,
    handler: js.ThisFunction1[/* this */ DOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_onreadystatechange(
    obj: FreeThreadedDOMDocument60,
    event: onreadystatechange,
    handler: js.ThisFunction1[/* this */ FreeThreadedDOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

