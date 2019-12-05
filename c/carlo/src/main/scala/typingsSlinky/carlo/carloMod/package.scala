package typingsSlinky.carlo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object carloMod {
  import typingsSlinky.carlo.carloStrings.close
  import typingsSlinky.puppeteer.puppeteerMod.Serializable

  type Channel = String
  type EvaluateFunction = js.Function2[
    /* pageFunction */ (js.Function1[/* repeated */ js.Any, js.Any]) | String, 
    /* repeated */ Serializable, 
    js.Promise[Serializable]
  ]
  type WindowEvent = close
}
