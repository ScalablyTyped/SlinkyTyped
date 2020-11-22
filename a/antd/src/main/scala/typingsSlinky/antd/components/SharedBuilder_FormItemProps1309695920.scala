package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.parallel
import typingsSlinky.antd.formFormMod.RequiredMark
import typingsSlinky.antd.formItemLabelMod.LabelTooltipType
import typingsSlinky.antd.formItemMod.ChildrenType
import typingsSlinky.antd.formItemMod.ValidateStatus
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import typingsSlinky.rcFieldForm.anon.Source
import typingsSlinky.rcFieldForm.fieldMod.ShouldUpdate
import typingsSlinky.rcFieldForm.interfaceMod.EventArgs
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.Rule
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FormItemProps1309695920[Values] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def childrenFunction1(value: /* form */ FormInstance[Values] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
  
  @scala.inline
  def children(value: ChildrenType[Values]): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dependenciesVarargs(value: NamePath*): this.type = set("dependencies", js.Array(value :_*))
  
  @scala.inline
  def dependencies(value: js.Array[NamePath]): this.type = set("dependencies", value.asInstanceOf[js.Any])
  
  @scala.inline
  def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
  
  @scala.inline
  def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fieldKeyVarargs(value: Key*): this.type = set("fieldKey", js.Array(value :_*))
  
  @scala.inline
  def fieldKey(value: Key | js.Array[Key]): this.type = set("fieldKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getValueFromEvent(value: /* args */ EventArgs => StoreValue): this.type = set("getValueFromEvent", js.Any.fromFunction1(value))
  
  @scala.inline
  def getValueProps(value: /* value */ StoreValue => js.Object): this.type = set("getValueProps", js.Any.fromFunction1(value))
  
  @scala.inline
  def hasFeedback(value: Boolean): this.type = set("hasFeedback", value.asInstanceOf[js.Any])
  
  @scala.inline
  def helpReactElement(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
  
  @scala.inline
  def help(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  
  @scala.inline
  def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def initialValue(value: js.Any): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isList(value: Boolean): this.type = set("isList", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isListField(value: Boolean): this.type = set("isListField", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelAlign(value: FormLabelAlign): this.type = set("labelAlign", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelCol(value: ColProps): this.type = set("labelCol", value.asInstanceOf[js.Any])
  
  @scala.inline
  def messageVariables(value: Record[String, String]): this.type = set("messageVariables", value.asInstanceOf[js.Any])
  
  @scala.inline
  def nameVarargs(value: (String | Double)*): this.type = set("name", js.Array(value :_*))
  
  @scala.inline
  def name(value: NamePath): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def noStyle(value: Boolean): this.type = set("noStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def normalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): this.type = set("normalize", js.Any.fromFunction3(value))
  
  @scala.inline
  def onReset(value: () => Unit): this.type = set("onReset", js.Any.fromFunction0(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def preserve(value: Boolean): this.type = set("preserve", value.asInstanceOf[js.Any])
  
  @scala.inline
  def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  
  @scala.inline
  def requiredMark(value: RequiredMark): this.type = set("requiredMark", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rulesVarargs(value: Rule*): this.type = set("rules", js.Array(value :_*))
  
  @scala.inline
  def rules(value: js.Array[Rule]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shouldUpdateFunction3(value: (_, _, /* info */ Source) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction3(value))
  
  @scala.inline
  def shouldUpdate(value: ShouldUpdate[_]): this.type = set("shouldUpdate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def status(value: ValidateStatus): this.type = set("status", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltipReactElement(value: ReactElement): this.type = set("tooltip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltip(value: LabelTooltipType): this.type = set("tooltip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trigger(value: String): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateFirst(value: Boolean | parallel): this.type = set("validateFirst", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateStatus(value: ValidateStatus): this.type = set("validateStatus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value :_*))
  
  @scala.inline
  def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def valuePropName(value: String): this.type = set("valuePropName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wrapperCol(value: ColProps): this.type = set("wrapperCol", value.asInstanceOf[js.Any])
}
