package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listBodyMod {
  type OmitProp = typingsSlinky.antd.typeMod.ElementOf[
    js.Tuple3[
      typingsSlinky.antd.antdStrings.handleFilter, 
      typingsSlinky.antd.antdStrings.handleClear, 
      typingsSlinky.antd.antdStrings.checkedKeys
    ]
  ]
  type PartialTransferListProps = typingsSlinky.antd.typeMod.Omit[
    typingsSlinky.antd.transferListMod.TransferListProps, 
    typingsSlinky.antd.listBodyMod.OmitProp
  ]
}
