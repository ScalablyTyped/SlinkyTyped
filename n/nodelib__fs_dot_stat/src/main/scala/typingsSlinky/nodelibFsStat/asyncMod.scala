package typingsSlinky.nodelibFsStat

import typingsSlinky.nodelibFsStat.settingsMod.default
import typingsSlinky.nodelibFsStat.typesMod.ErrnoException
import typingsSlinky.nodelibFsStat.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nodelib/fs.stat/out/providers/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  
  def read(path: String, settings: default, callback: AsyncCallback): Unit = js.native
  
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit]
}
