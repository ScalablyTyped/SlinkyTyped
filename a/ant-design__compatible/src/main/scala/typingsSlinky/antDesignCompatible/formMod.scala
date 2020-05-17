package typingsSlinky.antDesignCompatible

import typingsSlinky.antDesignCompatible.anon.Colon
import typingsSlinky.antDesignCompatible.anon.TypeofFormItem
import typingsSlinky.antDesignCompatible.formFormMod.FormComponentProps
import typingsSlinky.antDesignCompatible.formFormMod.FormCreateOption
import typingsSlinky.antDesignCompatible.formFormMod.FormProps
import typingsSlinky.antDesignCompatible.interfaceMod.FormWrappedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/compatible/lib/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.antDesignCompatible.formFormMod.default {
    def this(props: FormProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: TypeofFormItem = js.native
    var createFormField: js.Any = js.native
    var defaultProps: Colon = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
  }
  
}

