package typingsSlinky.cypress.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * Default: false
    */
  var includeStack: Boolean = js.native
  /**
    * Default: ['then', 'catch', 'inspect', 'toJSON']
    */
  var proxyExcludedKeys: js.Array[String] = js.native
  /**
    * Default: true
    */
  var showDiff: Boolean = js.native
  /**
    * Default: 40
    */
  var truncateThreshold: Double = js.native
  /**
    * Default: true
    */
  var useProxy: Boolean = js.native
}

object Config {
  @scala.inline
  def apply(
    includeStack: Boolean,
    proxyExcludedKeys: js.Array[String],
    showDiff: Boolean,
    truncateThreshold: Double,
    useProxy: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(includeStack = includeStack.asInstanceOf[js.Any], proxyExcludedKeys = proxyExcludedKeys.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], truncateThreshold = truncateThreshold.asInstanceOf[js.Any], useProxy = useProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyExcludedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyExcludedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDiff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDiff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncateThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProxy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

