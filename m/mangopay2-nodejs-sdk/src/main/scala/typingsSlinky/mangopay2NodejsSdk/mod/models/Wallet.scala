package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.mod.wallet.CreateWallet
import typingsSlinky.mangopay2NodejsSdk.mod.wallet.UpdateWallet
import typingsSlinky.mangopay2NodejsSdk.mod.wallet.WalletData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Wallet")
@js.native
class Wallet protected () extends EntityBase[WalletData] {
  def this(data: CreateWallet) = this()
  def this(data: UpdateWallet) = this()
}

