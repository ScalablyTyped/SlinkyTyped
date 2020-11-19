package typingsSlinky.nodelibFsScandir

import typingsSlinky.nodelibFsScandir.settingsMod.default
import typingsSlinky.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nodelib/fs.scandir/out/providers/sync", JSImport.Namespace)
@js.native
object syncMod extends js.Object {
  
  def read(directory: String, settings: default): js.Array[Entry] = js.native
  
  def readdir(directory: String, settings: default): js.Array[Entry] = js.native
  
  def readdirWithFileTypes(directory: String, settings: default): js.Array[Entry] = js.native
}
