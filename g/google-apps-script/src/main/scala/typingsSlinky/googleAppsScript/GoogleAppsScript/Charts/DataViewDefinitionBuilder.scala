package typingsSlinky.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for DataViewDefinition objects.
  *
  * Here's an example of using the builder. The data is imported
  * from a Google spreadsheet.
  *
  *     function doGet() {
  *       // This example creates two table charts side by side. One uses a data view definition to
  *       // restrict the number of displayed columns.
  *
  *       // Get sample data from a spreadsheet.
  *       var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AF' +
  *           '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
  *
  *       // Create a chart to display all of the data.
  *       var originalChart = Charts.newTableChart()
  *           .setDimensions(600, 500)
  *           .setDataSourceUrl(dataSourceUrl)
  *           .build();
  *
  *       // Create another chart to display a subset of the data (only columns 1 and 4).
  *       var dataViewDefinition = Charts.newDataViewDefinition().setColumns([0, 3]);
  *       var limitedChart = Charts.newTableChart()
  *           .setDimensions(200, 500)
  *           .setDataSourceUrl(dataSourceUrl)
  *           .setDataViewDefinition(dataViewDefinition)
  *           .build();
  *
  *       var htmlOutput = HtmlService.createHtmlOutput();
  *       var originalChartData = Utilities.base64Encode(originalChart.getAs('image/png').getBytes());
  *       var originalChartUrl = "data:image/png;base64," + encodeURI(originalChartData);
  *       var limitedChartData = Utilities.base64Encode(limitedChart.getAs('image/png').getBytes());
  *       var limitedChartUrl = "data:image/png;base64," + encodeURI(limitedChartData);
  *       htmlOutput.append("<table><tr><td>");
  *       htmlOutput.append("<img border=\"1\" src=\"" + originalChartUrl + "\">");
  *       htmlOutput.append("</td><td>");
  *       htmlOutput.append("<img border=\"1\" src=\"" + limitedChartUrl + "\">");
  *       htmlOutput.append("</td></tr></table>");
  *       return htmlOutput;
  *     }
  */
@js.native
trait DataViewDefinitionBuilder extends js.Object {
  
  def build(): DataViewDefinition = js.native
  
  def setColumns(columns: js.Array[_]): DataViewDefinitionBuilder = js.native
}
object DataViewDefinitionBuilder {
  
  @scala.inline
  def apply(build: () => DataViewDefinition, setColumns: js.Array[_] => DataViewDefinitionBuilder): DataViewDefinitionBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setColumns = js.Any.fromFunction1(setColumns))
    __obj.asInstanceOf[DataViewDefinitionBuilder]
  }
  
  @scala.inline
  implicit class DataViewDefinitionBuilderOps[Self <: DataViewDefinitionBuilder] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => DataViewDefinition): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColumns(value: js.Array[_] => DataViewDefinitionBuilder): Self = this.set("setColumns", js.Any.fromFunction1(value))
  }
}
