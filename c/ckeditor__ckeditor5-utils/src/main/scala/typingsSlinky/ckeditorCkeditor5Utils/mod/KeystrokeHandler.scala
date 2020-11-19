package typingsSlinky.ckeditorCkeditor5Utils.mod

import typingsSlinky.ckeditorCkeditor5Utils.anon.Priority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-utils", "KeystrokeHandler")
@js.native
class KeystrokeHandler () extends js.Object {
  
  def destroy(): Unit = js.native
  
  def listenTo(emitter: Emitter): Unit = js.native
  
  def press(keyEvtData: KeystrokeInfo): Boolean = js.native
  
  def set(
    keystroke: String,
    callback: js.Function2[/* keyEvtData */ KeystrokeInfo, /* cancel */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def set(
    keystroke: String,
    callback: js.Function2[/* keyEvtData */ KeystrokeInfo, /* cancel */ js.Function0[Unit], Unit],
    options: Priority
  ): Unit = js.native
  def set(
    keystroke: js.Array[String | Double],
    callback: js.Function2[/* keyEvtData */ KeystrokeInfo, /* cancel */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def set(
    keystroke: js.Array[String | Double],
    callback: js.Function2[/* keyEvtData */ KeystrokeInfo, /* cancel */ js.Function0[Unit], Unit],
    options: Priority
  ): Unit = js.native
}
