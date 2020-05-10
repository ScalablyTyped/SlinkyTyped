package typingsSlinky.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var checkLineBreaks: Boolean = js.native
  var filename: String | Null = js.native
  var implicitTypes: js.Array[Type] = js.native
  var input: String = js.native
  var json: Boolean = js.native
  var kind: String = js.native
  var length: Double = js.native
  var line: Double = js.native
  var lineIndent: Double = js.native
  var lineStart: Double = js.native
  var position: Double = js.native
  var result: js.Any = js.native
  var schema: SchemaDefinition = js.native
  var version: Null | Double = js.native
  def onWarning(e: YAMLException): Unit = js.native
}

object State {
  @scala.inline
  def apply(
    checkLineBreaks: Boolean,
    implicitTypes: js.Array[Type],
    input: String,
    json: Boolean,
    kind: String,
    length: Double,
    line: Double,
    lineIndent: Double,
    lineStart: Double,
    onWarning: YAMLException => Unit,
    position: Double,
    result: js.Any,
    schema: SchemaDefinition
  ): State = {
    val __obj = js.Dynamic.literal(checkLineBreaks = checkLineBreaks.asInstanceOf[js.Any], implicitTypes = implicitTypes.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineIndent = lineIndent.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], onWarning = js.Any.fromFunction1(onWarning), position = position.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckLineBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkLineBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplicitTypes(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnWarning(value: YAMLException => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWarning")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: SchemaDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilenameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(null)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(null)
        ret
    }
  }
  
}

