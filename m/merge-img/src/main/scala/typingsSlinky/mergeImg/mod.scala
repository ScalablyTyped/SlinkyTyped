package typingsSlinky.mergeImg

import typingsSlinky.jimp.mod.DepreciatedJimp
import typingsSlinky.mergeImg.mergeImgStrings.center
import typingsSlinky.mergeImg.mergeImgStrings.end
import typingsSlinky.mergeImg.mergeImgStrings.start
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merge-img", JSImport.Default)
  @js.native
  def default(images: js.Array[String | ImageDescriptor | Buffer | DepreciatedJimp]): js.Promise[DepreciatedJimp] = js.native
  @JSImport("merge-img", JSImport.Default)
  @js.native
  def default(images: js.Array[String | ImageDescriptor | Buffer | DepreciatedJimp], options: Options): js.Promise[DepreciatedJimp] = js.native
  
  @js.native
  trait ImageDescriptor extends StObject {
    
    /**
      * x offset to affect this image
      * @default 0
      */
    var offsetX: js.UndefOr[Double] = js.native
    
    /**
      * y offset to affect this image
      * @default 0
      */
    var offsetY: js.UndefOr[Double] = js.native
    
    /**
      * A single image source to concat
      */
    var src: String | Buffer = js.native
  }
  object ImageDescriptor {
    
    @scala.inline
    def apply(src: String | Buffer): ImageDescriptor = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDescriptor]
    }
    
    @scala.inline
    implicit class ImageDescriptorMutableBuilder[Self <: ImageDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setSrc(value: String | Buffer): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MarginOptions extends StObject {
    
    /**
      * Margin on bottom side of result image
      * @default 0
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /**
      * Margin on left side of result image
      * @default 0
      */
    var left: js.UndefOr[Double] = js.native
    
    /**
      * Margin on right side of result image
      * @default 0
      */
    var right: js.UndefOr[Double] = js.native
    
    /**
      * Margin on top side of result image
      * @default 0
      */
    var top: js.UndefOr[Double] = js.native
  }
  object MarginOptions {
    
    @scala.inline
    def apply(): MarginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarginOptions]
    }
    
    @scala.inline
    implicit class MarginOptionsMutableBuilder[Self <: MarginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Aligning of given images. If the images are not all the same size, images will be sorted to largest image
      * @default 'start'
      */
    var align: js.UndefOr[start | center | end] = js.native
    
    /**
      * Default background color represented by RGBA hex value.
      * @default 0x00000000
      */
    var color: js.UndefOr[Double] = js.native
    
    /**
      * Direction of the merged image. If this value is true, the images will be merged vertically (column).
      * Otherwise, the images will be merged horizontally (row)
      * @default false
      */
    var direction: js.UndefOr[Boolean] = js.native
    
    /**
      * Margin of the result image.
      * If `number` or `string` is passed, it will be considered as standard
      * css shorthand properties (e.g. '40 40 0 10')
      */
    var margin: js.UndefOr[Double | String | MarginOptions] = js.native
    
    /**
      * Offset in pixels between each image
      * @default 0
      */
    var offset: js.UndefOr[Double] = js.native
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
      def setAlign(value: start | center | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setMargin(value: Double | String | MarginOptions): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
