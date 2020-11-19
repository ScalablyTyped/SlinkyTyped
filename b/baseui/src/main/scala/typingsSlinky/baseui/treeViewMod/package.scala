package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object treeViewMod {
  
  type TGetId = js.Function1[
    /* node */ typingsSlinky.baseui.treeViewMod.TreeNode[js.Any], 
    java.lang.String | scala.Double
  ]
  
  type toggleIsExpandedT = js.Function3[
    /* data */ js.Array[typingsSlinky.baseui.treeViewMod.TreeNode[js.Any]], 
    /* toggledNode */ typingsSlinky.baseui.treeViewMod.TreeNode[js.Any], 
    /* getId */ js.UndefOr[typingsSlinky.baseui.treeViewMod.TGetId], 
    js.Array[typingsSlinky.baseui.treeViewMod.TreeNode[js.Any]]
  ]
}
