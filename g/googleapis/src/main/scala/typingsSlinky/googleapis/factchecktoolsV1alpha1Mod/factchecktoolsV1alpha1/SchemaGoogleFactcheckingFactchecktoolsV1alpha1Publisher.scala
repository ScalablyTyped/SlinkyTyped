package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the publisher.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher extends js.Object {
  /**
    * The name of this publisher. For instance, &quot;Awesome Fact
    * Checks&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Host-level site name, without the protocol or &quot;www&quot; prefix. For
    * instance, &quot;awesomefactchecks.com&quot;. This value of this field is
    * based purely on the claim review URL.
    */
  var site: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1PublisherOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(js.undefined)
        ret
    }
  }
  
}

