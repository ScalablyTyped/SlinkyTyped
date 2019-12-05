package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDeleteMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreObjectIdentifierMod._ObjectIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Delete extends js.Object {
  /**
    * _ObjectIdentifierList shape
    */
  var Objects: js.Array[_ObjectIdentifier] | js.Iterable[_ObjectIdentifier]
  /**
    * <p>Element to enable quiet mode for the request. When you add this element, you must set its value to true.</p>
    */
  var Quiet: js.UndefOr[Boolean] = js.undefined
}

object _Delete {
  @scala.inline
  def apply(
    Objects: js.Array[_ObjectIdentifier] | js.Iterable[_ObjectIdentifier],
    Quiet: js.UndefOr[Boolean] = js.undefined
  ): _Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    if (!js.isUndefined(Quiet)) __obj.updateDynamic("Quiet")(Quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Delete]
  }
}

