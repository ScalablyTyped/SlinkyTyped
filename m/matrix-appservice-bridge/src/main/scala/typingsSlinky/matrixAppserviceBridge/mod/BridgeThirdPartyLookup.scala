package typingsSlinky.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeThirdPartyLookup extends js.Object {
      // Function. Called for requests for 3PE query metadata.
  var getLocation: BridgeGetLocation = js.native
          // list of recognised protocol names. If present, lookups for unrecognised protocols will be automatically rejected.
  var getProtocol: BridgeGetProtocol = js.native
    // Function. Called for reverse parse requests on 3PL aliases.
  var getUser: BridgeGetUser = js.native
      // Function. Called for requests for 3PLs.
  var parseLocation: BridgeParseLocation = js.native
          // Function. Called for requests for 3PUs.
  var parseUser: BridgeParseUser = js.native
  var protocols: js.Array[String] = js.native
}

object BridgeThirdPartyLookup {
  @scala.inline
  def apply(
    getLocation: BridgeGetLocation,
    getProtocol: BridgeGetProtocol,
    getUser: BridgeGetUser,
    parseLocation: BridgeParseLocation,
    parseUser: BridgeParseUser,
    protocols: js.Array[String]
  ): BridgeThirdPartyLookup = {
    val __obj = js.Dynamic.literal(getLocation = getLocation.asInstanceOf[js.Any], getProtocol = getProtocol.asInstanceOf[js.Any], getUser = getUser.asInstanceOf[js.Any], parseLocation = parseLocation.asInstanceOf[js.Any], parseUser = parseUser.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeThirdPartyLookup]
  }
  @scala.inline
  implicit class BridgeThirdPartyLookupOps[Self <: BridgeThirdPartyLookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLocation(value: BridgeGetLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtocol(value: BridgeGetProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUser(value: BridgeGetUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseLocation(value: BridgeParseLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseUser(value: BridgeParseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

