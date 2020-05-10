package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeySchemaElement extends js.Object {
  /**
    * The name of a key attribute.
    */
  var AttributeName: KeySchemaAttributeName = js.native
  /**
    * The attribute data, consisting of the data type and the attribute value itself.
    */
  var KeyType: typingsSlinky.awsSdk.dynamodbstreamsMod.KeyType = js.native
}

object KeySchemaElement {
  @scala.inline
  def apply(AttributeName: KeySchemaAttributeName, KeyType: KeyType): KeySchemaElement = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], KeyType = KeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySchemaElement]
  }
  @scala.inline
  implicit class KeySchemaElementOps[Self <: KeySchemaElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: KeySchemaAttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyType(value: KeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

