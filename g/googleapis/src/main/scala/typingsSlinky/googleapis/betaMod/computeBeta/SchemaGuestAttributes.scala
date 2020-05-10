package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A guest attributes entry.
  */
@js.native
trait SchemaGuestAttributes extends js.Object {
  /**
    * [Output Only] Type of the resource. Always compute#guestAttributes for
    * guest attributes entry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The path to be queried. This can be the default namespace (&#39;/&#39;)
    * or a nested namespace (&#39;//&#39;) or a specified key (&#39;//&#39;)
    */
  var queryPath: js.UndefOr[String] = js.native
  /**
    * [Output Only] The value of the requested queried path.
    */
  var queryValue: js.UndefOr[SchemaGuestAttributesValue] = js.native
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The key to search for.
    */
  var variableKey: js.UndefOr[String] = js.native
  /**
    * [Output Only] The value found for the requested key.
    */
  var variableValue: js.UndefOr[String] = js.native
}

object SchemaGuestAttributes {
  @scala.inline
  def apply(): SchemaGuestAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributes]
  }
  @scala.inline
  implicit class SchemaGuestAttributesOps[Self <: SchemaGuestAttributes] (val x: Self) extends AnyVal {
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
    def withQueryPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPath")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryValue(value: SchemaGuestAttributesValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableKey")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableValue")(js.undefined)
        ret
    }
  }
  
}

