package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** parameters that may be passed to {@link XChartTypeTemplate.createDiagramByDataSource()} . */
@js.native
trait StandardDiagramCreationParameters extends StObject {
  
  /** States whether the first XLabeledDataSequence in a data-source is used as categories. */
  var HasCategories: Boolean = js.native
  
  /** If categories are given they should be used as x values also if a chart type requires x values. Default is true. */
  var UseCategoriesAsX: Boolean = js.native
}
object StandardDiagramCreationParameters {
  
  @scala.inline
  def apply(HasCategories: Boolean, UseCategoriesAsX: Boolean): StandardDiagramCreationParameters = {
    val __obj = js.Dynamic.literal(HasCategories = HasCategories.asInstanceOf[js.Any], UseCategoriesAsX = UseCategoriesAsX.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardDiagramCreationParameters]
  }
  
  @scala.inline
  implicit class StandardDiagramCreationParametersMutableBuilder[Self <: StandardDiagramCreationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasCategories(value: Boolean): Self = StObject.set(x, "HasCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCategoriesAsX(value: Boolean): Self = StObject.set(x, "UseCategoriesAsX", value.asInstanceOf[js.Any])
  }
}
