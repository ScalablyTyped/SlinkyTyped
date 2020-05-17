package typingsSlinky.pulumiAws.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.awsSdk.mod.CloudFront.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCloudFront extends js.Object {
  val Signer: Instantiable2[
    /* keyPairId */ String, 
    /* privateKey */ String, 
    typingsSlinky.awsSdk.mod.CloudFront.Signer
  ] = js.native
  val Types: this.type = js.native
}

object TypeofCloudFront {
  @scala.inline
  def apply(
    Signer: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer],
    Types: TypeofCloudFront
  ): TypeofCloudFront = {
    val __obj = js.Dynamic.literal(Signer = Signer.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCloudFront]
  }
  @scala.inline
  implicit class TypeofCloudFrontOps[Self <: TypeofCloudFront] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSigner(value: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: TypeofCloudFront): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

