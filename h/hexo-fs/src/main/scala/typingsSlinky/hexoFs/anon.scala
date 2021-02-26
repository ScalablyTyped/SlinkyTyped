package typingsSlinky.hexoFs

import typingsSlinky.hexoFs.hexoFsStrings.buffer
import typingsSlinky.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var encoding: buffer = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(encoding: buffer): `0` = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  @js.native
  trait `2` extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding | Null] = js.native
  }
  object `2` {
    
    @scala.inline
    def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  @js.native
  trait AutoClose extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var defaultEncoding: js.UndefOr[String] = js.native
    
    var fd: js.UndefOr[Double] = js.native
    
    var flags: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var start: js.UndefOr[Double] = js.native
  }
  object AutoClose {
    
    @scala.inline
    def apply(): AutoClose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoClose]
    }
    
    @scala.inline
    implicit class AutoCloseMutableBuilder[Self <: AutoClose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait Buffer extends StObject {
    
    var buffer: typingsSlinky.node.Buffer = js.native
    
    var bytesRead: Double = js.native
  }
  object Buffer {
    
    @scala.inline
    def apply(buffer: typingsSlinky.node.Buffer, bytesRead: Double): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: typingsSlinky.node.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BufferBytesWritten extends StObject {
    
    var buffer: String = js.native
    
    var bytesWritten: Double = js.native
  }
  object BufferBytesWritten {
    
    @scala.inline
    def apply(buffer: String, bytesWritten: Double): BufferBytesWritten = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferBytesWritten]
    }
    
    @scala.inline
    implicit class BufferBytesWrittenMutableBuilder[Self <: BufferBytesWritten] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BytesRead extends StObject {
    
    var buffer: js.typedarray.Uint8Array = js.native
    
    var bytesRead: Double = js.native
  }
  object BytesRead {
    
    @scala.inline
    def apply(buffer: js.typedarray.Uint8Array, bytesRead: Double): BytesRead = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesRead]
    }
    
    @scala.inline
    implicit class BytesReadMutableBuilder[Self <: BytesRead] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BytesWritten[TBuffer /* <: typingsSlinky.node.Buffer | js.typedarray.Uint8Array */] extends StObject {
    
    var buffer: TBuffer = js.native
    
    var bytesWritten: Double = js.native
  }
  object BytesWritten {
    
    @scala.inline
    def apply[TBuffer /* <: typingsSlinky.node.Buffer | js.typedarray.Uint8Array */](buffer: TBuffer, bytesWritten: Double): BytesWritten[TBuffer] = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesWritten[TBuffer]]
    }
    
    @scala.inline
    implicit class BytesWrittenMutableBuilder[Self <: BytesWritten[_], TBuffer /* <: typingsSlinky.node.Buffer | js.typedarray.Uint8Array */] (val x: Self with BytesWritten[TBuffer]) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined hexo-fs.hexo-fs.DirectoryOptions & {  exclude :std.Array<string> | undefined} */
  @js.native
  trait DirectoryOptionsexcludeAr extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var ignoreHidden: js.UndefOr[Boolean] = js.native
    
    var ignorePattern: js.UndefOr[js.RegExp] = js.native
  }
  object DirectoryOptionsexcludeAr {
    
    @scala.inline
    def apply(): DirectoryOptionsexcludeAr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryOptionsexcludeAr]
    }
    
    @scala.inline
    implicit class DirectoryOptionsexcludeArMutableBuilder[Self <: DirectoryOptionsexcludeAr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
      
      @scala.inline
      def setIgnorePattern(value: js.RegExp): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
    }
  }
  
  @js.native
  trait Encoding extends StObject {
    
    var encoding: BufferEncoding | Null = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
    }
  }
  
  @js.native
  trait Escape extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
    
    var escape: js.UndefOr[Boolean] = js.native
    
    var flag: js.UndefOr[String] = js.native
  }
  object Escape {
    
    @scala.inline
    def apply(): Escape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Escape]
    }
    
    @scala.inline
    implicit class EscapeMutableBuilder[Self <: Escape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  @js.native
  trait Flag extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.native
    
    var flag: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[String | Double] = js.native
  }
  object Flag {
    
    @scala.inline
    def apply(): Flag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flag]
    }
    
    @scala.inline
    implicit class FlagMutableBuilder[Self <: Flag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
