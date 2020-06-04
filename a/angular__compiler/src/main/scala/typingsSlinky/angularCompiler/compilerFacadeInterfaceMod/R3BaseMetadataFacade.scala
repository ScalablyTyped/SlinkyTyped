package typingsSlinky.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3BaseMetadataFacade extends js.Object {
  var inputs: js.UndefOr[StringDictionary[String | (js.Tuple2[String, String])]] = js.undefined
  var name: String
  var outputs: js.UndefOr[StringDictionary[String]] = js.undefined
  var propMetadata: StringDictionary[js.Array[_]]
  var queries: js.UndefOr[js.Array[R3QueryMetadataFacade]] = js.undefined
  var `type`: js.Any
  var viewQueries: js.UndefOr[js.Array[R3QueryMetadataFacade]] = js.undefined
}

object R3BaseMetadataFacade {
  @scala.inline
  def apply(name: String, propMetadata: StringDictionary[js.Array[_]], `type`: js.Any): R3BaseMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3BaseMetadataFacade]
  }
  @scala.inline
  implicit class R3BaseMetadataFacadeOps[Self <: R3BaseMetadataFacade] (val x: Self) extends AnyVal {
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
    def setPropMetadata(value: StringDictionary[js.Array[_]]): Self = this.set("propMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setOutputs(value: StringDictionary[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setQueries(value: js.Array[R3QueryMetadataFacade]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setViewQueries(value: js.Array[R3QueryMetadataFacade]): Self = this.set("viewQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewQueries: Self = this.set("viewQueries", js.undefined)
  }
  
}

