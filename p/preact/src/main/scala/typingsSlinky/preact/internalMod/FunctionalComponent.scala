package typingsSlinky.preact.internalMod

import typingsSlinky.preact.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionalComponent[P] extends FunctionComponent[P] {
  
  // Define getDerivedStateFromProps as undefined on FunctionalComponent
  // to get rid of some errors in `diff()`
  var getDerivedStateFromProps: js.UndefOr[scala.Nothing] = js.native
}
