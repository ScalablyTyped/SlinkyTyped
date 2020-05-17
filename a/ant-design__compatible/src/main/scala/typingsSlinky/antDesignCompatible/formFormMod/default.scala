package typingsSlinky.antDesignCompatible.formFormMod

import typingsSlinky.antDesignCompatible.anon.Colon
import typingsSlinky.antDesignCompatible.anon.TypeofFormItem
import typingsSlinky.antDesignCompatible.interfaceMod.FormWrappedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/compatible/lib/form/Form", JSImport.Default)
@js.native
class default protected () extends Form {
  def this(props: FormProps) = this()
}

/* static members */
@JSImport("@ant-design/compatible/lib/form/Form", JSImport.Default)
@js.native
object default extends js.Object {
  var Item: TypeofFormItem = js.native
  var createFormField: js.Any = js.native
  var defaultProps: Colon = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
}

