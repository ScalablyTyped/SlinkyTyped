package typingsSlinky.poi.mod.Config

import typingsSlinky.poi.mod.Config.Output.FileNames
import typingsSlinky.poi.mod.Config.Output.Html
import typingsSlinky.poi.poiStrings.`async-node`
import typingsSlinky.poi.poiStrings.`electron-main`
import typingsSlinky.poi.poiStrings.`electron-renderer`
import typingsSlinky.poi.poiStrings.`node-webkit`
import typingsSlinky.poi.poiStrings.cjs
import typingsSlinky.poi.poiStrings.electron
import typingsSlinky.poi.poiStrings.iife
import typingsSlinky.poi.poiStrings.node
import typingsSlinky.poi.poiStrings.umd
import typingsSlinky.poi.poiStrings.web
import typingsSlinky.poi.poiStrings.webworker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output_ extends js.Object {
  var clean: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[String] = js.native
  var fileNames: js.UndefOr[FileNames] = js.native
  var format: js.UndefOr[iife | cjs | umd] = js.native
  var html: js.UndefOr[Html] = js.native
  var minimize: js.UndefOr[Boolean] = js.native
  var moduleName: js.UndefOr[String] = js.native
  var publicUrl: js.UndefOr[String] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[
    web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
  ] = js.native
}

object Output_ {
  @scala.inline
  def apply(): Output_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output_]
  }
  @scala.inline
  implicit class Output_Ops[Self <: Output_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withFileNames(value: FileNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: iife | cjs | umd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(
      value: web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

