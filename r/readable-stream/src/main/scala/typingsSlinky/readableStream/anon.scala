package typingsSlinky.readableStream

import typingsSlinky.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AfterTransform extends StObject {
    
    def afterTransform(er: js.Any, data: js.Any): Unit | Boolean = js.native
    
    var needTransform: Boolean = js.native
    
    var transforming: Boolean = js.native
    
    var writecb: (js.Function1[/* err */ js.Any, _]) | Null = js.native
    
    var writechunk: js.Any = js.native
    
    // TODO
    var writeencoding: BufferEncoding | Null = js.native
  }
  object AfterTransform {
    
    @scala.inline
    def apply(
      afterTransform: (js.Any, js.Any) => Unit | Boolean,
      needTransform: Boolean,
      transforming: Boolean,
      writechunk: js.Any
    ): AfterTransform = {
      val __obj = js.Dynamic.literal(afterTransform = js.Any.fromFunction2(afterTransform), needTransform = needTransform.asInstanceOf[js.Any], transforming = transforming.asInstanceOf[js.Any], writechunk = writechunk.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterTransform]
    }
    
    @scala.inline
    implicit class AfterTransformMutableBuilder[Self <: AfterTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterTransform(value: (js.Any, js.Any) => Unit | Boolean): Self = StObject.set(x, "afterTransform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNeedTransform(value: Boolean): Self = StObject.set(x, "needTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransforming(value: Boolean): Self = StObject.set(x, "transforming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritecb(value: /* err */ js.Any => _): Self = StObject.set(x, "writecb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWritecbNull: Self = StObject.set(x, "writecb", null)
      
      @scala.inline
      def setWritechunk(value: js.Any): Self = StObject.set(x, "writechunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteencoding(value: BufferEncoding): Self = StObject.set(x, "writeencoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteencodingNull: Self = StObject.set(x, "writeencoding", null)
    }
  }
  
  @js.native
  trait Chunk extends StObject {
    
    var chunk: js.Any = js.native
    
    var encoding: BufferEncoding | String = js.native
  }
  object Chunk {
    
    @scala.inline
    def apply(chunk: js.Any, encoding: BufferEncoding | String): Chunk = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunk(value: js.Any): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: BufferEncoding | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Encoding extends StObject {
    
    var chunk: js.Any = js.native
    
    var encoding: BufferEncoding = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(chunk: js.Any, encoding: BufferEncoding): Encoding = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunk(value: js.Any): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: js.UndefOr[Boolean] = js.native
  }
  object End {
    
    @scala.inline
    def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}
