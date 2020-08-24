package typingsSlinky.formol.components

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formol.formolStrings.FormolProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Formol {
  @JSImport("formol", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def allowUnmodifiedSubmit(value: js.Any): this.type = set("allowUnmodifiedSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelText(value: js.Any): this.type = set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: js.Any): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def i18n(value: js.Any): this.type = set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def item(value: js.Any): this.type = set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def noCancel(value: js.Any): this.type = set("noCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def onSubmit(value: /* e */ Event => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def submitText(value: js.Any): this.type = set("submitText", value.asInstanceOf[js.Any])
    @scala.inline
    def typesVarargs(value: String*): this.type = set("types", js.Array(value :_*))
    @scala.inline
    def types(value: js.Array[String]): this.type = set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def validator(
      value: js.Any => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]:? string | null}
      */ FormolProps with TopLevel[js.Any]
    ): this.type = set("validator", js.Any.fromFunction1(value))
  }
  
  def withProps(p: typingsSlinky.formol.mod.FormolProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Formol.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

