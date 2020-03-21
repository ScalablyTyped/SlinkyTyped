package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Page {
  type GetCurrentPages = js.Function0[
    typingsSlinky.minappEnv.Array[(typingsSlinky.minappEnv.Page.PageInstance[js.Object, js.Object]) with js.Object]
  ]
  type PageConstructor = js.Function1[
    /* options */ (typingsSlinky.minappEnv.Page.PageInstance[
      typingsSlinky.minappEnv.IAnyObject, 
      typingsSlinky.minappEnv.IAnyObject with (typingsSlinky.minappEnv.Page.PageInstance[_, _])
    ]) with typingsSlinky.minappEnv.IAnyObject with (typingsSlinky.minappEnv.Page.PageInstance[_, _]), 
    scala.Unit
  ]
}
