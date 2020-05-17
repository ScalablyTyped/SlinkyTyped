package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedProperty[T] extends js.Object {
  var CanBeChanged: Boolean = js.native
  var ManagedPropertyLogicalName: String = js.native
  var Value: T = js.native
}

object ManagedProperty {
  @scala.inline
  def apply[T](CanBeChanged: Boolean, ManagedPropertyLogicalName: String, Value: T): ManagedProperty[T] = {
    val __obj = js.Dynamic.literal(CanBeChanged = CanBeChanged.asInstanceOf[js.Any], ManagedPropertyLogicalName = ManagedPropertyLogicalName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedProperty[T]]
  }
  @scala.inline
  implicit class ManagedPropertyOps[Self[t] <: ManagedProperty[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCanBeChanged(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanBeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagedPropertyLogicalName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedPropertyLogicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

