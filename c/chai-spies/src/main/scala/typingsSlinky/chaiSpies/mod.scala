package typingsSlinky.chaiSpies

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.chaiSpies.ChaiSpies.Spy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-spies", JSImport.Namespace)
  @js.native
  val ^ : Spy = js.native
  
  type _To = Spy
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Spy = ^
}
