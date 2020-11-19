package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fieldMod {
  
  type FieldAttributes[T] = typingsSlinky.formik.typesMod.GenericFieldHTMLAttributes with typingsSlinky.formik.fieldMod.FieldConfig[T] with T with typingsSlinky.formik.anon.Name
  
  type FieldHookConfig[T] = typingsSlinky.formik.typesMod.GenericFieldHTMLAttributes with typingsSlinky.formik.fieldMod.FieldConfig[T]
}
