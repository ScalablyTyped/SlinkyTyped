package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A chain of paths which connect end to end.
  */
@js.native
trait IChain extends js.Object {
  /**
    * Flag if this chain forms a loop end to end.
    */
  var endless: js.UndefOr[Boolean] = js.native
  /**
    * The links in this chain.
    */
  var links: js.Array[IChainLink] = js.native
  /**
    * Total length of all paths in the chain.
    */
  var pathLength: Double = js.native
}

object IChain {
  @scala.inline
  def apply(links: js.Array[IChainLink], pathLength: Double): IChain = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChain]
  }
  @scala.inline
  implicit class IChainOps[Self <: IChain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Array[IChainLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endless")(js.undefined)
        ret
    }
  }
  
}

