package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.ethers.mod.ethers.Contract
import typingsSlinky.ethers.mod.ethers.Interface
import typingsSlinky.ethers.mod.ethers.SigningKey
import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.ParamType
import typingsSlinky.ethers.typesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofethers extends js.Object {
  var Contract: Instantiable3[
    /* addressOrName */ String, 
    /* contractInterface */ js.Array[String | ParamType], 
    /* signerOrProvider */ Signer, 
    typingsSlinky.ethers.mod.ethers.Contract
  ] = js.native
  val HDNode: TypeofHDNode = js.native
  var Interface: Instantiable1[/* abi */ js.Array[String | ParamType], typingsSlinky.ethers.mod.ethers.Interface] = js.native
  var SigningKey: Instantiable1[/* privateKey */ Arrayish, typingsSlinky.ethers.mod.ethers.SigningKey] = js.native
  var Wallet: TypeofWallet = js.native
  val constants: AddressZero = js.native
  val errors: Typeoferrors = js.native
  val platform: /* "node" */ String = js.native
  val providers: Typeofproviders = js.native
  val types: TypeoftypesBigNumber = js.native
  val utils: Typeofutils = js.native
  val version: /* "4.0.0-beta.3" */ String = js.native
  val wordlists: Typeofwordlists = js.native
}

object Typeofethers {
  @scala.inline
  def apply(
    Contract: Instantiable3[
      /* addressOrName */ String, 
      /* contractInterface */ js.Array[String | ParamType], 
      /* signerOrProvider */ Signer, 
      Contract
    ],
    HDNode: TypeofHDNode,
    Interface: Instantiable1[/* abi */ js.Array[String | ParamType], Interface],
    SigningKey: Instantiable1[/* privateKey */ Arrayish, SigningKey],
    Wallet: TypeofWallet,
    constants: AddressZero,
    errors: Typeoferrors,
    platform: /* "node" */ String,
    providers: Typeofproviders,
    types: TypeoftypesBigNumber,
    utils: Typeofutils,
    version: /* "4.0.0-beta.3" */ String,
    wordlists: Typeofwordlists
  ): Typeofethers = {
    val __obj = js.Dynamic.literal(Contract = Contract.asInstanceOf[js.Any], HDNode = HDNode.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any], SigningKey = SigningKey.asInstanceOf[js.Any], Wallet = Wallet.asInstanceOf[js.Any], constants = constants.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], wordlists = wordlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofethers]
  }
  @scala.inline
  implicit class TypeofethersOps[Self <: Typeofethers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContract(
      value: Instantiable3[
          /* addressOrName */ String, 
          /* contractInterface */ js.Array[String | ParamType], 
          /* signerOrProvider */ Signer, 
          Contract
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHDNode(value: TypeofHDNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HDNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterface(value: Instantiable1[/* abi */ js.Array[String | ParamType], Interface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningKey(value: Instantiable1[/* privateKey */ Arrayish, SigningKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWallet(value: TypeofWallet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wallet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstants(value: AddressZero): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: Typeoferrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: /* "node" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviders(value: Typeofproviders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: TypeoftypesBigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: Typeofutils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: /* "4.0.0-beta.3" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordlists(value: Typeofwordlists): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordlists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

