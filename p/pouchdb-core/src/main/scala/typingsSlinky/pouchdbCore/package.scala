package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pouchdbCore {
  type Fetch = js.Function2[
    /* url */ java.lang.String | org.scalajs.dom.experimental.Request, 
    /* opts */ js.UndefOr[org.scalajs.dom.experimental.RequestInit], 
    js.Promise[org.scalajs.dom.experimental.Response]
  ]
}
