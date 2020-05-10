package typingsSlinky.nextServer.libUtilsMod

import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.nextServerBooleans.`true`
import typingsSlinky.nextServer.renderMod.ManifestItem
import typingsSlinky.react.mod.ReactFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/utils.DocumentInitialProps & {  __NEXT_DATA__  :next-server.next-server/dist/lib/utils.NEXT_DATA,   dangerousAsPath  :string,   ampPath  :string,   inAmpMode  :boolean,   hybridAmp  :boolean,   staticMarkup  :boolean,   devFiles  :std.Array<string>,   files  :std.Array<string>,   dynamicImports  :std.Array<next-server.next-server/dist/server/render.ManifestItem>,   assetPrefix ? :string,   canonicalBase  :string} */
@js.native
trait DocumentProps extends js.Object {
  var __NEXT_DATA__ : NEXT_DATA = js.native
  var ampPath: String = js.native
  var assetPrefix: js.UndefOr[String] = js.native
  var canonicalBase: String = js.native
  var dangerousAsPath: String = js.native
  var dataOnly: js.UndefOr[`true`] = js.native
  var devFiles: js.Array[String] = js.native
  var dynamicImports: js.Array[ManifestItem] = js.native
  var files: js.Array[String] = js.native
  var head: js.UndefOr[js.Array[ReactElement | Null]] = js.native
  var html: String = js.native
  var hybridAmp: Boolean = js.native
  var inAmpMode: Boolean = js.native
  var staticMarkup: Boolean = js.native
  var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.native
}

object DocumentProps {
  @scala.inline
  def apply(
    __NEXT_DATA__ : NEXT_DATA,
    ampPath: String,
    canonicalBase: String,
    dangerousAsPath: String,
    devFiles: js.Array[String],
    dynamicImports: js.Array[ManifestItem],
    files: js.Array[String],
    html: String,
    hybridAmp: Boolean,
    inAmpMode: Boolean,
    staticMarkup: Boolean
  ): DocumentProps = {
    val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devFiles = devFiles.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProps]
  }
  @scala.inline
  implicit class DocumentPropsOps[Self <: DocumentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__NEXT_DATA__(value: NEXT_DATA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__NEXT_DATA__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmpPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanonicalBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDangerousAsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerousAsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamicImports(value: js.Array[ManifestItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHybridAmp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hybridAmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAmpMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAmpMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticMarkup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDataOnly(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withHead(value: js.Array[ReactElement | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[ReactElement] | ReactFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

