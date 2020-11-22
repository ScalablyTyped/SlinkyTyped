package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object listBodyMod {
  
  type OmitProp = typingsSlinky.antd.typeMod.ElementOf[
    js.Tuple3[
      typingsSlinky.antd.antdStrings.handleFilter, 
      typingsSlinky.antd.antdStrings.handleClear, 
      typingsSlinky.antd.antdStrings.checkedKeys
    ]
  ]
  
  type PartialTransferListProps[RecordType] = typingsSlinky.antd.typeMod.Omit[
    typingsSlinky.antd.transferListMod.TransferListProps[RecordType], 
    typingsSlinky.antd.listBodyMod.OmitProp
  ]
}
