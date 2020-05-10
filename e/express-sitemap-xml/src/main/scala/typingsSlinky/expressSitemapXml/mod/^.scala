package typingsSlinky.expressSitemapXml.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-sitemap-xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Express middleware to serve {@link https://en.wikipedia.org/wiki/Sitemaps|`sitemap.xml`} from a list of URLs
    * Create a sitemap.xml middleware.
    */
  def apply(getUrls: js.Function0[js.Array[SitemapLeaf] | js.Promise[js.Array[SitemapLeaf]]], base: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

