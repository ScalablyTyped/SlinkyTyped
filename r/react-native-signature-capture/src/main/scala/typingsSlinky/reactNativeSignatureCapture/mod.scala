package typingsSlinky.reactNativeSignatureCapture

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeSignatureCapture.reactNativeSignatureCaptureStrings.landscape
import typingsSlinky.reactNativeSignatureCapture.reactNativeSignatureCaptureStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-signature-capture", JSImport.Default)
  @js.native
  class default () extends SignatureCapture
  
  @js.native
  trait SaveEventParams extends StObject {
    
    /**
      * The base64 encoded png
      */
    var encoded: String = js.native
    
    /**
      * The file path name
      */
    var pathName: String = js.native
  }
  object SaveEventParams {
    
    @scala.inline
    def apply(encoded: String, pathName: String): SaveEventParams = {
      val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], pathName = pathName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaveEventParams]
    }
    
    @scala.inline
    implicit class SaveEventParamsMutableBuilder[Self <: SaveEventParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoded(value: String): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathName(value: String): Self = StObject.set(x, "pathName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignatureCapture
    extends Component[SignatureCaptureProps, js.Object, js.Any] {
    
    /**
      * When called it will clear the image on the canvas
      */
    def resetImage(): Unit = js.native
    
    /**
      * When called it will save the image and returns the base 64 encoded string on onSaveEvent() callback
      */
    def saveImage(): Unit = js.native
  }
  
  @js.native
  trait SignatureCaptureProps extends ViewProps {
    
    /**
      * sets the max size of the image maintains aspect ratio,
      *
      * @default 500
      */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
      * Triggered when user marks their signature on the canvas.
      * This will not be called when the user does not perform any action on canvas.
      *
      * @param event - the event when a drag is performed
      */
    var onDragEvent: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
    
    /**
      * Triggered when saveImage() is called, which return Base64 Encoded String and image file path.
      *
      * @param params - the file path and encoded png
      */
    var onSaveEvent: js.UndefOr[js.Function1[/* params */ SaveEventParams, Unit]] = js.native
    
    /**
      * Make this props true, if you want to save the image file in external storage.
      * Warning: Image file will be visible in gallery or any other image browsing app
      *
      * @default false
      */
    var saveImageFileInExtStorage: js.UndefOr[Boolean] = js.native
    
    /**
      * If this props is made to false, it will hide the dashed border (the border is shown on iOS only).
      *
      * @default false
      */
    var showBorder: js.UndefOr[Boolean] = js.native
    
    /**
      * If this props is made to true, it will display the native buttons "Save" and "Reset".
      *
      * @default false
      */
    var showNativeButtons: js.UndefOr[Boolean] = js.native
    
    /**
      * If this props is made to true, it will display the "x_ _ _ _ _ _ _ _ _ _ _" placeholder indicating where to sign.
      *
      * @default false
      */
    var showTitleLabel: js.UndefOr[Boolean] = js.native
    
    /**
      * Change the screen orientation based on boolean value
      * "portrait" or "landscape"
      */
    var viewMode: js.UndefOr[portrait | landscape] = js.native
  }
  object SignatureCaptureProps {
    
    @scala.inline
    def apply(): SignatureCaptureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureCaptureProps]
    }
    
    @scala.inline
    implicit class SignatureCapturePropsMutableBuilder[Self <: SignatureCaptureProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setOnDragEvent(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onDragEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEventUndefined: Self = StObject.set(x, "onDragEvent", js.undefined)
      
      @scala.inline
      def setOnSaveEvent(value: /* params */ SaveEventParams => Unit): Self = StObject.set(x, "onSaveEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSaveEventUndefined: Self = StObject.set(x, "onSaveEvent", js.undefined)
      
      @scala.inline
      def setSaveImageFileInExtStorage(value: Boolean): Self = StObject.set(x, "saveImageFileInExtStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveImageFileInExtStorageUndefined: Self = StObject.set(x, "saveImageFileInExtStorage", js.undefined)
      
      @scala.inline
      def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
      
      @scala.inline
      def setShowNativeButtons(value: Boolean): Self = StObject.set(x, "showNativeButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNativeButtonsUndefined: Self = StObject.set(x, "showNativeButtons", js.undefined)
      
      @scala.inline
      def setShowTitleLabel(value: Boolean): Self = StObject.set(x, "showTitleLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitleLabelUndefined: Self = StObject.set(x, "showTitleLabel", js.undefined)
      
      @scala.inline
      def setViewMode(value: portrait | landscape): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
}
