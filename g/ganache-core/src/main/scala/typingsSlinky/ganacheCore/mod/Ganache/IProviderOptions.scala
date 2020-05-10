package typingsSlinky.ganacheCore.mod.Ganache

import typingsSlinky.ganacheCore.AnonLog
import typingsSlinky.ganacheCore.ganacheCoreStrings.byzantium
import typingsSlinky.ganacheCore.ganacheCoreStrings.constantinople
import typingsSlinky.ganacheCore.ganacheCoreStrings.istanbul
import typingsSlinky.ganacheCore.ganacheCoreStrings.muirGlacier
import typingsSlinky.ganacheCore.ganacheCoreStrings.petersburg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProviderOptions extends js.Object {
  var account_keys_path: js.UndefOr[String] = js.native
  var accounts: js.UndefOr[js.Array[js.Object]] = js.native
  var allowUnlimitedContractSize: js.UndefOr[Boolean] = js.native
  var blockTime: js.UndefOr[Double] = js.native
  var db_path: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var default_balance_ether: js.UndefOr[Double] = js.native
  var fork: js.UndefOr[String | js.Object] = js.native
  var fork_block_number: js.UndefOr[String | Double] = js.native
  var gasLimit: js.UndefOr[String | Double] = js.native
  var gasPrice: js.UndefOr[String] = js.native
  var hardfork: js.UndefOr[byzantium | constantinople | petersburg | istanbul | muirGlacier] = js.native
  var hd_path: js.UndefOr[String] = js.native
  var locked: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[AnonLog] = js.native
  var mnemonic: js.UndefOr[String] = js.native
  var networkId: js.UndefOr[Double] = js.native
  var network_id: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var seed: js.UndefOr[js.Any] = js.native
  var time: js.UndefOr[js.Date] = js.native
  var total_accounts: js.UndefOr[Double] = js.native
  var unlocked_accounts: js.UndefOr[js.Array[String]] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.native
  var ws: js.UndefOr[Boolean] = js.native
}

object IProviderOptions {
  @scala.inline
  def apply(): IProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProviderOptions]
  }
  @scala.inline
  implicit class IProviderOptionsOps[Self <: IProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_keys_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_keys_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_keys_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_keys_path")(js.undefined)
        ret
    }
    @scala.inline
    def withAccounts(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUnlimitedContractSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnlimitedContractSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnlimitedContractSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnlimitedContractSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDb_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDb_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db_path")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_balance_ether(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_balance_ether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_balance_ether: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_balance_ether")(js.undefined)
        ret
    }
    @scala.inline
    def withFork(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(js.undefined)
        ret
    }
    @scala.inline
    def withFork_block_number(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork_block_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFork_block_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork_block_number")(js.undefined)
        ret
    }
    @scala.inline
    def withGasLimit(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGasLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withGasPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGasPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withHardfork(value: byzantium | constantinople | petersburg | istanbul | muirGlacier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardfork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardfork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardfork")(js.undefined)
        ret
    }
    @scala.inline
    def withHd_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHd_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd_path")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: AnonLog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withMnemonic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mnemonic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMnemonic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mnemonic")(js.undefined)
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
    def withNetwork_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_accounts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_accounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlocked_accounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlocked_accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlocked_accounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlocked_accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withVmErrorsOnRPCResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmErrorsOnRPCResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmErrorsOnRPCResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmErrorsOnRPCResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withWs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(js.undefined)
        ret
    }
  }
  
}

