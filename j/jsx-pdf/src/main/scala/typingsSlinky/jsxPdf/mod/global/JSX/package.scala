package typingsSlinky.jsxPdf.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JSX {
  
  type Child = typingsSlinky.jsxPdf.mod.global.JSX.Element | js.Array[typingsSlinky.jsxPdf.mod.global.JSX.Element]
  
  type DynamicChild = typingsSlinky.jsxPdf.mod.global.JSX.Child | (js.Function3[
    /* currentPage */ scala.Double, 
    /* pageCount */ scala.Double, 
    /* pageSize */ typingsSlinky.pdfmake.interfacesMod.ContextPageSize, 
    typingsSlinky.jsxPdf.mod.global.JSX.Child
  ])
  
  type Ele[Props] = typingsSlinky.jsxPdf.mod.global.JSX.ElementChildrenAttribute with Props
  
  type EleNoChidlren[Props] = Props
}
