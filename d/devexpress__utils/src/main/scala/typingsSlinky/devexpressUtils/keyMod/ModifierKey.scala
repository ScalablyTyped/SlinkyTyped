package typingsSlinky.devexpressUtils.keyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModifierKey extends StObject
@JSImport("@devexpress/utils/lib/utils/key", "ModifierKey")
@js.native
object ModifierKey extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModifierKey with Double] = js.native
  
  @js.native
  sealed trait Alt extends ModifierKey
  /* 1048576 */ val Alt: typingsSlinky.devexpressUtils.keyMod.ModifierKey.Alt with Double = js.native
  
  @js.native
  sealed trait Ctrl extends ModifierKey
  /* 65536 */ val Ctrl: typingsSlinky.devexpressUtils.keyMod.ModifierKey.Ctrl with Double = js.native
  
  @js.native
  sealed trait Meta extends ModifierKey
  /* 16777216 */ val Meta: typingsSlinky.devexpressUtils.keyMod.ModifierKey.Meta with Double = js.native
  
  @js.native
  sealed trait None extends ModifierKey
  /* 0 */ val None: typingsSlinky.devexpressUtils.keyMod.ModifierKey.None with Double = js.native
  
  @js.native
  sealed trait Shift extends ModifierKey
  /* 262144 */ val Shift: typingsSlinky.devexpressUtils.keyMod.ModifierKey.Shift with Double = js.native
}
