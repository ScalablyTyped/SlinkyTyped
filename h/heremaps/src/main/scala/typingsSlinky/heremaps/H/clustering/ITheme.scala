package typingsSlinky.heremaps.H.clustering

import typingsSlinky.heremaps.H.map.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface which specifies the methods a theme must implement.
  */
@js.native
trait ITheme extends js.Object {
  /**
    * Function returns a cluster presentation as a map object.
    * @param cluster {H.clustering.ICluster}
    * @returns {H.map.Object}
    */
  def getClusterPresentation(cluster: ICluster): Object = js.native
  /**
    * Function returns noise point presentation as a map object
    * @param noisePoint {H.clustering.INoisePoint}
    * @returns {H.map.Object}
    */
  def getNoisePresentation(noisePoint: INoisePoint): Object = js.native
}

object ITheme {
  @scala.inline
  def apply(getClusterPresentation: ICluster => Object, getNoisePresentation: INoisePoint => Object): ITheme = {
    val __obj = js.Dynamic.literal(getClusterPresentation = js.Any.fromFunction1(getClusterPresentation), getNoisePresentation = js.Any.fromFunction1(getNoisePresentation))
    __obj.asInstanceOf[ITheme]
  }
  @scala.inline
  implicit class IThemeOps[Self <: ITheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClusterPresentation(value: ICluster => Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClusterPresentation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNoisePresentation(value: INoisePoint => Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNoisePresentation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

