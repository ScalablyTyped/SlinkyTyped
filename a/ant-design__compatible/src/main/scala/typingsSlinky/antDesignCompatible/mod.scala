package typingsSlinky.antDesignCompatible

import typingsSlinky.antDesignCompatible.formFormMod.FormComponentProps
import typingsSlinky.antDesignCompatible.formFormMod.FormCreateOption
import typingsSlinky.antDesignCompatible.formFormMod.FormProps
import typingsSlinky.antDesignCompatible.formMod.default
import typingsSlinky.antDesignCompatible.iconMod.IconComponent
import typingsSlinky.antDesignCompatible.iconMod.IconProps
import typingsSlinky.antDesignCompatible.interfaceMod.FormWrappedProps
import typingsSlinky.antDesignCompatible.mentionMod.MentionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/compatible/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Form protected () extends default {
    def this(props: FormProps) = this()
  }
  
  @js.native
  class Mention protected ()
    extends typingsSlinky.antDesignCompatible.mentionMod.default {
    def this(props: MentionProps) = this()
  }
  
  val Icon: IconComponent[IconProps] = js.native
  /* static members */
  @js.native
  object Form extends js.Object {
    var Item: TypeofFormItem = js.native
    var createFormField: js.Any = js.native
    var defaultProps: AnonColon = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
  }
  
  /* static members */
  @js.native
  object Mention extends js.Object {
    var Nav: js.Any = js.native
    var defaultProps: AnonLoading = js.native
    var getMentions: js.Any = js.native
    var toContentState: js.Any = js.native
    @JSName("toString")
    var toString_FMention: js.Any = js.native
  }
  
}

