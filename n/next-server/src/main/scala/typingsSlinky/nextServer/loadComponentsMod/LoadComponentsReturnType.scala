package typingsSlinky.nextServer.loadComponentsMod

import typingsSlinky.nextServer.typesMod.PageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadComponentsReturnType extends js.Object {
  var App: js.UndefOr[js.Any] = js.native
  var Component: js.Any = js.native
  var Document: js.UndefOr[js.Any] = js.native
  var DocumentMiddleware: js.UndefOr[js.Any] = js.native
  var buildManifest: js.UndefOr[js.Any] = js.native
  var pageConfig: PageConfig = js.native
  var reactLoadableManifest: js.UndefOr[js.Any] = js.native
}

object LoadComponentsReturnType {
  @scala.inline
  def apply(Component: js.Any, pageConfig: PageConfig): LoadComponentsReturnType = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadComponentsReturnType]
  }
  @scala.inline
  implicit class LoadComponentsReturnTypeOps[Self <: LoadComponentsReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageConfig(value: PageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("App")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("App")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentMiddleware(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMiddleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMiddleware")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildManifest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withReactLoadableManifest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactLoadableManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactLoadableManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactLoadableManifest")(js.undefined)
        ret
    }
  }
  
}

