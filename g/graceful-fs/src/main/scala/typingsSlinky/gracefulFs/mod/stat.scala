package typingsSlinky.gracefulFs.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graceful-fs", "stat")
@js.native
object stat extends js.Object {
  
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typingsSlinky.node.fsMod.Stats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BigIntOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* stats */ typingsSlinky.node.fsMod.BigIntStats, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* stats */ typingsSlinky.node.fsMod.Stats | typingsSlinky.node.fsMod.BigIntStats, 
      Unit
    ]
  ): Unit = js.native
}
