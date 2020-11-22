package typingsSlinky.ipfsCore.startMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.ipfsCore.blockStatMod.Stat
import typingsSlinky.ipfsCore.blockStatMod.StatOptions
import typingsSlinky.ipfsCore.chmodMod.ChmodOptions
import typingsSlinky.ipfsCore.cpMod.CpOptions
import typingsSlinky.ipfsCore.lsMod.UnixFSEntry
import typingsSlinky.ipfsCore.mkdirMod.MkdirOptions
import typingsSlinky.ipfsCore.mvMod.MvOptions
import typingsSlinky.ipfsCore.pinRmMod.RmOptions
import typingsSlinky.ipfsCore.readMod.ReadOptions
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.touchMod.TouchOptions
import typingsSlinky.ipfsCore.writeMod.WriteOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Files extends js.Object {
  
  def chmod(path: String, mode: String): js.Promise[Unit] = js.native
  def chmod(path: String, mode: String, options: ChmodOptions with AbortOptions): js.Promise[Unit] = js.native
  def chmod(path: String, mode: Double): js.Promise[Unit] = js.native
  def chmod(path: String, mode: Double, options: ChmodOptions with AbortOptions): js.Promise[Unit] = js.native
  
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple2[String | typingsSlinky.cids.mod.^ , js.UndefOr[CpOptions]]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple3[
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple4[
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple5[
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple6[
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple7[
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple8[
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  def cp(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] | [string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, string | cids, ./files/cp.CpOptions | undefined | undefined] is not an array type */ args: js.Tuple9[
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      String | typingsSlinky.cids.mod.^ , 
      js.UndefOr[CpOptions]
    ]
  ): js.Promise[Unit] = js.native
  
  def flush(path: String): js.Promise[typingsSlinky.cids.mod.^] = js.native
  def flush(path: String, options: AbortOptions): js.Promise[typingsSlinky.cids.mod.^] = js.native
  
  def ls(path: String): AsyncIterable[UnixFSEntry] = js.native
  def ls(path: String, options: AbortOptions): AsyncIterable[UnixFSEntry] = js.native
  
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mkdir(path: String, options: MkdirOptions with AbortOptions): js.Promise[Unit] = js.native
  
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple10[String, String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple3[String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple4[String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple5[String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple6[String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple7[String, String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  def mv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, string, ./files/mv.MvOptions | undefined | undefined] is not an array type */ args: js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]
  ): js.Promise[Unit] = js.native
  
  def read(path: String): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def read(path: String, options: ReadOptions with AbortOptions): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def read(path: typingsSlinky.cids.mod.^): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def read(path: typingsSlinky.cids.mod.^, options: ReadOptions with AbortOptions): AsyncIterable[js.typedarray.Uint8Array] = js.native
  
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple2[String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple3[String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple4[String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  def rm(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string, ./files/rm.RmOptions | undefined | undefined] | [string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] | [string, string, string, string, string, string, string, string, ./files/rm.RmOptions | undefined | undefined] is not an array type */ args: js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]
  ): js.Promise[Unit] = js.native
  
  def stat(path: String): js.Promise[Stat] = js.native
  def stat(path: String, options: StatOptions with AbortOptions): js.Promise[Stat] = js.native
  
  def touch(path: String): js.Promise[Unit] = js.native
  def touch(path: String, options: TouchOptions with AbortOptions): js.Promise[Unit] = js.native
  
  def write(path: String, content: String): js.Promise[Unit] = js.native
  def write(path: String, content: String, options: WriteOptions with AbortOptions): js.Promise[Unit] = js.native
  def write(path: String, content: AsyncIterable[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
  def write(
    path: String,
    content: AsyncIterable[js.typedarray.Uint8Array],
    options: WriteOptions with AbortOptions
  ): js.Promise[Unit] = js.native
  def write(path: String, content: Blob): js.Promise[Unit] = js.native
  def write(path: String, content: Blob, options: WriteOptions with AbortOptions): js.Promise[Unit] = js.native
  def write(path: String, content: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  def write(path: String, content: js.typedarray.Uint8Array, options: WriteOptions with AbortOptions): js.Promise[Unit] = js.native
}
