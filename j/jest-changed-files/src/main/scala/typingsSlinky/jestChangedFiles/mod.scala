package typingsSlinky.jestChangedFiles

import typingsSlinky.jestChangedFiles.typesMod.ChangedFilesPromise
import typingsSlinky.jestChangedFiles.typesMod.Options
import typingsSlinky.jestChangedFiles.typesMod.Repos
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-changed-files", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def findRepos(roots: js.Array[Path]): js.Promise[Repos] = js.native
  
  def getChangedFilesForRoots(roots: js.Array[Path], options: Options): ChangedFilesPromise = js.native
}
