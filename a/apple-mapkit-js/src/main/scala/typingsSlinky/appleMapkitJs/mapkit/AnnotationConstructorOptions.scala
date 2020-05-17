package typingsSlinky.appleMapkitJs.mapkit

import typingsSlinky.appleMapkitJs.anon.Height
import typingsSlinky.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that contains options for initializing annotation features.
  */
@js.native
trait AnnotationConstructorOptions extends js.Object {
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
  implicit class AnnotationConstructorOptionsOps[Self <: AnnotationConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilityLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorOffset(value: DOMPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animates")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearanceAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearanceAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearanceAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearanceAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withCallout(value: AnnotationCalloutDelegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutOffset(value: DOMPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withClusteringIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteringIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusteringIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteringIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

