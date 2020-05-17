package typingsSlinky.ethereumjsCommon.anon

import typingsSlinky.ethereumjsCommon.typesMod.BootstrapNode
import typingsSlinky.ethereumjsCommon.typesMod.GenesisBlock
import typingsSlinky.ethereumjsCommon.typesMod.Hardfork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ethereumjs-common.ethereumjs-common/dist/types.Chain> */
@js.native
trait PartialChain extends js.Object {
  var bootstrapNodes: js.UndefOr[js.Array[BootstrapNode]] = js.native
  var chainId: js.UndefOr[Double] = js.native
  var comment: js.UndefOr[String] = js.native
  var genesis: js.UndefOr[GenesisBlock] = js.native
  var hardforks: js.UndefOr[js.Array[Hardfork]] = js.native
  var name: js.UndefOr[String] = js.native
  var networkId: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object PartialChain {
  @scala.inline
  def apply(): PartialChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChain]
  }
  @scala.inline
  implicit class PartialChainOps[Self <: PartialChain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrapNodes(value: js.Array[BootstrapNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withChainId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainId")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withGenesis(value: GenesisBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenesis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genesis")(js.undefined)
        ret
    }
    @scala.inline
    def withHardforks(value: js.Array[Hardfork]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardforks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardforks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardforks")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkId")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

