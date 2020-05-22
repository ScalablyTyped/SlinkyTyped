package typingsSlinky.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bankAccount {
  type CAData = typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.CADetails
  type Data = typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.OtherData | typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.CAData | typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.GBData | typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.IBANData | typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.USData
  type GBData = typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.GBDetails
  type IBANData = typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.IBANDetails
  type OtherData = typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.OtherDetails
  type USData = typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.USDetails
}
