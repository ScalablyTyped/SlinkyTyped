package typingsSlinky.favicons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* response */ typingsSlinky.favicons.mod.FavIconResponse, 
    scala.Unit
  ]
}
