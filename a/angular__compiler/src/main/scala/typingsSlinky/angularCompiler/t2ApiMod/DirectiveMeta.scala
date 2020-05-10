package typingsSlinky.angularCompiler.t2ApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveMeta extends js.Object {
  /**
    * Name under which the directive is exported, if any (exportAs in Angular).
    *
    * Null otherwise
    */
  var exportAs: js.Array[String] | Null = js.native
  /**
    * Set of inputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var inputs: StringDictionary[String | (js.Tuple2[String, String])] = js.native
  /**
    * Whether the directive is a component.
    */
  var isComponent: Boolean = js.native
  /**
    * Name of the directive class (used for debugging).
    */
  var name: String = js.native
  /**
    * Set of outputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var outputs: StringDictionary[String] = js.native
}

object DirectiveMeta {
  @scala.inline
  def apply(
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    isComponent: Boolean,
    name: String,
    outputs: StringDictionary[String]
  ): DirectiveMeta = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveMeta]
  }
  @scala.inline
  implicit class DirectiveMetaOps[Self <: DirectiveMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComponent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportAs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportAsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAs")(null)
        ret
    }
  }
  
}

