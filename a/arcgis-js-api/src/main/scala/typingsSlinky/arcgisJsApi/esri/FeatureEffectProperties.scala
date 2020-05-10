package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureEffectProperties extends js.Object {
  /**
    * The graphical [css filter](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) operation applied to the features that do not meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements. Currently, [grayscale](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/grayscale), [sepia](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/sepia), [hue-rotate](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/hue-rotate), [invert](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/invert), [opacity](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/opacity), [brightness](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/brightness) and [contrast](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/contrast) css filter functions are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect)
    */
  var excludedEffect: js.UndefOr[String] = js.native
  /**
    * Indicates if labels for features that are [excluded](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) from the effect are visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedLabelsVisible)
    *
    * @default false
    */
  var excludedLabelsVisible: js.UndefOr[Boolean] = js.native
  /**
    * The filter that drives the effect. Features that meet the requirements specified in the filter will have the [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) applied while features that do not meet meet the filter requirements will have the [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.native
  /**
    * The graphical [css filter](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) operation applied to the features that meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements. Currently, [grayscale](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/grayscale), [sepia](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/sepia), [hue-rotate](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/hue-rotate), [invert](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/invert), [opacity](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/opacity), [brightness](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/brightness) and [contrast](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/contrast) css filter functions are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect)
    */
  var includedEffect: js.UndefOr[String] = js.native
}

object FeatureEffectProperties {
  @scala.inline
  def apply(): FeatureEffectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureEffectProperties]
  }
  @scala.inline
  implicit class FeatureEffectPropertiesOps[Self <: FeatureEffectProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedLabelsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedLabelsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedLabelsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedLabelsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: FeatureFilterProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedEffect")(js.undefined)
        ret
    }
  }
  
}

