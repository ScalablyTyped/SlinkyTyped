package typingsSlinky.awsSdkTypes.protocolMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.blob
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.boolean
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.float
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.integer
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.list
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.map
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.string
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.structure
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkTypes.protocolMod.Blob
  - typingsSlinky.awsSdkTypes.protocolMod.Boolean
  - typingsSlinky.awsSdkTypes.protocolMod.Float
  - typingsSlinky.awsSdkTypes.protocolMod.Integer
  - typingsSlinky.awsSdkTypes.protocolMod.List
  - typingsSlinky.awsSdkTypes.protocolMod.Map
  - typingsSlinky.awsSdkTypes.protocolMod.String
  - typingsSlinky.awsSdkTypes.protocolMod.Structure
  - typingsSlinky.awsSdkTypes.protocolMod.Timestamp
*/
trait SerializationModel extends js.Object

object SerializationModel {
  @scala.inline
  def Timestamp(
    `type`: timestamp,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    timestampFormat: java.lang.String = null
  ): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Float(
    `type`: float,
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Boolean(`type`: boolean, sensitive: js.UndefOr[scala.Boolean] = js.undefined): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def String(
    `type`: string,
    idempotencyToken: js.UndefOr[scala.Boolean] = js.undefined,
    jsonValue: js.UndefOr[scala.Boolean] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotencyToken)) __obj.updateDynamic("idempotencyToken")(idempotencyToken.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonValue)) __obj.updateDynamic("jsonValue")(jsonValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def List(
    member: Member,
    `type`: list,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Blob(
    `type`: blob,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    streaming: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Integer(
    `type`: integer,
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Structure(
    members: StringDictionary[Member],
    required: js.Array[java.lang.String],
    `type`: structure,
    exceptionCode: java.lang.String = null,
    exceptionType: java.lang.String = null,
    payload: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exceptionCode != null) __obj.updateDynamic("exceptionCode")(exceptionCode.asInstanceOf[js.Any])
    if (exceptionType != null) __obj.updateDynamic("exceptionType")(exceptionType.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
  @scala.inline
  def Map(
    key: Member,
    `type`: map,
    value: Member,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializationModel = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializationModel]
  }
}

