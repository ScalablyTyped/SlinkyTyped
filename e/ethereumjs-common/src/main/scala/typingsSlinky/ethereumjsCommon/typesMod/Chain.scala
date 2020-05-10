package typingsSlinky.ethereumjsCommon.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chain extends js.Object {
  var bootstrapNodes: js.Array[BootstrapNode] = js.native
  var chainId: Double = js.native
  var comment: String = js.native
  var genesis: GenesisBlock = js.native
  var hardforks: js.Array[Hardfork] = js.native
  var name: String = js.native
  var networkId: Double = js.native
  var url: String = js.native
}

object Chain {
  @scala.inline
  def apply(
    bootstrapNodes: js.Array[BootstrapNode],
    chainId: Double,
    comment: String,
    genesis: GenesisBlock,
    hardforks: js.Array[Hardfork],
    name: String,
    networkId: Double,
    url: String
  ): Chain = {
    val __obj = js.Dynamic.literal(bootstrapNodes = bootstrapNodes.asInstanceOf[js.Any], chainId = chainId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], genesis = genesis.asInstanceOf[js.Any], hardforks = hardforks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chain]
  }
  @scala.inline
  implicit class ChainOps[Self <: Chain] (val x: Self) extends AnyVal {
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
    def withChainId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenesis(value: GenesisBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardforks(value: js.Array[Hardfork]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardforks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

