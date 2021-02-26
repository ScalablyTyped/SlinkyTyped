package typingsSlinky.mkdirp

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathLike): Stats = js.native
    def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
  }
  
  @js.native
  trait Typeofmkdir extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: js.UndefOr[Mode],
      callback: js.Function2[ErrnoException | Null, js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: js.UndefOr[Mode], callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Null, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptionsrecur,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
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
}
