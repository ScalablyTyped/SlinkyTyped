package typingsSlinky.nativeDashUrl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nativeDashUrl.nativeDashUrlBooleans.`false`
import typingsSlinky.nativeDashUrl.nativeDashUrlBooleans.`true`
import typingsSlinky.node.urlMod.URLFormatOptions
import typingsSlinky.node.urlMod.Url
import typingsSlinky.node.urlMod.UrlObject
import typingsSlinky.node.urlMod.UrlWithParsedQuery
import typingsSlinky.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("native-url", JSImport.Namespace)
@js.native
object nativeDashUrlMod extends js.Object {
  @js.native
  class URL protected ()
    extends typingsSlinky.node.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typingsSlinky.node.urlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.node.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: typingsSlinky.node.urlMod.URLSearchParams) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
  }
  
  def domainToASCII(domain: String): String = js.native
  def domainToUnicode(domain: String): String = js.native
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  def fileURLToPath(url: String): String = js.native
  def fileURLToPath(url: typingsSlinky.node.urlMod.URL): String = js.native
  def format(URL: typingsSlinky.node.urlMod.URL): String = js.native
  def format(URL: typingsSlinky.node.urlMod.URL, options: URLFormatOptions): String = js.native
  def format(urlObject: String): String = js.native
  def format(urlObject: UrlObject): String = js.native
  def parse(urlStr: String): UrlWithStringQuery = js.native
  def parse(urlStr: String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  def parse(urlStr: String, parseQueryString: Boolean): Url = js.native
  def parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
  @JSName("parse")
  def parse_false(urlStr: String, parseQueryString: `false`): UrlWithStringQuery = js.native
  @JSName("parse")
  def parse_false(urlStr: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  @JSName("parse")
  def parse_true(urlStr: String, parseQueryString: `true`): UrlWithParsedQuery = js.native
  @JSName("parse")
  def parse_true(urlStr: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = js.native
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  def pathToFileURL(url: String): typingsSlinky.node.urlMod.URL = js.native
  def resolve(from: String, to: String): String = js.native
}

