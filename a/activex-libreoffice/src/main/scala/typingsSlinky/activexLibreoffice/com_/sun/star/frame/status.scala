package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`16`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`32`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`64`
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object status {
  
  /**
    * contains a list of format IDs and names which are part of the system clipboard.
    * @since OOo 2.0
    */
  @js.native
  trait ClipboardFormats extends StObject {
    
    /** specifies a sequence of format IDs which are contained in the system clipboard. */
    var Identifiers: SafeArray[Double] = js.native
    
    /** specifies a sequence of format names which are contained in the system clipboard. */
    var Names: SafeArray[String] = js.native
  }
  object ClipboardFormats {
    
    @scala.inline
    def apply(Identifiers: SafeArray[Double], Names: SafeArray[String]): ClipboardFormats = {
      val __obj = js.Dynamic.literal(Identifiers = Identifiers.asInstanceOf[js.Any], Names = Names.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardFormats]
    }
    
    @scala.inline
    implicit class ClipboardFormatsMutableBuilder[Self <: ClipboardFormats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifiers(value: SafeArray[Double]): Self = StObject.set(x, "Identifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: SafeArray[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * describes the characteristics of a font.
    *
    * For example, this can be used to select a font.
    * @since OOo 2.0
    */
  @js.native
  trait FontHeight extends StObject {
    
    /** specifies the width of the font in the measure of the destination. */
    var Diff: Double = js.native
    
    /** specifies the current height of the font. */
    var Height: Double = js.native
    
    /** specifies the height of the font in the measure of the destination. */
    var Prop: Double = js.native
  }
  object FontHeight {
    
    @scala.inline
    def apply(Diff: Double, Height: Double, Prop: Double): FontHeight = {
      val __obj = js.Dynamic.literal(Diff = Diff.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Prop = Prop.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontHeight]
    }
    
    @scala.inline
    implicit class FontHeightMutableBuilder[Self <: FontHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiff(value: Double): Self = StObject.set(x, "Diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProp(value: Double): Self = StObject.set(x, "Prop", value.asInstanceOf[js.Any])
    }
  }
  
  object ItemState {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`32`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`16`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`64`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def DEFAULT_VALUE: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def DISABLED: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def DONT_CARE: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def READ_ONLY: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def SET: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def UNKNOWN: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  /**
    * describes a state of a property.
    * @since OOo 2.0
    */
  @js.native
  trait ItemStatus extends StObject {
    
    /**
      * numerical value which describes the current state of an item.
      * @see ItemState
      */
    var State: Double = js.native
    
    /** optional data which can be used by an implementation to send additional information. The content is dependent on the specific implementation. */
    var aStateData: js.Any = js.native
  }
  object ItemStatus {
    
    @scala.inline
    def apply(State: Double, aStateData: js.Any): ItemStatus = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], aStateData = aStateData.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemStatus]
    }
    
    @scala.inline
    implicit class ItemStatusMutableBuilder[Self <: ItemStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAStateData(value: js.Any): Self = StObject.set(x, "aStateData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies a left and right margin.
    * @since OOo 2.0
    */
  @js.native
  trait LeftRightMargin extends StObject {
    
    /** specifies a left side margin in 1/100th mm. */
    var Left: Double = js.native
    
    /** specifies a right side margin in 1/100th mm. */
    var Right: Double = js.native
  }
  object LeftRightMargin {
    
    @scala.inline
    def apply(Left: Double, Right: Double): LeftRightMargin = {
      val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeftRightMargin]
    }
    
    @scala.inline
    implicit class LeftRightMarginMutableBuilder[Self <: LeftRightMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies a left and right margin.
    * @since LibreOffice 5.3
    */
  @js.native
  trait LeftRightMarginScale extends StObject {
    
    /** specifies if the automatic calculation of the first line indent occurs. */
    var AutoFirstLine: Boolean = js.native
    
    /** specifies a first line indent relative to TextLeft in 1/100th mm. */
    var FirstLine: Double = js.native
    
    /** specifies a left margin in 1/100th mm. */
    var Left: Double = js.native
    
    /** specifies a right margin in 1/100th mm. */
    var Right: Double = js.native
    
    /** specifies a scale value for the first line margin in percent. */
    var ScaleFirstLine: Double = js.native
    
    /** specifies a scale value for the left margin in percent. */
    var ScaleLeft: Double = js.native
    
    /** specifies a scale value for the right margin in percent. */
    var ScaleRight: Double = js.native
    
    /** specifies a left text margin in 1/100th mm. */
    var TextLeft: Double = js.native
  }
  object LeftRightMarginScale {
    
    @scala.inline
    def apply(
      AutoFirstLine: Boolean,
      FirstLine: Double,
      Left: Double,
      Right: Double,
      ScaleFirstLine: Double,
      ScaleLeft: Double,
      ScaleRight: Double,
      TextLeft: Double
    ): LeftRightMarginScale = {
      val __obj = js.Dynamic.literal(AutoFirstLine = AutoFirstLine.asInstanceOf[js.Any], FirstLine = FirstLine.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], ScaleFirstLine = ScaleFirstLine.asInstanceOf[js.Any], ScaleLeft = ScaleLeft.asInstanceOf[js.Any], ScaleRight = ScaleRight.asInstanceOf[js.Any], TextLeft = TextLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeftRightMarginScale]
    }
    
    @scala.inline
    implicit class LeftRightMarginScaleMutableBuilder[Self <: LeftRightMarginScale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFirstLine(value: Boolean): Self = StObject.set(x, "AutoFirstLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstLine(value: Double): Self = StObject.set(x, "FirstLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFirstLine(value: Double): Self = StObject.set(x, "ScaleFirstLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleLeft(value: Double): Self = StObject.set(x, "ScaleLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleRight(value: Double): Self = StObject.set(x, "ScaleRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextLeft(value: Double): Self = StObject.set(x, "TextLeft", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * contains an association between a style name and a value.
    * @since OOo 2.0
    */
  @js.native
  trait Template extends StObject {
    
    /** specifies a style name. */
    var StyleName: String = js.native
    
    /** specifies a value that is bound to the style name. */
    var Value: Double = js.native
  }
  object Template {
    
    @scala.inline
    def apply(StyleName: String, Value: Double): Template = {
      val __obj = js.Dynamic.literal(StyleName = StyleName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Template]
    }
    
    @scala.inline
    implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyleName(value: String): Self = StObject.set(x, "StyleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies an upper and lower margin.
    * @since OOo 2.0
    */
  @js.native
  trait UpperLowerMargin extends StObject {
    
    /** specifies a lower margin in 1/100th mm. */
    var Lower: Double = js.native
    
    /** specifies a upper margin in 1/100th mm. */
    var Upper: Double = js.native
  }
  object UpperLowerMargin {
    
    @scala.inline
    def apply(Lower: Double, Upper: Double): UpperLowerMargin = {
      val __obj = js.Dynamic.literal(Lower = Lower.asInstanceOf[js.Any], Upper = Upper.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpperLowerMargin]
    }
    
    @scala.inline
    implicit class UpperLowerMarginMutableBuilder[Self <: UpperLowerMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLower(value: Double): Self = StObject.set(x, "Lower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpper(value: Double): Self = StObject.set(x, "Upper", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies an upper and lower margin.
    * @since OOo 2.0
    */
  @js.native
  trait UpperLowerMarginScale extends StObject {
    
    /** specifies a lower margin in 1/100th mm. */
    var Lower: Double = js.native
    
    /** specifies a scale value for the lower margin. */
    var ScaleLower: Double = js.native
    
    /** specifies a scale value for the upper margin. */
    var ScaleUpper: Double = js.native
    
    /** specifies a upper margin in 1/100th mm. */
    var Upper: Double = js.native
  }
  object UpperLowerMarginScale {
    
    @scala.inline
    def apply(Lower: Double, ScaleLower: Double, ScaleUpper: Double, Upper: Double): UpperLowerMarginScale = {
      val __obj = js.Dynamic.literal(Lower = Lower.asInstanceOf[js.Any], ScaleLower = ScaleLower.asInstanceOf[js.Any], ScaleUpper = ScaleUpper.asInstanceOf[js.Any], Upper = Upper.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpperLowerMarginScale]
    }
    
    @scala.inline
    implicit class UpperLowerMarginScaleMutableBuilder[Self <: UpperLowerMarginScale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLower(value: Double): Self = StObject.set(x, "Lower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleLower(value: Double): Self = StObject.set(x, "ScaleLower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUpper(value: Double): Self = StObject.set(x, "ScaleUpper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpper(value: Double): Self = StObject.set(x, "Upper", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * describes a command that can be send to an OLE object
    *
    * For example, this can be used to select a font.
    * @since OOo 2.0
    */
  @js.native
  trait Verb extends StObject {
    
    /** specifies the Id of the command. */
    var VerbId: Double = js.native
    
    /** specifies if the command is available for a constant object. */
    var VerbIsConst: Boolean = js.native
    
    /** specifies if the command should be visible in a menu. */
    var VerbIsOnMenu: Boolean = js.native
    
    /** specifies the name of the command. The name is localized. */
    var VerbName: String = js.native
  }
  object Verb {
    
    @scala.inline
    def apply(VerbId: Double, VerbIsConst: Boolean, VerbIsOnMenu: Boolean, VerbName: String): Verb = {
      val __obj = js.Dynamic.literal(VerbId = VerbId.asInstanceOf[js.Any], VerbIsConst = VerbIsConst.asInstanceOf[js.Any], VerbIsOnMenu = VerbIsOnMenu.asInstanceOf[js.Any], VerbName = VerbName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verb]
    }
    
    @scala.inline
    implicit class VerbMutableBuilder[Self <: Verb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbId(value: Double): Self = StObject.set(x, "VerbId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbIsConst(value: Boolean): Self = StObject.set(x, "VerbIsConst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbIsOnMenu(value: Boolean): Self = StObject.set(x, "VerbIsOnMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbName(value: String): Self = StObject.set(x, "VerbName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * describes the visibility state of a property.
    * @since OOo 2.0
    */
  @js.native
  trait Visibility extends StObject {
    
    /** `TRUE` if the property is visible otherwise `FALSE` . */
    var bVisible: Boolean = js.native
  }
  object Visibility {
    
    @scala.inline
    def apply(bVisible: Boolean): Visibility = {
      val __obj = js.Dynamic.literal(bVisible = bVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Visibility]
    }
    
    @scala.inline
    implicit class VisibilityMutableBuilder[Self <: Visibility] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBVisible(value: Boolean): Self = StObject.set(x, "bVisible", value.asInstanceOf[js.Any])
    }
  }
}
