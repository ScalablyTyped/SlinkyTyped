package typingsSlinky.domHelpers

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.domHelpers.domHelpersBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isWindowMod {
  
  @JSImport("dom-helpers/cjs/isWindow", JSImport.Default)
  @js.native
  def default(node: Document): Window | `false` = js.native
  @JSImport("dom-helpers/cjs/isWindow", JSImport.Default)
  @js.native
  def default(node: Element): Window | `false` = js.native
  @JSImport("dom-helpers/cjs/isWindow", JSImport.Default)
  @js.native
  def default(node: Window): Window | `false` = js.native
}
