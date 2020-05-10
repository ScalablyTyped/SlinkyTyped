package typingsSlinky.pulumiAws.getServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerCertificateResult extends js.Object {
  val arn: String = js.native
  val certificateBody: String = js.native
  val certificateChain: String = js.native
  val expirationDate: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val latest: js.UndefOr[Boolean] = js.native
  val name: String = js.native
  val namePrefix: js.UndefOr[String] = js.native
  val path: String = js.native
  val pathPrefix: js.UndefOr[String] = js.native
  val uploadDate: String = js.native
}

object GetServerCertificateResult {
  @scala.inline
  def apply(
    arn: String,
    certificateBody: String,
    certificateChain: String,
    expirationDate: String,
    id: String,
    name: String,
    path: String,
    uploadDate: String
  ): GetServerCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateBody = certificateBody.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerCertificateResult]
  }
  @scala.inline
  implicit class GetServerCertificateResultOps[Self <: GetServerCertificateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateChain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPathPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(js.undefined)
        ret
    }
  }
  
}

