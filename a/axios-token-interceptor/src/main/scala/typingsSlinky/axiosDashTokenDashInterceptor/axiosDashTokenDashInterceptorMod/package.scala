package typingsSlinky.axiosDashTokenDashInterceptor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosDashTokenDashInterceptorMod {
  import typingsSlinky.axios.axiosMod.AxiosRequestConfig

  type TokenProvider = js.Function1[/* config */ AxiosRequestConfig, js.Promise[AxiosRequestConfig]]
}
