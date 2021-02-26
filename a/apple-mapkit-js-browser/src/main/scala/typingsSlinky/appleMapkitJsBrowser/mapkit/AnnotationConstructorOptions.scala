package typingsSlinky.appleMapkitJsBrowser.mapkit

import typingsSlinky.appleMapkitJsBrowser.anon.Height
import typingsSlinky.std.DOMPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains options for initializing annotation features.
  */
@js.native
trait AnnotationConstructorOptions extends StObject {
  
  /**
    * Accessibility text for the annotation.
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  /**
    * The offset in CSS pixels of the element from the bottom center.
    */
  var anchorOffset: js.UndefOr[DOMPoint] = js.native
  
  /**
    * A Boolean value that determines if the annotation should be animated.
    */
  var animates: js.UndefOr[Boolean] = js.native
  
  /**
    * A CSS animation that runs when the annotation appears on the map.
    */
  var appearanceAnimation: js.UndefOr[String] = js.native
  
  /**
    * A delegate that enables you to customize the annotation's callout.
    */
  var callout: js.UndefOr[AnnotationCalloutDelegate] = js.native
  
  /**
    * A Boolean value that determines whether a callout should be shown.
    */
  var calloutEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The offset in CSS pixels of a callout from the top center of the element.
    */
  var calloutOffset: js.UndefOr[DOMPoint] = js.native
  
  /**
    * An identifer used for grouping annotations into the same cluster.
    */
  var clusteringIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A mode that determines the shape of the collision frame.
    */
  var collisionMode: js.UndefOr[String] = js.native
  
  /**
    * Data you define that is assigned to the annotation.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * A hint the map uses to prioritize displaying the annotation.
    */
  var displayPriority: js.UndefOr[Double] = js.native
  
  /**
    * A Boolean value that determines whether the user can drag the annotation.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that determines whether the annotation responds to user
    * interaction.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Spacing added around the annotation when showing items.
    */
  var padding: js.UndefOr[Padding] = js.native
  
  /**
    * A Boolean value that determines whether the annotation is selected.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * The desired dimensions of the annotation, in CSS pixels.
    */
  var size: js.UndefOr[Height] = js.native
  
  /**
    * The text to display as a subtitle on the second line of an annotation's
    * callout.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * The text to display in the annotation's callout.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that determines if the annotation is visible or hidden.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object AnnotationConstructorOptions {
  
  @scala.inline
  def apply(): AnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationConstructorOptions]
  }
  
  @scala.inline
  implicit class AnnotationConstructorOptionsMutableBuilder[Self <: AnnotationConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAnchorOffset(value: DOMPoint): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorOffsetUndefined: Self = StObject.set(x, "anchorOffset", js.undefined)
    
    @scala.inline
    def setAnimates(value: Boolean): Self = StObject.set(x, "animates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatesUndefined: Self = StObject.set(x, "animates", js.undefined)
    
    @scala.inline
    def setAppearanceAnimation(value: String): Self = StObject.set(x, "appearanceAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceAnimationUndefined: Self = StObject.set(x, "appearanceAnimation", js.undefined)
    
    @scala.inline
    def setCallout(value: AnnotationCalloutDelegate): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutEnabled(value: Boolean): Self = StObject.set(x, "calloutEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutEnabledUndefined: Self = StObject.set(x, "calloutEnabled", js.undefined)
    
    @scala.inline
    def setCalloutOffset(value: DOMPoint): Self = StObject.set(x, "calloutOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutOffsetUndefined: Self = StObject.set(x, "calloutOffset", js.undefined)
    
    @scala.inline
    def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    @scala.inline
    def setClusteringIdentifier(value: String): Self = StObject.set(x, "clusteringIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringIdentifierUndefined: Self = StObject.set(x, "clusteringIdentifier", js.undefined)
    
    @scala.inline
    def setCollisionMode(value: String): Self = StObject.set(x, "collisionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionModeUndefined: Self = StObject.set(x, "collisionMode", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDisplayPriority(value: Double): Self = StObject.set(x, "displayPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPriorityUndefined: Self = StObject.set(x, "displayPriority", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
