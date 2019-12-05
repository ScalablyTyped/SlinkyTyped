package typingsSlinky.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSImport("lovefield", "Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait ARRAY_BUFFER extends Type
  
  @js.native
  sealed trait BOOLEAN extends Type
  
  @js.native
  sealed trait DATE_TIME extends Type
  
  @js.native
  sealed trait INTEGER extends Type
  
  @js.native
  sealed trait NUMBER extends Type
  
  @js.native
  sealed trait OBJECT extends Type
  
  @js.native
  sealed trait STRING extends Type
  
  /* 0 */ val ARRAY_BUFFER: typingsSlinky.lovefield.lovefieldMod.Type.ARRAY_BUFFER with Double = js.native
  /* 1 */ val BOOLEAN: typingsSlinky.lovefield.lovefieldMod.Type.BOOLEAN with Double = js.native
  /* 2 */ val DATE_TIME: typingsSlinky.lovefield.lovefieldMod.Type.DATE_TIME with Double = js.native
  /* 3 */ val INTEGER: typingsSlinky.lovefield.lovefieldMod.Type.INTEGER with Double = js.native
  /* 4 */ val NUMBER: typingsSlinky.lovefield.lovefieldMod.Type.NUMBER with Double = js.native
  /* 5 */ val OBJECT: typingsSlinky.lovefield.lovefieldMod.Type.OBJECT with Double = js.native
  /* 6 */ val STRING: typingsSlinky.lovefield.lovefieldMod.Type.STRING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

