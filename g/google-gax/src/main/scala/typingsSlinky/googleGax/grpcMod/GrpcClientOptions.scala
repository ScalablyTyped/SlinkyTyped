package typingsSlinky.googleGax.grpcMod

import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcClientOptions extends GoogleAuthOptions {
  var auth: js.UndefOr[GoogleAuth] = js.native
  var grpc: js.UndefOr[GrpcModule] = js.native
  var promise: js.UndefOr[PromiseConstructor] = js.native
}

object GrpcClientOptions {
  @scala.inline
  def apply(): GrpcClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcClientOptions]
  }
  @scala.inline
  implicit class GrpcClientOptionsOps[Self <: GrpcClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: GoogleAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withGrpc(value: GrpcModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grpc")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(value: PromiseConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
  }
  
}

