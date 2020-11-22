package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formItemMod {
  
  type ChildrenType[Values] = typingsSlinky.antd.formItemMod.RenderChildren[Values] | slinky.core.facade.ReactElement
  
  type RenderChildren[Values] = js.Function1[
    /* form */ typingsSlinky.rcFieldForm.interfaceMod.FormInstance[Values], 
    slinky.core.facade.ReactElement
  ]
}
