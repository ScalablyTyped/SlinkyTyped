package typingsSlinky.bsLogger.messageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogFormattersMap extends /* key */ StringDictionary[LogMessageFormatter] {
  
  def json(msg: LogMessage): String = js.native
  @JSName("json")
  var json_Original: LogMessageFormatter = js.native
  
  def simple(msg: LogMessage): String = js.native
  @JSName("simple")
  var simple_Original: LogMessageFormatter = js.native
}
