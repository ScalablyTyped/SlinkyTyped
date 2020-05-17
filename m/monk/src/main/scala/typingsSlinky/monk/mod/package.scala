package typingsSlinky.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TMiddleware = js.Function1[
    /* hasCollectionMonkInstance */ typingsSlinky.monk.anon.Collection, 
    js.Function1[
      /* next */ js.Function2[/* args */ js.Object, /* method */ java.lang.String, js.Promise[js.Any]], 
      js.Function2[/* args */ js.Object, /* method */ java.lang.String, js.Promise[js.Any]]
    ]
  ]
}
