package typingsSlinky.appleMapkitJs.mapkit

import org.scalajs.dom.raw.Element
import typingsSlinky.appleMapkitJs.anon.Height
import typingsSlinky.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Methods for customizing the behavior and appearance of an annotation callout.
  */
@js.native
trait AnnotationCalloutDelegate extends js.Object {
  /**
    * Returns a point determining the callout's anchor offset.
    */
  var calloutAnchorOffsetForAnnotation: js.UndefOr[js.Function2[/* annotation */ Annotation, /* size */ Height, DOMPoint]] = js.native
  /**
    * Returns a CSS animation used when the callout appears.
    */
  var calloutAppearanceAnimationForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, String]] = js.native
  /**
    * Returns custom content for the callout bubble.
    */
  var calloutContentForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.native
  /**
    * Returns an element representing a custom callout.
    */
  var calloutElementForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.native
  /**
    * Returns an element used as a custom accessory on the left side of the
    * callout content area.
    */
  var calloutLeftAccessoryForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.native
  /**
    * Returns an element used as a custom accessory on the right side of the
    * callout content area.
    */
  var calloutRightAccessoryForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.native
  /**
    * Determines whether the callout should animate.
    */
  var calloutShouldAnimateForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Boolean]] = js.native
  /**
    * Determines whether the callout should appear for an annotation.
    */
  var calloutShouldAppearForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Boolean]] = js.native
}

object AnnotationCalloutDelegate {
  @scala.inline
  def apply(): AnnotationCalloutDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationCalloutDelegate]
  }
  @scala.inline
  implicit class AnnotationCalloutDelegateOps[Self <: AnnotationCalloutDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutAnchorOffsetForAnnotation(value: (/* annotation */ Annotation, /* size */ Height) => DOMPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutAnchorOffsetForAnnotation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCalloutAnchorOffsetForAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutAnchorOffsetForAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutAppearanceAnimationForAnnotation(value: /* annotation */ Annotation => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutAppearanceAnimationForAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalloutAppearanceAnimationForAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutAppearanceAnimationForAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutContentForAnnotation(value: /* annotation */ Annotation => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutContentForAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalloutContentForAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutContentForAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutElementForAnnotation(value: /* annotation */ Annotation => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutElementForAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalloutElementForAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutElementForAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutLeftAccessoryForAnnotation(value: /* annotation */ Annotation => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutLeftAccessoryForAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalloutLeftAccessoryForAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutLeftAccessoryForAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutRightAccessoryForAnnotation(value: /* annotation */ Annotation => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutRightAccessoryForAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalloutRightAccessoryForAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutRightAccessoryForAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutShouldAnimateForAnnotation(value: /* annotation */ Annotation => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutShouldAnimateForAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalloutShouldAnimateForAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutShouldAnimateForAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutShouldAppearForAnnotation(value: /* annotation */ Annotation => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutShouldAppearForAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalloutShouldAppearForAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutShouldAppearForAnnotation")(js.undefined)
        ret
    }
  }
  
}

