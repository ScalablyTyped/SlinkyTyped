package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SecurityTypes extends js.Object
@JSGlobal("Sdk.Mdq.ValueEnums.SecurityTypes")
@js.native
object SecurityTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecurityTypes with Double] = js.native
  
  @js.native
  sealed trait Append extends SecurityTypes
  /* 0 */ @js.native
  object Append extends TopLevel[Append with Double]
  
  @js.native
  sealed trait Inheritance extends SecurityTypes
  /* 1 */ @js.native
  object Inheritance extends TopLevel[Inheritance with Double]
  
  @js.native
  sealed trait None extends SecurityTypes
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait ParentChild extends SecurityTypes
  /* 3 */ @js.native
  object ParentChild extends TopLevel[ParentChild with Double]
  
  @js.native
  sealed trait Pointer extends SecurityTypes
  /* 4 */ @js.native
  object Pointer extends TopLevel[Pointer with Double]
}
