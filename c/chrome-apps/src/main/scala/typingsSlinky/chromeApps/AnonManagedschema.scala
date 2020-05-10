package typingsSlinky.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManagedschema extends js.Object {
  /**
    * The storage.managed_schema property indicates a file within the app that contains the policy schema.
    * @see ManagedSchema for schema content typings
    * @see[Docs and Schema Format]{@link https://developer.chrome.com/apps/manifest/storage}
    */
  var managed_schema: String = js.native
}

object AnonManagedschema {
  @scala.inline
  def apply(managed_schema: String): AnonManagedschema = {
    val __obj = js.Dynamic.literal(managed_schema = managed_schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManagedschema]
  }
  @scala.inline
  implicit class AnonManagedschemaOps[Self <: AnonManagedschema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManaged_schema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managed_schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

