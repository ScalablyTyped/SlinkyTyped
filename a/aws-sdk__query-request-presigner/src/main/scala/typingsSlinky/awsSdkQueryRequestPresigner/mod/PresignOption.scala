package typingsSlinky.awsSdkQueryRequestPresigner.mod

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresignOption extends js.Object {
  /**
    * credentials used to sign the request.
    */
  var credentials: Credentials = js.native
  /**
    * Use endpoint other than that in request
    * @default request the same endpoint as in the request
    */
  var endpoint: js.UndefOr[HttpEndpoint] = js.native
  /**
    * The time span in second that the presigned url lives
    * @default 3600
    */
  var expireTime: js.UndefOr[Double] = js.native
  var sha256: HashConstructor = js.native
  /**
    * The service name used to sign the request
    */
  var signingName: String = js.native
  /**
    * The region that signer used to sign. Usally the same as
    * that in request hostname
    */
  var signingRegion: String = js.native
}

object PresignOption {
  @scala.inline
  def apply(credentials: Credentials, sha256: HashConstructor, signingName: String, signingRegion: String): PresignOption = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresignOption]
  }
  @scala.inline
  implicit class PresignOptionOps[Self <: PresignOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha256(value: HashConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: HttpEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withExpireTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(js.undefined)
        ret
    }
  }
  
}

