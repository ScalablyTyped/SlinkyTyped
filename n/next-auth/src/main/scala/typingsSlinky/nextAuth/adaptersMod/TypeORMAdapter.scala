package typingsSlinky.nextAuth.adaptersMod

import typingsSlinky.nextAuth.anon.User
import typingsSlinky.nextAuth.anon.`0`
import typingsSlinky.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TODO: fix auto-type schema
  */
@js.native
trait TypeORMAdapter[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends js.Object {
  
  def Adapter(typeOrmConfig: ConnectionOptions): typingsSlinky.nextAuth.adaptersMod.Adapter[U, Profile, S, VR] = js.native
  def Adapter(typeOrmConfig: ConnectionOptions, options: `0`[A, U, S, VR]): typingsSlinky.nextAuth.adaptersMod.Adapter[U, Profile, S, VR] = js.native
  
  var Models: User = js.native
}
