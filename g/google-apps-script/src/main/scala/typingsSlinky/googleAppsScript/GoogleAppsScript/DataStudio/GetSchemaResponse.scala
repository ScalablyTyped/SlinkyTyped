package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a getSchema() response for your script project.
  *
  *     function getSchema() {
  *       var cc = DataStudioApp.createCommunityConnector();
  *       var fields = cc.getFields();
  *       var types = cc.FieldType;
  *
  *       fields.newDimension()
  *           .setId('Created')
  *           .setName('Date Created')
  *           .setDescription('The date that this was created')
  *           .setType(types.YEAR_MONTH_DAY);
  *
  *       fields.newMetric()
  *           .setId('Amount')
  *           .setName('Amount (USD)')
  *           .setDescription('The cost in US dollars')
  *           .setType(types.CURRENCY_USD);
  *
  *       return cc.newGetSchemaResponse()
  *           .setFields(fields)
  *           .build();
  *     }
  */
@js.native
trait GetSchemaResponse extends js.Object {
  def build(): js.Any = js.native
  def printJson(): String = js.native
  def setFields(fields: Fields): GetSchemaResponse = js.native
}

object GetSchemaResponse {
  @scala.inline
  def apply(build: () => js.Any, printJson: () => String, setFields: Fields => GetSchemaResponse): GetSchemaResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setFields = js.Any.fromFunction1(setFields))
    __obj.asInstanceOf[GetSchemaResponse]
  }
  @scala.inline
  implicit class GetSchemaResponseOps[Self <: GetSchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintJson(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printJson")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFields(value: Fields => GetSchemaResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

