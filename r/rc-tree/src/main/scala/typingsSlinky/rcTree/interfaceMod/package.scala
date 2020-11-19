package typingsSlinky.rcTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfaceMod {
  
  type GetCheckDisabled[RecordType] = js.Function1[/* record */ RecordType, scala.Boolean]
  
  type GetKey[RecordType] = js.Function2[
    /* record */ RecordType, 
    /* index */ js.UndefOr[scala.Double], 
    typingsSlinky.rcTree.interfaceMod.Key
  ]
  
  type IconType = slinky.core.facade.ReactElement | (js.Function1[
    /* props */ typingsSlinky.rcTree.treeNodeMod.TreeNodeProps, 
    slinky.core.facade.ReactElement
  ])
  
  type Key = java.lang.String | scala.Double
  
  type ScrollTo = js.Function1[/* scroll */ typingsSlinky.rcTree.anon.Key, scala.Unit]
}
