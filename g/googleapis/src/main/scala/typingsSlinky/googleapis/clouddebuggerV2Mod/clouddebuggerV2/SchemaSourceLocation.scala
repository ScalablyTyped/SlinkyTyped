package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a location in the source code.
  */
@js.native
trait SchemaSourceLocation extends js.Object {
  /**
    * Column within a line. The first column in a line as the value `1`. Agents
    * that do not support setting breakpoints on specific columns ignore this
    * field.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * Line inside the file. The first line in the file has the value `1`.
    */
  var line: js.UndefOr[Double] = js.native
  /**
    * Path to the source file within the source context of the target binary.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaSourceLocation {
  @scala.inline
  def apply(): SchemaSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceLocation]
  }
  @scala.inline
  implicit class SchemaSourceLocationOps[Self <: SchemaSourceLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

