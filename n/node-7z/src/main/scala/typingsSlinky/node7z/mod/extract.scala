package typingsSlinky.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "extract")
@js.native
object extract extends js.Object {
  
  /**
    * Extracts files from an archive to the current directory or to the output directory. This command copies all extracted files to one directory.
    * @param archive Archive to extract files from
    * @param output Output directory
    * @param options Seven Zip Options
    */
  def apply(archive: String, output: String): ZipStream = js.native
  def apply(archive: String, output: String, options: SevenZipOptions): ZipStream = js.native
}
