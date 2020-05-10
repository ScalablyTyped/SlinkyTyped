package typingsSlinky.ecmarkup.specMod

import typingsSlinky.ecmarkup.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec extends js.Object {
  var namespace: String = js.native
  var opts: Options = js.native
  var rootDir: String = js.native
  var rootPath: String = js.native
  var spec: this.type = js.native
  def exportBiblio(): js.Any = js.native
  def toHTML(): String = js.native
}

object Spec {
  @scala.inline
  def apply(
    exportBiblio: () => js.Any,
    namespace: String,
    opts: Options,
    rootDir: String,
    rootPath: String,
    spec: Spec,
    toHTML: () => String
  ): Spec = {
    val __obj = js.Dynamic.literal(exportBiblio = js.Any.fromFunction0(exportBiblio), namespace = namespace.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], toHTML = js.Any.fromFunction0(toHTML))
    __obj.asInstanceOf[Spec]
  }
  @scala.inline
  implicit class SpecOps[Self <: Spec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportBiblio(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportBiblio")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: Spec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToHTML(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHTML")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

