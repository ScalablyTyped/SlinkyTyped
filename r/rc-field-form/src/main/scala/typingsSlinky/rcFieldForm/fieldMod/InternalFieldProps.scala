package typingsSlinky.rcFieldForm.fieldMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcFieldForm.anon.Source
import typingsSlinky.rcFieldForm.interfaceMod.EventArgs
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
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

@js.native
trait InternalFieldProps extends js.Object {
  
  var children: js.UndefOr[
    ReactElement | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance, ReactElement])
  ] = js.native
  
  /**
    * Set up `dependencies` field.
    * When dependencies field update and current field is touched,
    * will trigger validate rules and render.
    */
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.native
  
  var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.native
  
  var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, js.Object]] = js.native
  
  var initialValue: js.UndefOr[js.Any] = js.native
  
  var messageVariables: js.UndefOr[Record[String, String]] = js.native
  
  var name: js.UndefOr[InternalNamePath] = js.native
  
  var normalize: js.UndefOr[
    js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
  ] = js.native
  
  var onReset: js.UndefOr[js.Function0[Unit]] = js.native
  
  var preserve: js.UndefOr[Boolean] = js.native
  
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  
  var shouldUpdate: js.UndefOr[ShouldUpdate] = js.native
  
  var trigger: js.UndefOr[String] = js.native
  
  var validateFirst: js.UndefOr[Boolean | parallel] = js.native
  
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
  
  var valuePropName: js.UndefOr[String] = js.native
}
object InternalFieldProps {
  
  @scala.inline
  def apply(): InternalFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalFieldProps]
  }
  
  @scala.inline
  implicit class InternalFieldPropsOps[Self <: InternalFieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction3(value: (/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance) => ReactElement): Self = this.set("children", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChildren(
      value: ReactElement | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance, ReactElement])
    ): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: NamePath*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[NamePath]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = this.set("getValueFromEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetValueFromEvent: Self = this.set("getValueFromEvent", js.undefined)
    
    @scala.inline
    def setGetValueProps(value: /* value */ StoreValue => js.Object): Self = this.set("getValueProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetValueProps: Self = this.set("getValueProps", js.undefined)
    
    @scala.inline
    def setInitialValue(value: js.Any): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    
    @scala.inline
    def setMessageVariables(value: Record[String, String]): Self = this.set("messageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageVariables: Self = this.set("messageVariables", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: (String | Double)*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: InternalNamePath): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = this.set("normalize", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setOnReset(value: () => Unit): Self = this.set("onReset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setShouldUpdateFunction3(value: (/* prevValues */ Store, /* nextValues */ Store, /* info */ Source) => Boolean): Self = this.set("shouldUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShouldUpdate(value: ShouldUpdate): Self = this.set("shouldUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldUpdate: Self = this.set("shouldUpdate", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setValidateFirst(value: Boolean | parallel): Self = this.set("validateFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateFirst: Self = this.set("validateFirst", js.undefined)
    
    @scala.inline
    def setValidateTriggerVarargs(value: String*): Self = this.set("validateTrigger", js.Array(value :_*))
    
    @scala.inline
    def setValidateTrigger(value: String | js.Array[String] | `false`): Self = this.set("validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateTrigger: Self = this.set("validateTrigger", js.undefined)
    
    @scala.inline
    def setValuePropName(value: String): Self = this.set("valuePropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePropName: Self = this.set("valuePropName", js.undefined)
  }
}
