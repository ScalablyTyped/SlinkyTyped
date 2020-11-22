package typingsSlinky.crawler.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cheerio.cheerio.Cheerio
import typingsSlinky.cheerio.cheerio.CheerioAPI
import typingsSlinky.cheerio.cheerio.Element
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerRequestResponse
  extends /* x */ StringDictionary[js.Any] {
  
  @JSName("$")
  def $(selector: String): Cheerio = js.native
  @JSName("$")
  def $(selector: String, context: String): Cheerio = js.native
  @JSName("$")
  def $(selector: String, context: String, root: String): Cheerio = js.native
  @JSName("$")
  def $(selector: String, context: js.Array[Element]): Cheerio = js.native
  @JSName("$")
  def $(selector: String, context: js.Array[Element], root: String): Cheerio = js.native
  @JSName("$")
  def $(selector: String, context: Cheerio): Cheerio = js.native
  @JSName("$")
  def $(selector: String, context: Cheerio, root: String): Cheerio = js.native
  @JSName("$")
  def $(selector: String, context: Element): Cheerio = js.native
  @JSName("$")
  def $(selector: String, context: Element, root: String): Cheerio = js.native
  @JSName("$")
  def $(selector: js.Any): Cheerio = js.native
  @JSName("$")
  var $_Original: CheerioAPI = js.native
  
  var body: Buffer | String = js.native
  
  var options: CrawlerRequestOptions = js.native
  
  var request: RequestAsJSON = js.native
}
