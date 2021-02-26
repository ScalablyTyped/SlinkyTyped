package typingsSlinky.broccoliOutputWrapper

import typingsSlinky.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.BaseEncodingOptionsflagst
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.EncodingBufferEncoding
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.anon.`3`
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.fsMod.WriteFileOptions
import typingsSlinky.node.fsMod.symlink.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(path: PathLike): Stats = js.native
    def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: Double): String | Buffer = js.native
    def apply(path: Double, options: BufferEncoding): String = js.native
    def apply(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def apply(path: Double, options: EncodingBufferEncoding): String = js.native
    def apply(path: Double, options: `3`): Buffer = js.native
    def apply(path: PathLike): String | Buffer = js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    def apply(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def apply(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def apply(path: PathLike, options: `3`): Buffer = js.native
  }
  
  @js.native
  trait FnCallFileDataOptions extends StObject {
    
    def apply(file: Double, data: String): Unit = js.native
    def apply(file: Double, data: String, options: WriteFileOptions): Unit = js.native
    def apply(file: Double, data: js.typedarray.Uint8Array): Unit = js.native
    def apply(file: Double, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
    def apply(file: PathLike, data: String): Unit = js.native
    def apply(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
    def apply(file: PathLike, data: js.typedarray.Uint8Array): Unit = js.native
    def apply(file: PathLike, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallPathAtimeMtime extends StObject {
    
    def apply(path: PathLike, atime: String, mtime: String): Unit = js.native
    def apply(path: PathLike, atime: String, mtime: js.Date): Unit = js.native
    def apply(path: PathLike, atime: String, mtime: Double): Unit = js.native
    def apply(path: PathLike, atime: js.Date, mtime: String): Unit = js.native
    def apply(path: PathLike, atime: js.Date, mtime: js.Date): Unit = js.native
    def apply(path: PathLike, atime: js.Date, mtime: Double): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: String): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: js.Date): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  }
  
  @js.native
  trait FnCallPathDataOptions extends StObject {
    
    def apply(path: Double, data: String): Unit = js.native
    def apply(path: Double, data: String, options: WriteFileOptions): Unit = js.native
    def apply(path: Double, data: ArrayBufferView): Unit = js.native
    def apply(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    def apply(path: PathLike, data: String): Unit = js.native
    def apply(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
    def apply(path: PathLike, data: ArrayBufferView): Unit = js.native
    def apply(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathLike): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def apply(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
  }
  
  @js.native
  trait FnCallTargetPathType extends StObject {
    
    def apply(target: PathLike, path: PathLike): Unit = js.native
    def apply(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  }
  
  @js.native
  trait Recursive extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.native
  }
  object Recursive {
    
    @scala.inline
    def apply(): Recursive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Recursive]
    }
    
    @scala.inline
    implicit class RecursiveMutableBuilder[Self <: Recursive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
