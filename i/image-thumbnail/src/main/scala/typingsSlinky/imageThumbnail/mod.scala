package typingsSlinky.imageThumbnail

import typingsSlinky.imageThumbnail.anon.Uri
import typingsSlinky.imageThumbnail.anon.responseTypebase64Options
import typingsSlinky.imageThumbnail.anon.responseTypebufferOptions
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: String): js.Promise[Buffer] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: String, options: responseTypebase64Options): js.Promise[String] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: String, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: Uri): js.Promise[Buffer] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: Uri, options: responseTypebase64Options): js.Promise[String] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: Uri, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: Buffer): js.Promise[Buffer] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: Buffer, options: responseTypebase64Options): js.Promise[String] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: Buffer, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: ReadStream): js.Promise[Buffer] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: ReadStream, options: responseTypebase64Options): js.Promise[String] = js.native
  @JSImport("image-thumbnail", JSImport.Namespace)
  @js.native
  def apply(src: ReadStream, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var percentage: js.UndefOr[Double] = js.native
    
    var responseType: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
