package typingsSlinky.nodelibFsStat

import typingsSlinky.nodelibFsStat.settingsMod.default
import typingsSlinky.nodelibFsStat.typesMod.ErrnoException
import typingsSlinky.nodelibFsStat.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("@nodelib/fs.stat/out/providers/async", "read")
  @js.native
  def read(path: String, settings: default, callback: AsyncCallback): Unit = js.native
  
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit]
}
