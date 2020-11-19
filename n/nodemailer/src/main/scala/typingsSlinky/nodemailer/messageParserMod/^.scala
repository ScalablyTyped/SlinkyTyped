package typingsSlinky.nodemailer.messageParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MessageParser instance is a transform stream that separates message headers
  * from the rest of the body. Headers are emitted with the 'headers' event. Message
  * body is passed on as the resulting stream.
  */
@JSImport("nodemailer/lib/dkim/message-parser", JSImport.Namespace)
@js.native
class ^ () extends MessageParser
