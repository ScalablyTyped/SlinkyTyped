package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRestrictionsSchema extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#appRestrictionsSchema". */
  var kind: js.UndefOr[String] = js.native
  /** The set of restrictions that make up this schema. */
  var restrictions: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.native
}

object AppRestrictionsSchema {
  @scala.inline
  def apply(): AppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchema]
  }
  @scala.inline
  implicit class AppRestrictionsSchemaOps[Self <: AppRestrictionsSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictions(value: js.Array[AppRestrictionsSchemaRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(js.undefined)
        ret
    }
  }
  
}

