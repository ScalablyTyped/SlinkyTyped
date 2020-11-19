package typingsSlinky.nodelibFsScandir

import typingsSlinky.nodelibFsScandir.typesMod.Dirent
import typingsSlinky.nodelibFsScandir.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nodelib/fs.scandir/out/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  @js.native
  object fs extends js.Object {
    
    def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
  }
}
