package typingsSlinky.ky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AfterResponseHook = js.Function3[
    /* request */ org.scalajs.dom.experimental.Request, 
    /* options */ typingsSlinky.ky.mod.NormalizedOptions, 
    /* response */ org.scalajs.dom.experimental.Response, 
    org.scalajs.dom.experimental.Response | scala.Unit | (js.Promise[org.scalajs.dom.experimental.Response | scala.Unit])
  ]
  type BeforeRequestHook = js.Function2[
    /* request */ org.scalajs.dom.experimental.Request, 
    /* options */ typingsSlinky.ky.mod.NormalizedOptions, 
    org.scalajs.dom.experimental.Request | org.scalajs.dom.experimental.Response | scala.Unit | (js.Promise[
      org.scalajs.dom.experimental.Request | org.scalajs.dom.experimental.Response | scala.Unit
    ])
  ]
  type BeforeRetryHook = js.Function4[
    /* request */ org.scalajs.dom.experimental.Request, 
    /* options */ typingsSlinky.ky.mod.NormalizedOptions, 
    /* error */ js.Error, 
    /* retryCount */ scala.Double, 
    scala.Unit | js.Promise[scala.Unit]
  ]
}
