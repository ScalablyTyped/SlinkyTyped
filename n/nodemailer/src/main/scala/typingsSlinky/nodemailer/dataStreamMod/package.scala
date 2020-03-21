package typingsSlinky.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataStreamMod {
  /**
    * Escapes dots in the beginning of lines. Ends the stream with <CR><LF>.<CR><LF>
    * Also makes sure that only <CR><LF> sequences are used for linebreaks
    */
  type DataStream = typingsSlinky.node.streamMod.Transform
}
