package typingsSlinky.antd.antdMod

import typingsSlinky.antd.Anon_ArgsChildren
import typingsSlinky.antd.Anon_Colon
import typingsSlinky.antd.TypeofClassFormItem
import typingsSlinky.antd.libFormFormMod.FormComponentProps
import typingsSlinky.antd.libFormFormMod.FormCreateOption
import typingsSlinky.antd.libFormFormMod.FormProps
import typingsSlinky.antd.libFormInterfaceMod.FormWrappedProps
import typingsSlinky.antd.libFormMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Form")
@js.native
class Form protected () extends default {
  def this(props: FormProps) = this()
}

/* static members */
@JSImport("antd", "Form")
@js.native
object Form extends js.Object {
  var Item: TypeofClassFormItem = js.native
  var createFormField: js.Any = js.native
  var defaultProps: Anon_Colon = js.native
  var propTypes: Anon_ArgsChildren = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
}

