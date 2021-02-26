package typingsSlinky.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagesSettingsMod {
  
  @JSImport("amcharts/ImagesSettings", JSImport.Default)
  @js.native
  class default () extends ImagesSettings
  
  @js.native
  trait ImagesSettings extends StObject {
    
    /**
      * Opacity of the image.
      * @default 1
      */
    var alpha: Double = js.native
    
    /**
      * Text which is displayed in a roll-over balloon. You can use the following tags:
      * [[title]], [[description]], [[value]] and [[percent]]. [[title]]
      */
    var balloonText: String = js.native
    
    /**
      * Specifies if the image's center should be placed in the provided coordinates.
      * If false, top-left corner will be at provided coordinates.
      * @default true
      */
    var centered: Boolean = js.native
    
    /**
      * Color of image.
      * This will affect only predefined images (with "type" property set) and images with svgPath set.
      * This property won't affect bitmap images and loaded SVG images.
      * @default "#000000"
      */
    var color: String = js.native
    
    /**
      * Height of a description window.
      */
    var descriptionWindowHeight: Double = js.native
    
    /**
      * Width of a description window.
      * @default 250
      */
    var descriptionWindowWidth: Double = js.native
    
    /**
      * X position of a description window.
      */
    var descriptionWindowX: Double = js.native
    
    /**
      * Y position of a description window.
      */
    var descriptionWindowY: Double = js.native
    
    /**
      * Label color. #000000
      */
    var labelColor: String = js.native
    
    /**
      * Position of the label. Allowed values are: left, right, top, bottom and middle. right
      */
    var labelPosition: String = js.native
    
    /**
      * Label roll-over color. #00CC00
      */
    var labelRollOverColor: String = js.native
    
    /**
      * Font size of a label.
      * @default 11
      */
    var labelfontSize: String = js.native
    
    /**
      * Opacity of image outline.
      * This will affect only predefined images (with "type" property set) and images with svgPath set.
      * This property won't affect bitmap images and loaded SVG images.
      */
    var outlineAlpha: Double = js.native
    
    /**
      * Color of image outline.
      * This will affect only predefined images (with "type" property set) and images with svgPath set.
      * This property won't affect bitmap images and loaded SVG images.
      */
    var outlineColor: String = js.native
    
    /**
      * Thickness of image outline.
      * This will affect only predefined images (with "type" property set) and images with svgPath set.
      * This property won't affect bitmap images and loaded SVG images.
      * @default 1
      */
    var outlineThickness: Double = js.native
    
    /**
      * Color of image when hovered.
      * This will affect only predefined images (with "type" property set) and images with svgPath set.
      * This property won't affect bitmap images and loaded SVG images.
      */
    var rollOverColor: String = js.native
    
    /**
      * Scale of the image when hovered. Use value like 1.5 - 2 to enlarge image when user rolls-over it.
      * @default 1
      */
    var rollOverScale: Double = js.native
    
    /**
      * Scale of the image if it is selected. Use value like 1.5 - 2 to enlarge selected image.
      * @default 1
      */
    var selectedScale: Double = js.native
  }
  object ImagesSettings {
    
    @scala.inline
    def apply(
      alpha: Double,
      balloonText: String,
      centered: Boolean,
      color: String,
      descriptionWindowHeight: Double,
      descriptionWindowWidth: Double,
      descriptionWindowX: Double,
      descriptionWindowY: Double,
      labelColor: String,
      labelPosition: String,
      labelRollOverColor: String,
      labelfontSize: String,
      outlineAlpha: Double,
      outlineColor: String,
      outlineThickness: Double,
      rollOverColor: String,
      rollOverScale: Double,
      selectedScale: Double
    ): ImagesSettings = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], centered = centered.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], descriptionWindowHeight = descriptionWindowHeight.asInstanceOf[js.Any], descriptionWindowWidth = descriptionWindowWidth.asInstanceOf[js.Any], descriptionWindowX = descriptionWindowX.asInstanceOf[js.Any], descriptionWindowY = descriptionWindowY.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelRollOverColor = labelRollOverColor.asInstanceOf[js.Any], labelfontSize = labelfontSize.asInstanceOf[js.Any], outlineAlpha = outlineAlpha.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], outlineThickness = outlineThickness.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], rollOverScale = rollOverScale.asInstanceOf[js.Any], selectedScale = selectedScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImagesSettings]
    }
    
    @scala.inline
    implicit class ImagesSettingsMutableBuilder[Self <: ImagesSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalloonText(value: String): Self = StObject.set(x, "balloonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionWindowHeight(value: Double): Self = StObject.set(x, "descriptionWindowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionWindowWidth(value: Double): Self = StObject.set(x, "descriptionWindowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionWindowX(value: Double): Self = StObject.set(x, "descriptionWindowX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionWindowY(value: Double): Self = StObject.set(x, "descriptionWindowY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPosition(value: String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelRollOverColor(value: String): Self = StObject.set(x, "labelRollOverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelfontSize(value: String): Self = StObject.set(x, "labelfontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineAlpha(value: Double): Self = StObject.set(x, "outlineAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineThickness(value: Double): Self = StObject.set(x, "outlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollOverColor(value: String): Self = StObject.set(x, "rollOverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollOverScale(value: Double): Self = StObject.set(x, "rollOverScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedScale(value: Double): Self = StObject.set(x, "selectedScale", value.asInstanceOf[js.Any])
    }
  }
}
