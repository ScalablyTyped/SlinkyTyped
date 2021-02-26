package typingsSlinky.makeDir.anon

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstat extends StObject {
  
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: BigIntOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
  ): Unit = js.native
}
