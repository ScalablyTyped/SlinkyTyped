package typingsSlinky.koaJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SecretLoader = js.Function2[
    /* header */ js.Any, 
    /* payload */ js.Any, 
    js.Promise[
      java.lang.String | (js.Array[typingsSlinky.node.Buffer | java.lang.String]) | typingsSlinky.node.Buffer
    ]
  ]
}
