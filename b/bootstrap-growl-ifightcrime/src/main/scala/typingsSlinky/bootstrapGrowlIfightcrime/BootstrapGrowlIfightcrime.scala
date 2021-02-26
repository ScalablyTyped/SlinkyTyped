package typingsSlinky.bootstrapGrowlIfightcrime

import typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapGrowlIfightcrime {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.info
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.danger
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.success
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.warning
    - java.lang.String
    - scala.Null
  */
  type AlertType = _AlertType | String | Null
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.left
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.center
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.right
  */
  trait AlignType extends StObject
  object AlignType {
    
    @scala.inline
    def center: typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.center = "center".asInstanceOf[typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.center]
    
    @scala.inline
    def left: typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.left = "left".asInstanceOf[typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.left]
    
    @scala.inline
    def right: typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.right = "right".asInstanceOf[typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.right]
  }
  
  @js.native
  trait OffsetOption extends StObject {
    
    /**
      * Offset amount
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * Position: top or bottom
      */
    var from: js.UndefOr[OffsetPositionType] = js.native
  }
  object OffsetOption {
    
    @scala.inline
    def apply(): OffsetOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffsetOption]
    }
    
    @scala.inline
    implicit class OffsetOptionMutableBuilder[Self <: OffsetOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setFrom(value: OffsetPositionType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.top
    - typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.bottom
  */
  trait OffsetPositionType extends StObject
  object OffsetPositionType {
    
    @scala.inline
    def bottom: typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.bottom = "bottom".asInstanceOf[typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.bottom]
    
    @scala.inline
    def top: typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.top = "top".asInstanceOf[typingsSlinky.bootstrapGrowlIfightcrime.bootstrapGrowlIfightcrimeStrings.top]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * 'left', 'right', or 'center'
      */
    var align: js.UndefOr[AlignType] = js.native
    
    /**
      *  If true then will display a cross to close the popup.
      */
    var allow_dismiss: js.UndefOr[Boolean] = js.native
    
    /**
      * Time while the message will be displayed. It's not equivalent to the *demo* timeOut!
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Which element to append to
      */
    var ele: js.UndefOr[String] = js.native
    
    /**
      * Offset Options
      */
    var offset: js.UndefOr[OffsetOption] = js.native
    
    /**
      * Spacing between consecutively stacked growls.
      */
    var stackup_spacing: js.UndefOr[Double] = js.native
    
    /**
      * Values of (null, 'info', 'danger', 'success', 'warning') or another value
      */
    var `type`: js.UndefOr[AlertType] = js.native
    
    /**
      * Integer or 'auto'
      */
    var width: js.UndefOr[Double | auto] = js.native
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
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAllow_dismiss(value: Boolean): Self = StObject.set(x, "allow_dismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_dismissUndefined: Self = StObject.set(x, "allow_dismiss", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEle(value: String): Self = StObject.set(x, "ele", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEleUndefined: Self = StObject.set(x, "ele", js.undefined)
      
      @scala.inline
      def setOffset(value: OffsetOption): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setStackup_spacing(value: Double): Self = StObject.set(x, "stackup_spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackup_spacingUndefined: Self = StObject.set(x, "stackup_spacing", js.undefined)
      
      @scala.inline
      def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait _AlertType extends StObject
}
