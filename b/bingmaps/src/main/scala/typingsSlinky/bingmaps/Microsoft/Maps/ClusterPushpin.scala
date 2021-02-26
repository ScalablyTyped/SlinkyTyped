package typingsSlinky.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterPushpin extends Pushpin {
  
  /** An array of all the pushpins that are in the cluster. */
  var containedPushpins: js.Array[Pushpin] = js.native
  
  /**
    * The grid cell key that can be used retrieve the clustered pushpin(s) from the clustering layer. This is useful when creating a clickable list that
    * link items in the list to clusters or pushpins on the map. Your list just needs to store the gridKey value.
    */
  var gridKey: Double = js.native
}
object ClusterPushpin {
  
  @scala.inline
  def apply(
    containedPushpins: js.Array[Pushpin],
    getAnchor: () => Point,
    getClickedStyleEnabled: () => Boolean,
    getColor: () => String | Color,
    getCursor: () => String,
    getDraggable: () => Boolean,
    getHoverStyleEnabled: () => Boolean,
    getIcon: () => String,
    getLocation: () => Location,
    getRoundClickableArea: () => Boolean,
    getSubTitle: () => String,
    getText: () => String,
    getTextOffset: () => Point,
    getTitle: () => String,
    getVisible: () => Boolean,
    gridKey: Double,
    setLocation: Location => Unit,
    setOptions: IPushpinOptions => Unit
  ): ClusterPushpin = {
    val __obj = js.Dynamic.literal(containedPushpins = containedPushpins.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getClickedStyleEnabled = js.Any.fromFunction0(getClickedStyleEnabled), getColor = js.Any.fromFunction0(getColor), getCursor = js.Any.fromFunction0(getCursor), getDraggable = js.Any.fromFunction0(getDraggable), getHoverStyleEnabled = js.Any.fromFunction0(getHoverStyleEnabled), getIcon = js.Any.fromFunction0(getIcon), getLocation = js.Any.fromFunction0(getLocation), getRoundClickableArea = js.Any.fromFunction0(getRoundClickableArea), getSubTitle = js.Any.fromFunction0(getSubTitle), getText = js.Any.fromFunction0(getText), getTextOffset = js.Any.fromFunction0(getTextOffset), getTitle = js.Any.fromFunction0(getTitle), getVisible = js.Any.fromFunction0(getVisible), gridKey = gridKey.asInstanceOf[js.Any], setLocation = js.Any.fromFunction1(setLocation), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[ClusterPushpin]
  }
  
  @scala.inline
  implicit class ClusterPushpinMutableBuilder[Self <: ClusterPushpin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainedPushpins(value: js.Array[Pushpin]): Self = StObject.set(x, "containedPushpins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainedPushpinsVarargs(value: Pushpin*): Self = StObject.set(x, "containedPushpins", js.Array(value :_*))
    
    @scala.inline
    def setGridKey(value: Double): Self = StObject.set(x, "gridKey", value.asInstanceOf[js.Any])
  }
}
