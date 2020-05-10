package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used with connection.executeMany() to define a bind variable's types, sizes and directions.
  */
@js.native
trait BindDefinition extends js.Object {
  /**
    * The direction of the bind. One of the Execute Bind Direction Constants.
    *
    * @default BIND_IN
    */
  var dir: js.UndefOr[Double] = js.native
  /**
    * Required for Strings and Buffers. Ignored for other types. Specifies the maximum number of bytes
    * allocated when processing each value of this bind variable. When data is being passed into the database,
    * maxSize should be at least the size of the longest value. When data is being returned from the database,
    * maxSize should be the size of the longest value. If maxSize is too small, executeMany() will throw an
    * error that is not handled by batchErrors.
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * The node-oracledb or JavaScript data type to be bound. One of the Node-oracledb Type Constants.
    */
  var `type`: js.UndefOr[Double] = js.native
}

object BindDefinition {
  @scala.inline
  def apply(): BindDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindDefinition]
  }
  @scala.inline
  implicit class BindDefinitionOps[Self <: BindDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

