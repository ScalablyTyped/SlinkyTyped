package typingsSlinky.appBuilderLib.appFileCopierMod

import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.fsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/util/appFileCopier", "computeFileSets")
@js.native
object computeFileSets extends js.Object {
  
  def apply(
    matchers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ _
    ],
    transformer: Null,
    platformPackager: PlatformPackager[_],
    isElectronCompile: Boolean
  ): js.Promise[js.Array[ResolvedFileSet]] = js.native
  def apply(
    matchers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ _
    ],
    transformer: FileTransformer,
    platformPackager: PlatformPackager[_],
    isElectronCompile: Boolean
  ): js.Promise[js.Array[ResolvedFileSet]] = js.native
}
