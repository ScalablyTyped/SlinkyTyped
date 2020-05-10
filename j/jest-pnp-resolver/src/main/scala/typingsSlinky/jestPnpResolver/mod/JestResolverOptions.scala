package typingsSlinky.jestPnpResolver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestResolverOptions extends js.Object {
  var basedir: String = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
  def defaultResolver(request: String, opts: js.Any): String = js.native
}

object JestResolverOptions {
  @scala.inline
  def apply(basedir: String, defaultResolver: (String, js.Any) => String): JestResolverOptions = {
    val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], defaultResolver = js.Any.fromFunction2(defaultResolver))
    __obj.asInstanceOf[JestResolverOptions]
  }
  @scala.inline
  implicit class JestResolverOptionsOps[Self <: JestResolverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasedir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultResolver(value: (String, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResolver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
  }
  
}

