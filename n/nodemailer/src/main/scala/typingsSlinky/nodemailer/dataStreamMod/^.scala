package typingsSlinky.nodemailer.dataStreamMod

import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Escapes dots in the beginning of lines. Ends the stream with <CR><LF>.<CR><LF>
  * Also makes sure that only <CR><LF> sequences are used for linebreaks
  */
@JSImport("nodemailer/lib/smtp-connection/data-stream", JSImport.Namespace)
@js.native
class ^ () extends Transform
