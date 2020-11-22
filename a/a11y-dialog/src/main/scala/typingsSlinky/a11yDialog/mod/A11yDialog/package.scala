package typingsSlinky.a11yDialog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object A11yDialog {
  
  type EventHandler = js.Function2[
    /* node */ org.scalajs.dom.raw.Element, 
    /* event */ js.UndefOr[org.scalajs.dom.raw.Event], 
    scala.Unit
  ]
  
  type Targets = org.scalajs.dom.raw.NodeList | org.scalajs.dom.raw.Element | java.lang.String
}
