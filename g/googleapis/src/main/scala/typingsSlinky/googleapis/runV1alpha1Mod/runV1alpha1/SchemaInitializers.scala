package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializers tracks the progress of initialization.
  */
@js.native
trait SchemaInitializers extends js.Object {
  /**
    * Pending is a list of initializers that must execute in order before this
    * object is visible. When the last pending initializer is removed, and no
    * failing result is set, the initializers struct will be set to nil and the
    * object is considered as initialized and visible to all clients.
    * +patchMergeKey=name +patchStrategy=merge
    */
  var pending: js.UndefOr[js.Array[SchemaInitializer]] = js.native
}

object SchemaInitializers {
  @scala.inline
  def apply(): SchemaInitializers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitializers]
  }
  @scala.inline
  implicit class SchemaInitializersOps[Self <: SchemaInitializers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPending(value: js.Array[SchemaInitializer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.undefined)
        ret
    }
  }
  
}

