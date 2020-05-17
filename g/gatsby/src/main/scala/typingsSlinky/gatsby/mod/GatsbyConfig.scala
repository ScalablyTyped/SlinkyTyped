package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.anon.Options
import typingsSlinky.gatsby.anon.Prefix
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyConfig extends js.Object {
  /** Sometimes you need more granular/flexible access to the development server. Gatsby exposes the Express.js development server to your site’s gatsby-config.js where you can add Express middleware as needed. */
  var developMiddleware: js.UndefOr[js.Function1[/* app */ js.Any, Unit]] = js.native
  var mapping: js.UndefOr[Record[String, String]] = js.native
  /** It’s common for sites to be hosted somewhere other than the root of their domain. Say we have a Gatsby site at `example.com/blog/`. In this case, we would need a prefix (`/blog`) added to all paths on the site. */
  var pathPrefix: js.UndefOr[String] = js.native
  /** Plugins are Node.js packages that implement Gatsby APIs. The config file accepts an array of plugins. Some plugins may need only to be listed by name, while others may take options. */
  var plugins: js.UndefOr[js.Array[String | Options]] = js.native
  /** Gatsby uses the ES6 Promise API. Because some browsers don't support this, Gatsby includes a Promise polyfill by default. If you'd like to provide your own Promise polyfill, you can set `polyfill` to false.*/
  var polyfill: js.UndefOr[Boolean] = js.native
  /**
    * Setting the proxy config option will tell the develop server to proxy any unknown requests to your specified server.
    * @see https://www.gatsbyjs.org/docs/api-proxy/
    * */
  var proxy: js.UndefOr[Prefix] = js.native
  /** When you want to reuse common pieces of data across the site (for example, your site title), you can store that here. */
  var siteMetadata: js.UndefOr[Record[String, _]] = js.native
}

object GatsbyConfig {
  @scala.inline
  def apply(): GatsbyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatsbyConfig]
  }
  @scala.inline
  implicit class GatsbyConfigOps[Self <: GatsbyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevelopMiddleware(value: /* app */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developMiddleware")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDevelopMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developMiddleware")(js.undefined)
        ret
    }
    @scala.inline
    def withMapping(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(js.undefined)
        ret
    }
    @scala.inline
    def withPathPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String | Options]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPolyfill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyfill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyfill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyfill")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: Prefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteMetadata(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteMetadata")(js.undefined)
        ret
    }
  }
  
}

