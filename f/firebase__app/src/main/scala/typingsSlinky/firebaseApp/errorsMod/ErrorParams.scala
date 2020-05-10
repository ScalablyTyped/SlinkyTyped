package typingsSlinky.firebaseApp.errorsMod

import typingsSlinky.firebaseApp.AnonAppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in @firebase/app.@firebase/app/dist/packages/app/src/errors.AppError ]: {  appName  :string}} */
@js.native
trait ErrorParams extends js.Object {
  var `app-deleted`: AnonAppName = js.native
  var `bad-app-name`: AnonAppName = js.native
  var `duplicate-app`: AnonAppName = js.native
  var `invalid-app-argument`: AnonAppName = js.native
  var `invalid-log-argument`: AnonAppName = js.native
  var `no-app`: AnonAppName = js.native
}

object ErrorParams {
  @scala.inline
  def apply(
    `app-deleted`: AnonAppName,
    `bad-app-name`: AnonAppName,
    `duplicate-app`: AnonAppName,
    `invalid-app-argument`: AnonAppName,
    `invalid-log-argument`: AnonAppName,
    `no-app`: AnonAppName
  ): ErrorParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app-deleted")(`app-deleted`.asInstanceOf[js.Any])
    __obj.updateDynamic("bad-app-name")(`bad-app-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("duplicate-app")(`duplicate-app`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-app-argument")(`invalid-app-argument`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-log-argument")(`invalid-log-argument`.asInstanceOf[js.Any])
    __obj.updateDynamic("no-app")(`no-app`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorParams]
  }
  @scala.inline
  implicit class ErrorParamsOps[Self <: ErrorParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withApp-deleted`(value: AnonAppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app-deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBad-app-name`(value: AnonAppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bad-app-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDuplicate-app`(value: AnonAppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate-app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInvalid-app-argument`(value: AnonAppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid-app-argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInvalid-log-argument`(value: AnonAppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid-log-argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withNo-app`(value: AnonAppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-app")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

