package typingsSlinky.axiosDashCurlirize

import typingsSlinky.axios.axiosMod.AxiosStatic
import typingsSlinky.axiosDashCurlirize.axiosDashCurlirizeMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axios-curlirize", JSImport.Namespace)
@js.native
object axiosDashCurlirizeMod extends js.Object {
  def apply(instance: AxiosStatic): Unit = js.native
  def apply(instance: AxiosStatic, callback: Callback): Unit = js.native
  type Callback = js.Function2[/* error */ js.Error, /* result */ js.UndefOr[Double], Unit]
}

