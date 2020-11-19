package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttributeRequiredLevel extends js.Object
@JSGlobal("Sdk.Mdq.ValueEnums.AttributeRequiredLevel")
@js.native
object AttributeRequiredLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttributeRequiredLevel with Double] = js.native
  
  @js.native
  sealed trait ApplicationRequired extends AttributeRequiredLevel
  /* 0 */ @js.native
  object ApplicationRequired extends TopLevel[ApplicationRequired with Double]
  
  @js.native
  sealed trait None extends AttributeRequiredLevel
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Recommended extends AttributeRequiredLevel
  /* 2 */ @js.native
  object Recommended extends TopLevel[Recommended with Double]
  
  @js.native
  sealed trait SystemRequired extends AttributeRequiredLevel
  /* 3 */ @js.native
  object SystemRequired extends TopLevel[SystemRequired with Double]
}
