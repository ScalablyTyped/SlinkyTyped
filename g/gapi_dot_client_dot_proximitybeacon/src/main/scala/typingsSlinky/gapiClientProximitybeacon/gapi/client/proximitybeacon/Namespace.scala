package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespace extends js.Object {
  /**
    * Resource name of this namespace. Namespaces names have the format:
    * <code>namespaces/<var>namespace</var></code>.
    */
  var namespaceName: js.UndefOr[String] = js.native
  /**
    * Specifies what clients may receive attachments under this namespace
    * via `beaconinfo.getforobserved`.
    */
  var servingVisibility: js.UndefOr[String] = js.native
}

object Namespace {
  @scala.inline
  def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServingVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServingVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingVisibility")(js.undefined)
        ret
    }
  }
  
}

