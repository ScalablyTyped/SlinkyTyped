package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderListBodyMod {
  type OmitProp = typingsSlinky.antd.typeMod.ElementOf[
    js.Tuple3[
      typingsSlinky.antd.antdStrings.handleFilter, 
      typingsSlinky.antd.antdStrings.handleClear, 
      typingsSlinky.antd.antdStrings.checkedKeys
    ]
  ]
  type PartialTransferListProps = typingsSlinky.antd.typeMod.Omit[
    typingsSlinky.antd.transferListMod.TransferListProps, 
    typingsSlinky.antd.renderListBodyMod.OmitProp
  ]
}
