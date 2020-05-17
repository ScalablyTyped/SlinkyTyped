package typingsSlinky.browserify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options pertaining to an individual file.
  */
@js.native
trait FileOptions extends InputFile {
  // Basedir to use to resolve this file's path.
  var basedir: js.UndefOr[String] = js.native
  // If true, this is considered an entry point to your app.
  var entry: js.UndefOr[Boolean] = js.native
  // Expose this file under a custom dependency name.
  // require('./vendor/angular/angular.js', {expose: 'angular'}) enables require('angular')
  var expose: js.UndefOr[String] = js.native
  // Forward file to external() to be externalized.
  var external: js.UndefOr[Boolean] = js.native
  // The name/path to the file.
  var file: js.UndefOr[String] = js.native
  // The ID to use for require() statements.
  var id: js.UndefOr[String] = js.native
  // Disable transforms on file if set to false.
  var transform: js.UndefOr[Boolean] = js.native
}

object FileOptions {
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
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
    def withoutBasedir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(js.undefined)
        ret
    }
    @scala.inline
    def withEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.undefined)
        ret
    }
    @scala.inline
    def withExpose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

