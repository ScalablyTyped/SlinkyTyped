package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents function call argument. Either remote object id <code>objectId</code>, primitive <code>value</code>, unserializable primitive value or neither of (for undefined) them should be specified.
  */
@js.native
trait CallArgument extends js.Object {
  /**
    * Remote object handle.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  /**
    * Primitive value which can not be JSON-stringified.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.native
  /**
    * Primitive value or serializable javascript object.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object CallArgument {
  @scala.inline
  def apply(): CallArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallArgument]
  }
  @scala.inline
  implicit class CallArgumentOps[Self <: CallArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectId(value: RemoteObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withUnserializableValue(value: UnserializableValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unserializableValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnserializableValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unserializableValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

