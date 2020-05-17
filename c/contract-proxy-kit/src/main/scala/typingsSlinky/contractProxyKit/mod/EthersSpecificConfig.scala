package typingsSlinky.contractProxyKit.mod

import typingsSlinky.contractProxyKit.anon.Typeofethers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EthersSpecificConfig
  extends CommonConfig
     with CPKConfig {
  var ethers: Typeofethers = js.native
  var signer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any = js.native
}

object EthersSpecificConfig {
  @scala.inline
  def apply(
    ethers: Typeofethers,
    signer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any
  ): EthersSpecificConfig = {
    val __obj = js.Dynamic.literal(ethers = ethers.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthersSpecificConfig]
  }
  @scala.inline
  implicit class EthersSpecificConfigOps[Self <: EthersSpecificConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEthers(value: Typeofethers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ethers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigner(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

