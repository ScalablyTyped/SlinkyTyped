package typingsSlinky.activexOffice.Office

import typingsSlinky.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permission extends StObject {
  
  def apply(Index: js.Any): UserPermission = js.native
  
  def Add(UserId: String): UserPermission = js.native
  def Add(UserId: String, Permission: js.UndefOr[scala.Nothing], ExpirationDate: VarDate): UserPermission = js.native
  def Add(UserId: String, Permission: MsoPermission): UserPermission = js.native
  def Add(UserId: String, Permission: MsoPermission, ExpirationDate: VarDate): UserPermission = js.native
  
  val Application: js.Any = js.native
  
  def ApplyPolicy(FileName: String): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var DocumentAuthor: String = js.native
  
  var EnableTrustedBrowser: Boolean = js.native
  
  var Enabled: Boolean = js.native
  
  def Item(Index: js.Any): UserPermission = js.native
  
  val Parent: js.Any = js.native
  
  val PermissionFromPolicy: Boolean = js.native
  
  val PolicyDescription: String = js.native
  
  val PolicyName: String = js.native
  
  def RemoveAll(): Unit = js.native
  
  var RequestPermissionURL: String = js.native
  
  var StoreLicenses: Boolean = js.native
}
