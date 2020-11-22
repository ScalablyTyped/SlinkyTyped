package typingsSlinky.angularCore.mod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores a list of nodes which need to be removed.
  *
  * Numbers are indexes into the `LView`
  * - index > 0: `removeRNode(lView[0])`
  * - index < 0: `removeICU(~lView[0])`
  */
@js.native
trait I18nRemoveOpCodes extends Array[Double] {
  
  var __brand__ : typingsSlinky.angularCore.angularCoreStrings.I18nRemoveOpCodes = js.native
}
