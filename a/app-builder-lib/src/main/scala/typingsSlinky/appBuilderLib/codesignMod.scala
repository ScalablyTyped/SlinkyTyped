package typingsSlinky.appBuilderLib

import typingsSlinky.tempFile.mod.TmpDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/codeSign/codesign", JSImport.Namespace)
@js.native
object codesignMod extends js.Object {
  
  def downloadCertificate(urlOrBase64: String, tmpDir: TmpDir, currentDir: String): js.Promise[String] = js.native
}
