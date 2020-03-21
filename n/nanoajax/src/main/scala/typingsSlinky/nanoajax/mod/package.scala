package typingsSlinky.nanoajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* statusCode */ scala.Double, 
    /* response */ java.lang.String, 
    /* request */ org.scalajs.dom.raw.XMLHttpRequest, 
    js.Any
  ]
}
