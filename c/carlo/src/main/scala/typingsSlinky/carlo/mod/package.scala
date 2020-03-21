package typingsSlinky.carlo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Channel = java.lang.String
  type EvaluateFunction = js.Function2[
    /* pageFunction */ (js.Function1[/* repeated */ js.Any, js.Any]) | java.lang.String, 
    /* repeated */ typingsSlinky.puppeteer.mod.Serializable, 
    js.Promise[typingsSlinky.puppeteer.mod.Serializable]
  ]
  type WindowEvent = typingsSlinky.carlo.carloStrings.close
}
