package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.ethers.mod.ethers.utils.types.BigNumber
import typingsSlinky.ethers.mod.ethers.utils.types.HDNode
import typingsSlinky.ethers.mod.ethers.utils.types.Indexed
import typingsSlinky.ethers.mod.ethers.utils.types.MinimalProvider
import typingsSlinky.ethers.mod.ethers.utils.types.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftypes extends js.Object {
  var BigNumber: Instantiable0[typingsSlinky.ethers.mod.ethers.utils.types.BigNumber] = js.native
  var HDNode: Instantiable0[typingsSlinky.ethers.mod.ethers.utils.types.HDNode] = js.native
  var Indexed: Instantiable0[typingsSlinky.ethers.mod.ethers.utils.types.Indexed] = js.native
  var MinimalProvider: Instantiable0[typingsSlinky.ethers.mod.ethers.utils.types.MinimalProvider] = js.native
  var Signer: Instantiable0[typingsSlinky.ethers.mod.ethers.utils.types.Signer] = js.native
}

object Typeoftypes {
  @scala.inline
  def apply(
    BigNumber: Instantiable0[BigNumber],
    HDNode: Instantiable0[HDNode],
    Indexed: Instantiable0[Indexed],
    MinimalProvider: Instantiable0[MinimalProvider],
    Signer: Instantiable0[Signer]
  ): Typeoftypes = {
    val __obj = js.Dynamic.literal(BigNumber = BigNumber.asInstanceOf[js.Any], HDNode = HDNode.asInstanceOf[js.Any], Indexed = Indexed.asInstanceOf[js.Any], MinimalProvider = MinimalProvider.asInstanceOf[js.Any], Signer = Signer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftypes]
  }
  @scala.inline
  implicit class TypeoftypesOps[Self <: Typeoftypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigNumber(value: Instantiable0[BigNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BigNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHDNode(value: Instantiable0[HDNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HDNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexed(value: Instantiable0[Indexed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Indexed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimalProvider(value: Instantiable0[MinimalProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimalProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigner(value: Instantiable0[Signer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

