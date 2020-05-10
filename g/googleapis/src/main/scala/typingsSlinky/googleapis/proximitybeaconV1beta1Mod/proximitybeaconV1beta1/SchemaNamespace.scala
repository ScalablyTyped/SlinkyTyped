package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attachment namespace defines read and write access for all the
  * attachments created under it. Each namespace is globally unique, and owned
  * by one project which is the only project that can create attachments under
  * it.
  */
@js.native
trait SchemaNamespace extends js.Object {
  /**
    * Resource name of this namespace. Namespaces names have the format:
    * &lt;code&gt;namespaces/&lt;var&gt;namespace&lt;/var&gt;&lt;/code&gt;.
    */
  var namespaceName: js.UndefOr[String] = js.native
  /**
    * Specifies what clients may receive attachments under this namespace via
    * `beaconinfo.getforobserved`.
    */
  var servingVisibility: js.UndefOr[String] = js.native
}

object SchemaNamespace {
  @scala.inline
  def apply(): SchemaNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespace]
  }
  @scala.inline
  implicit class SchemaNamespaceOps[Self <: SchemaNamespace] (val x: Self) extends AnyVal {
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

