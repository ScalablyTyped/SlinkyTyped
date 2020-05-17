package typingsSlinky.rcFieldForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcFieldForm.anon.Source
import typingsSlinky.rcFieldForm.fieldMod.FieldProps
import typingsSlinky.rcFieldForm.fieldMod.ShouldUpdate
import typingsSlinky.rcFieldForm.fieldMod.default
import typingsSlinky.rcFieldForm.interfaceMod.EventArgs
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.Rule
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Field {
  @JSImport("rc-field-form/lib/Field", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def dependencies(value: js.Array[NamePath]): this.type = set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def getValueFromEvent(value: /* args */ EventArgs => StoreValue): this.type = set("getValueFromEvent", js.Any.fromFunction1(value))
    @scala.inline
    def name(value: NamePath): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def normalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): this.type = set("normalize", js.Any.fromFunction3(value))
    @scala.inline
    def onReset(value: () => Unit): this.type = set("onReset", js.Any.fromFunction0(value))
    @scala.inline
    def rules(value: js.Array[Rule]): this.type = set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldUpdateFunction3(value: (/* prevValues */ Store, /* nextValues */ Store, /* info */ Source) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction3(value))
    @scala.inline
    def shouldUpdate(value: ShouldUpdate): this.type = set("shouldUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def trigger(value: String): this.type = set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def validateFirst(value: Boolean): this.type = set("validateFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def valuePropName(value: String): this.type = set("valuePropName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Field.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

