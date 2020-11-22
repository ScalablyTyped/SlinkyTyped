package typingsSlinky.rimraf

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.RmDirOptions
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.rimraf.rimrafStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Fn0 extends js.Object {
    
    def apply(path: PathLike): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def apply(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(path: PathLike): Stats = js.native
    def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends js.Object {
    
    def apply(path: PathLike): Unit = js.native
    def apply(path: PathLike, options: RmDirOptions): Unit = js.native
  }
  
  @js.native
  trait Typeofchmod extends js.Object {
    
    def apply(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeoflstat extends js.Object {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  }
  
  @js.native
  trait Typeofreaddir extends js.Object {
    
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFiEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: BaseEncodingOptionswithFi,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Encoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: WithFileTypes,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: buffer,
      callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofrmdir extends js.Object {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: RmDirOptions, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait Typeofstat extends js.Object {
    
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
  
  @js.native
  trait Typeofunlink extends js.Object {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  }
}
