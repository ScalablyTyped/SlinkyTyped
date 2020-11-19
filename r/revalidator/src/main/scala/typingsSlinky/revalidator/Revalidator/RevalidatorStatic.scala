package typingsSlinky.revalidator.Revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevalidatorStatic extends js.Object {
  
  def validate[T](`object`: T, schema: JSONSchema[T]): IReturnMessage = js.native
  def validate[T](`object`: T, schema: JSONSchema[T], options: IOptions): IReturnMessage = js.native
}
