package typingsSlinky.creditCardType

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.creditCardType.typesMod.CardCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardTypesMod extends Shortcut {
  
  @JSImport("credit-card-type/dist/lib/card-types", JSImport.Namespace)
  @js.native
  val ^ : CardCollection = js.native
  
  type _To = CardCollection
  
  /* This means you don't have to write `^`, but can instead just say `cardTypesMod.foo` */
  override def _to: CardCollection = ^
}
