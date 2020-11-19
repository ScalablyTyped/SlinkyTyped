package typingsSlinky.materialSnackbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type MDCSnackbarAnnouncer = js.Function2[
    /* ariaEl */ org.scalajs.dom.raw.Element, 
    /* labelEl */ js.UndefOr[org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  
  type MDCSnackbarAnnouncerFactory = js.Function0[typingsSlinky.materialSnackbar.typesMod.MDCSnackbarAnnouncer]
}
