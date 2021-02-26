package typingsSlinky.atomically

import typingsSlinky.atomically.anon.Fn0
import typingsSlinky.atomically.anon.FnCall
import typingsSlinky.atomically.anon.FnCallFdBufferOffsetLengthPosition
import typingsSlinky.atomically.anon.FnCallPathFlagsMode
import typingsSlinky.atomically.anon.FnCallPathOptions
import typingsSlinky.atomically.anon.TypeofrealpathSync
import typingsSlinky.atomically.typesMod.FN
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/fs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("atomically/dist/utils/fs", "default.chmodAttempt")
    @js.native
    def chmodAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ js.Any = js.native
    @scala.inline
    def chmodAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chmodAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.chmodSyncAttempt")
    @js.native
    def chmodSyncAttempt: js.Function2[/* path */ PathLike, /* mode */ Mode, Unit] = js.native
    @JSImport("atomically/dist/utils/fs", "default.chmodSyncAttempt")
    @js.native
    def chmodSyncAttempt(path: PathLike, mode: Mode): Unit = js.native
    @scala.inline
    def chmodSyncAttempt_=(x: js.Function2[/* path */ PathLike, /* mode */ Mode, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chmodSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.chownAttempt")
    @js.native
    def chownAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ js.Any = js.native
    @scala.inline
    def chownAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chownAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.chownSyncAttempt")
    @js.native
    def chownSyncAttempt: js.Function3[/* path */ PathLike, /* uid */ Double, /* gid */ Double, Unit] = js.native
    @JSImport("atomically/dist/utils/fs", "default.chownSyncAttempt")
    @js.native
    def chownSyncAttempt(path: PathLike, uid: Double, gid: Double): Unit = js.native
    @scala.inline
    def chownSyncAttempt_=(x: js.Function3[/* path */ PathLike, /* uid */ Double, /* gid */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chownSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.closeAttempt")
    @js.native
    def closeAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ js.Any = js.native
    @scala.inline
    def closeAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.closeRetry")
    @js.native
    def closeRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ js.Any
      ] = js.native
    @JSImport("atomically/dist/utils/fs", "default.closeRetry")
    @js.native
    def closeRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @scala.inline
    def closeRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.closeSyncAttempt")
    @js.native
    def closeSyncAttempt: js.Function1[/* fd */ Double, Unit] = js.native
    @JSImport("atomically/dist/utils/fs", "default.closeSyncAttempt")
    @js.native
    def closeSyncAttempt(fd: Double): Unit = js.native
    @scala.inline
    def closeSyncAttempt_=(x: js.Function1[/* fd */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.closeSyncRetry")
    @js.native
    def closeSyncRetry: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]] = js.native
    @JSImport("atomically/dist/utils/fs", "default.closeSyncRetry")
    @js.native
    def closeSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, Unit] = js.native
    @scala.inline
    def closeSyncRetry_=(x: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.fsyncAttempt")
    @js.native
    def fsyncAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ js.Any = js.native
    @scala.inline
    def fsyncAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fsyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.fsyncRetry")
    @js.native
    def fsyncRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ js.Any
      ] = js.native
    @JSImport("atomically/dist/utils/fs", "default.fsyncRetry")
    @js.native
    def fsyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @scala.inline
    def fsyncRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fsyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.fsyncSyncRetry")
    @js.native
    def fsyncSyncRetry: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]] = js.native
    @JSImport("atomically/dist/utils/fs", "default.fsyncSyncRetry")
    @js.native
    def fsyncSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, Unit] = js.native
    @scala.inline
    def fsyncSyncRetry_=(x: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fsyncSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.mkdirAttempt")
    @js.native
    def mkdirAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ js.Any = js.native
    @scala.inline
    def mkdirAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mkdirAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt: FnCall = js.native
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt(path: PathLike): js.UndefOr[String] = js.native
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt(path: PathLike, options: Mode): js.UndefOr[String] = js.native
    @scala.inline
    def mkdirSyncAttempt_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mkdirSyncAttempt")(x.asInstanceOf[js.Any])
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt_Unit(path: PathLike): Unit = js.native
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt_Unit(path: PathLike, options: Mode): Unit = js.native
    
    @JSImport("atomically/dist/utils/fs", "default.openRetry")
    @js.native
    def openRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ js.Any
      ] = js.native
    @JSImport("atomically/dist/utils/fs", "default.openRetry")
    @js.native
    def openRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @scala.inline
    def openRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.openSyncRetry")
    @js.native
    def openSyncRetry: FN[js.Array[Double], FnCallPathFlagsMode] = js.native
    @JSImport("atomically/dist/utils/fs", "default.openSyncRetry")
    @js.native
    def openSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallPathFlagsMode = js.native
    @scala.inline
    def openSyncRetry_=(x: FN[js.Array[Double], FnCallPathFlagsMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.readFileRetry")
    @js.native
    def readFileRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ js.Any
      ] = js.native
    @JSImport("atomically/dist/utils/fs", "default.readFileRetry")
    @js.native
    def readFileRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @scala.inline
    def readFileRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFileRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.readFileSyncRetry")
    @js.native
    def readFileSyncRetry: FN[js.Array[Double], Fn0] = js.native
    @JSImport("atomically/dist/utils/fs", "default.readFileSyncRetry")
    @js.native
    def readFileSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Fn0 = js.native
    @scala.inline
    def readFileSyncRetry_=(x: FN[js.Array[Double], Fn0]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFileSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.realpathAttempt")
    @js.native
    def realpathAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ js.Any = js.native
    @scala.inline
    def realpathAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realpathAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.realpathSyncAttempt")
    @js.native
    def realpathSyncAttempt: TypeofrealpathSync = js.native
    @scala.inline
    def realpathSyncAttempt_=(x: TypeofrealpathSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realpathSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.renameRetry")
    @js.native
    def renameRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ js.Any
      ] = js.native
    @JSImport("atomically/dist/utils/fs", "default.renameRetry")
    @js.native
    def renameRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @scala.inline
    def renameRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renameRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.renameSyncRetry")
    @js.native
    def renameSyncRetry: FN[
        js.Array[Double], 
        js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]
      ] = js.native
    @JSImport("atomically/dist/utils/fs", "default.renameSyncRetry")
    @js.native
    def renameSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit] = js.native
    @scala.inline
    def renameSyncRetry_=(
      x: FN[
          js.Array[Double], 
          js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renameSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.statAttempt")
    @js.native
    def statAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ js.Any = js.native
    @scala.inline
    def statAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.statRetry")
    @js.native
    def statRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ js.Any
      ] = js.native
    @JSImport("atomically/dist/utils/fs", "default.statRetry")
    @js.native
    def statRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @scala.inline
    def statRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.statSyncAttempt")
    @js.native
    def statSyncAttempt: FnCallPathOptions = js.native
    @JSImport("atomically/dist/utils/fs", "default.statSyncAttempt")
    @js.native
    def statSyncAttempt(path: PathLike): Stats = js.native
    @JSImport("atomically/dist/utils/fs", "default.statSyncAttempt")
    @js.native
    def statSyncAttempt(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    @JSImport("atomically/dist/utils/fs", "default.statSyncAttempt")
    @js.native
    def statSyncAttempt(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
    @scala.inline
    def statSyncAttempt_=(x: FnCallPathOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.statSyncRetry")
    @js.native
    def statSyncRetry: FN[js.Array[Double], FnCallPathOptions] = js.native
    @JSImport("atomically/dist/utils/fs", "default.statSyncRetry")
    @js.native
    def statSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallPathOptions = js.native
    @scala.inline
    def statSyncRetry_=(x: FN[js.Array[Double], FnCallPathOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.unlinkAttempt")
    @js.native
    def unlinkAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ js.Any = js.native
    @scala.inline
    def unlinkAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unlinkAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.unlinkSyncAttempt")
    @js.native
    def unlinkSyncAttempt: js.Function1[/* path */ PathLike, Unit] = js.native
    @JSImport("atomically/dist/utils/fs", "default.unlinkSyncAttempt")
    @js.native
    def unlinkSyncAttempt(path: PathLike): Unit = js.native
    @scala.inline
    def unlinkSyncAttempt_=(x: js.Function1[/* path */ PathLike, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unlinkSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.writeRetry")
    @js.native
    def writeRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.write.__promisify__ */ js.Any
      ] = js.native
    @JSImport("atomically/dist/utils/fs", "default.writeRetry")
    @js.native
    def writeRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @scala.inline
    def writeRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.write.__promisify__ */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.writeSyncRetry")
    @js.native
    def writeSyncRetry: FN[js.Array[Double], FnCallFdBufferOffsetLengthPosition] = js.native
    @JSImport("atomically/dist/utils/fs", "default.writeSyncRetry")
    @js.native
    def writeSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallFdBufferOffsetLengthPosition = js.native
    @scala.inline
    def writeSyncRetry_=(x: FN[js.Array[Double], FnCallFdBufferOffsetLengthPosition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeSyncRetry")(x.asInstanceOf[js.Any])
  }
}
