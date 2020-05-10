package typingsSlinky.convict.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalSchema[T] extends js.Object {
  var properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default  :T[K]}}
    */ typingsSlinky.convict.convictStrings.InternalSchema with TopLevel[js.Any] = js.native
}

object InternalSchema {
  @scala.inline
  def apply[T](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default  :T[K]}}
    */ typingsSlinky.convict.convictStrings.InternalSchema with TopLevel[js.Any]
  ): InternalSchema[T] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalSchema[T]]
  }
  @scala.inline
  implicit class InternalSchemaOps[Self[t] <: InternalSchema[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default  :T[K]}}
      */ typingsSlinky.convict.convictStrings.InternalSchema with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

