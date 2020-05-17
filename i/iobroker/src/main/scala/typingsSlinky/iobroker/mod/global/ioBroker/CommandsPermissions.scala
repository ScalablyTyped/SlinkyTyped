package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandsPermissions extends js.Object {
  var authEnabled: Permission = js.native
  var chmodFile: ObjectOrStatePermission = js.native
  var disconnect: Permission = js.native
  // TODO: Are all properties required or is a partial object ok?
  var getObject: ObjectOrStatePermission = js.native
  var getObjectView: ObjectOrStatePermission = js.native
  var getObjects: ObjectOrStatePermission = js.native
  var getState: ObjectOrStatePermission = js.native
  var getStateHistory: ObjectOrStatePermission = js.native
  var getStates: ObjectOrStatePermission = js.native
  var getUserPermissions: ObjectOrStatePermission = js.native
  var getVersion: Permission = js.native
  var httpGet: OtherPermission = js.native
  var listPermissions: Permission = js.native
  var mkdir: ObjectOrStatePermission = js.native
  var readDir: ObjectOrStatePermission = js.native
  var readFile: ObjectOrStatePermission = js.native
  var readFile64: ObjectOrStatePermission = js.native
  var rename: ObjectOrStatePermission = js.native
  var sendTo: OtherPermission = js.native
  var sendToHost: OtherPermission = js.native
  var setObject: ObjectOrStatePermission = js.native
  var setState: ObjectOrStatePermission = js.native
  var subscribe: ObjectOrStatePermission = js.native
  var subscribeObjects: ObjectOrStatePermission = js.native
  var unlink: ObjectOrStatePermission = js.native
  var unsubscribe: ObjectOrStatePermission = js.native
  var unsubscribeObjects: ObjectOrStatePermission = js.native
  var writeFile: ObjectOrStatePermission = js.native
  var writeFile64: ObjectOrStatePermission = js.native
}

object CommandsPermissions {
  @scala.inline
  def apply(
    authEnabled: Permission,
    chmodFile: ObjectOrStatePermission,
    disconnect: Permission,
    getObject: ObjectOrStatePermission,
    getObjectView: ObjectOrStatePermission,
    getObjects: ObjectOrStatePermission,
    getState: ObjectOrStatePermission,
    getStateHistory: ObjectOrStatePermission,
    getStates: ObjectOrStatePermission,
    getUserPermissions: ObjectOrStatePermission,
    getVersion: Permission,
    httpGet: OtherPermission,
    listPermissions: Permission,
    mkdir: ObjectOrStatePermission,
    readDir: ObjectOrStatePermission,
    readFile: ObjectOrStatePermission,
    readFile64: ObjectOrStatePermission,
    rename: ObjectOrStatePermission,
    sendTo: OtherPermission,
    sendToHost: OtherPermission,
    setObject: ObjectOrStatePermission,
    setState: ObjectOrStatePermission,
    subscribe: ObjectOrStatePermission,
    subscribeObjects: ObjectOrStatePermission,
    unlink: ObjectOrStatePermission,
    unsubscribe: ObjectOrStatePermission,
    unsubscribeObjects: ObjectOrStatePermission,
    writeFile: ObjectOrStatePermission,
    writeFile64: ObjectOrStatePermission
  ): CommandsPermissions = {
    val __obj = js.Dynamic.literal(authEnabled = authEnabled.asInstanceOf[js.Any], chmodFile = chmodFile.asInstanceOf[js.Any], disconnect = disconnect.asInstanceOf[js.Any], getObject = getObject.asInstanceOf[js.Any], getObjectView = getObjectView.asInstanceOf[js.Any], getObjects = getObjects.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any], getStateHistory = getStateHistory.asInstanceOf[js.Any], getStates = getStates.asInstanceOf[js.Any], getUserPermissions = getUserPermissions.asInstanceOf[js.Any], getVersion = getVersion.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], listPermissions = listPermissions.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], readDir = readDir.asInstanceOf[js.Any], readFile = readFile.asInstanceOf[js.Any], readFile64 = readFile64.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], sendTo = sendTo.asInstanceOf[js.Any], sendToHost = sendToHost.asInstanceOf[js.Any], setObject = setObject.asInstanceOf[js.Any], setState = setState.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any], subscribeObjects = subscribeObjects.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any], unsubscribe = unsubscribe.asInstanceOf[js.Any], unsubscribeObjects = unsubscribeObjects.asInstanceOf[js.Any], writeFile = writeFile.asInstanceOf[js.Any], writeFile64 = writeFile64.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsPermissions]
  }
  @scala.inline
  implicit class CommandsPermissionsOps[Self <: CommandsPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthEnabled(value: Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChmodFile(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chmodFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnect(value: Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetObject(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetObjectView(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObjectView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetObjects(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetState(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStateHistory(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStateHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStates(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUserPermissions(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetVersion(value: Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpGet(value: OtherPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPermissions(value: Permission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMkdir(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadDir(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadFile(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadFile64(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendTo(value: OtherPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendToHost(value: OtherPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendToHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetObject(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetState(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribe(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribeObjects(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlink(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsubscribe(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsubscribeObjects(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribeObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteFile(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteFile64(value: ObjectOrStatePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFile64")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

