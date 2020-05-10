package typingsSlinky.angularCore.documentImportVisitorMod

import typingsSlinky.typescript.mod.ImportSpecifier
import typingsSlinky.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedDocumentImport extends js.Object {
  var commonImport: NamedImports | Null = js.native
  var documentElement: ImportSpecifier | Null = js.native
  var platformBrowserImport: NamedImports | Null = js.native
}

object ResolvedDocumentImport {
  @scala.inline
  def apply(): ResolvedDocumentImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedDocumentImport]
  }
  @scala.inline
  implicit class ResolvedDocumentImportOps[Self <: ResolvedDocumentImport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonImport(value: NamedImports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonImportNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonImport")(null)
        ret
    }
    @scala.inline
    def withDocumentElement(value: ImportSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentElement")(null)
        ret
    }
    @scala.inline
    def withPlatformBrowserImport(value: NamedImports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformBrowserImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformBrowserImportNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformBrowserImport")(null)
        ret
    }
  }
  
}

