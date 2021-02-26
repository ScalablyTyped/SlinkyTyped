package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardType extends StObject
@JSImport("azdata", "CardType")
@js.native
object CardType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardType with String] = js.native
  
  @js.native
  sealed trait Details extends CardType
  /* "Details" */ val Details: typingsSlinky.azdata.mod.CardType.Details with String = js.native
  
  @js.native
  sealed trait ListItem extends CardType
  /* "ListItem" */ val ListItem: typingsSlinky.azdata.mod.CardType.ListItem with String = js.native
  
  @js.native
  sealed trait VerticalButton extends CardType
  /* "VerticalButton" */ val VerticalButton: typingsSlinky.azdata.mod.CardType.VerticalButton with String = js.native
}
