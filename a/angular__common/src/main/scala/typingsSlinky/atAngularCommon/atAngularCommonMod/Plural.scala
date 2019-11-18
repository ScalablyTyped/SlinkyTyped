package typingsSlinky.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Plural extends js.Object

@JSImport("@angular/common", "Plural")
@js.native
object Plural extends js.Object {
  @js.native
  sealed trait Few extends Plural
  
  @js.native
  sealed trait Many extends Plural
  
  @js.native
  sealed trait One extends Plural
  
  @js.native
  sealed trait Other extends Plural
  
  @js.native
  sealed trait Two extends Plural
  
  @js.native
  sealed trait Zero extends Plural
  
  /* 3 */ val Few: typingsSlinky.atAngularCommon.atAngularCommonMod.Plural.Few with Double = js.native
  /* 4 */ val Many: typingsSlinky.atAngularCommon.atAngularCommonMod.Plural.Many with Double = js.native
  /* 1 */ val One: typingsSlinky.atAngularCommon.atAngularCommonMod.Plural.One with Double = js.native
  /* 5 */ val Other: typingsSlinky.atAngularCommon.atAngularCommonMod.Plural.Other with Double = js.native
  /* 2 */ val Two: typingsSlinky.atAngularCommon.atAngularCommonMod.Plural.Two with Double = js.native
  /* 0 */ val Zero: typingsSlinky.atAngularCommon.atAngularCommonMod.Plural.Zero with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Plural with Double] = js.native
}

