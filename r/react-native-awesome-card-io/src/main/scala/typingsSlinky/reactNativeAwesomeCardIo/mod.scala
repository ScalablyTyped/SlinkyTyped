package typingsSlinky.reactNativeAwesomeCardIo

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CardIOModule {
    
    @JSImport("react-native-awesome-card-io", "CardIOModule.scanCard")
    @js.native
    def scanCard(): js.Promise[CardDetails] = js.native
    @JSImport("react-native-awesome-card-io", "CardIOModule.scanCard")
    @js.native
    def scanCard(config: CardIOModuleProps): js.Promise[CardDetails] = js.native
  }
  
  object CardIOUtilities {
    
    @JSImport("react-native-awesome-card-io", "CardIOUtilities.CAN_READ_CARD_WITH_CAMERA")
    @js.native
    val CAN_READ_CARD_WITH_CAMERA: Boolean = js.native
    
    @JSImport("react-native-awesome-card-io", "CardIOUtilities.DETECTION_MODE")
    @js.native
    val DETECTION_MODE: CardIODetectionMode = js.native
    
    /**  iOS only - prepares card.io to launch faster. */
    @JSImport("react-native-awesome-card-io", "CardIOUtilities.preload")
    @js.native
    def preload(): Unit = js.native
  }
  
  @JSImport("react-native-awesome-card-io", "CardIOView")
  @js.native
  class CardIOView protected ()
    extends Component[CardIOViewProps, js.Object, js.Any] {
    def this(props: CardIOViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardIOViewProps, context: js.Any) = this()
  }
  
  @js.native
  trait CardDetails extends StObject {
    
    /**  Card number. */
    var cardNumber: String = js.native
    
    /**  Localized card type. */
    var cardType: String = js.native
    
    /**  Card holder name. */
    var cardholderName: String = js.native
    
    /**  Security code. */
    var cvv: String = js.native
    
    /**  Expiry month with january as 1 (may be 0 if expiry information was not requested). */
    var expiryMonth: Double = js.native
    
    /**  Expiry year (may be 0 if expiry information was not requested). */
    var expiryYear: Double = js.native
    
    /**  Postal code. Format is country dependent. */
    var postalCode: String = js.native
    
    /**  Card number with all but the last four digits obfuscated. */
    var redactedCardNumber: String = js.native
    
    /**  - Was the card number scanned (as opposed to entered manually)? */
    var scanned: js.UndefOr[Boolean] = js.native
  }
  object CardDetails {
    
    @scala.inline
    def apply(
      cardNumber: String,
      cardType: String,
      cardholderName: String,
      cvv: String,
      expiryMonth: Double,
      expiryYear: Double,
      postalCode: String,
      redactedCardNumber: String
    ): CardDetails = {
      val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expiryMonth = expiryMonth.asInstanceOf[js.Any], expiryYear = expiryYear.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], redactedCardNumber = redactedCardNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardDetails]
    }
    
    @scala.inline
    implicit class CardDetailsMutableBuilder[Self <: CardDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryMonth(value: Double): Self = StObject.set(x, "expiryMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryYear(value: Double): Self = StObject.set(x, "expiryYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedactedCardNumber(value: String): Self = StObject.set(x, "redactedCardNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanned(value: Boolean): Self = StObject.set(x, "scanned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScannedUndefined: Self = StObject.set(x, "scanned", js.undefined)
    }
  }
  
  @js.native
  trait CardIOCommonProps extends StObject {
    
    /**  true - By default, in camera view the card guide and the buttons always rotate to match the device's orientation. */
    var allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.native
    
    /**  iOS only */
    /**  false - Set the detection mode. (iOS) */
    var detectionMode: js.UndefOr[CardIODetectionMode] = js.native
    
    /**  Alter the card guide (bracket) color. Opaque colors recommended.. */
    var guideColor: js.UndefOr[String | Double] = js.native
    
    /**  false - Hide the PayPal or card.io logo in the scan view.. */
    var hideCardIOLogo: js.UndefOr[Boolean] = js.native
    
    /**  The preferred language for all strings appearing in the user interface. */
    var languageOrLocale: js.UndefOr[String] = js.native
    
    /**  true - Set to false if you don't want the camera to try to scan the card expiration.. */
    var scanExpiry: js.UndefOr[Boolean] = js.native
    
    /**  - Set the scan instruction text. If nil, use the default text.. */
    var scanInstructions: js.UndefOr[String] = js.native
    
    /**  0.1 - How long card.io will display an image of the card with the computed card number superimposed after a successful scan. */
    var scannedImageDuration: js.UndefOr[Double] = js.native
    
    /**  false - Set to true to show the card.io logo over the camera view instead of the PayPal logo.. */
    var useCardIOLogo: js.UndefOr[Boolean] = js.native
  }
  object CardIOCommonProps {
    
    @scala.inline
    def apply(): CardIOCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardIOCommonProps]
    }
    
    @scala.inline
    implicit class CardIOCommonPropsMutableBuilder[Self <: CardIOCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowFreelyRotatingCardGuide(value: Boolean): Self = StObject.set(x, "allowFreelyRotatingCardGuide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFreelyRotatingCardGuideUndefined: Self = StObject.set(x, "allowFreelyRotatingCardGuide", js.undefined)
      
      @scala.inline
      def setDetectionMode(value: CardIODetectionMode): Self = StObject.set(x, "detectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectionModeUndefined: Self = StObject.set(x, "detectionMode", js.undefined)
      
      @scala.inline
      def setGuideColor(value: String | Double): Self = StObject.set(x, "guideColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuideColorUndefined: Self = StObject.set(x, "guideColor", js.undefined)
      
      @scala.inline
      def setHideCardIOLogo(value: Boolean): Self = StObject.set(x, "hideCardIOLogo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCardIOLogoUndefined: Self = StObject.set(x, "hideCardIOLogo", js.undefined)
      
      @scala.inline
      def setLanguageOrLocale(value: String): Self = StObject.set(x, "languageOrLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageOrLocaleUndefined: Self = StObject.set(x, "languageOrLocale", js.undefined)
      
      @scala.inline
      def setScanExpiry(value: Boolean): Self = StObject.set(x, "scanExpiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanExpiryUndefined: Self = StObject.set(x, "scanExpiry", js.undefined)
      
      @scala.inline
      def setScanInstructions(value: String): Self = StObject.set(x, "scanInstructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanInstructionsUndefined: Self = StObject.set(x, "scanInstructions", js.undefined)
      
      @scala.inline
      def setScannedImageDuration(value: Double): Self = StObject.set(x, "scannedImageDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScannedImageDurationUndefined: Self = StObject.set(x, "scannedImageDuration", js.undefined)
      
      @scala.inline
      def setUseCardIOLogo(value: Boolean): Self = StObject.set(x, "useCardIOLogo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCardIOLogoUndefined: Self = StObject.set(x, "useCardIOLogo", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.IMAGE_AND_NUMBER
    - typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.IMAGE
    - typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.AUTOMATIC
  */
  trait CardIODetectionMode extends StObject
  object CardIODetectionMode {
    
    @scala.inline
    def AUTOMATIC: typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.AUTOMATIC = "AUTOMATIC".asInstanceOf[typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.AUTOMATIC]
    
    @scala.inline
    def IMAGE: typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.IMAGE = "IMAGE".asInstanceOf[typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.IMAGE]
    
    @scala.inline
    def IMAGE_AND_NUMBER: typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.IMAGE_AND_NUMBER = "IMAGE_AND_NUMBER".asInstanceOf[typingsSlinky.reactNativeAwesomeCardIo.reactNativeAwesomeCardIoStrings.IMAGE_AND_NUMBER]
  }
  
  @js.native
  trait CardIOModuleProps extends CardIOCommonProps {
    
    /**  iOS Only */
    /**  false - Disable the blur of the screen when the app is backgrounded. */
    var disableBlurWhenBackgrounding: js.UndefOr[Boolean] = js.native
    
    /**  false - If true, the status bar's style will be kept as whatever your app has set it to. */
    var keepStatusBarStyle: js.UndefOr[Boolean] = js.native
    
    /**  Android Only */
    /**  false If set, the card will not be scanned with the camera. */
    var noCamera: js.UndefOr[Boolean] = js.native
    
    /**  true - Set to false if you don't need to collect the CVV from the user. */
    var requireCVV: js.UndefOr[Boolean] = js.native
    
    /**  false - Set to true if you need to collect the cardholder name. */
    var requireCardholderName: js.UndefOr[Boolean] = js.native
    
    /**  true - Set to false if you don't need to collect the card expiration. */
    var requireExpiry: js.UndefOr[Boolean] = js.native
    
    /**  false - Set to false if you need to collect the billing postal code. */
    var requirePostalCode: js.UndefOr[Boolean] = js.native
    
    /**  false - Set to true if the postal code should only collect numeric input. */
    var restrictPostalCodeToNumericOnly: js.UndefOr[Boolean] = js.native
    
    /**  false - If true, don't have the user confirm the scanned card, just return the results immediately. */
    var suppressConfirmation: js.UndefOr[Boolean] = js.native
    
    /**  false - Set to true to prevent card.io from showing its "Enter Manually" button. */
    var suppressManualEntry: js.UndefOr[Boolean] = js.native
    
    /**  false - If true, instead of displaying the image of the scanned card, present the manual entry screen with the scanned card number prefilled. */
    var suppressScannedCardImage: js.UndefOr[Boolean] = js.native
    
    /**  -1 Privacy feature. How many of the Card number digits NOT to blur on the resulting image. Setting it to 4 will blur all digits except the last four. */
    var unblurDigits: js.UndefOr[Double] = js.native
    
    /**   Default false; Use the PayPal icon in the ActionBar. */
    var usePaypalActionbarIcon: js.UndefOr[Boolean] = js.native
  }
  object CardIOModuleProps {
    
    @scala.inline
    def apply(): CardIOModuleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardIOModuleProps]
    }
    
    @scala.inline
    implicit class CardIOModulePropsMutableBuilder[Self <: CardIOModuleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableBlurWhenBackgrounding(value: Boolean): Self = StObject.set(x, "disableBlurWhenBackgrounding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableBlurWhenBackgroundingUndefined: Self = StObject.set(x, "disableBlurWhenBackgrounding", js.undefined)
      
      @scala.inline
      def setKeepStatusBarStyle(value: Boolean): Self = StObject.set(x, "keepStatusBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepStatusBarStyleUndefined: Self = StObject.set(x, "keepStatusBarStyle", js.undefined)
      
      @scala.inline
      def setNoCamera(value: Boolean): Self = StObject.set(x, "noCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCameraUndefined: Self = StObject.set(x, "noCamera", js.undefined)
      
      @scala.inline
      def setRequireCVV(value: Boolean): Self = StObject.set(x, "requireCVV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireCVVUndefined: Self = StObject.set(x, "requireCVV", js.undefined)
      
      @scala.inline
      def setRequireCardholderName(value: Boolean): Self = StObject.set(x, "requireCardholderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireCardholderNameUndefined: Self = StObject.set(x, "requireCardholderName", js.undefined)
      
      @scala.inline
      def setRequireExpiry(value: Boolean): Self = StObject.set(x, "requireExpiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireExpiryUndefined: Self = StObject.set(x, "requireExpiry", js.undefined)
      
      @scala.inline
      def setRequirePostalCode(value: Boolean): Self = StObject.set(x, "requirePostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequirePostalCodeUndefined: Self = StObject.set(x, "requirePostalCode", js.undefined)
      
      @scala.inline
      def setRestrictPostalCodeToNumericOnly(value: Boolean): Self = StObject.set(x, "restrictPostalCodeToNumericOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictPostalCodeToNumericOnlyUndefined: Self = StObject.set(x, "restrictPostalCodeToNumericOnly", js.undefined)
      
      @scala.inline
      def setSuppressConfirmation(value: Boolean): Self = StObject.set(x, "suppressConfirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressConfirmationUndefined: Self = StObject.set(x, "suppressConfirmation", js.undefined)
      
      @scala.inline
      def setSuppressManualEntry(value: Boolean): Self = StObject.set(x, "suppressManualEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressManualEntryUndefined: Self = StObject.set(x, "suppressManualEntry", js.undefined)
      
      @scala.inline
      def setSuppressScannedCardImage(value: Boolean): Self = StObject.set(x, "suppressScannedCardImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressScannedCardImageUndefined: Self = StObject.set(x, "suppressScannedCardImage", js.undefined)
      
      @scala.inline
      def setUnblurDigits(value: Double): Self = StObject.set(x, "unblurDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnblurDigitsUndefined: Self = StObject.set(x, "unblurDigits", js.undefined)
      
      @scala.inline
      def setUsePaypalActionbarIcon(value: Boolean): Self = StObject.set(x, "usePaypalActionbarIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePaypalActionbarIconUndefined: Self = StObject.set(x, "usePaypalActionbarIcon", js.undefined)
    }
  }
  
  @js.native
  trait CardIOViewProps extends CardIOCommonProps {
    
    /**  This function will be called when the CardIOView completes its work and returns a CreditCard. */
    def didScanCard(card: CardDetails): Unit = js.native
    
    /**  Style props of CardIOViewProps */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object CardIOViewProps {
    
    @scala.inline
    def apply(didScanCard: CardDetails => Unit): CardIOViewProps = {
      val __obj = js.Dynamic.literal(didScanCard = js.Any.fromFunction1(didScanCard))
      __obj.asInstanceOf[CardIOViewProps]
    }
    
    @scala.inline
    implicit class CardIOViewPropsMutableBuilder[Self <: CardIOViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDidScanCard(value: CardDetails => Unit): Self = StObject.set(x, "didScanCard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
