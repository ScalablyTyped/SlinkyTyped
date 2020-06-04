package typingsSlinky.angularCompiler.viewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.apiMod.R3HostMetadata
import typingsSlinky.angularCompiler.apiMod.R3QueryMetadata
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseRefMetaData extends js.Object {
  var host: js.UndefOr[R3HostMetadata] = js.undefined
  var inputs: js.UndefOr[StringDictionary[String | (js.Tuple2[String, String])]] = js.undefined
  var name: String
  var outputs: js.UndefOr[StringDictionary[String]] = js.undefined
  var queries: js.UndefOr[js.Array[R3QueryMetadata]] = js.undefined
  var `type`: Expression
  var typeSourceSpan: ParseSourceSpan
  var viewQueries: js.UndefOr[js.Array[R3QueryMetadata]] = js.undefined
}

object R3BaseRefMetaData {
  @scala.inline
  def apply(name: String, `type`: Expression, typeSourceSpan: ParseSourceSpan): R3BaseRefMetaData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3BaseRefMetaData]
  }
  @scala.inline
  implicit class R3BaseRefMetaDataOps[Self <: R3BaseRefMetaData] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Expression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeSourceSpan(value: ParseSourceSpan): Self = this.set("typeSourceSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: R3HostMetadata): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setOutputs(value: StringDictionary[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setQueries(value: js.Array[R3QueryMetadata]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setViewQueries(value: js.Array[R3QueryMetadata]): Self = this.set("viewQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewQueries: Self = this.set("viewQueries", js.undefined)
  }
  
}

