package typingsSlinky.axiosTokenInterceptor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TokenProvider = js.Function1[
    /* config */ typingsSlinky.axios.mod.AxiosRequestConfig, 
    js.Promise[typingsSlinky.axios.mod.AxiosRequestConfig]
  ]
}
