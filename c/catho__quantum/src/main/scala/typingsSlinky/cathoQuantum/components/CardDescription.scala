package typingsSlinky.cathoQuantum.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.AnonSmall
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardDescription {
  object ComponentClass {
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def Instantiable1(
        Instantiable1: org.scalablytyped.runtime.Instantiable1[AnonSmall, ReactComponentClass[AnonSmall]] = null
      ): this.type = {
            if (Instantiable1 != null) js.Dynamic.global.Object.assign(args(1), Instantiable1)
            this
      }
      @scala.inline
      def Instantiable2(
        Instantiable2: org.scalablytyped.runtime.Instantiable2[AnonSmall, /* context */ js.Any, ReactComponentClass[AnonSmall]] = null
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
      def defaultProps(value: Partial[AnonSmall]): this.type = set("defaultProps", value.asInstanceOf[js.Any])
      @scala.inline
      def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
      @scala.inline
      def getDerivedStateFromError(value: /* error */ js.Any => Partial[js.Object] | Null): this.type = set("getDerivedStateFromError", js.Any.fromFunction1(value))
      @scala.inline
      def getDerivedStateFromProps(value: (AnonSmall, js.Object) => Partial[js.Object] | Null): this.type = set("getDerivedStateFromProps", js.Any.fromFunction2(value))
      @scala.inline
      def propTypes(value: WeakValidationMap[AnonSmall]): this.type = set("propTypes", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ReactComponentClass[AnonSmall]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: ComponentClass.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object FunctionComponent {
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def contextTypes(value: ValidationMap[_]): this.type = set("contextTypes", value.asInstanceOf[js.Any])
      @scala.inline
      def defaultProps(value: Partial[AnonSmall]): this.type = set("defaultProps", value.asInstanceOf[js.Any])
      @scala.inline
      def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
      @scala.inline
      def propTypes(value: WeakValidationMap[AnonSmall]): this.type = set("propTypes", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ReactComponentClass[AnonSmall]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: FunctionComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

