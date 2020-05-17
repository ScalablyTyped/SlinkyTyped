package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object App {
  type AppConstructor = js.Function1[
    /* options */ (typingsSlinky.minappEnv.App.AppInstance[
      typingsSlinky.minappEnv.IAnyObject with typingsSlinky.minappEnv.App.AppInstance[js.Object]
    ]) with typingsSlinky.minappEnv.IAnyObject with typingsSlinky.minappEnv.App.AppInstance[js.Object], 
    scala.Unit
  ]
  type GetApp = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.minappEnv.App.IGetAppOption], 
    typingsSlinky.minappEnv.App.AppInstance[typingsSlinky.minappEnv.IAnyObject] with typingsSlinky.minappEnv.IAnyObject
  ]
}
