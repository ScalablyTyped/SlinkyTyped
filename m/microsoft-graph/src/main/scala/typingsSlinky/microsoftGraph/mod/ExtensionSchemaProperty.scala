package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionSchemaProperty extends js.Object {
  // The name of the strongly-typed property defined as part of a schema extension.
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the property that is defined as part of a schema extension. Allowed values are Binary, Boolean, DateTime,
    * Integer or String. See the table below for more details.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ExtensionSchemaProperty {
  @scala.inline
  def apply(): ExtensionSchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionSchemaProperty]
  }
  @scala.inline
  implicit class ExtensionSchemaPropertyOps[Self <: ExtensionSchemaProperty] (val x: Self) extends AnyVal {
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
    def withType(value: String): Self = {
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

