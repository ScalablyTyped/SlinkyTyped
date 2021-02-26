package typingsSlinky.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Plural extends StObject
@JSImport("@angular/common", "Plural")
@js.native
object Plural extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Plural with Double] = js.native
  
  @js.native
  sealed trait Few extends Plural
  /* 3 */ val Few: typingsSlinky.angularCommon.mod.Plural.Few with Double = js.native
  
  @js.native
  sealed trait Many extends Plural
  /* 4 */ val Many: typingsSlinky.angularCommon.mod.Plural.Many with Double = js.native
  
  @js.native
  sealed trait One extends Plural
  /* 1 */ val One: typingsSlinky.angularCommon.mod.Plural.One with Double = js.native
  
  @js.native
  sealed trait Other extends Plural
  /* 5 */ val Other: typingsSlinky.angularCommon.mod.Plural.Other with Double = js.native
  
  @js.native
  sealed trait Two extends Plural
  /* 2 */ val Two: typingsSlinky.angularCommon.mod.Plural.Two with Double = js.native
  
  @js.native
  sealed trait Zero extends Plural
  /* 0 */ val Zero: typingsSlinky.angularCommon.mod.Plural.Zero with Double = js.native
}
