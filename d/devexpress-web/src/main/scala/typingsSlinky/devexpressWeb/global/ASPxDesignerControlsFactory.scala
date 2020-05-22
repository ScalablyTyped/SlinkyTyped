package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ASPxDesignerControlsFactory")
@js.native
class ASPxDesignerControlsFactory ()
  extends typingsSlinky.devexpressWeb.ASPxDesignerControlsFactory {
  /* CompleteClass */
  override def createPopularBindingInfo(
    options: typingsSlinky.devexpressWeb.ASPxDesignerElementSerializationInfoWithBindings,
    isExpression: Boolean
  ): typingsSlinky.devexpressWeb.ASPxDesignerElementSerializationInfoWithBindings = js.native
  /* CompleteClass */
  override def getControlInfo(controlType: String): typingsSlinky.devexpressWeb.ASPxDesignerToolboxItem = js.native
  /* CompleteClass */
  override def getControlType(model: js.Any): String = js.native
  /* CompleteClass */
  override def getPropertyInfo(controlType: String, propertyDisplayName: String): typingsSlinky.devexpressWeb.ASPxDesignerElementSerializationInfo = js.native
  /* CompleteClass */
  override def hideExpressionBindings(controlType: String, propertyNames: String*): Unit = js.native
  /* CompleteClass */
  override def inheritControl(parentType: String, extendedOptions: typingsSlinky.devexpressWeb.ASPxDesignerToolboxItem): typingsSlinky.devexpressWeb.ASPxDesignerToolboxItem = js.native
  /* CompleteClass */
  override def registerControl(typeName: String, metadata: typingsSlinky.devexpressWeb.ASPxDesignerToolboxItem): Unit = js.native
  /* CompleteClass */
  override def setExpressionBinding(
    controlType: String,
    propertyName: String,
    events: js.Array[String],
    group: String,
    objectProperties: js.Array[String]
  ): Unit = js.native
}

