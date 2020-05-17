package typingsSlinky.antdMobile

import slinky.core.TagMod
import typingsSlinky.antdMobile.anon.Close
import typingsSlinky.antdMobile.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/modal/alert", JSImport.Namespace)
@js.native
object alertMod extends js.Object {
  def default(title: TagMod[Any], message: TagMod[Any]): Close = js.native
  def default(title: TagMod[Any], message: TagMod[Any], actions: js.Array[Text]): Close = js.native
  def default(title: TagMod[Any], message: TagMod[Any], actions: js.Array[Text], platform: String): Close = js.native
}

