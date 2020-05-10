package typingsSlinky.cosmiconfig.typesMod

import typingsSlinky.cosmiconfig.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<cosmiconfig.cosmiconfig.Options> */
@js.native
trait ExplorerOptions extends js.Object {
  var cache: Boolean = js.native
  var ignoreEmptySearchPlaces: Boolean = js.native
  var loaders: Loaders = js.native
  var packageProp: String = js.native
  var searchPlaces: js.Array[String] = js.native
  var stopDir: String = js.native
  var transform: Transform = js.native
}

object ExplorerOptions {
  @scala.inline
  def apply(
    cache: Boolean,
    ignoreEmptySearchPlaces: Boolean,
    loaders: Loaders,
    packageProp: String,
    searchPlaces: js.Array[String],
    stopDir: String,
    transform: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
  ): ExplorerOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], ignoreEmptySearchPlaces = ignoreEmptySearchPlaces.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], packageProp = packageProp.asInstanceOf[js.Any], searchPlaces = searchPlaces.asInstanceOf[js.Any], stopDir = stopDir.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[ExplorerOptions]
  }
  @scala.inline
  implicit class ExplorerOptionsOps[Self <: ExplorerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreEmptySearchPlaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptySearchPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaders(value: Loaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchPlaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(
      value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

