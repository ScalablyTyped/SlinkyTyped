package typingsSlinky.appDashBuilderDashLib.outUtilAppFileCopierMod

import typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager
import typingsSlinky.builderDashUtil.outFsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/appFileCopier", "copyAppFiles")
@js.native
object copyAppFiles extends js.Object {
  def apply(fileSet: ResolvedFileSet, packager: Packager, transformer: FileTransformer): js.Promise[Unit] = js.native
}

