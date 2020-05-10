package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOfSightViewModelProperties extends js.Object {
  /**
    * The observer's viewpoint from which lines of sight will be drawn towards the targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#observer)
    */
  var observer: js.UndefOr[PointProperties] = js.native
  /**
    * A collection of [LineOfSightTarget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html) containing the target location and the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#targets)
    */
  var targets: js.UndefOr[CollectionProperties[LineOfSightTargetProperties]] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
}

object LineOfSightViewModelProperties {
  @scala.inline
  def apply(): LineOfSightViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightViewModelProperties]
  }
  @scala.inline
  implicit class LineOfSightViewModelPropertiesOps[Self <: LineOfSightViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObserver(value: PointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: CollectionProperties[LineOfSightTargetProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

