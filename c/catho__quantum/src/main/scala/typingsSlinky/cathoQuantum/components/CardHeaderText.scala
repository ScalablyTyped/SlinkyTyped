package typingsSlinky.cathoQuantum.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardHeaderText {
  object ComponentClass {
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def Instantiable1(
        Instantiable1: org.scalablytyped.runtime.Instantiable1[js.Object, ReactComponentClass[js.Object]] = null
      ): this.type = {
            if (Instantiable1 != null) js.Dynamic.global.Object.assign(args(1), Instantiable1)
            this
      }
      @scala.inline
      def Instantiable2(
        Instantiable2: org.scalablytyped.runtime.Instantiable2[js.Object, /* context */ js.Any, ReactComponentClass[js.Object]] = null
      ): this.type = {
            if (Instantiable2 != null) js.Dynamic.global.Object.assign(args(1), Instantiable2)
            this
      }
      @scala.inline
      def childContextTypes(value: ValidationMap[_]): this.type = set("childContextTypes", value.asInstanceOf[js.Any])
      @scala.inline
      def contextType(value: Context[_]): this.type = set("contextType", value.asInstanceOf[js.Any])
      @scala.inline
      def contextTypes(value: ValidationMap[_]): this.type = set("contextTypes", value.asInstanceOf[js.Any])
      @scala.inline
      def defaultProps(value: Partial[js.Object]): this.type = set("defaultProps", value.asInstanceOf[js.Any])
      @scala.inline
      def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
      @scala.inline
      def getDerivedStateFromError(value: /* error */ js.Any => Partial[js.Object] | Null): this.type = set("getDerivedStateFromError", js.Any.fromFunction1(value))
      @scala.inline
      def getDerivedStateFromProps(value: (js.Object, js.Object) => Partial[js.Object] | Null): this.type = set("getDerivedStateFromProps", js.Any.fromFunction2(value))
      @scala.inline
      def propTypes(value: WeakValidationMap[js.Object]): this.type = set("propTypes", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ReactComponentClass[js.Object]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: ComponentClass.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object FunctionComponent {
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def contextTypes(value: ValidationMap[_]): this.type = set("contextTypes", value.asInstanceOf[js.Any])
      @scala.inline
      def defaultProps(value: Partial[js.Object]): this.type = set("defaultProps", value.asInstanceOf[js.Any])
      @scala.inline
      def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
      @scala.inline
      def propTypes(value: WeakValidationMap[js.Object]): this.type = set("propTypes", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ReactComponentClass[js.Object]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: FunctionComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

