package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoadmapItem extends StObject {
  
  /** determines whether a control is enabled or disabled. */
  var Enabled: Boolean = js.native
  
  /**
    * The ID uniquely identifies the roadmap item. When the {@link RoadmapItem} is inserted into the Roadmap via "insertByIndex" the default value of the ID
    * is the first available absolute digit that has not yet been assigned to other existing RoadmapItems.
    */
  var ID: Double = js.native
  
  /**
    * When "Interactive" is true the {@link RoadmapItem} supports a certain "HyperLabel; functionality": Moving the mouse pointer over the {@link
    * RoadmapItem} will change it to a Refhand and underline the Label for the time the mouse pointer resides over the {@link RoadmapItem} . Clicking with
    * mouse pointer will then notify the Roadmap Container. The property Interactive" is readonly because it is adapted from the container of the {@link
    * RoadmapItem} .
    */
  var Interactive: Boolean = js.native
  
  /** The Label of the {@link RoadmapItem} does not include its Prefix that is automatically set after the following algorithm: (Index + 1) + ". " + Label */
  var Label: String = js.native
}
object RoadmapItem {
  
  @scala.inline
  def apply(Enabled: Boolean, ID: Double, Interactive: Boolean, Label: String): RoadmapItem = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Interactive = Interactive.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadmapItem]
  }
  
  @scala.inline
  implicit class RoadmapItemMutableBuilder[Self <: RoadmapItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "Interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
  }
}
