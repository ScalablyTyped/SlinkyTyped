package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IKeytipProps415083889[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hasDynamicChildren(value: Boolean): this.type = set("hasDynamicChildren", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hasMenu(value: Boolean): this.type = set("hasMenu", value.asInstanceOf[js.Any])
  
  @scala.inline
  def offset(value: Point): this.type = set("offset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): this.type = set("onExecute", js.Any.fromFunction2(value))
  
  @scala.inline
  def onReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): this.type = set("onReturn", js.Any.fromFunction2(value))
  
  @scala.inline
  def overflowSetSequenceVarargs(value: String*): this.type = set("overflowSetSequence", js.Array(value :_*))
  
  @scala.inline
  def overflowSetSequence(value: js.Array[String]): this.type = set("overflowSetSequence", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stylesFunction1(value: IKeytipStyleProps => DeepPartial[IKeytipStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  
  @scala.inline
  def styles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
