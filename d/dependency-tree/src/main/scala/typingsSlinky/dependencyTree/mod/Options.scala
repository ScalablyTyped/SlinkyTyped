package typingsSlinky.dependencyTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var detective: js.UndefOr[js.Any] = js.native
  var directory: js.UndefOr[String] = js.native
  var filename: String = js.native
  var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
  var isListForm: js.UndefOr[Boolean] = js.native
  var nodeModulesConfig: js.UndefOr[js.Any] = js.native
  var nonExistent: js.UndefOr[js.Array[String]] = js.native
  var requireConfig: js.UndefOr[String] = js.native
  var tsConfig: js.UndefOr[String] = js.native
  var visited: js.UndefOr[DependencyObj] = js.native
  var webpackConfig: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(filename: String): Options = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetective(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detective")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIsListForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isListForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsListForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isListForm")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeModulesConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeModulesConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeModulesConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeModulesConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNonExistent(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonExistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonExistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonExistent")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTsConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withVisited(value: DependencyObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visited")(js.undefined)
        ret
    }
    @scala.inline
    def withWebpackConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebpackConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackConfig")(js.undefined)
        ret
    }
  }
  
}

