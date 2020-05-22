package typingsSlinky.grpcGrpcJs.uriParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrpcUri extends js.Object {
  var authority: js.UndefOr[String] = js.undefined
  var path: String
  var scheme: js.UndefOr[String] = js.undefined
}

object GrpcUri {
  @scala.inline
  def apply(path: String, authority: String = null, scheme: String = null): GrpcUri = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcUri]
  }
}

