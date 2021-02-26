package typingsSlinky.jimpCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jimpCore.anon.X
import typingsSlinky.jimpCore.jimpCoreStrings.`before-change`
import typingsSlinky.jimpCore.jimpCoreStrings.changed
import typingsSlinky.jimpCore.jimpCoreStrings.clone
import typingsSlinky.jimpCore.jimpCoreStrings.constructor
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object etcMod {
  
  @js.native
  trait Bitmap extends StObject {
    
    var data: Buffer = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Bitmap {
    
    @scala.inline
    def apply(data: Buffer, height: Double, width: Double): Bitmap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitmap]
    }
    
    @scala.inline
    implicit class BitmapMutableBuilder[Self <: Bitmap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BlendMode extends StObject {
    
    var mode: String = js.native
    
    var opacityDest: Double = js.native
    
    var opacitySource: Double = js.native
  }
  object BlendMode {
    
    @scala.inline
    def apply(mode: String, opacityDest: Double, opacitySource: Double): BlendMode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], opacityDest = opacityDest.asInstanceOf[js.Any], opacitySource = opacitySource.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlendMode]
    }
    
    @scala.inline
    implicit class BlendModeMutableBuilder[Self <: BlendMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityDest(value: Double): Self = StObject.set(x, "opacityDest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacitySource(value: Double): Self = StObject.set(x, "opacitySource", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jimpCore.jimpCoreStrings.background
    - typingsSlinky.jimpCore.jimpCoreStrings.scan
    - typingsSlinky.jimpCore.jimpCoreStrings.crop
  */
  trait ChangeName extends StObject
  object ChangeName {
    
    @scala.inline
    def background: typingsSlinky.jimpCore.jimpCoreStrings.background = "background".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.background]
    
    @scala.inline
    def crop: typingsSlinky.jimpCore.jimpCoreStrings.crop = "crop".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.crop]
    
    @scala.inline
    def scan: typingsSlinky.jimpCore.jimpCoreStrings.scan = "scan".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.scan]
  }
  
  type DecoderFn = js.Function1[/* data */ Buffer, Bitmap]
  
  type EncoderFn[ImageType /* <: Image */] = js.Function1[/* image */ ImageType, Buffer]
  
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ js.Error | Null, /* value */ T, U]
  
  @js.native
  trait Image extends StObject {
    
    var bitmap: Bitmap = js.native
  }
  object Image {
    
    @scala.inline
    def apply(bitmap: Bitmap): Image = {
      val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitmap(value: Bitmap): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageCallback[jimp] = js.ThisFunction3[/* this */ jimp, /* err */ js.Error | Null, /* value */ jimp, /* coords */ X, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jimpCore.jimpCoreStrings.any
    - typingsSlinky.jimpCore.jimpCoreStrings.initialized
    - typingsSlinky.jimpCore.jimpCoreStrings.`before-change`
    - typingsSlinky.jimpCore.jimpCoreStrings.changed
    - typingsSlinky.jimpCore.jimpCoreStrings.`before-clone`
    - typingsSlinky.jimpCore.jimpCoreStrings.cloned
    - typingsSlinky.jimpCore.jimpCoreStrings.background
    - typingsSlinky.jimpCore.jimpCoreStrings.scan
    - typingsSlinky.jimpCore.jimpCoreStrings.crop
  */
  trait ListenableName extends StObject
  object ListenableName {
    
    @scala.inline
    def any: typingsSlinky.jimpCore.jimpCoreStrings.any = "any".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.any]
    
    @scala.inline
    def background: typingsSlinky.jimpCore.jimpCoreStrings.background = "background".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.background]
    
    @scala.inline
    def `before-change`: typingsSlinky.jimpCore.jimpCoreStrings.`before-change` = "before-change".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.`before-change`]
    
    @scala.inline
    def `before-clone`: typingsSlinky.jimpCore.jimpCoreStrings.`before-clone` = "before-clone".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.`before-clone`]
    
    @scala.inline
    def changed: typingsSlinky.jimpCore.jimpCoreStrings.changed = "changed".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.changed]
    
    @scala.inline
    def cloned: typingsSlinky.jimpCore.jimpCoreStrings.cloned = "cloned".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.cloned]
    
    @scala.inline
    def crop: typingsSlinky.jimpCore.jimpCoreStrings.crop = "crop".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.crop]
    
    @scala.inline
    def initialized: typingsSlinky.jimpCore.jimpCoreStrings.initialized = "initialized".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.initialized]
    
    @scala.inline
    def scan: typingsSlinky.jimpCore.jimpCoreStrings.scan = "scan".asInstanceOf[typingsSlinky.jimpCore.jimpCoreStrings.scan]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jimpCore.anon.EventName[T]
    - typingsSlinky.jimpCore.anon.Dictkey[T]
  */
  trait ListenerData[T /* <: ListenableName */] extends StObject
  object ListenerData {
    
    @scala.inline
    def Dictkey[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): typingsSlinky.jimpCore.anon.Dictkey[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jimpCore.anon.Dictkey[T]]
    }
    
    @scala.inline
    def EventName[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): typingsSlinky.jimpCore.anon.EventName[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.jimpCore.anon.EventName[T]]
    }
  }
  
  @js.native
  trait RGB extends StObject {
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object RGB {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit class RGBMutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGBA extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object RGBA {
    
    @scala.inline
    def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit class RGBAMutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait URLOptions extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.native
    
    var headers: StringDictionary[js.Any] = js.native
    
    var url: String = js.native
  }
  object URLOptions {
    
    @scala.inline
    def apply(headers: StringDictionary[js.Any], url: String): URLOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLOptions]
    }
    
    @scala.inline
    implicit class URLOptionsMutableBuilder[Self <: URLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
