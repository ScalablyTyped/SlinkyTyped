package typingsSlinky.nodemailer.sharedMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodemailer/lib/shared", "resolveContent")
@js.native
object resolveContent extends js.Object {
  
  def apply(data: js.Array[_], key: String): js.Promise[Buffer | String] = js.native
  def apply(
    data: js.Array[_],
    key: String,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  def apply(data: js.Array[_], key: Double): js.Promise[Buffer | String] = js.native
  def apply(
    data: js.Array[_],
    key: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  def apply(data: js.Object, key: String): js.Promise[Buffer | String] = js.native
  def apply(
    data: js.Object,
    key: String,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  def apply(data: js.Object, key: Double): js.Promise[Buffer | String] = js.native
  def apply(
    data: js.Object,
    key: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
}
