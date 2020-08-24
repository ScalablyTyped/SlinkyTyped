package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.inputNumberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object InputNumber {
  @JSImport("@ant-design/react-native/lib/stepper/InputNumber", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.antDesignReactNative.inputNumberMod.InputNumberProps */ P, /* <: typingsSlinky.antDesignReactNative.inputNumberMod.InputNumberState */ S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[P, S]]
  
  def apply[/* <: typingsSlinky.antDesignReactNative.inputNumberMod.InputNumberProps */ P, /* <: typingsSlinky.antDesignReactNative.inputNumberMod.InputNumberState */ S](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.antDesignReactNative.inputNumberMod.InputNumberProps */ P, /* <: typingsSlinky.antDesignReactNative.inputNumberMod.InputNumberState */ S](companion: InputNumber.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}

