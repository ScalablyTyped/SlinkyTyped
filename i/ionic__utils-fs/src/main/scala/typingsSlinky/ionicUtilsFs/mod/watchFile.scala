package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.anon.Interval
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "watchFile")
@js.native
object watchFile extends js.Object {
  
  def apply(
    filename: PathLike,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[
      /* curr */ typingsSlinky.node.fsMod.Stats, 
      /* prev */ typingsSlinky.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
}
