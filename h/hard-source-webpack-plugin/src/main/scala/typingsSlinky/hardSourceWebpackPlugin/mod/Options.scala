package typingsSlinky.hardSourceWebpackPlugin.mod

import typingsSlinky.hardSourceWebpackPlugin.anon.Directories
import typingsSlinky.hardSourceWebpackPlugin.anon.Level
import typingsSlinky.hardSourceWebpackPlugin.anon.MaxAge
import typingsSlinky.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.native
  var cachePrune: js.UndefOr[MaxAge] = js.native
  var configHash: js.UndefOr[String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String])] = js.native
  var environmentHash: js.UndefOr[Directories] = js.native
  var info: js.UndefOr[Level] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withCachePrune(value: MaxAge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePrune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachePrune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePrune")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigHashFunction1(value: /* webpackConfig */ js.UndefOr[Configuration] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configHash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConfigHash(value: String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configHash")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentHash(value: Directories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentHash")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
  }
  
}

