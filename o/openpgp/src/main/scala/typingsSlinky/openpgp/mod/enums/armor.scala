package typingsSlinky.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait armor extends StObject
/**
  * Armor type
  */
@JSImport("openpgp", "enums.armor")
@js.native
object armor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[armor with Double] = js.native
  
  @js.native
  sealed trait message extends armor
  /* 3 */ val message: typingsSlinky.openpgp.mod.enums.armor.message with Double = js.native
  
  @js.native
  sealed trait multipart_last extends armor
  /* 1 */ val multipart_last: typingsSlinky.openpgp.mod.enums.armor.multipart_last with Double = js.native
  
  @js.native
  sealed trait multipart_section extends armor
  /* 0 */ val multipart_section: typingsSlinky.openpgp.mod.enums.armor.multipart_section with Double = js.native
  
  @js.native
  sealed trait private_key extends armor
  /* 5 */ val private_key: typingsSlinky.openpgp.mod.enums.armor.private_key with Double = js.native
  
  @js.native
  sealed trait public_key extends armor
  /* 4 */ val public_key: typingsSlinky.openpgp.mod.enums.armor.public_key with Double = js.native
  
  @js.native
  sealed trait signature extends armor
  /* 6 */ val signature: typingsSlinky.openpgp.mod.enums.armor.signature with Double = js.native
  
  @js.native
  sealed trait signed extends armor
  /* 2 */ val signed: typingsSlinky.openpgp.mod.enums.armor.signed with Double = js.native
}
