package typingsSlinky.rcFieldForm.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcFieldForm.anon.Source
import typingsSlinky.rcFieldForm.fieldMod.ChildProps
import typingsSlinky.rcFieldForm.fieldMod.ShouldUpdate
import typingsSlinky.rcFieldForm.interfaceMod.EventArgs
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.Meta
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.Rule
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.rcFieldForm.rcFieldFormBooleans.`false`
import typingsSlinky.rcFieldForm.rcFieldFormStrings.parallel
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FieldProps1642681149[Values] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def childrenFunction3(
    value: (/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values]) => ReactElement
  ): this.type = set("children", js.Any.fromFunction3(value))
  
  @scala.inline
  def children(
    value: ReactElement | (js.Function3[
      /* control */ ChildProps, 
      /* meta */ Meta, 
      /* form */ FormInstance[Values], 
      ReactElement
    ])
  ): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dependenciesVarargs(value: NamePath*): this.type = set("dependencies", js.Array(value :_*))
  
  @scala.inline
  def dependencies(value: js.Array[NamePath]): this.type = set("dependencies", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getValueFromEvent(value: /* args */ EventArgs => StoreValue): this.type = set("getValueFromEvent", js.Any.fromFunction1(value))
  
  @scala.inline
  def getValueProps(value: /* value */ StoreValue => js.Object): this.type = set("getValueProps", js.Any.fromFunction1(value))
  
  @scala.inline
  def initialValue(value: js.Any): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isList(value: Boolean): this.type = set("isList", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isListField(value: Boolean): this.type = set("isListField", value.asInstanceOf[js.Any])
  
  @scala.inline
  def messageVariables(value: Record[String, String]): this.type = set("messageVariables", value.asInstanceOf[js.Any])
  
  @scala.inline
  def nameVarargs(value: (String | Double)*): this.type = set("name", js.Array(value :_*))
  
  @scala.inline
  def name(value: NamePath): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def normalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): this.type = set("normalize", js.Any.fromFunction3(value))
  
  @scala.inline
  def onReset(value: () => Unit): this.type = set("onReset", js.Any.fromFunction0(value))
  
  @scala.inline
  def preserve(value: Boolean): this.type = set("preserve", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rulesVarargs(value: Rule*): this.type = set("rules", js.Array(value :_*))
  
  @scala.inline
  def rules(value: js.Array[Rule]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shouldUpdateFunction3(value: (Values, Values, /* info */ Source) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction3(value))
  
  @scala.inline
  def shouldUpdate(value: ShouldUpdate[Values]): this.type = set("shouldUpdate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trigger(value: String): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateFirst(value: Boolean | parallel): this.type = set("validateFirst", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value :_*))
  
  @scala.inline
  def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def valuePropName(value: String): this.type = set("valuePropName", value.asInstanceOf[js.Any])
}
