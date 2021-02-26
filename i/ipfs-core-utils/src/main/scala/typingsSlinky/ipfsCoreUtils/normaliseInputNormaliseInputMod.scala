package typingsSlinky.ipfsCoreUtils

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.Blob
import typingsSlinky.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normaliseInputNormaliseInputMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/normalise-input", JSImport.Namespace)
  @js.native
  def apply[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */](
    input: Source,
    normaliseContent: js.Function1[/* content */ ToContent, Content | js.Promise[Content]]
  ): AsyncIterable[Directory | File[Content]] = js.native
  
  @js.native
  trait Directory
    extends Entry[js.Any] {
    
    var content: js.UndefOr[scala.Nothing] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime] = js.native
    
    var path: String = js.native
  }
  object Directory {
    
    @scala.inline
    def apply(path: String): Directory = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directory]
    }
    
    @scala.inline
    implicit class DirectoryMutableBuilder[Self <: Directory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.File[Content]
    - typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.Directory
  */
  trait Entry[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */] extends StObject
  object Entry {
    
    @scala.inline
    def Directory(path: String): typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.Directory = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.Directory]
    }
    
    @scala.inline
    def File[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */](path: String): typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.File[Content] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.ipfsCoreUtils.normaliseInputNormaliseInputMod.File[Content]]
    }
  }
  
  @js.native
  trait File[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */] extends Entry[Content] {
    
    var content: js.UndefOr[Content] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime] = js.native
    
    var path: String = js.native
  }
  object File {
    
    @scala.inline
    def apply[Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */](path: String): File[Content] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[File[Content]]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File[_], Content /* <: Blob | AsyncIterable[js.typedarray.Uint8Array] */] (val x: Self with File[Content]) extends AnyVal {
      
      @scala.inline
      def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileInput extends StObject {
    
    var content: js.UndefOr[
        String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array]
      ] = js.native
    
    var mode: js.UndefOr[String | Double] = js.native
    
    var mtime: js.UndefOr[
        typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime | js.Date | (js.Tuple2[Double, Double])
      ] = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  object FileInput {
    
    @scala.inline
    def apply(): FileInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileInput]
    }
    
    @scala.inline
    implicit class FileInputMutableBuilder[Self <: FileInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(
        value: String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBlob(value: Blob): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentIterable(value: js.Iterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReadableStream(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime | js.Date | (js.Tuple2[Double, Double])): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeDate(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type HRTime = js.Tuple2[Double, Double]
  
  @js.native
  trait MTime extends StObject {
    
    /**
      * - the number of nanoseconds since the last full
      * second.
      */
    var nsecs: Double = js.native
    
    /**
      * - the number of seconds since (positive) or before
      * (negative) the Unix Epoch began
      */
    var secs: Double = js.native
  }
  object MTime {
    
    @scala.inline
    def apply(nsecs: Double, secs: Double): MTime = {
      val __obj = js.Dynamic.literal(nsecs = nsecs.asInstanceOf[js.Any], secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MTime]
    }
    
    @scala.inline
    implicit class MTimeMutableBuilder[Self <: MTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecs(value: Double): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
    }
  }
  
  type Mode = Double
  
  type Source = (js.Iterable[
    String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array] | FileInput
  ]) | (AsyncIterable[
    String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array] | FileInput
  ]) | (ReadableStream[
    String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array] | FileInput
  ])
  
  type ToContent = String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array]
  
  type ToFile = String | Blob | AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | js.Iterable[js.typedarray.Uint8Array] | ReadableStream[js.typedarray.Uint8Array] | FileInput
  
  type UnixTime = typingsSlinky.ipfsCoreUtils.formatMtimeMod.MTime | js.Date | (js.Tuple2[Double, Double])
}
