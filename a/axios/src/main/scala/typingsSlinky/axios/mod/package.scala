package typingsSlinky.axios

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AxiosAdapter = js.Function1[
    /* config */ typingsSlinky.axios.mod.AxiosRequestConfig, 
    typingsSlinky.axios.mod.AxiosPromise[js.Any]
  ]
  
  type AxiosPromise[T] = js.Promise[typingsSlinky.axios.mod.AxiosResponse[T]]
  
  type AxiosTransformer = js.Function2[/* data */ js.Any, /* headers */ js.UndefOr[js.Any], js.Any]
  
  type Canceler = js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]
}
