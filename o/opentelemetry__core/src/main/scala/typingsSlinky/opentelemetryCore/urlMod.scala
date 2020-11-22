package typingsSlinky.opentelemetryCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/utils/url", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  
  def isUrlIgnored(url: String): Boolean = js.native
  def isUrlIgnored(url: String, ignoredUrls: js.Array[String | js.RegExp]): Boolean = js.native
  
  def urlMatches(url: String, urlToMatch: String): Boolean = js.native
  def urlMatches(url: String, urlToMatch: js.RegExp): Boolean = js.native
}
