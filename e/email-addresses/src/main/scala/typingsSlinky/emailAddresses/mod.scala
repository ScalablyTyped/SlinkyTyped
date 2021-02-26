package typingsSlinky.emailAddresses

import typingsSlinky.emailAddresses.emailAddresses.Options
import typingsSlinky.emailAddresses.emailAddresses.ParsedGroup
import typingsSlinky.emailAddresses.emailAddresses.ParsedMailbox
import typingsSlinky.emailAddresses.emailAddresses.ParsedResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("email-addresses", JSImport.Namespace)
  @js.native
  def apply(opts: Options): ParsedResult = js.native
  
  @JSImport("email-addresses", "parseAddressList")
  @js.native
  def parseAddressList(input: String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  @JSImport("email-addresses", "parseAddressList")
  @js.native
  def parseAddressList(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  
  @JSImport("email-addresses", "parseFrom")
  @js.native
  def parseFrom(input: String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  @JSImport("email-addresses", "parseFrom")
  @js.native
  def parseFrom(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  
  @JSImport("email-addresses", "parseOneAddress")
  @js.native
  def parseOneAddress(input: String): ParsedMailbox | ParsedGroup = js.native
  @JSImport("email-addresses", "parseOneAddress")
  @js.native
  def parseOneAddress(input: Options): ParsedMailbox | ParsedGroup = js.native
  
  @JSImport("email-addresses", "parseReplyTo")
  @js.native
  def parseReplyTo(input: String): js.Array[ParsedMailbox | ParsedGroup] = js.native
  @JSImport("email-addresses", "parseReplyTo")
  @js.native
  def parseReplyTo(input: Options): js.Array[ParsedMailbox | ParsedGroup] = js.native
  
  @JSImport("email-addresses", "parseSender")
  @js.native
  def parseSender(input: String): ParsedMailbox | ParsedGroup = js.native
  @JSImport("email-addresses", "parseSender")
  @js.native
  def parseSender(input: Options): ParsedMailbox | ParsedGroup = js.native
}
