package typingsSlinky.neteaseCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NeteaseCaptcha {
  type InitFunction = js.Function3[
    /* config */ typingsSlinky.neteaseCaptcha.NeteaseCaptcha.Config, 
    /* onLoad */ js.UndefOr[typingsSlinky.neteaseCaptcha.NeteaseCaptcha.onLoad], 
    /* onError */ js.UndefOr[typingsSlinky.neteaseCaptcha.NeteaseCaptcha.onError], 
    scala.Unit
  ]
  type onError = js.Function1[/* error */ js.Any, scala.Unit]
  type onLoad = js.Function1[/* instance */ typingsSlinky.neteaseCaptcha.NeteaseCaptcha.Instance, scala.Unit]
}
