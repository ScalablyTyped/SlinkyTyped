package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimension extends js.Object {
  
  /**
    * Returns the caption of the dimension used when displaying the name of the dimension to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String = js.native
  
  /**
    * Returns a user-friendly description of the dimension.
    *
    * @param value
    */
  def description(value: js.Object): String = js.native
  
  /**
    * Returns the type of the dimension which is a value from the $.ig.DimensionType enumeration.
    *
    *             $.ig.DimensionType.prototype.unknown = 0;
    *             $.ig.DimensionType.prototype.time = 1;
    *             $.ig.DimensionType.prototype.measure = 2;
    *             $.ig.DimensionType.prototype.other = 3;
    *             $.ig.DimensionType.prototype.quantitative = 5;
    *             $.ig.DimensionType.prototype.accounts = 6;
    *             $.ig.DimensionType.prototype.customers = 7;
    *             $.ig.DimensionType.prototype.products = 8;
    *             $.ig.DimensionType.prototype.scenario = 9;
    *             $.ig.DimensionType.prototype.utility = 10;
    *             $.ig.DimensionType.prototype.currency = 11;
    *             $.ig.DimensionType.prototype.rates = 12;
    *             $.ig.DimensionType.prototype.channel = 13;
    *             $.ig.DimensionType.prototype.promotion = 14;
    *             $.ig.DimensionType.prototype.organization = 15;
    *             $.ig.DimensionType.prototype.billOfMaterials = 16;
    *             $.ig.DimensionType.prototype.geography = 17;
    *
    * @param value
    */
  def dimensionType(value: js.Object): Double = js.native
  
  /**
    * Returns the name of the dimension.
    *
    * @param value
    */
  def name(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the dimension.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String = js.native
}
object Dimension {
  
  @scala.inline
  def apply(
    caption: js.Object => String,
    description: js.Object => String,
    dimensionType: js.Object => Double,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Dimension = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), description = js.Any.fromFunction1(description), dimensionType = js.Any.fromFunction1(dimensionType), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit class DimensionOps[Self <: Dimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaption(value: js.Object => String): Self = this.set("caption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: js.Object => String): Self = this.set("description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDimensionType(value: js.Object => Double): Self = this.set("dimensionType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: js.Object => String): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUniqueName(value: js.Object => String): Self = this.set("uniqueName", js.Any.fromFunction1(value))
  }
}
