package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedPropertyBundle extends js.Object {
  /** The list of managed properties. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.native
}

object ManagedPropertyBundle {
  @scala.inline
  def apply(): ManagedPropertyBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPropertyBundle]
  }
  @scala.inline
  implicit class ManagedPropertyBundleOps[Self <: ManagedPropertyBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagedProperty(value: js.Array[ManagedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedProperty")(js.undefined)
        ret
    }
  }
  
}

