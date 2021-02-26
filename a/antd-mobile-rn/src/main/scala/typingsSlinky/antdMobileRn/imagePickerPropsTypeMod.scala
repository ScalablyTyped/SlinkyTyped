package typingsSlinky.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePickerPropsTypeMod {
  
  @js.native
  trait ImagePickerPropTypes extends StObject {
    
    var files: js.UndefOr[js.Array[js.Object]] = js.native
    
    var onAddImageClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChange: js.UndefOr[
        js.Function3[
          /* files */ js.Array[js.Object], 
          /* operationType */ String, 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
    
    var onImageClick: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]], Unit]
      ] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var styles: js.UndefOr[js.Object] = js.native
  }
  object ImagePickerPropTypes {
    
    @scala.inline
    def apply(): ImagePickerPropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImagePickerPropTypes]
    }
    
    @scala.inline
    implicit class ImagePickerPropTypesMutableBuilder[Self <: ImagePickerPropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[js.Object]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: js.Object*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setOnAddImageClick(value: () => Unit): Self = StObject.set(x, "onAddImageClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAddImageClickUndefined: Self = StObject.set(x, "onAddImageClick", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFail(value: /* msg */ String => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
      
      @scala.inline
      def setOnImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit): Self = StObject.set(x, "onImageClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnImageClickUndefined: Self = StObject.set(x, "onImageClick", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
