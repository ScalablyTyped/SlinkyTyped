package typingsSlinky.appBuilderLib.appFileCopierMod

import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.builderUtil.fsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/util/appFileCopier", "copyAppFiles")
@js.native
object copyAppFiles extends js.Object {
  
  def apply(fileSet: ResolvedFileSet, packager: Packager, transformer: FileTransformer): js.Promise[Unit] = js.native
}
